import java.util.Scanner;

public class match {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Decision = scan.nextLine();
        scan.close();
        if (Decision.equals("win")) {
            System.out.println("RCB won the match");
        }
        else{
            System.out.println("RCB loss");
        }
    }
}
