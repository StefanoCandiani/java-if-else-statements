
package pkgif.pkgelse.statements;

import java.util.Scanner;



/**
 *
 * Name: Stefano Candiani
 * Period: 7
 * Project Name: If-else lab
 * 
 * 
 */
public class IfElseStatements {

   
    static Scanner userInput = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        
        System.out.print("Please insert a number: ");
        int value1 = userInput.nextInt();
        question1(value1);
        
        System.out.println("");
        
        System.out.print("Please insert a number: ");
        int value2 = userInput.nextInt();
        question2(value2);
        
        System.out.println("");
        
        System.out.print("Please insert a number: ");
        int value3 = userInput.nextInt();
        question3(value3);
        
        System.out.println("");
        
        System.out.print("Please insert a number: ");
        int value4 = userInput.nextInt();
        question4(value4);
        
        System.out.println("");
        
        System.out.print("Please insert a number: ");
        int value5 = userInput.nextInt();
        question5(value5);
        
        System.out.println("");
        
        System.out.print("Please insert a Jersey Number");
        int value6 = userInput.nextInt();
        question6(value6);
        
        System.out.println("");
        
        System.out.print("Please insert a state name");
        String value7 = userInput.nextLine();
        question7(value7);
    }
    
    
    public static void question1(int valOne){
        if(valOne > 70){
            System.out.println("PASSING!");
        }
        else{
            System.out.println("NOT PASSING!");
        }
    }
    
    public static void question2(int valTwo){
        if(valTwo >= 50){
            System.out.println("GO!");
        }
        else{
            System.out.println("STOP!");
        }
    }
    
    public static void question3(int valThree){
        if(valThree % 2 == 0){
            System.out.println("EVEN!");
        }
        else if(valThree % 2 != 0){
            System.out.println("ODD!");
        }
    }
    
    public static void question4(int valFour){
        if(valFour % 5 == 0){
            System.out.println("MULTIPLE OF 5!");
        }
        else{
            System.out.println("NOT MULTIPLE OF 5!");
        }
    }
    
    public static void question5(int valFive){
        if(valFive < 10){
            System.out.println("ONE DIGIT!");
        }
        else if(valFive > 100){
            System.out.println("THREE DIGITS!");
        }
        else{
            System.out.println("TWO DIGITS!");
        }
    }
    
    public static void question6(int valSix){
        if(valSix == 12 || valSix == 71){
            System.out.println("That number is retired from the Seattle Seahawks");
        }
        else if(valSix == 80){
            System.out.println("That number is retired from the Seattle Seahawks");
        }
    }
    
    public static void question7(String valSeven){
        if(valSeven.equals("Washington") || valSeven.equals("Oregon") || valSeven.equals("Idaho")){
            System.out.println("This state is retired");
        }
    }
    
    public static void question8(){
        
    }
    
    public static void question9(){
        
    }
    
    public static void question10(){
        
    }
    
}
