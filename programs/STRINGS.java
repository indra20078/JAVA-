import java.util.Scanner;

public class STRINGS {
    public static void main(String[] args){
    // String name = ;
    // System.out.println(name);
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String str = sc.nextLine();
    System.out.print("Enter a Float: ");
    float no = sc.nextFloat();
    System.out.print("Enter a Integer: ");
    int a = sc.nextInt();
    System.out.format("The values entered are %s , %f, %d ", str, no , a);

}
}