import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[6];
        for(int i=0; i<=5; i=i+1)
            num[i] = scan.nextInt();
        System.out.println(num[4]);
    }
}
