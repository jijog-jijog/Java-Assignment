import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        int A = sacn.nextInt();
        sacn.close();
        if (A%2 == 0) {
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
