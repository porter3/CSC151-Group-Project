import java.util.Scanner;

public class StringSetMain {
    public static void main(String[] args) {
        StringSet strings = new StringSet();
        Scanner kybd = new Scanner(System.in);
        System.out.print("How many strings will you enter? ");
        int numStr = Integer.parseInt(kybd.nextLine());
        for (int i = 0; i < numStr; i++){
                System.out.print("Enter String " + (i+1) + " to add: ");
                strings.add(kybd.nextLine());
        }
        System.out.println("Total of ints: " + strings.sumValidIntegers());
        System.out.println("Total chars: " + strings.numChars());
        System.out.print("Enter substring to look for: ");
        String substring = kybd.nextLine();
        System.out.println("Number of strings containing " + substring + ": " + strings.countStrings(substring));
        System.out.println("Pop 10 Strings.");
        for (int i = 0; i < 10; i++) {
            strings.pop();
        }
        System.out.println("Total of ints: " + strings.sumValidIntegers());
        System.out.println("Total chars: " + strings.numChars());
        System.out.println("Number of strings containing " + substring + ": " + strings.countStrings(substring));
    }
}
