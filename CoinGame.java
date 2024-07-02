import java.util.Random;

class CoinGame {
    private String[] strarr = new String[5];

    CoinGame() {
        for (int i = 0; i < 5; i++) {
            Random rnd = new Random();
            if (rnd.nextInt(2) == 0) {
                strarr[i] = "Heads";
            } else {
                strarr[i] = "Tails";
            }
        }
    }

    void run() {
        int cntH = 0, cntT = 0;
        System.out.println("Tossing a coin...");
        for (int i = 1; i <= 3; i++) {
            Random random = new Random();
            int rndnum = random.nextInt(5);
            System.out.println("Round " + i + ": " + strarr[rndnum]);
            if (strarr[rndnum].equals("Heads")) {
                cntH++;
            } else {
                cntT++;
            }
        }
        System.out.println("Heads: " + cntH + ", Tails: " + cntT);

        if(cntH > cntT){
            System.out.println("You won");
        }
        else{
            System.out.println("You lose");
        }
    }

    public static void main(String[] args) {
        new CoinGame().run();
    }
}