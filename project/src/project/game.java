package project;

import java.util.*;

public class game {
	
	//User input
	int x;
	//Computer input
	int y;

	Scanner scanner;
	Random random;

	game(){
		
		//Tries
		int z;
		//loop
		int i;
		
		scanner = new Scanner(System.in);
		random = new Random();
		
		//Allows player  to chooses how many attempts they get
		System.out.println("How many attempts do you want?");
		z = scanner.nextInt();
		
		y = random.nextInt(100);
		
	
		
		for(i = 0; i < z;  i++) {
			
			
			System.out.println("Enter your guess from 1 - 100:");
			x = scanner.nextInt();
			
			
			if(x==y) {
				System.out.println("You guessed correctly!!" + 
								   "\n" + "Computer number -> " + y +
								   "\n" + "Your guess -> " + x);
				break;
				
			}else if(x < y && i != z -1){
				System.out.println(x + " was to low!");
			}else if(x > y && i != z -1){
				System.out.println(x + " was too high!");
			}
			
			
		}
		
		if(z == i) {
			System.out.println("You've Failed!" + "\n"
				       + "Computer number:" + y);
		}
	
		
	}
	
	
	
	
}
