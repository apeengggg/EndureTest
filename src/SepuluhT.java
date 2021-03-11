
public class SepuluhT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int x = 0; 
		for (int i=1; i<=n*2; i++){
			if((x%2)==0){
				System.out.print(x+",");
				System.out.print(x+",");
				x=x+1;
			}else{
				x=x+1;
			}
		}
	}
}
