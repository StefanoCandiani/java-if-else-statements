
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
        
        
        
        question1();
        
        System.out.println("");
        
        
        question2();
        
        System.out.println("");
        
        
        question3();
        
        System.out.println("");
        
        
        question4();
        
        System.out.println("");
        
        
        question5();
        
        System.out.println("");
        
        
        question6();
        
        System.out.println("");
        
       
        question7();
        
        System.out.println("");
        
        question8();
        
        System.out.println("");
        
        System.out.println("Please enter the hours you've worked and the amount of money you make each hour: ");
        int time = userInput.nextInt();
        int cash = userInput.nextInt();
        question9(time, cash);
        
        System.out.println("");
        System.out.println("Please enter the hours you've worked and the amount of money you make each hour: ");
        int time2 = userInput.nextInt();
        int cash2 = userInput.nextInt();
        question10(time2, cash2);
        
        System.out.println("");
    }
    
    
    public static void question1(){
        System.out.print("Please insert your test grade: ");
        int valOne = userInput.nextInt();
        
        if(valOne > 70){
            System.out.println("PASSING!");
        }
        
        else{
            System.out.println("NOT PASSING!");
        }
    }
    
    public static void question2(){
        System.out.print("Please insert your speed: ");
        int valTwo = userInput.nextInt();
        
        if(valTwo >= 50){
            System.out.println("GO!");
        }
        
        else{
            System.out.println("STOP!");
        }
    }
    
    public static void question3(){
        System.out.print("Please insert an even or odd number: ");
        int valThree = userInput.nextInt();
        
        if(valThree % 2 == 0){
            System.out.println("EVEN!");
        }
        
        else if(valThree % 2 != 0){
            System.out.println("ODD!");
        }
    }
    
    public static void question4(){
        System.out.print("Please insert a random number: ");
        int valFour = userInput.nextInt();
        
        if(valFour % 5 == 0){
            System.out.println("MULTIPLE OF 5!");
        }
        
        else{
            System.out.println("NOT MULTIPLE OF 5!");
        }
    }
    
    public static void question5(){
        System.out.print("Please insert a random number: ");
        int valFive = userInput.nextInt();
        
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
    
    public static void question6(){
        System.out.print("Please insert a Jersey Number: ");
        int valSix = userInput.nextInt();
        
        if(valSix == 12 || valSix == 71){
            System.out.println("That number is retired from the Seattle Seahawks");
        }
        
        else if(valSix == 80){
            System.out.println("That number is retired from the Seattle Seahawks");
        }
    }
    
    public static void question7(){
        System.out.print("Please insert a state name: ");
        userInput.nextLine();
        String valSeven = userInput.nextLine();
        if(valSeven.equals("Washington") || valSeven.equals("Oregon") || valSeven.equals("Idaho")){
            System.out.println("This state is in the PNW!");
        }
        else{
            System.out.println("You should move to the PNW; it's great here!");
        }
    }
    
    public static void question8(){
        System.out.print("Please insert your drink size from the following options: Short, Tall, Grande, or Venti: ");
        String valEight = userInput.nextLine();
        
        if(valEight.equals("Short")){
            System.out.println("This drink is 8 ounces");
        }
        else if(valEight.equals("Tall")){
            System.out.println("This drink is 12 ounces");
        }
        else if(valEight.equals("Grande")){
            System.out.println("This drink is 16 ounces");
        }
        else if(valEight.equals("Venti")){
            System.out.println("This drink is 18 ounces");
        }
        else{
            System.out.println("That is not one of the options");
        }
    }
    
    public static void question9(int hour, int money){
       if(hour > 40){
           int extra = hour % 40;
           int hourAft = hour - extra;
           double extraMoney = 1.5 * ((double)money);
           double total = (hour*money)+(extra*extraMoney);
           System.out.println("You worked for "+hour+" hours making a total of "+total+" ( "+hourAft+" * $"+money+"+ "+extra+" * $"+extraMoney+" = $"+total+")");
       }
       else if(hour < 40){
           int totalSmall = hour*money;
           System.out.println("You worked for "+hour+" hours making a total of "+totalSmall+" ("+hour+" * $"+money+")");
       }
    }
    
    public static void question10(int hour, int money){
       if(hour > 40 && hour < 60){
           int extra = hour % 40;
           int hourAft = hour - extra;
           double extraMoney = 1.5 * ((double)money);
           double total = (hour*money)+(extra*extraMoney);
           System.out.println("You worked for "+hour+" hours making a total of "+total+" ( "+hourAft+" * $"+money+"+ "+extra+" * $"+extraMoney+" = $"+total+")");
       } 
       else if(hour > 60){
           System.out.println("Please see manager.");
       }
    }
    
}
