
public class TujuhPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b=0, c=13;
		for (int i=b; i<=c; i++){
            a=0; 
//            System.out.println("A adalah " + a);
//            System.out.println("B adalah " + b);
//            System.out.println("C adalah " + c);
            for (int j=1; j<=i; j++){
                if (i%j==0){
                    a = a+1;
                }
            }
            if (a==2){
                System.out.println(i+ " ");
            }
        }
	}

}
