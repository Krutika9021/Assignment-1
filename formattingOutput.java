//Write a program in JAVA to formatting the output. 
import java.util.Formatter;

public class formattingOutput 
{

     public static void main(String args[])
     {
        Formatter f1 = new Formatter();
        Formatter f2 = new Formatter();
        f1.format("Rank and Percentage of %s = %d %f", "John", 2, 98.5);
        System.out.println(f1.toString());
        f2.format("Rank and Percentage of %s %s = %d %f", "David", "Warner", 1, 80.8);
        System.out.println(f2.toString());
   }
}

