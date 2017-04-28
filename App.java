interface Executable{
	int execute(int a);
}


class Runner{
	public void run(Executable e, int count){
		System.out.println("Executing code block...");
		int sum = 0;
		int noOfValues = count > App.arrayOfNum.length ? App.arrayOfNum.length : count;
		for(int i=0; i<noOfValues; i++){
			sum = sum + e.execute(i);
			System.out.println("value of sum for product "+ i + " is : " + sum);
		}
		
		System.out.println("Final Sum of product for " + count + " numbers is : " + sum);
	}
}

public class App {
	
	public static final int[] arrayOfNum = new int[10000000];
	public static final int c = 200;

	public static void main(String[] args) {
		
		int length = arrayOfNum.length;
		for(int i=0; i<length; i++){
			arrayOfNum[i] = i;
		}
		
		System.out.println("Input: Ärray length (n): "+ arrayOfNum.length);
		System.out.println("Input: C = " + c);
		Runner runner = new Runner();
		runner.run((int a) -> a, c);
	}

}
