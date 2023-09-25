public class MyFirstClass {
	public static void main(String[] s) {
		MySecondClass dif=new MySecondClass();
		System.out.print("Разность");
		System.out.println();
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				dif.setA(i);
				dif.setB(j);
				System.out.print(dif.difference(i,j));
				System.out.print(" ");
			}
			System.out.println();	
		}
	}
}

class MySecondClass {
	private int a;
	private int b;

	public MySecondClass(){
	a=0;
	b=0;
	}

	public MySecondClass(int a, int b) {
	this.a=a;
	this.b=b;
	}

	public int getA(){
	return a;
	}

	public void setA(int a){
	this.a=a;
	}

	public int getB(){
	return b;
	}

	public void setB(int b){
	this.b=b;
	}

	public static int difference(int a,int b) {
	return a-b;
	}	
}