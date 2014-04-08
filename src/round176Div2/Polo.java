package round176Div2;

import java.util.Scanner;

public class Polo {

	public Polo() {
		
		int n=0, k=0, covered = 0;
		Scanner scanner =  new Scanner(System.in);
		n = scanner.nextInt(); // length of array
		k = scanner.nextInt(); // divisable number
		
		for (int i = 0; i < n; ++i) {
			int start, end;
			start = scanner.nextInt();
			end = scanner.nextInt();
			
			covered += (end - start + 1);
			
		} 
		
		covered %= k;
		if(covered !=0)
			covered = k-covered;
		
		System.out.println("Covered = "+covered);
		
	}


	
	public static void main(String[] args) {
		new Polo();
	}

}
