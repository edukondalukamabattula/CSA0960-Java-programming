import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Random random = new Random();
        int Result = 5; 
        int rockCount = 0;
        int paperCount = 0;
        int scissorsCount = 0;

        for (int i = 0; i < Result; i++) {
            int generatedNumber = random.nextInt(3);
            switch(generatedNumber) {
                case 0:
                    System.out.println("rock");
                    rockCount++;
                    break;
                case 1:
                    System.out.println("paper");
                    paperCount++;
                    break;
                case 2:
                    System.out.println("scissors");
                    scissorsCount++;
                    break;
                default:
                    System.out.println("Invalid number generated");
                    break;
            }
        }

        System.out.println("Results:");
        System.out.println("Rock: " + rockCount);
        System.out.println("Paper: " + paperCount);
        System.out.println("Scissors: " + scissorsCount);
    }
}