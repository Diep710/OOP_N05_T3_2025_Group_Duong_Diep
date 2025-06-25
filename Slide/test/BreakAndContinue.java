public class BreakAndContinue {
    public static void testFor() {
        for (int i = 0; i < 100; i++) {
            if (i == 74)
                break; // out of for loop
            if (i % 9 != 0)
                continue; // next iteration
            System.out.println(i);
        }
    }

    public static void testWhile() {
        int i = 0;

        while (i < 100) {
            // thuc hien
            if (i == 74)
                break;
            if (i % 9 != 0) {

                i++;
            }

             System.out.println(i);

        }

    }

    public static void testDoWhile() {

    }
}
