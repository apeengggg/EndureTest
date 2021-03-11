
public class SepuluhN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int a = 0;
		int x = 3; 
		for (int i=1; i<=n; i++){
			if(i==1){
				System.out.print(x+",");
				a = a+3;
			}
			x = x+a;
			a = a+2;
			System.out.print(x+",");
		}
	}

}
