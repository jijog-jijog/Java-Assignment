import java.util.Scanner;

public class adress {
    public static void main(String[] args) {
        Scanner john = new Scanner(System.in);
        String A = john.nextLine();
        int B = john.nextInt();
        john.nextLine();
        String C = john.nextLine();
        System.out.println("My name is: "+ A);
        System.out.println("My age is: "+B);
        System.out.println("My address is "+C);
    }
}
