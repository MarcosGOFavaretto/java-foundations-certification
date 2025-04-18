public class BitwiseOperators {

    static final byte NUMBER_ONE = 0B00000001;
    static final byte NUMBER_TWO = 0B00000010;
    static final byte NUMBER_EIGHT = 0B00001000;
    static final int HIGH_NUMBER = 0B11111111;

    static final int BYTES_TO_SHIFT = 3;

    public static void main(String[] args) {

        /*
         * 00000001
         * 00000010
         * -------- (&)
         * 00000000
         */
        System.out.println("AND (&): \t\t\t" + (NUMBER_ONE & NUMBER_TWO)); // prints 0.

        /*
         * 00000001
         * 00000010
         * -------- (|)
         * 00000011
         */
        System.out.println("OR (|): \t\t\t" + (NUMBER_ONE | NUMBER_TWO)); // prints 3.

        /*
         * 00000001
         * 00000010
         * -------- (^)
         * 00000011
         */
        System.out.println("XOR (^): \t\t\t" + (NUMBER_ONE ^ NUMBER_TWO)); // prints 3.

        /*
         * 00000001
         * -------- (~)
         * 11111110
         */
        System.out.println("NOT (~): \t\t\t" + (~NUMBER_ONE)); // prints -2 because of numeric promotion (11111111 11111111 11111111 11111110).

        /*
         * 00001000
         * -------- (>> 3)
         * 00000001
         */
        System.out.println("Right shift (>>): \t\t" + (NUMBER_EIGHT >> BYTES_TO_SHIFT)); // prints 1.

        /*
         * 00001000
         * -------- (<< 3)
         * 01000000
         */
        System.out.println("Left shift (<<): \t\t" + (NUMBER_EIGHT << BYTES_TO_SHIFT)); // prints 64.

        /*
         * 11111111
         * -------- (>>> 3)
         * 00011111
         */
        System.out.println("Unsigned right shift (>>>) \t" + (HIGH_NUMBER >>> BYTES_TO_SHIFT)); // prints 31.
    }

}