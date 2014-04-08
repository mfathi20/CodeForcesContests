package round176Div2;

import java.util.Scanner;

public class Shaass {

	int max = 100;
	int[] birds = new int[max];
	int count, shot;
	
	Scanner scanner = new Scanner(System.in);
	
	public Shaass() {
		
		
		count  = scanner.nextInt();
		for (int i = 0; i < count; i++) {
			birds[i] = scanner.nextInt();
		}
		
		shot = scanner.nextInt();
		for (int i = 0; i < shot; i++) {
			int x, y;
			x= scanner.nextInt();
			y= scanner.nextInt();
			
			--x;
			
			if (x != 0) 
				birds[x-1] += y-1;
			
			if (x != count-1) 
				birds[x+1] += birds[x]-y;
			
			birds[x] = 0;
		}
		
		for (int i = 0; i < count; i++) {
			System.out.println(birds[i]);
		}
		
	}

	
	public static void main(String[] args) {
		new Shaass();
	}

}
