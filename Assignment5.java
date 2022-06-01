
/** ***************************************************************************
 *
 * FILE:           Assignment5.java
 * DATE:           Nov 2, 2021
 * AUTHOR:         Nathan Grabowski
 * VERSION:        1.0
 * PURPOSE:
 *
 ***************************************************************************** */
import java.io.File;
import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Assignment5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Global Sound Clips
        Clip bombSnd = null;//Clips to be played

        //Prepare an Audio File for the Verifiers, let's use the bomb sound
        //Load up bomb sound file
        File bombSndF = new File("Sounds/Explosion.wav");

        try {
            bombSnd = AudioSystem.getClip();
            bombSnd.open(AudioSystem.getAudioInputStream(bombSndF));
        } catch (Exception e) {
            System.out.println(e);
        }

        //Create the 8 verifiers
        IntVerifier intVer1 = new IntVerifier(input, 1, true, 10, true, bombSnd);
        IntVerifier intVer2 = new IntVerifier(input, 1, false, 10, true, bombSnd);
        IntVerifier intVer3 = new IntVerifier(input, 1, true, 10, false, bombSnd);
        IntVerifier intVer4 = new IntVerifier(input, 1, false, 10, false, bombSnd);
        DoubleVerifier dlbVer1 = new DoubleVerifier(input, 0, true, .1, true, bombSnd);
        DoubleVerifier dlbVer2 = new DoubleVerifier(input, 0, false, .1, true, bombSnd);
        DoubleVerifier dlbVer3 = new DoubleVerifier(input, 0, true, .1, false, bombSnd);
        DoubleVerifier dlbVer4 = new DoubleVerifier(input, 0, false, .1, false, bombSnd);

        while (true) {
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("Welcome to Assign 5 Tester");
            System.out.println("1 = Print Square Roots 1-100");
            System.out.println("2 = BoxPrint a Phrase");
            System.out.println("3 = Test Int Ver L inc H inc");
            System.out.println("4 = Test Int Ver L exc H inc");
            System.out.println("5 = Test Int Ver L inc H exc");
            System.out.println("6 = Test Int Ver L exc H exc");
            System.out.println("7 = Test Dbl Ver L inc H inc");
            System.out.println("8 = Test Dbl Ver L exc H inc");
            System.out.println("9 = Test Dbl Ver L inc H exc");
            System.out.println("10 = Test Dbl Ver L exc H exc");
            System.out.println("0 = I'm out");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

            int menuchoice = input.nextInt();

            if (menuchoice == 0) {
                break;
            }

            if (menuchoice == 1) {
                NJGUtilities.squareRootLoop();
                break;
            }

            if (menuchoice == 2) {
                System.out.println("Enter a message to be displayed");
                input.skip("\n");
                String message = input.nextLine();
                NJGUtilities.outputBoxedStr(message);
                break;
            }

            if (menuchoice == 3) {
                System.out.println("Please type in # between 1 (inc) and 10 (inc)");
                int intValue = intVer1.readAndVerify();
                System.out.println("GOLDEN");
                break;
            }

            if (menuchoice == 4) {
                System.out.println("Please type in # between 1 (exc) and 10 (inc)");
                int intValue = intVer2.readAndVerify();
                System.out.println("GOLDEN");
                break;
            }

            if (menuchoice == 5) {
                System.out.println("Please type in # between 1 (inc) and 10 (exc)");
                int intValue = intVer3.readAndVerify();
                System.out.println("GOLDEN");
                break;
            }
            if (menuchoice == 6) {
                System.out.println("Please type in # between 1 (exc) and 10 (exc)");
                int intValue = intVer4.readAndVerify();
                System.out.println("GOLDEN");
                break;
            }
            if (menuchoice == 7) {
                System.out.println("Please type in # between 1 (exc) and 10 (exc)");
                double doubleValue = dlbVer1.readAndVerify();
                System.out.println("GOLDEN");
                break;
            }
            if (menuchoice == 8) {
                System.out.println("Please type in # between 1 (exc) and 10 (exc)");
                double doubleValue = dlbVer2.readAndVerify();
                System.out.println("GOLDEN");
                break;
            }
            if (menuchoice == 9) {
                System.out.println("Please type in # between 1 (exc) and 10 (exc)");
                double doubleValue = dlbVer3.readAndVerify();
                System.out.println("GOLDEN");
                break;
            }
            if (menuchoice == 10) {
                System.out.println("Please type in # between 1 (exc) and 10 (exc)");
                double doubleValue = dlbVer4.readAndVerify();
                System.out.println("GOLDEN");
                break;
            }
        }
    }
}
