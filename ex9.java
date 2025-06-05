import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int A = scan.nextInt();
        int[] num = new int[A];
        for(int i=0; i<=A-1; i=i+1)
        num[i] = scan.nextInt();
        System.out.println(num[3] );
    }
}
