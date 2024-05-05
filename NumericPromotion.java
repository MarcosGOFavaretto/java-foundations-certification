public class NumericPromotion {

    public static void main(String[] args) {
        byte b = 0b00000001;
        short s = b - b; // b is converted to int for expression evaluation.

        System.out.println(s);
    }

}