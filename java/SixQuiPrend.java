

public class SixQuiPrend {

    private static final int NB_CARD_MAX = 104;

    public static int findNumberOfBullHeads(int value) {
        if(value == 55) return 7;

        int bull_heads = 1;

        if(value % 5 == 0) bull_heads += 1;
        if(value % 10 == 0) bull_heads += 1;
        return (value % 11 == 0 && value != 100)? bull_heads += 4 : bull_heads;
    }

    public static void gameLoop() {
        for (int cardValue = 1 ; cardValue <= NB_CARD_MAX ; cardValue++) {
            System.out.println(cardValue + " -> " + findNumberOfBullHeads(cardValue));
        }
    }
}
