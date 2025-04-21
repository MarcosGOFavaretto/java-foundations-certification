public class EvaluationOrder {

    public static void main(String[] args) throws Exception {

        int result = getA() + getB() + ((getException()) + getC()); // getC will not be invoked!
        System.out.println(result);
    }

    public static int getA() {
        System.out.println("Method A invoked!");
        return 1;
    }

    public static int getB() {
        System.out.println("Method B invoked!");
        return 1;
    }

    public static int getException() throws Exception {
        throw new Exception("An Exception occurred!");
    }

    public static int getC() {
        System.out.println("Method C invoked!");
        return 1;
    }

}