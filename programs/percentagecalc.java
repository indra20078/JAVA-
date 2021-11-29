// calculate your percentage of marks of any 5 subjects!!
import java.util.Scanner;

public class percentagecalc {
    public static void main(String[] args){
    try(Scanner mys = new Scanner(System.in)){
    System.out.print("Enter the sum of 5 subject's maximum marks: ");
    float a2 = mys.nextInt();
    System.out.println("THEN THE MARKS OF ONE SUBJECT IS: "+ a2 / 5);
    System.out.print("Enter 1st subject's obtained marks: ");
    int a = mys.nextInt();
    System.out.print("Enter 2nd subject's obtained marks: ");
    int b = mys.nextInt();
    System.out.print("Enter 3rd subject's obtained marks: ");
    int c = mys.nextInt();
    System.out.print("Enter 4th subject's obtained marks: ");
    int d = mys.nextInt();
    System.out.print("Enter 5th subject's obtained marks: ");
    int e = mys.nextInt();
    float f = ((a + b + c + d + e )/ a2 * 100);
    System.out.println(f);

}
}
}

