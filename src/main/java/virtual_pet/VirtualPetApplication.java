package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        boolean game = true;
        int userSelection;
        Scanner input = new Scanner(System.in);
        VirtualPet max = new VirtualPet(50,50,50,"Max");
        SystemLogic sus = new SystemLogic();
        do{
            max.getStatus();
            System.out.println();
            sus.promptUser();
            userSelection = input.nextInt();
            if(userSelection == 4){
                System.out.println("Aw well, thanks for playing! Bye!");
                game = false;
            }else if(userSelection>3 || userSelection<1){
                System.out.println("Im sorry, I do not understand that choice, please try again...");
            }else{max.onTick(userSelection);}
            


        }while(game);
        input.close();
    }

}
