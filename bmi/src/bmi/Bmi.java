package bmi;
import java.util.Scanner;

public class Bmi {
public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
     int Cities, Persons = 0, TotalPersons = 0;
      double Mass, Height, Bmi, UnderRatio = 0, NormalRatio = 0, OverRatio = 0, ObeseRatio = 0, TotalUnder = 0,
       TotalNormal = 0, TotalOver = 0, TotalObese = 0, maxNormal = Double.NEGATIVE_INFINITY, maxObese = Double.NEGATIVE_INFINITY,
        minUnder = Double.POSITIVE_INFINITY;
         String cityName, BestNormalCity = "", WorstObeseCity = "", UnderCity = "";

    while (true) {
     System.out.printf("Enter the number of cities\n");
      Cities = scan.nextInt();
       if (Cities >= 1)
        break;
         }
    
    for (int i = 0; i < Cities; ++i) {
     int TotalUnderCity = 0,TotalNormalCity = 0, TotalOverCity = 0, TotalObeseCity = 0;  
      System.out.printf("Enter the name of the city\n");
       cityName = scan.next();   
        
    while (true) {
     System.out.printf("Enter the number of persons\n");
      Persons = scan.nextInt();
       TotalPersons += Persons;
        if (Persons >= 10)
         break;
          }
       
    for (int j = 0; j < Persons; ++j) {
     System.out.printf("Enter the Height of person number %d\n", j + 1);
      Height = scan.nextDouble();
       Height /= 100;
        System.out.printf("Enter the Mass of person number %d\n", j + 1);
         Mass = scan.nextDouble();
          Bmi = Mass / (Height * Height);
          
    if (Bmi < 18.5) {
     System.out.printf("BMI is: %.1f it's Underweight\n", Bmi);
      TotalUnder++;
       TotalUnderCity++;
        }
    
    else if (Bmi < 25) {
     System.out.printf("BMI is: %.1f it's Normal\n", Bmi);
      TotalNormal++;
       TotalNormalCity++;
        }
        
    else if (Bmi < 30) {
     System.out.printf("BMI is: %.1f it's Overweight\n", Bmi);
      TotalOver++;
       TotalOverCity++;
        }
    
    else {
     System.out.printf("BMI is: %.1f it's Obese\n", Bmi);
      TotalObese++;
       TotalObeseCity++; 
        }
    
    UnderRatio=(float)(TotalUnderCity * 100 / Persons);
    ObeseRatio=(float)(TotalObeseCity * 100 / Persons);
    NormalRatio=(float)(TotalNormalCity * 100 / Persons);
    }

    if (UnderRatio < minUnder) {
    minUnder = UnderRatio;
    UnderCity = cityName;
    }
    
    if (ObeseRatio > maxObese) {
    maxObese = ObeseRatio;
    WorstObeseCity = cityName;
    }
    
    if (NormalRatio > maxNormal) {
    maxNormal = NormalRatio;
    BestNormalCity = cityName;
    }
    
    System.out.printf("City number %d\n", i + 1);
     System.out.printf("The number of persons is: %d\n", Persons);
      System.out.printf("The ratio of underweight persons is: %.1f%%\n", UnderRatio);
       System.out.printf("The ratio of normal persons is: %.1f%%\n", NormalRatio);
        System.out.printf("The ratio of overweight persons is: %.1f%%\n",(float)(TotalOverCity * 100 / Persons));
         System.out.printf("The ratio of obese persons is: %.1f%%\n", ObeseRatio);}
          System.out.printf("The number of cities is: %d\n", Cities);
           System.out.printf("The total number of persons is: %d\n", TotalPersons);
            System.out.printf("The Underweight ratio in all cities is %.1f%%\n", (TotalUnder * 100 / TotalPersons));
             System.out.printf("The Normal ratio in all cities is %.1f%%\n", (TotalNormal * 100 / TotalPersons));
              System.out.printf("The Overweight ratio in all cities is %.1f%%\n", (TotalOver * 100 / TotalPersons));
               System.out.printf("The Obese ratio in all cities is %.1f%%\n", (TotalObese * 100 / TotalPersons));
                System.out.printf( "The best city in normal ratio is ");
                 System.out.printf(BestNormalCity);
                  System.out.printf(" with ratio: %.1f%%\n", maxNormal);
                   System.out.printf( "The worst city in obese ratio is ");
                    System.out.printf(WorstObeseCity);
                     System.out.printf(" with ratio: %.1f%%\n", maxObese);
                      System.out.printf("The minimum city in underweight ratio is " );
                       System.out.printf( UnderCity);
                        System.out.printf(" with ratio: %.1f%%\n", minUnder);
                         }

}