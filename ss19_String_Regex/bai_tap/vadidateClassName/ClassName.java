package ss19_String_Regex.bai_tap.vadidateClassName;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static void regexClassName(){
        Scanner scanner= new Scanner(System.in);
        System.out.println(" moi nhap ten lop");
        String name= scanner.nextLine();
        Pattern pattern= Pattern.compile("^[A|C|P][\\d]{4}[G-M]$");
        Matcher m=pattern.matcher(name);
        System.out.println(((Matcher) m).matches());
    }
    public static void main(String[] args) {
        regexClassName();
    }
}

