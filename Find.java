import java.util.Scanner;

public class Find {
    int evenodd(int A)
    {
        return A;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        Find obj = new Find();
        int result = obj.evenodd(A);
        scan.close();
        if (result%2 == 0) {
            System.out.println("The given number is even number");
        }else{
            System.out.println("The given number is odd");
        }
    //    System.out.println(result);
    }
}
