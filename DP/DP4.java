import java.util.*;
class DP4 {
    public static void main(String[] args) throws InputMismatchException {
        try {
            var e1 = new ExceptionPOC();
            e1.checkInput();
        } catch (InputMismatchException e) {
            println("invalid Input:" + e);
        }
    }

    static void println(Object x) {
        System.out.println(x);
    }
}
class ExceptionPOC {
    public void checkInput() {
        System.out.println("System requestin number from 1 to 10. ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        if (number < 1 || number > 10) {
            throw new InputMismatchException("\nusing throw number was : " + number);
        }
        System.out.println("input is " + number);
    }
}

