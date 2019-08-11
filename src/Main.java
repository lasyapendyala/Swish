import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import static javafx.scene.input.KeyCode.P;
public class Main
{
public static void main(String args[])throws IOException
{ 
                         Scanner in = new Scanner(System.in);
         double amount = in.nextDouble(); 
double discountRate = in.nextDouble(); 
double required = 0;
double discount = (amount * (discountRate/100));
do{
required += amount;
amount -= discount;
discount = (amount * (discountRate/100));
}while(amount>=1);
System.out.println(required);
}
}