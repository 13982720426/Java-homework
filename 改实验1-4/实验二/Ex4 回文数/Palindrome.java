
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number: ");
        String word = sc.next();
        int i = word.length();
        int j = 0;
        while (j <= (i / 2) -1 && word.charAt(j) == word.charAt(i - j - 1))
            j++;
        if (j == i / 2)
            System.out.println("Yes it is HuiWen.");
        else
            System.out.println("No it is not HuiWen.");

        sc.close();
    }
}
