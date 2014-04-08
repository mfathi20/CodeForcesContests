package round176Div2;

import java.util.Scanner;

public class Shaass {

	int max = 100;
	int[] birds = new int[max];
	int count, shot;
	
	Scanner scanner = new Scanner(System.in);
	
	public Shaass() {
		
		count  = scanner.nextInt();
		shot = scanner.nextInt();
		
	}

	
	public static void main(String[] args) {
		new Shaass();
	}

}
