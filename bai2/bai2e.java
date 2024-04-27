package bai2;

public class bai2e {
	public static int tongphantule(int[]array) {
		int sum=0;
		for(int dem:array) {
			if(dem % 2 != 0) {
				sum+=dem;
			}
		}
		return sum;
	}
	public static void main(String[]args) {
		int[]array= {1,2,3,4,5,6};
		int sumle=tongphantule(array);
		System.out.println("tong cac phan tu le la:"+sumle);
		}

}
