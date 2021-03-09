
public class EmpatB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                    if (i==0||i==4||(i+j)==4||((i+j)==2&&i!=2)||((i+j)==6&&i!=2)){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                } System.out.println("");
        }  
	}
}
