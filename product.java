public class product {
    void soup(int price)
    {
        System.out.println(price);
    }
    void powder(int price)
    {
        System.out.println(price);
    }
    void paste(int price)
    {
        System.out.println(price);
    }
    public static void main(String[] args) {
        product obj = new product();
        obj.soup(20);
        obj.powder(100);
        obj.paste(150);
    }
}
