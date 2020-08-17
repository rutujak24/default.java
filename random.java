/*Assignment: A new game has to be invented by you. Program generates random number between 0 to 1000. 
It is a multiplayer game so program takes 2 users as input. Both play the 3 times and one with maximum score wins. 
And program displays the Winner name?  
(hint: use java.util.Random class)*/

import java.util.Random;
import java.util.*;

public class random
{
	public static void main(String[] args) {
		
		System.out.println("The Game has began!");
		Random rand = new Random(); 
  
        // Generate random integers in range 0 to 999 
        int user_1 = rand.nextInt(1000); 
        int user_2 = rand.nextInt(1000); 
        
        user_1+=rand.nextInt(1000);
        user_2+=rand.nextInt(1000);
        
        user_1+=rand.nextInt(1000);
        user_2+=rand.nextInt(1000);
        
        System.out.println("User 1 total score: " +user_1);
		System.out.println("User 2 total score: " +user_2);
		
		if(user_1>user_2){
		    System.out.println("The winner is User 1 with score: " +user_1);
		}
		else if (user_2>user_1){
		    System.out.println("The winner is User 2 with score: " +user_2);
		}
		else{
		    System.out.println("The game ended up in a draw!");
		}
	}
}
