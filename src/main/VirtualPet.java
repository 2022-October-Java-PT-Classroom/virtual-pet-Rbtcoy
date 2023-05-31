public class VirtualPet {
    private int food = 60;
    private int water = 60;
    private int play = 60;

    public VirtualPet(int food, int water, int play) {
        this.food = food;
        this.water = water;
        this.play = play;
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
}
