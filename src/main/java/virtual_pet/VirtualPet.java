package virtual_pet;

public class VirtualPet {
    private int food = 60;
    private int water = 60;
    private int play = 60;
    private String name = "";
    private int randoFive = (int) (Math.random() * 5);
    // private int randoTwo = (int) (Math.random()*2);

    public VirtualPet(int food, int water, int play, String name) {
        this.food = food;
        this.water = water;
        this.play = play;
        this.name = name;
    }

    public int getWater() {
        return water;
    }

    public int getPlay() {
        return play;
    }

    public int getFood() {
        return food;
    }

    public String getName() {
        return name;
    }

    public void getStatus() {
        System.out.println(getName() + " the corgi");
        System.out.println("Hunger Level: " + getFood());
        System.out.println("Water Level: " + getWater());
        System.out.println("Entertained level: " + getPlay());
    }

    // public void goodDog(int randoBehave){
    //     switch(randoBehave){
    //         case 1:
    //         food -= randoFive;
    //         water -= randoFive;
    //         play += 10;
    //         break;
    //         case 2:
    //         if(randoTwo == 1){
    //             food += randoFive;
    //             water += randoFive;
    //             play += randoFive;
    //         }else{
    //             food -= randoFive;
    //             water -= randoFive;
    //             play -= randoFive;
    //         }
    //         break;
    //         case 3: 
    //         food += 10;
    //         water += 10;
    //         play += 10;
    //         break;
    //         case 4:
    //         food -= 10;
    //         water -= 10;
    //         play -= 10;
    //         break;
    //         default :
    //         System.out.println("I am error");
    //     }
    // }

    public void onTick(int playerChoice) {
        switch (playerChoice) {
            case 1:
                food += 10;
                water -= randoFive;
                play -= randoFive;
                break;
            case 2:
                food -= randoFive;
                water += 10;
                play -= randoFive;
                break;
            case 3:
                food -= randoFive;
                water -= randoFive;
                play += 10;
                break;
            default:
                System.out.println("Sorry not understand");
                break;
        }
    }
}
