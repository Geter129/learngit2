package test2;


public class Main {
	public static void main(String[] args) {
//		int x = 1;
//		float y =2;
//		System.out.println(x/y);
		
		int x = 4;
		int y = (x++)+(++x)+(x*10);
		int a = 10;
		int b = 10;
		int c = 10;
	
		a = b++;	//a: b:	
		//c = --a;		//a:  c:
		b = ++a;	//a: b:	
		//a = c--;
		System.out.println(x);
		System.out.println(y);
	}
}
