public class Ex06 {
    public static void sequence(int nbr) {
        String current = "1";

        for (int i = 0; i <= nbr; i++) {
            System.out.println(current);
            current = nextTerm(current);
        }
    }

    private static String nextTerm(String term) {
        StringBuilder next = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= term.length(); i++) {
            if (i < term.length() && term.charAt(i) == term.charAt(i - 1)) {
                count++;
            } else {
                next.append(count).append(term.charAt(i - 1));
                count = 1;
            }
        }
        return next.toString();
    }
}
