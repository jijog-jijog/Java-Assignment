import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number 1 : ");
        int A = scan.nextInt();
        System.out.print("Enter the number 2 : ");
        int B = scan.nextInt();
        for(int i=A;i<=B;i=i+1)
        System.out.println(i);
    }
}
