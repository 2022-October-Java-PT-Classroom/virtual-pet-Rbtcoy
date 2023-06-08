// package virtual_pet;

// public class DayNightCycle {
//     private int timeTracker = 1;

//     private String morningFeed = "You feed the precious corgi, arn't they so cute!";
//     private String dayFeed = "The afternoon sun rises in the sky while they dine upon Kibbles-n-Bits™";
//     private String nightFeed = "You hurriedly feed the corgi before midnight afraid of what might happen if you feed them after...";

//     private String morningWater = "Only the crispest water for the little one";
//     private String dayWater = "They lap at the cool and refreshing water";
//     private String nightWater = "The moon sits upon the nights sky, dancing in the dog's water dish only to be interrupted by the corgi's imbibing";

//     private String morningPlay = "You throw a bright red ball and, as if by rocket propulsion, the corgi gives chase";
//     private String dayPlay = "\"You enter a long corridor with 2 rooms on the right...\" You begin to narrate a Dungeons and Dragons™ scene for your corgi";
//     private String nightPlay = "You both dance crazily to a random song on your playlist";

//     public int getTimeTracker() {
//         return timeTracker;
//     }

//     public void foodTimeCheck(int timeCheck) {
//         switch (timeCheck) {
//             case 1:
//                 System.out.println(morningFeed);
//                 break;
//             case 2:
//                 System.out.println(dayFeed);
//                 break;
//             case 3:
//                 System.out.println(nightFeed);
//                 break;
//             default:
//                 System.out.println("Error I am");
//                 break;
//         }
//     }

//     public void waterTimeCheck(int timeCheck) {
//         switch (timeCheck) {
//             case 1:
//                 System.out.println(morningWater);
//                 break;
//             case 2:
//                 System.out.println(dayWater);
//                 break;
//             case 3:
//                 System.out.println(nightWater);
//                 break;
//             default:
//                 System.out.println("Error I am");
//                 break;
//         }
//     }

//     public void playTimeCheck(int timeCheck) {
//         switch (timeCheck) {
//             case 1:
//                 System.out.println(morningPlay);
//                 break;
//             case 2:
//                 System.out.println(dayPlay);
//                 break;
//             case 3:
//                 System.out.println(nightPlay);
//                 break;
//             default:
//                 System.out.println("Error I am");
//                 break;
//         }
//     }

//     public void userSelectionMatcher(int userSelection) {
//         switch (timeTracker) {
//             case 1:
//                 foodTimeCheck(userSelection);
//                 break;
//             case 2:
//                 waterTimeCheck(userSelection);
//                 break;
//             case 3:
//                 playTimeCheck(userSelection);
//                 break;
//         }
//     }

//     public void onTick() {
//         timeTracker++;
//         if (timeTracker > 3) {
//             timeTracker = 1;
//         }
//         cycleCheck(timeTracker);
//     }

//     public void cycleCheck(int cycleCheck) {
//         switch (cycleCheck) {
//             case 1:
//                 System.out.println("Good Morning");
//                 break;
//             case 2:
//                 System.out.println("Good Day");
//                 break;
//             case 3:
//                 System.out.println("Good Evening");
//                 break;
//             default:
//                 System.out.println("An error am I");
//         }
//     }
// }
