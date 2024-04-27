package bai1;

public class ham1a {
	public static int 
	dequy(int n) {
		if (n<=2) {
			return 1;
		} else {
			return dequy (n-1) + dequy(n-2);
		}
		
	} 
	public static void  main(String[]args) {
		System.out.println("Gia tri cua f8 la:"+dequy(8));
	}

}
