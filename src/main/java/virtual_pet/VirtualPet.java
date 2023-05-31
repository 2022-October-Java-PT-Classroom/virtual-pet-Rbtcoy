package virtual_pet;

public class VirtualPet {
    private int food = 60;
    private int water = 60;
    private int play = 60;
    private String name = "";

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


    public void getStatus(){
        System.out.println(getName()+" the corgi");
        System.out.println("Hunger Level: "+getFood());
        System.out.println("Water Level: "+getWater());
        System.out.println("Entertained level: "+getPlay());
    }

    public void onTick(int playerChoice){
        switch (playerChoice){
            case 1: food += 10; water -= 5; play -=5; break;
            case 2: food -= 5; water += 10; play -=5; break;
            case 3: food -= 5; water -= 5; play +=10; break;
            default: System.out.println("Sorry not understand"); break;
        }
    }
}
