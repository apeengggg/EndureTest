
public class SepuluhX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int x = 81; 
		for (int i=1; i<=n; i++){
			if((i%2)==0){
				System.out.print(x+",");
				x = x+8;
			}else{
				System.out.print(x+",");
				x = x-17;
			}
		}
	}

}
