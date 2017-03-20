import java.util.Scanner;
public class randonGame{
    public static void main(String[] args){
        
        
        Scanner input = new Scanner( System.in );
        int endGame;
        int numberofTries = 0;
        int numberofWins = 0;
        int numberofLoses = 0;
        int computerNum;
        computerNum = 0 + (int) ( Math.random() * 10 );
        int num;
        num = input.nextInt();
       
        boolean win = false;
        
        while (win == false){
        numberofTries++; //keep count of tries
    
        if (computerNum == num){//deciding if you won
            System.out.println("You win!!");
            numberofWins++;}
        else if (computerNum != num){//decing if you lost
            System.out.println("You Lost...");
            numberofLoses++;}
            
        System.out.println("Your total number of loses:");//number of loses
        System.out.printf("%d\n", numberofLoses);
            
        System.out.println("Your total number of wins:");//number of wins
        System.out.printf("%d\n", numberofWins); 
            
        System.out.println("Enter a number greater than 10 to end game.");//want to end game?
        endGame = input.nextInt();
        if (endGame > 10){
            win = true;
        }
        }
        System.out.println("You have tried " + numberofTries + " times");
        
    }
}
