/*
 * This program was made by Misha Donais
 * On November 7th 2018
 * To perform various calculations
 */

package subroutineprogram;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * This program performs a variety of different calculations
 * @author midon7419
 */
public class SubroutineProgram {
    
    public static void main(String[] args) {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);

        //Variables
        int menuSelection = 0;

        //Initial message
        System.out.println("Enter a number to select an operation to perform");
        System.out.println("---------------");
        System.out.println("1 -- Find the area of a circle");
        System.out.println("2 -- Find the average of five integers");
        System.out.println("3 -- Find the volume of a cone");
        System.out.println("4 -- Find the average speed of a moving object");
        System.out.println("5 -- Find angles of a triangle");
        System.out.println("6 -- Exit");
        System.out.println("---------------");
        
        //Selection of calculations
        menuSelection = keyedInput.nextInt();
        
         if (menuSelection == 1) {
             areaOfACircle();
         }
         if (menuSelection == 2) {
             average();
         }
         if (menuSelection == 3) {
             volumeOfACone();
         }
         if (menuSelection == 4) {
             averageSpeed();
         }
         if (menuSelection == 5) {
             anglesOfATriangle();
         }
         if (menuSelection == 6) {
             exitProgram();
         }
        
    }
 /**
 * This method asks the user to input the radius of a circle, and then it finds the area of the circle
 * 
 */
    public static void areaOfACircle() {
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Decimal format
        DecimalFormat x = new DecimalFormat("###.##");
        
        //Variables
        final double PI = 3.14159;
        double radius;
        double area;
        
        //Prompts+inputs
        System.out.println("You have chosen to find the area of a circle");
        System.out.println("Input the radius of this circle in centimeters");
        radius = keyedInput.nextDouble();
        
        //Calculation and output
        area = (radius * radius* PI);
        System.out.println("The area of this circle is " + x.format(area) + " square centimeters.");
    }
/**
 * This method asks the user to input five numbers, and then calculates the average of these numbers
 * 
 */
    public static void average() {
        System.out.println("You have chosen to find the average of five integers");
        
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Prompt
        System.out.println("Enter five integers");
        
        //Array 
        int [ ] numbers = new int [10];
        int total = 0;
        
        //Loop for inputs
        for (int i = 0; i <= 4; i = i + 1){
           numbers[i] = keyedInput.nextInt();
        }
        //Loop for total
        for (int i = 0; i <= 4; i = i + 1){
             total = total + numbers[i];
        }
        //Output
        System.out.println("The average is: " + total/5); 
    }
    
/**
 * This method asks the user to input the radius of the base of a cone, and the height of the cone. It then calculates the volume of the cone
 * 
 */
    public static void volumeOfACone() {
        System.out.println("You have chosen to find the volume of a cone");
        
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Decimal format
        DecimalFormat x = new DecimalFormat("###.##");
        
        //Variables
        double radius, height, volume;
        final double PI = 3.14159;
        //Prompts+inputs
        System.out.println("Enter the radius of the base of the cone in cm");
        radius = keyedInput.nextDouble();
        System.out.println("Enter the height of the cone in cm");
        height = keyedInput.nextDouble();
        
        //Calculation+output
        volume = PI * radius * radius * (height/3);
        System.out.println("The volume of this cone is " + x.format(volume) + "square cm");
    }
    
/**
 * This method asks the user to input the distance traveled in km, and the travel time in hours. It then calculates the average speed in km/h
 * 
 */
    public static void averageSpeed() {
        System.out.println("You have chosen to find the average speed of a moving object");
        
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Decimal format
        DecimalFormat x = new DecimalFormat("###.##");
        
        //Variables
        double time, distance;
        //Prompts+inputs
        System.out.println("Enter the distance travelled in km");
        distance = keyedInput.nextDouble();
        System.out.println("Enter the travel time in hours");
        time = keyedInput.nextDouble();
        
        //Calculation
        System.out.println("The average speed is:  " + x.format(distance/time) + " km/h");
    }
/**
 * This method asks the user to input the side lengths of a triangle, and the finds the angles in degrees
 * 
 */
    public static void anglesOfATriangle() {
        System.out.println("You have chosen to find the angles of a triangle");
        
        //Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Decimal format
        DecimalFormat x = new DecimalFormat("###.##");
        
        //Variables
        double sideA, sideB, sideC, cosOfA, cosOfB, cosOfC;
        
        //Prompts+inputs
        System.out.println("Enter the length of side A");
        sideA = keyedInput.nextDouble();
        System.out.println("Enter the length of side B");
        sideB = keyedInput.nextDouble();
        System.out.println("Enter the length of side C");
        sideC = keyedInput.nextDouble();
        
        //Calculations Angle A
        cosOfA = ((sideB*sideB)+(sideC*sideC)-(sideA*sideA))/(2*sideB*sideC);
        double angleAR = Math.acos(cosOfA);
        double angleAD = Math.toDegrees(angleAR);
        System.out.println("Angle A is: " + x.format(angleAD) + " degrees");
        
        //Calculations Angle B
        cosOfB = ((sideC*sideC)+(sideA*sideA)-(sideB*sideB))/(2*sideC*sideA);
        double angleBR = Math.acos(cosOfB);
        double angleBD = Math.toDegrees(angleBR);
        System.out.println("Angle B is: " + x.format(angleBD) + " degrees");
        
        //Calculations Angle C
        cosOfC = ((sideA*sideA)+(sideB*sideB)-(sideC*sideC))/(2*sideA*sideB);
        double angleCR = Math.acos(cosOfC);
        double angleCD = Math.toDegrees(angleCR);
        System.out.println("Angle C is: " + x.format(angleCD) + " degrees");

    }   
/**
 * This method ends the program
 * 
 */
    public static void exitProgram() {
        System.exit(0);
    }
    
    
    
}
