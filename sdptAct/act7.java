package sdptAct;
import java.util.Scanner;

public class act7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String correctAns = "jose rizal";
        int lives = 3;

        do{
            System.out.println(lives +" lives left");
            System.out.println("Who is our national hero?");
            String answer = s.nextLine();

            if (answer.equalsIgnoreCase(correctAns)){
                System.out.println("you are correct!");
                System.out.println("CONGRATS! you won!");
                break;
                
            } else {
                System.out.println(" incorrect try again");
                lives--;
                
            }
            

        } while (lives > 0);

        
        
    }
}