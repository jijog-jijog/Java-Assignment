import java.util.Scanner;

public class pass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        if (m>=35) {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
