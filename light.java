import java.util.Scanner;

public class light {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        scan.close();
        if (A.equals("red")) {
            System.out.println("Stop");
        }else if (A.equals("yellow")) {
            System.out.println("Get ready");
        }else if (A.equals("green")) {
            System.out.println("Go");
        }
    }
}
