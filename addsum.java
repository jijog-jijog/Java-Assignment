public class addsum {
    int add(int A, int B)
    {
        return A+B;
    }
    public static void main(String[] args) {
        addsum obj = new addsum();
        int result = obj.add(10,50);
        System.out.println(result);
    }
}
