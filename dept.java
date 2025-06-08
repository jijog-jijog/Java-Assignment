import java.util.Scanner;

public class dept {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        Integer B = scan.nextInt();
        scan.nextLine();
        String C = scan.nextLine();
        float D = B / 10.0f;
        System.out.println("My name is : " + A);
        System.out.println("My Score is : " + D + "/10");
        System.out.println("My Dept is : " + C);
        
    }
}
