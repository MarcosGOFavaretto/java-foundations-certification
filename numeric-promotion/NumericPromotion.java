public class NumericPromotion {

    public static void main(String[] args) {

        byte b = 1;
        // short s = -b; Esta linha não compila, dado que "-b" é int.

        int i = 1;
        long l = 1L;
        int j = 0;
        // j = i + l; Esta linha não compila, dado que "i + l" é long.

        System.out.println(j);

        b += 1;
        short s = --b;

        System.out.println(b);
        System.out.println(s);
    }

}