
public class SepuluhQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int a = 2;
		int x = 160; 
		for (int i=1; i<=n; i++){
				if (i==1){
					System.out.print(x+",");
			}
				x = x/a;
				System.out.print(x+",");
		}
	}

}
