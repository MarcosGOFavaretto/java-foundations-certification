public class Precedence {
    public static void main(String[] args) {

        int result  = 5 >> (2 * 3) / 4 % 3 - 1;
                  //  5 >> (6) / 4 % 3 - 1;
                  //  5 >> (6 / 4) % 3 - 1;
                  //  5 >> (1) % 3 - 1;
                  //  5 >> (1 % 3) - 1;
                  //  5 >> (1) - 1;
                  //  5 >> (0);
                  // (5 >> 0);
                  //  5;

        System.out.println(result); // prints 5.

    }
}
