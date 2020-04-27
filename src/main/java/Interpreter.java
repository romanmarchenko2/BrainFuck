import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class Interpreter {

    static int dataPointer = 0;
    static int length = 65535;
    static byte[] data = new byte[length];

    public static int getPtr() {
        return dataPointer;
    }

    public static byte[] getData() {
        return data;
    }

    void shiftRight() {
        if (dataPointer == length - 1)
            dataPointer = 0;
        else
            dataPointer++;
    }

    void shiftLeft() {
        if (dataPointer == 0)
            dataPointer = length - 1;
        else
            dataPointer--;
    }

    void addPos() {

        data[dataPointer]++;
    }

    void subPos() {
        data[dataPointer]--;
    }

    void printChar() {
        out.print((char) (data[dataPointer]));
    }

    static void Demo() {

        Scanner sc = new Scanner(System.in);
        String chars;

        do {
            out.println("\nBrainFuck Language: ");
            chars = sc.next();
            if (!test(chars)) {

                out.print("\nNormal Language: ");
                ParseClass parseClass = new ParseClass();
                parseClass.parse(chars);
            } else {
                out.println("\nIncorrect Data");
            }

        }
        while (test(chars));
    }

    public static boolean test(String testString) {
        Pattern p = Pattern.compile("^[a-zA-Z0-9!@#$%^&*/|?,-_=()]*$");
        Matcher m = p.matcher(testString);
        return m.matches();
    }

}
