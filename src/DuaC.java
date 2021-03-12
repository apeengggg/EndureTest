
public class DuaC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =4, b=1, c=1; 
		for (int i=1; i<=4; i++){
			for(int j=b; j<=a; j++){
				if(c==i || c==6 || c==11 || c==16){
					System.out.print("O");
					System.out.print("\t");
					c = c+1;
				}else{
					System.out.print(j);
					System.out.print("\t");
					c = c+1;
				}
			}
			b+=4;
			a+=4;
			System.out.println();
		}
		
	}

}
