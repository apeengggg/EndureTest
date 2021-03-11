
public class SepuluhO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int a = 1;
		int x = 16; 
		for (int i=1; i<=n; i++){
				if (i==1){
					System.out.print(x+",");
					a = a+1;
			}
				x = x*a;
				System.out.print(x+",");
		}
	}

}
