package bai2;

public class bai2a {
	public static int demsochan(int[]array) {
		int dem =0;
		for (int nguyento : array) {
			if (nguyento % 2 == 0) {
				dem+=1;
			}
		}
		return dem;
	}
	public static void main(String[]args) {
		int []array= {1,2,3,4,5,8,10,6};
		int sochan=demsochan(array);
		System.out.println("So phan tu chan la:"+sochan);
	}

}
