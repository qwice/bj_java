import java.util.Scanner;

public class bj2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        for(int i = 1 ; i <= 9 ; i++){
            System.out.println(A + " * " + i + " = " + A*i);
        }
    }
}
