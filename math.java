import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = A*B*C;
        int E = A+B+C;
        int F = D/E;
        System.out.println("The Multiplication is"+D);
        System.out.println("The Addition is"+E);
        System.out.println("The Final output is "+F);
    }
}
