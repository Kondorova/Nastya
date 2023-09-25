import myfirstpackage.*;
public class MyFirstClass {
	public static void main(String[] s) {
		myfirstpackage dif = new myfirstpackage();
		System.out.println("Разность");
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
