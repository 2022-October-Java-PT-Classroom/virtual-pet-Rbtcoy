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


    public String getStatus(){
        outputStr = "Hello I am: "+ getName() + " and my food level is: "
    }
}
