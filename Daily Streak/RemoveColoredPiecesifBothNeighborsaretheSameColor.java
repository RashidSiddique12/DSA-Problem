public class RemoveColoredPiecesifBothNeighborsaretheSameColor {

    public static boolean winnerOfGame(String colors) {

        int alice = 0;
        int bob = 0;
        for (int i = 1; i < colors.length() - 1; i++) {
            if (colors.charAt(i - 1) == 'A' && colors.charAt(i) == 'A' && colors.charAt(i + 1) == 'A') {
                alice++;
            } else if (colors.charAt(i - 1) == 'B' && colors.charAt(i) == 'B' && colors.charAt(i + 1) == 'B') {
                bob++;
            }
        }

        return (alice > bob) ? true : false;
    }

    public static void main(String[] args) {
        String colors = "AAABABB";

        boolean res = winnerOfGame(colors);
        if (res == true) {
            System.out.println("Alice win");
        } else {
            System.out.println("Bob win");
        }
    }
}
