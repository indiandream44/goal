package learning.filehandling;

public class Calculator {
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public int multiplication(int c, int d) {
		int e = c * d;
		return e;

	}

	public int devide(int g, int h) {
		int i = g / h;
		return i;
	}
	
	public int fact(){
		int n =0;
		int result =1;
		for(int i=1; i<=n;i++){
			result = result * i;
		}
		return result;
	}
}