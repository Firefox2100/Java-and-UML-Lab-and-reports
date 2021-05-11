public class TestClass {
    public static void main(String args[]){
        Book book1=new Book();
        book1.setbook("My book", 172, 3000);
        System.out.println("The price is "+book1.price());
    }
}