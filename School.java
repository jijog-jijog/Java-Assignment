import java.util.Scanner;

public class School {
    String passfail(int A)
    {   
        String X = A>=35 ? "Pass" : "Fail";
        return X;
        // System.out.println(X);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int mark = obj.nextInt();
        School obj1 = new School();
        String result = obj1.passfail(mark);
        System.out.println(result);
        
    }
}
