public class STRINGSmeth{
    public static void main(String[] args){
        String name = "Indra";
        int len = name.length();
        System.out.println(name);
        // Printing the length of name
        System.out.println(len);
        // Converting the letters in name to lowercase 
        String tlc = name.toLowerCase();
        System.out.println(tlc);
        // Converting the letters in name to lowercase
        String tuc = name.toUpperCase();
        System.out.println(tuc);
        // Trimming all the whitespaces inside the value of the variable
        String a = "   Indra     ";
        String b = a.trim();
        System.out.println(b);
        // Selecting the number of letters from the String must be printed out
        String c = "Dhanush";
        String d = c.substring(2);
        System.out.println(d);
        // Another Method (Limiting the output)
        String e = c.substring(2,6);
        System.out.println(e);
        // Replacing a letter in the String
        String f = c.replace("h", "HS");// here we an also replace letters amd words 
        System.out.println(f);
        // Check whether a letter or word starts with the String
        Boolean g = c.startsWith("Dhanush");
        System.out.println(g);
        // Check whether a letter or word ends with the String
        Boolean h = c.endsWith("rt");
        System.out.println(h);
        // Printing a letter from the String
        char i = c.charAt(1);
        System.out.println(i);
        // Printing in which position a letter is in the String
        int j = c.indexOf("h" , 4);// here 4 tells java that begin search from this position of index in String
        System.out.println(j);// Note -- It gives the output when it was FOUND FIRST
        // In this case it print last of the index no in the String
        int k = c.lastIndexOf("h" , 3);
        System.out.println(k);
        // Next operator id equals that returns a boolean 
        Boolean l = c.equals("Dhanush");
        System.out.println(l);
        // Here it ignores cases like it ignores capital or small letters in the String
        Boolean m = c.equalsIgnoreCase("dHaNusH");
        System.out.println(m);
        //Escaping the following error with "\"--"I am Indra"  and Dhanush"
        String n = "I am Indra \" and Dhanush";
        System.out.println(n);
        // "\n" prints in the in the next line
        String o = "I am Indra \n and Dhanush";
        System.out.println(o);
        // "\t" gives a much of a tab space          
        String p = "I am Indra \t and Dhanush";
        System.out.println(p);

    }
}