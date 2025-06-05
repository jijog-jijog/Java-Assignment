import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        scan.close();
        if (A<=50) {
            System.out.println("Need to improve");
        }else if(A>=50 && A<=70){
            System.out.println("Good Job");
        }else if (A>70) {
            System.out.println("Excellent"); 
        }
    }
}
