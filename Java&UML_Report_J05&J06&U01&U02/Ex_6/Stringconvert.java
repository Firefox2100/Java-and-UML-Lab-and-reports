import java.util.Scanner;

public class Stringconvert {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Please enter a string:");
        str=sc.nextLine();
        int num;
        try{
            num=Integer.valueOf(str);
        }
        catch(NumberFormatException e){
            num=0;
            System.out.println("Error: input is not a legal integer.");
        }
        finally{
            sc.close();
        }
        System.out.println("The converted value is "+num);
    }
}