public class ex4 {
    public static void main(String[] args) {
        int a = 0;
        for(int i=1; i<=100; i=i+1)
        if (i%3==0 && i%5==0) {
            a=a+1;
            System.out.println(i);
        }System.out.println("The number of number divisible are : " + a);
    }   
}
