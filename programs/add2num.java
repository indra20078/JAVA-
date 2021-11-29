import java.util.Scanner;

public class add2num{
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        try(Scanner se = new Scanner(System.in)){//here .in means to take input from the keyboard
        System.out.print("Enter number 1: ");
        int a = se.nextInt();
        System.out.print("Enter number 2: ");
        int b = se.nextInt();
        int sum = a+b;
        System.out.println("The sum is " +sum);
        // problem to check wheter entered number in integer or not  
        System.out.print("Enter number 2: ");
        Scanner sv = new Scanner(System.in);
        System.out.println(sv.hasNextInt());
        
    }

        
}
}
