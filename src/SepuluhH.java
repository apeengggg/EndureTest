
public class SepuluhH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1, print = 0, i, n=5;
		for (i=0; i<=n; i++){
			if(a==0 && b==1){
				System.out.print(b+",");
				b += 1;
				System.out.print(b+",");
				a=2;
				b +=3;
			}else{
				print = a+b;
				a = b;
				b = print;
				System.out.print(a+",");	
			}
		}
	}

}
