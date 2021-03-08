
public class SatuA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3,n=10,j=1, i,a;
		for (i=1; i<=n; i++){
			System.out.print(x+",");
			if ((i%2)==0){
				a = j;
				j = a;
			}else{
				j +=1;
			}
//			System.out.println("Ini J " + j);
			x += j;
		}
	}

}
