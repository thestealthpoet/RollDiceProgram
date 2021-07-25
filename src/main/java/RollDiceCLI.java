import java.util.Scanner;

public class RollDiceCLI {
    private static final D4die d4 = new D4die();
    private static final D6die d6 = new D6die();
    private static final D10die d10 = new D10die();
    private static final D12die d12 = new D12die();
    private static final D20die d20 = new D20die();

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("***This is a random number generator for D&D dice***");
        System.out.print("What die would you like to roll? (D4, D6, D10, D12, D20)>>>");
        String dieChoice = userInput.nextLine();
        boolean doRepeat = true;
        //while (doRepeat) {
            switch (dieChoice) {
                case "D4":
                    System.out.println("Your " + d4.getName() + " roll was: " + d4.rollDie());
                    break;
                case "D6":
                    System.out.println("Your " + d6.getName() + " roll was: " + d6.rollDie());
                    break;
                case "D10":
                    System.out.println("Your " + d10.getName() + " roll was: " + d10.rollDie());
                    break;
                case "D12":
                    System.out.println("Your " + d12.getName() + " roll was: " + d12.rollDie());
                    break;
                case "D20":
                    System.out.println("Your " + d20.getName() + " roll was: " + d20.rollDie());
                    break;
                default:
                    System.out.println("That is a not a valid option. Try again.");

                //System.out.println("Would you like to roll again? (Y/N)>>>");

            }
            }


    }

