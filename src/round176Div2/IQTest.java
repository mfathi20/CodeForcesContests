/**
 * 
 */
package round176Div2;

import java.util.Scanner;

/**
 * @author Mohamed
 *
 */
public class IQTest {

	char[][] inp = new char[4][4]/*{{'#','#','#','#'},{'.','#','.','.'},{'#','#','#','#'},{'.','.','.','.'}}*/;
	
	/**
	 * 
	 */
	public IQTest() {
		// TODO Auto-generated constructor stub
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < inp.length; i++) {
			for (int j = 0; j < inp.length; j++) {
				inp[i][j] = scanner.nextLine().charAt(0);
				//System.out.print(inp[i][j]);
			}
			System.out.println();
		}
		
		if (test()) 
			System.out.println("Yes");
		else
			changePoint();
	
	}
	
	//=============================
	public boolean test(){
		for (int i = 0; i < inp.length; i++) {
			for (int j = 0; j < inp.length; j++) 
				if(test(i, j))
					return true;
			
		}
		return false;
	}

	private boolean test(int i, int j) {
		// TODO Auto-generated method stub
		if (i+1 == 4 || j+1 == 4) 
			return false;
		
		return inp[i][j]==inp[i][j+1] && inp[i][j]==inp[i+1][j] && inp[i][j]==inp[i+1][j+1];
		
	}

	public void changePoint(){
		boolean bool = false;
		for (int i = 0; i < inp.length; i++) {
			for (int j = 0; j < inp.length; j++) {
				char origin = inp[i][j];
				if (inp[i][j] == '#') 
					inp[i][j] = '.';
				else
					inp[i][j] = '#';
				
				if (test()) 
					bool = true;
				
				inp[i][j] = origin;
			}
		}
		
		if (bool) 
			System.out.println("YES");
		else
			System.out.println("NO");
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new IQTest();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
