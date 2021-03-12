
public class SepuluhA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		int n =5;
//		int[] array = new int[n];
		int[] primes = {2,3,5,7,11,13};
		for (int i=0; i<=n; i++){
            if(i==0){
            	System.out.print(x+",");
//            	x = array[i];
            }
            x = x + primes[i];
            System.out.print(x+",");
        }
		
		
			
	}
}
