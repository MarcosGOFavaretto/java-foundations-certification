public class Main {
    public static void main(String[] args) {
        for (String s = null; s == null; System.out.println(s)) {
            s = "Nino";
        }

        System.out.println();

        for (int i = 0; true; System.out.println("Before: " + i), i++, System.out.println("After: " + i)) {
            if (i == 5)
                break;
        }

        System.out.println();

        for (System.out.println("Iniciando o for"); true;) {
            break;
        }

        for ( /* Executado ao iniciar */ ; /* condição para decidir se o FOR deve ser executado */ ; /* Executado após cada iteração */ ) {
            break;
        }
    }
}