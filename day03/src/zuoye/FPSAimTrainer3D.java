package zuoye;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FPSAimTrainer3D extends JFrame {
    private final GamePanel gamePanel;
    private final JLabel statsLabel;
    private int hits = 0;
    private int shots = 0;
    private long startTime;
    private int targetsHit = 0;
    private int targetsMissed = 0;
    private int round = 1;

    public FPSAimTrainer3D() {
        setTitle("3D FPS Aim Trainer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        statsLabel = new JLabel("Round: 1 | Hits: 0 | Shots: 0 | Accuracy: 0% | Targets: 0/0");
        statsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        statsLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        statsLabel.setForeground(new Color(50, 200, 50));
        statsLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        statsLabel.setOpaque(true);
        statsLabel.setBackground(new Color(20, 20, 30));
        add(statsLabel, BorderLayout.NORTH);

        gamePanel = new GamePanel();
        add(gamePanel, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel(new GridLayout(1, 3, 10, 0));
        controlPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 20, 20));
        controlPanel.setBackground(new Color(30, 30, 40));

        JButton restartButton = createButton("Restart Game", new Color(70, 130, 200));
        restartButton.addActionListener(e -> startGame());

        JButton nextRoundButton = createButton("Next Round", new Color(80, 180, 80));
        nextRoundButton.addActionListener(e -> nextRound());

        JButton exitButton = createButton("Exit", new Color(200, 80, 80));
        exitButton.addActionListener(e -> System.exit(0));

        controlPanel.add(restartButton);
        controlPanel.add(nextRoundButton);
        controlPanel.add(exitButton);
        add(controlPanel, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                startGame();
            }
        });
    }

    private JButton createButton(String text, Color bgColor) {
        JButton button = new JButton(text);
        button.setFont(new Font("Segoe UI", Font.BOLD, 14));
        button.setBackground(bgColor);
        button.setForeground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(150, 150, 150)),
                BorderFactory.createEmptyBorder(8, 20, 8, 20)
        ));
        return button;
    }

    private void startGame() {
        hits = 0;
        shots = 0;
        targetsHit = 0;
        targetsMissed = 0;
        round = 1;
        startTime = System.currentTimeMillis();
        updateStats();
        gamePanel.startNewGame();
    }

    private void nextRound() {
        round++;
        targetsHit = 0;
        targetsMissed = 0;
        gamePanel.increaseDifficulty();
        updateStats();
        gamePanel.startNewGame();
    }

    private void updateStats() {
        long elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
        double accuracy = shots > 0 ? (double) hits / shots * 100 : 0;
        statsLabel.setText(String.format("Round: %d | Hits: %d | Shots: %d | Accuracy: %.1f%% | Targets: %d/%d | Time: %ds",
                round, hits, shots, accuracy, targetsHit, targetsHit + targetsMissed, elapsedTime));
    }

    private void registerHit() {
        hits++;
        targetsHit++;
        shots++;
        updateStats();
    }

    private void registerMiss() {
        shots++;
        targetsMissed++;
        updateStats();
    }

    class GamePanel extends JPanel {
        private static final int TARGET_SIZE = 40;
        private static final int MIN_DISTANCE = 120;
        private final List<Target> targets = new ArrayList<>();
        private final Random random = new Random();
        private Point crosshairPosition = new Point();
        private int maxTargets = 5;
        private int targetTimeout = 3000; // 3 seconds
        private long lastTargetTime;
        private int currentTargetIndex = -1;

        public GamePanel() {
            setBackground(new Color(25, 25, 35));
            setDoubleBuffered(true);

            // 添加鼠标移动监听器来更新准星位置
            addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseMoved(MouseEvent e) {
                    crosshairPosition = e.getPoint();
                    repaint();
                }
            });

            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    boolean hit = false;
                    for (int i = 0; i < targets.size(); i++) {
                        Target t = targets.get(i);
                        if (t.isHit(e.getX(), e.getY())) {
                            registerHit();
                            targets.remove(i);
                            hit = true;
                            if (targets.isEmpty()) {
                                placeNewTarget();
                            } else {
                                currentTargetIndex = 0;
                                lastTargetTime = System.currentTimeMillis();
                            }
                            break;
                        }
                    }

                    if (!hit) {
                        registerMiss();
                    }
                    repaint();
                }
            });

            // 游戏循环
            new Timer(16, e -> {
                long currentTime = System.currentTimeMillis();
                if (currentTargetIndex >= 0 && currentTargetIndex < targets.size() &&
                        currentTime - lastTargetTime > targetTimeout) {

                    // 目标超时未命中
                    targets.remove(currentTargetIndex);
                    registerMiss();

                    if (targets.isEmpty()) {
                        placeNewTarget();
                    } else {
                        currentTargetIndex = 0;
                        lastTargetTime = System.currentTimeMillis();
                    }
                    repaint();
                }
            }).start();
        }

        public void increaseDifficulty() {
            maxTargets = Math.min(maxTargets + 1, 10);
            targetTimeout = Math.max(targetTimeout - 200, 1500);
        }

        public void startNewGame() {
            targets.clear();
            for (int i = 0; i < maxTargets; i++) {
                placeNewTarget();
            }
            if (!targets.isEmpty()) {
                currentTargetIndex = 0;
                lastTargetTime = System.currentTimeMillis();
            }
            repaint();
        }

        private void placeNewTarget() {
            if (targets.size() >= maxTargets) return;

            int width = getWidth();
            int height = getHeight();

            if (width <= TARGET_SIZE * 2 || height <= TARGET_SIZE * 2) {
                return;
            }

            int maxTries = 20;
            int tries = 0;
            boolean validPosition = false;
            int x = 0, y = 0;

            while (!validPosition && tries < maxTries) {
                x = TARGET_SIZE + random.nextInt(width - TARGET_SIZE * 2);
                y = TARGET_SIZE + random.nextInt(height - TARGET_SIZE * 2);

                validPosition = true;
                for (Target t : targets) {
                    if (distance(new Point(x, y), t.getPosition()) < MIN_DISTANCE) {
                        validPosition = false;
                        break;
                    }
                }
                tries++;
            }

            if (validPosition) {
                targets.add(new Target(x, y, TARGET_SIZE));
            }
        }

        private double distance(Point p1, Point p2) {
            return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // 绘制3D网格背景
            drawGridBackground(g2d);

            // 绘制目标
            for (Target t : targets) {
                t.draw(g2d);
            }

            // 绘制当前目标计时器
            if (currentTargetIndex >= 0 && currentTargetIndex < targets.size()) {
                Target currentTarget = targets.get(currentTargetIndex);
                long elapsed = System.currentTimeMillis() - lastTargetTime;
                double progress = 1.0 - Math.min((double) elapsed / targetTimeout, 1.0);
                currentTarget.drawTimer(g2d, progress);
            }

            // 绘制准星（在鼠标位置）
            drawCrosshair(g2d, crosshairPosition.x, crosshairPosition.y);
        }

        private void drawGridBackground(Graphics2D g2d) {
            int gridSize = 40;
            g2d.setColor(new Color(40, 40, 50));
            g2d.fillRect(0, 0, getWidth(), getHeight());

            g2d.setColor(new Color(60, 60, 70));
            for (int x = 0; x < getWidth(); x += gridSize) {
                g2d.drawLine(x, 0, x, getHeight());
            }
            for (int y = 0; y < getHeight(); y += gridSize) {
                g2d.drawLine(0, y, getWidth(), y);
            }

            // 绘制中心点
            g2d.setColor(new Color(80, 150, 220));
            int centerX = getWidth() / 2;
            int centerY = getHeight() / 2;
            g2d.fillOval(centerX - 3, centerY - 3, 6, 6);
        }

        private void drawCrosshair(Graphics2D g2d, int x, int y) {
            g2d.setColor(new Color(50, 220, 100, 220));
            g2d.setStroke(new BasicStroke(1.5f));

            // 十字线（缩小版）
            int armLength = 8;
            g2d.drawLine(x - armLength - 2, y, x - 2, y);
            g2d.drawLine(x + 2, y, x + armLength + 2, y);
            g2d.drawLine(x, y - armLength - 2, x, y - 2);
            g2d.drawLine(x, y + 2, x, y + armLength + 2);

            // 小圆圈
            int circleSize = 6;
            g2d.drawOval(x - circleSize/2, y - circleSize/2, circleSize, circleSize);

            // 中心点
            g2d.fillOval(x - 1, y - 1, 2, 2);
        }
    }

    static class Target {
        private final Point position;
        private final int size;
        private final Color color;
        private final Color highlight;
        private final Color innerColor;

        public Target(int x, int y, int size) {
            this.position = new Point(x, y);
            this.size = size;
            this.color = new Color(220, 60, 60);
            this.highlight = new Color(255, 150, 150);
            this.innerColor = new Color(40, 40, 40);
        }

        public Point getPosition() {
            return position;
        }

        public boolean isHit(int x, int y) {
            double dist = Point2D.distance(x, y, position.x, position.y);
            return dist < size / 2;
        }

        public void draw(Graphics2D g2d) {
            // 绘制外圈
            g2d.setColor(color);
            g2d.fillOval(position.x - size/2, position.y - size/2, size, size);

            // 绘制高光
            g2d.setColor(highlight);
            g2d.fillOval(position.x - size/2 + 2, position.y - size/2 + 2, size - 4, size - 4);

            // 绘制内圈
            int innerSize = size * 2 / 3;
            g2d.setColor(innerColor);
            g2d.fillOval(position.x - innerSize/2, position.y - innerSize/2, innerSize, innerSize);

            // 绘制中心点
            g2d.setColor(Color.WHITE);
            g2d.fillOval(position.x - 3, position.y - 3, 6, 6);
        }

        public void drawTimer(Graphics2D g2d, double progress) {
            int timerSize = size + 10;
            int arcSize = timerSize;

            // 绘制背景圆环
            g2d.setColor(new Color(50, 50, 60, 180));
            g2d.setStroke(new BasicStroke(3));
            g2d.drawOval(position.x - arcSize/2, position.y - arcSize/2, arcSize, arcSize);

            // 绘制进度条
            g2d.setColor(new Color(50, 200, 100));
            int startAngle = 90;
            int arcAngle = (int) (360 * progress);
            g2d.drawArc(position.x - arcSize/2, position.y - arcSize/2, arcSize, arcSize, startAngle, -arcAngle);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FPSAimTrainer3D game = new FPSAimTrainer3D();
            game.setVisible(true);
        });
    }
}