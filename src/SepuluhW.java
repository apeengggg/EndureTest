
public class SepuluhW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 16;
		int x = 1;
		for (int i=1; i<n; i++){
				if((x%5)==0){
					System.out.print("*"+",");
				}else{
					System.out.print(x+",");
				}
				x=x+1;
		}
	}

}
