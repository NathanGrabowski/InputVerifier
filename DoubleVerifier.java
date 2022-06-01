
/** ***************************************************************************
 *
 * FILE:           DoubleVerifier.java
 * DATE:           Nov 4, 2021
 * AUTHOR:         Nathan Grabowski
 * VERSION:        1.0
 * PURPOSE:
 *
 ***************************************************************************** */
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.sound.sampled.Clip;

public class DoubleVerifier {

    public DoubleVerifier(Scanner sc, double lo, boolean loInc,
            double hi, boolean hiInc, Clip eSnd) {

        keyboard = sc;
        low = lo;
        high = hi;
        highInc = hiInc;
        lowInc = loInc;
        errorSnd = eSnd;

    }

    public double readAndVerify() {
        while (true) {
            double inVal = 0;
            try {
                inVal = keyboard.nextDouble();
                if (highInc && lowInc) {
                    if (inVal <= high && inVal >= low) {
                        return inVal;
                    }
                }
                if (highInc && !lowInc) {
                    if (inVal <= high && inVal > low) {
                        return inVal;
                    }
                }
                if (!highInc && lowInc) {
                    if (inVal < high && inVal >= low) {
                        return inVal;
                    }
                }
                if (!highInc && !lowInc) {
                    if (inVal < high && inVal > low) {
                        return inVal;
                    }
                }
                System.out.println("OUT OF RANGE");
            } catch (InputMismatchException e) {
                System.out.println("@@@@@@@@@@@@@@@@@@@@");
                System.out.println(" Bad Character");
                System.out.println("@@@@@@@@@@@@@@@@@@@@");
                errorSnd.setFramePosition(0);
                errorSnd.start();
            } finally {
                keyboard.nextLine();
            }
        }
    }
    //Global Variables
    private Scanner keyboard;
    private double low, high;
    private boolean highInc, lowInc;
    private Clip errorSnd;
}
