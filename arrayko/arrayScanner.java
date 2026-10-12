package arrayko;

import java.util.*;

public class arrayScanner {

        public static void main(String[] args) {
                
    
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Enter 1st number");
        num1 = scanner.nextInt();

        System.out.println("Enter 2st number");
        num2 = scanner.nextInt();

        System.out.println("Enter 3st number");
        num3 = scanner.nextInt();

        int a[] = {num1,num2,num3};
        

        System.out.println("Sort number: "  );
        System.out.println( a[0]);
}
}
