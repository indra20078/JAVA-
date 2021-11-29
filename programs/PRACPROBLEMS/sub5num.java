package PRACPROBLEMS;

import java.util.Scanner;

public class sub5num {
    public static void main(String[] args){
        Scanner se = new Scanner(System.in);
        System.out.println("Calculate any (max 5 numbers) numbers!!");
        System.out.print("Enter how much numbers you want to calculate(max 5): ");
        int a = se.nextInt();
        
        if(a == 2){
           
            String x = se.next();
            if(x.equals("-")){
                System.out.println("Enter your first number: ");
                float y = se.nextFloat();
                System.out.println("Enter your second number: ");
                float z = se.nextFloat();
                System.out.print("The difference is: ");
                System.out.println(y -z);
            }
            else{
                System.out.println("Enter again");}}
        
            else if(a == 3){
                String a1 = se.next();
                if(a1.equals("-")){
                    System.out.println("Enter your first number: ");
                    float a2 = se.nextFloat();
                    System.out.println("Enter your second number: ");
                    float a3 = se.nextFloat();
                    System.out.println("Enter your third number: ");
                    float a4 = se.nextFloat();
                    System.out.print("The difference is: ");
                    System.out.println(a2 -a3-a4);
                }
                else{
                    System.out.println("Enter again");
                }}
                else if(a == 4){
                    String a5 = se.next();
                    if(a5.equals("-")){
                        System.out.println("Enter your first number: ");
                        float a6 = se.nextFloat();
                        System.out.println("Enter your second number: ");
                        float a7 = se.nextFloat();
                        System.out.println("Enter your third number: ");
                        float a8 = se.nextFloat();
                        System.out.println("Enter your fourth number: ");
                        float a9 = se.nextFloat();
                        System.out.print("The difference is: ");
                        System.out.println(a6-a7-a8-a9);
                    }
                    else{
                        System.out.println("Enter again");
                    }}
                    else if(a == 5){
                        String b1 = se.next();
                        if(b1.equals("-")){
                            System.out.println("Enter your first number: ");
                            float b2 = se.nextFloat();
                            System.out.println("Enter your second number: ");
                            float b3 = se.nextFloat();
                            System.out.println("Enter your third number: ");
                            float b4 = se.nextFloat();
                            System.out.println("Enter your fourth number: ");
                            float b5 = se.nextFloat();
                            System.out.println("Enter your fifth number: ");
                            float b6 = se.nextFloat();
                            System.out.print("The difference is: ");
                            System.out.println(b2-b3-b4-b5-b6);
                        }
                        else{
                            System.out.println("Enter again");
                        }//yy
    }
}}
