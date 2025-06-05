import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the table want to print : ");
        int A = scan.nextInt();
        for(int i=1; i<=10; i=i+1)
        System.out.println(i +"*"+A + "=" +A*i);
    }
}
