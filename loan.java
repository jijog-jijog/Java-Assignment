import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        // scan.nextInt();
        // scan.close();
        if (A>=20000 || B>=25) {
            System.out.println("You are eligible for loan");
            int C = scan.nextInt();
            if (C<=50000) {
                System.err.println("Eligible");
            }if (C>50000) {
                System.err.println("Max amount is 50000");
            }
        }else{
            System.out.println("Go to another bank");
        }
    }
}
