package learn.programming;

public class second {
	// This is a comment

	public static void main(String[] args) throws Exception {
		implimentingArrays();
		Thread.sleep(500);
		dubArrays();
		Thread.sleep(1000);
		warmUp();
	}

	public static void implimentingArrays() {
		int cat[] = { 4, 109, 88, 13, 21, 17, 9 };
		for (int a : cat) {
			System.out.println(a);
		}
	}

	public static void dubArrays() {
		int cat[][] = { { 15, 22, 33, 44 }, { 50, 60 } };

		for (int[] x1 : cat) {
			for (int b : x1) {
				System.err.println(b);
			}
		}
	}
	
	public static void  warmUp() {
		int x = 0;
		
		do {
			x++; //1, 4, 8
			System.out.println(x); //1, 4, 8
			if(++x < 5) { //2, 5, 9
				continue;
			}
			x++; // 2, 6, 10
			System.out.println(x); //2, 6, 10
		}while(x++ < 10); //3, 7, 10
	}
	
	
}
