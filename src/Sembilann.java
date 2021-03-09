
public class Sembilann {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {40,38,44,50,45};
		int jml = 0;
		String ket;
		for (int i=0; i<=a.length; i++){
			jml = jml + a[i];
			int jumlah = a.length;
			int hasil = jml/jumlah;
			if (a[i] >= hasil){
				ket = "IDEAL";
			}else{
				ket = "KURANG IDEAL";
			}
			System.out.println("Berat Siswa Ke " + hasil + " adalah " + a[i] + " Berat Yang " + ket);
		}
	}
	
	public static double luaslingkaran(double r){
		double luas = 3.14 * (r*2);
		return luas;
	}

}
