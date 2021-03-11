
public class SepuluhK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int a = 4;
		int x = 1; 
		for (int i=1; i<=n; i++){
			if(i==1){
				System.out.print(x+",");
			}
			x = x*a;
			System.out.print(x+",");
		}
	}	

}
