package bai2;

public class bai2d {
	public static int tongphantu(int[]array) {
		int sum =0;
		for (int dem: array) {
			sum+=dem;
		}
		return sum;
	}
	public static void main(String[]args) {
		int[]array= {1,3,5,7,9};
		int totalSum=tongphantu(array);
		System.out.println("tong cac phan tu la:"+totalSum);
	}

}
