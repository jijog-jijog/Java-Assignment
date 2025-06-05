import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int E = scan.nextInt();
        int F = A+B+C+D+E;
        int G = F/5;
        scan.close();
        if (G<=35) {
            System.out.println("Your mark is : "+ G +" Improvement is required");
        }else{
             System.out.println("Your mark is : "+ G +" Good to go");
        }
    }
}
