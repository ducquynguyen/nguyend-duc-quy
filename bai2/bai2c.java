package bai2;

public class bai2c {
	public static int demcacphantu(int[]array,int min,int max) {
		int count =0;
		for(int yeuto: array) {
			if (yeuto >= min && yeuto<=max) {
				count++;
			}
		}
		return count;
	}
	public static void main (String[]args) {
		int[]array= {1, 3, 5, 7, 9, 11};
		int dem=demcacphantu(array,4,12);
		System.out.println("so phan tu tu 4 den 12 la:"+dem);
		
	}

}
