package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        boolean game = true;
        int userSelection;
        String userNameSelect = "";
        Scanner input = new Scanner(System.in);
        SystemLogic sus = new SystemLogic();
        DayNightCycle dayNight = new DayNightCycle();
        System.out.println("Please enter a name for your corgi: ");
        userNameSelect = input.nextLine();
        VirtualPet max = new VirtualPet(50, 50, 50, userNameSelect);
        do {
            dayNight.cycleCheck(dayNight.getTimeTracker());
            max.getStatus();
            System.out.println();
            sus.promptUser();
            userSelection = input.nextInt();
            if (userSelection == 4) {
                System.out.println("Aw well, thanks for playing! Bye!");
                game = false;
            } else if (userSelection > 3 || userSelection < 1) {
                System.out.println("Im sorry, I do not understand that choice, please try again...");
            } else {
                max.onTick(userSelection);
                dayNight.userSelectionMatcher(userSelection);
            }

        } while (game);
        input.close();
    }

}
