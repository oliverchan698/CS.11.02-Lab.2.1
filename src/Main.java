/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Oliver
*****************************************************************************************************
*/

public class Main {
    public static void main(String[] args) {
        int add2 = add(4, 9);
        System.out.println(add2);

        int add4 = add(2, 6, 8, 3);
        System.out.println(add4);

        String goodmorning = morningGreeting("Toby Fox");
        System.out.println(goodmorning);

        String goodafternoon = afternoonGreeting("Mac Miller");
        System.out.println(goodafternoon);

        String dude = triple("oohbaby"); // Does it really have to be this string?
        System.out.println(dude);

        double half1 = half(8);
        double half2 = half(17);
        System.out.println(half1);
        System.out.println(half2);

        int roundpos1 = roundPositiveValueToNearestInteger(8.5);
        int roundpos2 = roundPositiveValueToNearestInteger(8.49);
        int roundneg1 = roundNegativeValueToNearestInteger(-8.5);
        int roundneg2 = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(roundpos1);
        System.out.println(roundpos2);
        System.out.println(roundneg1);
        System.out.println(roundneg2);

    }

    // 1. add
    public static int add(int a, int b) {
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d) {
        return add(add(a, b), add(c, d));
    }
    // 3. morningGreeting
    public static String morningGreeting(String name) {
        return "早上好, " + name + "!"; // Dude
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name) {
        return "下午好, " + name + "!"; // Doooooode
    }
    // 5. triple
    public static String triple(String input) {
        return input + input + input;
    }
    // 6. half
    public static double half(double input) { // double half looks weird
        return input / 2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double input) { // I would not give a method this long a name
        return (int) (input + 0.5);
    }
    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double input) {
        return (int) (input - 0.5);
    }
}
