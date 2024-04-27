package bai2;

public class bai2b {
	public static boolean sapxeptangdan(int[]array) {
		for (int i=0;i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				return false;
			}
		}
		return true;
	}
		public static void main (String[]args) {
			int[]array1= {1,2,3,4,5};
			int[]array2= {5,4,3,2,1};
			System.out.println("mang 1 sap xep tang dan:"+sapxeptangdan(array1));
			System.out.println("mang 2 sap xep tang dan:"+sapxeptangdan(array2));
		
	}

}
