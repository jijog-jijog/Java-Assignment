import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int A = scan.nextInt();
        System.err.print("Enter the number 2 : ");
        int B = scan.nextInt();
        String Result = A>B?"A is greater":"B is Greater";
        System.out.println(Result);

    }
}
