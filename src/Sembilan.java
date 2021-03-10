public class Sembilan {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={40,38,44,50,45};
		int weight = 0;
		for(int j=0; j<a.length; j++){
			weight += a[j];
		}
		double avg = weight/a.length;
		System.out.println("RATA-RATA BERAT BADAN: " + avg);
		for(int i=0; i<a.length; i++){
			if(a[i] < avg ){
				System.out.println("Berat " + a[i] + " Kurang Ideal !");
			}else{
				System.out.println("Berat " + a[i] + " Ideal !");
			}
		}
		
		
	}
	
}