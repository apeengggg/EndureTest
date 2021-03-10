
public class DuaBelasC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cel = 26;
		Temperature c = new Temperature(cel);
		c.setCelcius(cel);
		System.out.println("=====Celcius=======");
		System.out.println("Celcius : " + cel);
		System.out.println("=====Celcius To Fahrenheit=======");
		System.out.println("Fahrenheit: " + c.toFahrenheit());
        System.out.println("=====Celcius To Kelvin=======");
        System.out.println("Kelvin: " + c.toKelvin());
	}
}
