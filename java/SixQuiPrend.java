

public class SixQuiPrend {

    private static final int NB_CARD_MAX = 104;

    public static int findNumberOfBullHeads(int value) {
        // TODO

        return 0;
    }

    public static void gameLoop() {
        for (int cardValue = 1 ; cardValue <= NB_CARD_MAX ; cardValue++) {
            System.out.println(cardValue + " -> " + findNumberOfBullHeads(cardValue));
        }
    }
}
