package bai2;

public class bai2f {
	public static void sapxepgiaithuat(int[]array) {
		for (int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if (array[j]>array[j+1]) {
					int temp =array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[]args) {
		int[]array= {5,2,4,3};
		sapxepgiaithuat(array);
		System.out.println("so duoc sap xep:");
		for (int dem:array) {
			System.out.println(dem+"");
		}
	}

}
