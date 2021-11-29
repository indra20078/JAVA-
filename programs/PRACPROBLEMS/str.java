package PRACPROBLEMS;

public class str {
    public static void main(String[] args){

        // 1. Write a Java program to convert a string to lowercase.
        String a = "DhANUsh";
        String b = a.toLowerCase();
        System.out.println(b);

        // 2. Write a Java program to replace spaces with underscores.
        String c = "I am Indra  Dhanush";
        String d = c.replace(" ", "_");
        System.out.println(d);

        // 3. Write a Java program to fill in a letter template which looks like below:
        // letter = “Dear <|name|>, Thanks a lot”
        // Replace <|name|> with a string (some name)
        String e = "Dear Harry , Thanks a lot";
        String f = e.replace("Harry", "codeWithHarry");
        System.out.println(f);

        // 4. Write a Java program to detect double and triple spaces in a string.
        int g = c.indexOf("  ");
        int h = c.indexOf("   ");
        System.out.println(g);
        System.out.println(h);

        // 5. Write a program to format the following letter using escape sequence characters.
        // Letter = “Dear Harry, This Java Course is nice. Thanks”
        String Letter = "Dear Harry,\nThis Java Course is nice.\nThanks";
        System.out.println(Letter);
    }
}
