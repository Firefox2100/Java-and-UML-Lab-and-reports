public class TestCCircle{
   public static void main(String args[])   {
      CCircle cir1=new CCircle();
      System.out.println("initial radius="+cir1.getRadius()); 
      cir1.setCircle(2.0);
      System.out.println("radius="+cir1.getRadius()); 
      System.out.println("The Area is "+cir1.getarea());
   }
}
