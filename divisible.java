import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        if (A%3==0 && A%5==0) {
            System.out.println("The number is divisible by 3 and 5");
        }else{
            System.out.println("the number is not divisible by 3 and 5");
        }
    }
}
