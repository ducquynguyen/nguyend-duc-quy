package bai2;

public class bai2g {
	public static int giatrilonnhat(int[]array) {
		int max=array[0];
		for(int dem :array) {
			if(dem>max) {
				max=dem;
			}
		}
		return max;
	}
	public static void main(String[]args) {
		int[]array= {5,2,4,1};
		int giatrilonnhat=giatrilonnhat(array);
		System.out.println("gia tri lon nhat la:"+giatrilonnhat);
	}

}
