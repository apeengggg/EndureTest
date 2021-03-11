
public class SepuluhU {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 21;
		int x = 0;
		for (int i=1; i<=n; i++){
				System.out.print(x+",");
				x=x+1;
				if((x%10)==0){
					x=0;
				}
		}
	}

}
