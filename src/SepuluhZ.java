
public class SepuluhZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
		int x = 0; 
		for (int i=1; i<=n; i++){	
			System.out.print(i+",");
			x++;
				if(x==5){
					System.out.print("*"+",");
				}
				if(x==8){
					System.out.print("*"+",");
					x=0;
				}
				
		}
	}

}
