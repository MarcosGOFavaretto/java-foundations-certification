public class FallThrough {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 0; i < 10; i++) {

            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    counter++;
            }

        }
        System.out.println(counter);

    }
}