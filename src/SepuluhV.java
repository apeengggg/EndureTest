
public class SepuluhV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int x = 0;
		for (int i=1; i<=n; i++){
				if((x%3)==0 && i!=1){
					System.out.print("*"+",");
					x=x+1;
				}else{
					System.out.print(x+",");
					x=x+1;
				}
		}
	}

}
