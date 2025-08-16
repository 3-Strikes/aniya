import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int q = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        boolean isSorted = false;
        boolean isAscending = false;

        for(int i=0;i<q;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int op = Integer.parseInt(st.nextToken());

            switch (op){
                case 1:
                    int x = Integer.parseInt(st.nextToken());
                    list.add(x);
                    isSorted = false;
                    break;

                case 2:
                    list.remove(list.size()-1);
                    isSorted = false;
                    break;

                case 3:
                    int idx = Integer.parseInt(st.nextToken());
                    pw.println(list.get(idx));
                    break;

                case 4:
                    int pos = Integer.parseInt(st.nextToken());
                    int val = Integer.parseInt(st.nextToken());
                    list.add(pos+1,val);
                    isSorted = false;
                    break;

                case 5:
                    if(isSorted){
                        if(!isAscending){
                            Collections.reverse(list);
                            isAscending = true;
                        }
                    }else {
                        Collections.sort(list);
                        isSorted = true;
                        isAscending = true;
                    }
                    break;

                case 6:
                    if(isSorted){
                        if(isAscending){
                            Collections.reverse(list);
                            isAscending = false;
                        }
                    }else {
                        Collections.sort(list,Collections.reverseOrder());
                        isSorted = true;
                        isAscending = false;
                    }
                    break;

                case 7:
                    pw.println(list.size());
                    break;

                case 8:
                    StringBuffer sb = new StringBuffer();
                    for (int j = 0;j<list.size();j++){
                        sb.append(list.get(j));
                        if(j<list.size()-1) sb.append(" ");
                    }
                    pw.println(sb);
                    break;
            }
        }
        pw.flush();
    }
}
