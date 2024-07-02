import java.util.Random;
import java.util.Scanner;

class CoinGame {
    private String[] strarr = new String[5];
    private String name;

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
        enterName();
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

    void enterName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Who are you?");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        new CoinGame().run();
    }
}