/*
    !!!PROGRAM TO CALCULATE BMI(BODY MASS INDEX) OF A PERSON AND DISPLAY ITS CATEGORY!!!
*/
import java.util.Scanner;                         //For I/O Functions
public class BMICalc
{
    public static void main(String ar[])
    {
        double height,weight;
        Scanner input=new Scanner(System.in);     //To create an object of Scanner class

        //Taking all inputs from user
        System.out.print("\nenter the height in inch :");
        height=input.nextDouble();                 //To input height in inch

        System.out.print("\nenter the weight in lbs :");
        weight=input.nextDouble();                 //To input height in lbs

        double BMI=( weight / Math.pow(height,2)) * 703;     //BMI formula

        System.out.print("\nCalculated BMI="+BMI);

        //Sort the category to which the person belongs
        String value=(BMI<15)?"Very severely underweight":(BMI<16 && BMI>=15)?"Severely underweight":
                (BMI<18.5 && BMI>=16)?"underweight":(BMI<25 && BMI>=18.5)?"Normal(healthy weight)":
                (BMI<30 && BMI>=25)?"Overweight":(BMI<35 && BMI>=30)?"Moderately obese":
                        (BMI<40 && BMI>=35)?"Severely obese":"Very Severely obese";

        System.out.println("\n"+value);
    }
}
/*
                                    !!! THE END !!!
                                       THANK YOU
 */