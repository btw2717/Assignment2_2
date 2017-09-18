//Make the classes JOptionPane, Scanner, and Integer available to the application.
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.Integer;

/**
 * The EchoJPane class prompts the user to input an example of each primitive data type.
 * This class reads user input of each primitive data type through the use of a scanner object.
 * This class stores that user input in appropriately assigned variable locations
 * through the use of specific Scanner class method calls such as nextInt, nextFloat,
 * and nextBoolean among others.
 * The variable input data is assigned to an index location within the Object array 'input.'
 * This class outputs the variable values to the screen via JOptionPane window dialogue from
 * the javax.swing.JOptionPane package.
 * email: btannerw@gmail.com
 * Created 16SEP2017
 * @author Sapper
 * @version 1.0
 */



public class EchoJPane
{
    /**
     * The public static void main() method is a void method which will perform some action
     * other than returning an item.
     * This method is the entry point of the application.
     *
     * main() creates a scanner object utilizing the 'new' operator which also calls
     * the default constructor 'Scanner' which Java provided for the scanner class.
     * The Scanner() constructor creates the object 'keyboard' and initializes it.
     * Scanner() takes the argument System.in
     *
     * main() creates two arrays to store variable data, a char[] and an Object[].
     *
     * The Integer class is used to convert Character values stored in the char[] to binary
     * string representations of those encoded values, with a "0" appended to the beginning of each
     * in order to represent a byte.
     * This data is simultaneously ouput to the screen to represent the name of the program.
     *
     * main() utilizes JOptionPane to output an echo of what the user entered to the screen
     * in a dialog box with a call to the showMessageDialog method
     *
     * @param args The arguments passed to the command line.
     */
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        //keyboard.useDelimiter(",");

        char[] name = new char[5];
        name[0] = 'B';
        name[1] = 'r';
        name[2] = 'a';
        name[3] = 'd';
        name[4] = 'y';

        System.out.println("Hello, my name is:");

        System.out.println("0" + Integer.toBinaryString(name[0]) + " " + "0"
                + Integer.toBinaryString(name[1]) + " " + "0"
                + Integer.toBinaryString(name[2]) + " " + "0"
                + Integer.toBinaryString(name[3]) + " " + "0"
                + Integer.toBinaryString(name[4]));
        System.out.println("Let's practice learning about all of the Java primitive data types.");


        System.out.println();
        System.out.println("Enter in a Byte value,\n" +
                "a Short value,\n" +
                "an Integer value," +
                "a Long value,\n" +
                "a Float value,\n" +
                "a Double value,\n" +
                "a Character value(within single quotes, such as 'a'),\n" +
                "and a Boolean value.\n" +
                "Remember to press enter after each entry.");

        Object[] input = new Object[8];
        input[0] = keyboard.nextByte();
        input[1] = keyboard.nextShort();
        input[2] = keyboard.nextInt();
        input[3] = keyboard.nextLong();
        input[4] = keyboard.nextFloat();
        input[5] = keyboard.nextDouble();
        input[6] = keyboard.next().charAt(1);
        input[7] = keyboard.nextBoolean();

        JOptionPane.showMessageDialog(null, "You entered: \n" +
                "Byte value: \'" + input[0] + "\', \nShort value: \'" + input[1] +
                "\', \nInteger value: \'" + input[2] + "\', \nLong value: \'" + input[3] +
                "\', \nFloat value: \'" + input[4] + "\', \nDouble value: \'" + input[5] +
                "\', \nCharacter value: \'" + input[6] + "\', \nand Boolean value:  \'" +
                input[7] +"\'");

        System.exit(0);
        keyboard.close();

    }
}