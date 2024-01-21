import java.util.*;

public class stringcomp {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String str1, str2;
        int n;

        System.out.println("Enter string 1:");
        str1 = sc.nextLine();
        System.out.println("Enter string 2:");
        str2 = sc.nextLine();
        System.out.println("Enter the number of characters You want to compare:");
        n = sc.nextInt();

        sc.close();

        boolean r1 = strcompare(str1, str2);
        System.out.println("version 1 result: " + r1);

        boolean r2 = strcompare(str1, str2, n);
        System.out.println("version 2 result: " + r2);

    }

    public static boolean strcompare(String str1, String str2) {

        return str1.equals(str2);

    }

    public static boolean strcompare(String str1, String str2, int n) {

        return (str1.substring(0, n)).equals(str2.substring(0, n));

    }

}
