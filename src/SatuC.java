import java.text.DecimalFormat;

public class SatuC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat decimalpattern = new DecimalFormat("0.0000000");
		double x=3, n=10, i;
		for (i=1; i<=n; i++){
			System.out.print(decimalpattern.format(x)+",");
			x /=3;
		}
	}	

}
