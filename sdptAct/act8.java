package sdptAct;
import java.util.Scanner;

public class act8 {

    public static void main(String[] args) {
        
    Scanner s = new Scanner(System.in);
    
    String usernames [] = {"codegia","johndy","mochisan"};
    String passwords [] = {"123","Alohomora","2118"};
    
    System.out.println("Enter Username :");
    String C_User = s.nextLine();
    System.out.println("Enter Password :");
    String C_Pass = s.nextLine(); 
    System.out.println();

    boolean isValid = false;

        for(int i = 0; i < usernames.length; i++){
            if (C_User.equals(usernames[i]) && C_Pass.equals(passwords[i]) ) 
                isValid = true;
        }

        if (isValid) System.out.println("Welcome " +C_User );
        else System.out.println("Access Denied!");



    }

    
    
}
