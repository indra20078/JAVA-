package PRACPROBLEMS;

import java.util.Scanner;

public class calc {
    public static void main(String[] args){
        Scanner se = new Scanner(System.in);
        System.out.println("Calculate any (max 5 numbers) numbers!!");
        System.out.print("Enter how much numbers you want to calculate(max 5): ");
        int a = se.nextInt();
        if(a == 2 || a == 7){
            System.out.print("Which operation do you want to make(+ , - , * , / , **(power)): ");
            String b = se.next();
            if(b.equals("+")){
                System.out.println("Enter your first number: ");
                float c = se.nextFloat();
                System.out.println("Enter your second number: ");
                float d = se.nextFloat();
                System.out.print("The sum is: ");
                System.out.println(c +d);
            }
            else{
                System.out.println("Enter again");}}
        
            if(a == 3){
                System.out.print("Which operation do you want to make(+ , - , * , / , **(power)): ");
                String e = se.next();
                if(e.equals("+")){
                    System.out.println("Enter your first number: ");
                    float f = se.nextFloat();
                    System.out.println("Enter your second number: ");
                    float g = se.nextFloat();
                    System.out.println("Enter your third number: ");
                    float i = se.nextFloat();
                    System.out.print("The sum is: ");
                    System.out.println(f +g+i);
                }
                else{
                    System.out.println("Enter again");
                }}
                if(a == 4){
                    System.out.print("Which operation do you want to make(+ , - , * , / , **(power)): ");
                    String j = se.next();
                    if(j.equals("+")){
                        System.out.println("Enter your first number: ");
                        float k = se.nextFloat();
                        System.out.println("Enter your second number: ");
                        float l = se.nextFloat();
                        System.out.println("Enter your third number: ");
                        float m = se.nextFloat();
                        System.out.println("Enter your fourth number: ");
                        float n = se.nextFloat();
                        System.out.print("The sum is: ");
                        System.out.println(k+l+m+n);
                    }
                    else{
                        System.out.println("Enter again");
                    }}
                    if(a == 5){
                        System.out.print("Which operation do you want to make(+ , - , * , / , **(power)): ");
                        String o = se.next();
                        if(o.equals("+")){
                            System.out.println("Enter your first number: ");
                            float p = se.nextFloat();
                            System.out.println("Enter your second number: ");
                            float r = se.nextFloat();
                            System.out.println("Enter your third number: ");
                            float q = se.nextFloat();
                            System.out.println("Enter your fourth number: ");
                            float u = se.nextFloat();
                            System.out.println("Enter your fifth number: ");
                            float v = se.nextFloat();
                            System.out.print("The sum is: ");
                            System.out.println(p+r+q+u+v);
                        }
                        else{
                            System.out.println("Enter again");
                        }
                        
                        
                                        
    
 }     } }

    
