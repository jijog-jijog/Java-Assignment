import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    int value1 = scanner.nextInt();
    int value2 = scanner.nextInt();
    int value3 = value1 + value2;
    System.out.print(value3);
    scanner.close();
    }
}