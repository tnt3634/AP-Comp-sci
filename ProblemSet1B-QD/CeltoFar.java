import java.util.Scanner; 


public class CeltoFar {
    
 public static void main(String [] args) {
    
     Scanner input = new Scanner(System.in);
     
     //Celsius to Farhenheit 
      
    System.out.println("Celsius to Farhenheit Calculator");  
     System.out.print("Put Celsius value: ");
     double C = input.nextDouble();
     System.out.println(C*9/5+32);
     
     
     
     //BMI calculator 
     
     System.out.println("BMI Calculator");
     System.out.print("Enter your height in meters: ");
     double height = input.nextDouble();
     
     System.out.print("Enter your weight in kg: ");
     double weight = input.nextDouble();
     
     System.out.print("Your BMI is:");
     System.out.println(weight/(height*height));
     
     //Days to weeks and days
     
     System.out.println("Days to weeks and days");
     System.out.print("Enter amount of days");
     int days = input.nextInt();
     System.out.println(days + "is equal to:" + days/7 +"weeks and: " + days%7 +  "days");
     
     //Reciept
    System.out.println("Reciept Calculator");
    System.out.print("Enter number of items purchased");
    double units = input.nextDouble();
    System.out.print("Enter price");
    double price = input.nextDouble();
    System.out.print("Enter tax rate");
    double tax = input.nextDouble();
    System.out.println("You purchased: " + units + " Which costed " + price + " at a tax rate of "+ tax + "% it costed a total of " + (units*price) * (tax/100 +1));
     
    
   
     //Sum of digits 
     System.out.println("sum of digits");
    System.out.print("Enter a positive three digit number");
    int n = input.nextInt();
    int n100 = n/100;
    int n10 = (n/10)%10;
    int n1 = n%10;
    System.out.println(n100 + n10 + n1);
   
     input.close();
     
 }
 
 

}

