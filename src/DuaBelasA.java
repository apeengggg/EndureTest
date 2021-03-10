
public class DuaBelasA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={41,11,31,15,4};
		int max = 0;
		for (int i=0; i<a.length; i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		System.out.print("Angka Terbesar dari Array a adalah: " + max);
	}

}
