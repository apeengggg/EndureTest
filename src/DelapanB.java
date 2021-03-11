
public class DelapanB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1;
		int a=2;
		int count = 0;
		boolean primes = true;
		for(int i=a; i<=a; i++){
			for(j=1; j<=i; j++){
				if(i%j==0){
					primes =true;
					count +=1;
				}else{
					primes = false;
				}
			}
		}
		if(primes && count==2){
			System.out.println("is Prime!");
		}else{
			System.out.println("is not Prime!");
		}
	}

}
