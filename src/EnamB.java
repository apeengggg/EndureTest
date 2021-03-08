
public class EnamB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,2,3,4,1};	
		for(int i = (a.length-1); i>0; i--) {
			for(int j = 0; j<i; j++) {
				if(a[j]>a[(j+1)]) {
					int temp = a[(j+1)];
					a[(j+1)] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int x = 0; x<a.length; x++) {
			System.out.print(" "+a[x]);
		}
	}

}
