package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        boolean game = true;
        int userSelection;
        String userNameSelect = "";
        String userGreeting = "Please enter a name for your corgi: ";
        String userFarewell = "Aw well, thanks for playing! Bye!";
        String userErrorText = "Im sorry, I do not understand that choice, please try again...";
        Scanner input = new Scanner(System.in);
        SystemLogic sus = new SystemLogic();
        // DayNightCycle dayNight = new DayNightCycle();
        // CorgiBehave goodBoy = new CorgiBehave();
        // Exploration explore = new Exploration();
        System.out.println(userGreeting);
        userNameSelect = input.nextLine();
        VirtualPet max = new VirtualPet(50, 50, 50, userNameSelect);
        do {
            System.out.println();
            // dayNight.cycleCheck(dayNight.getTimeTracker());
            max.getStatus();
            System.out.println();
            sus.promptUser();
            userSelection = input.nextInt();
            if (userSelection == 4) {
                System.out.println(userFarewell);
                game = false;
            } else if (userSelection > 3 || userSelection < 1) {
                System.out.println(userErrorText);
            } else {
                max.onTick(userSelection);
                // dayNight.userSelectionMatcher(userSelection);
                System.out.println();
                // max.goodDog(goodBoy.randoBehave(max.getName()));
            }

        } while (game);
        input.close();
    }

}
