
public class Temperature {
	private int c;

	public Temperature(int c) {
	    this.c = c;
	}

	public void setCelcius(int c){
	    this.c = c;
	}

	public float toFahrenheit() {
	    float fahrenheit = (float) (1.8 * this.c + 32);
	    return fahrenheit;
	}

	public float toKelvin() {
	    float kelvin = (float) (this.c + 273);
	    return kelvin;
	}
	
}
