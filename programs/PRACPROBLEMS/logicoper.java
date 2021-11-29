package PRACPROBLEMS;
import java.util.Scanner;

public class logicoper {
    public static void main(String[] args) {
        //Logic operators 
        Scanner se = new Scanner(System.in);
        System.out.println("Enter your age");
        int a = se.nextInt();
        if(a > 18 && a > 19){
        System.out.println("Hey you can drive!!");

        }
        else {
            System.out.println("No you cant drive!!");
        }


    }
    
}
