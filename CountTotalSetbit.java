import java.util.Scanner;

import javax.script.ScriptContext;

class CountTotalSetbit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre n : ");
        int n = sc.nextInt();
        int res =0;
        for(int i=n; i>=1; i--) {
            int i1 = i;

            while(i1>0){
                 i1 = (i1 & (i1-1));
                res++;
            }


        }
        System.out.println(res);
}
}