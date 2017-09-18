import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import java.util.Scanner;

/**
 * The EchoJPane class extends the Application class and so makes available the methods of the
 * Application class.
 * The Application class is the entry point for JavaFX applications.
 *
 * This class contains two methods, main() and start().  As a JavaFX application, this class
 * begins execution at the start() method.
 *
 * The EchoJPaneFX class prompts the user to input an example of each primitive data type.
 * This class reads user input of each primitive data type through the use of a scanner object.
 * This class stores that user input in appropriately assigned variable locations
 * through the use of specific Scanner class method calls such as nextInt, nextFloat,
 * and nextBoolean among others.
 * The variable input data is assigned to an index location within the Object array 'input.'
 * This class outputs the variable values to the screen by creating an Alert object
 * and calling upon the various alert methods which format the display of the object
 * such as Type, Title, Header, and Context.
 * The alert window dialogue class and methods are imported from the javafx package.
 * email: btannerw@gmail.com
 * Created 16SEP2017
 * @author Sapper
 * @version 1.0
 */

public class EchoJPaneFX extends Application
{
    /**
     * The main() method is not used and is ignored in this class because
     * it is a JavaFX application.
     * main()is included along with a call to launch as a fallback, which will end up launching
     * the JavaFX program and the start method.
     * @param args arguments passed through the command line.
     */
    public static void main(String[] args)
    {
        launch(args);
    }

    /**
     * The start() method is the begin execution point for the application.
     * The main entry point for all JavaFX applications.
     * The start() method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     * start() is public, so it can interact with any part of this or another application.
     * start() is a void method, and so performs some action other than to return an item.
     * The start() method is abstract and must be overridden.
     *
     * @param primaryStage the primary stage for this application, onto which
     *                     the application scene can be set. The primary stage will be embedded
     *                     in the browser if the application was launched as an applet.
     *                     Applications may create other stages, if needed, but they will not
     *                     be primary stages and will not be embedded in the browser.
     * @throws Exception indicates conditions that a reasonable application might want to catch.
     */

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //crate a scanner object to read user input.
        Scanner keyboard = new Scanner(System.in);

        //create a character array to store character values.
        char[] name = new char[5];
        name[0] = 'B';
        name[1] = 'r';
        name[2] = 'a';
        name[3] = 'd';
        name[4] = 'y';

        System.out.println("Hello, my name is:");

        //use integer class to convert data of character array to binary and print as string.
        System.out.println("0" + Integer.toBinaryString(name[0]) + " " + "0"
                + Integer.toBinaryString(name[1]) + " " + "0"
                + Integer.toBinaryString(name[2]) + " " + "0"
                + Integer.toBinaryString(name[3]) + " " + "0"
                + Integer.toBinaryString(name[4]));
        System.out.println("Let's practice learning about all of the Java primitive data types.");

        //print a blank line for formatting purposes.
        System.out.println();
        //use escape sequences to make the prompt more readable.
        System.out.println("Enter in a Byte value,\n" +
                "a Short value,\n" +
                "an Integer value," +
                "a Long value,\n" +
                "a Float value,\n" +
                "a Double value,\n" +
                "a Character value(within single quotes, such as 'a'),\n" +
                "and a Boolean value.\n" +
                "Remember to press enter after each entry.");

        //create an object array and assign user input to the indices of the array.
        Object[] input = new Object[8];
        input[0] = keyboard.nextByte();
        input[1] = keyboard.nextShort();
        input[2] = keyboard.nextInt();
        input[3] = keyboard.nextLong();
        input[4] = keyboard.nextFloat();
        input[5] = keyboard.nextDouble();
        input[6] = keyboard.next().charAt(1);
        input[7] = keyboard.nextBoolean();

        //create an alert object of pre-created type 'Information'
        Alert show = new Alert(Alert.AlertType.INFORMATION);
        //set the title of the alert dialog box
        show.setTitle("Your Input");
        //set the header of the box
        show.setHeaderText("You Entered:");
        //display the previously entered user input in the alert box
        show.setContentText("Byte value: \'" + input[0] + "\', \n" + "Short value: \'" + input[1] +
                "\', \nInteger value: \'" + input[2] + "\', \nLong value: \'" + input[3] +
                "\', \nFloat value: \'" + input[4] + "\', \nDouble value: \'" + input[5] +
                "\', \nCharacter value: \'" + input[6] + "\', \nand Boolean value:  \'" +
                input[7] +"\'");

        //display the box and wait for user interaction
        show.showAndWait();


    }
}
