package temperatureconvertion;
import java.util.*;
public class Temperatureconvertion {
     
    public static void main(String[] args) {
       System.out.println("Conversion");
  
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter the Temperature in degree");
    double temp = sc.nextDouble();
    
    temperatureFahrenhei tp = new temperatureFahrenhei(temp);
     
    System.out.printf("\nThe value of the Temperature in Kelvin is %.2f\n", tp.Kelvin());
    System.out.printf("The value of the Temperature in Fahrenheit is %.2f\n", tp.Fahrenhei());
    //done
    } 
}
