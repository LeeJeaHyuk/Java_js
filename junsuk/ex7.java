
public class ex7 {
		public static void main(String[] args) {
		int fahrenheit = 100;

		float celcius = (int)((5/9f * (fahrenheit - 32)+0.005)*100)/100f;
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		}
}
//'C = 5/9 ×(F - 32)
/*
37.77778
37.78278 
3778.278 
3778 
37.38
*/