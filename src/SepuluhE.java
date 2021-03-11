
public class SepuluhE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int x = 2; 
		int n = 5;
		for (int i=1; i<=n; i++){
				if (i==1){
					System.out.print(x+",");
					a = a*4;
			}
				x = x+a;
				System.out.print(x+",");
				a = a+2;
		}
	}

}
