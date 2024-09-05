package Day240905;

import java.util.Scanner;

public class bj10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int f = 1;
        if(N < 2){
            System.out.println(1);
        }else {
            for (int i = 1; i <= N; i++) {
                f *= i;
            }
            System.out.println(f);
        }
    }
}
