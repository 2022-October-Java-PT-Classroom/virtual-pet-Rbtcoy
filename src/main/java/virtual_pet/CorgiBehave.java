package virtual_pet;

public class CorgiBehave {
    private String corgiBehaveOne = " does some zoomies around the house, they are hekkin fast";
    private String corgiBehaveTwo = " unleashes their inner beast and howls at the moon (even if its not there)";
    private String corgiBehaveThree = " does an arial flip through the air and sticks the landing, 10's across the board";
    private String corgiBehaveFour = " sploots and goes belly up, looks like they're not feeling it right now";

    public int randoBehave(String petName){
        int randoFour = (int) ((Math.random()*4)+1);
        switch(randoFour){
            case 1: System.out.println(petName + corgiBehaveOne);
            return 1;
            case 2 : System.out.println(petName + corgiBehaveTwo);
            return 2;
            case 3 : System.out.println(petName + corgiBehaveThree);
            return 3;
            case 4 : System.out.println(petName + corgiBehaveFour);
            return 4;
            default : System.out.println("I am error"); return 0;
        }
    }
}
