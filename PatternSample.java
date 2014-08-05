import java.util.Scanner ;
import java.util.regex.Pattern;

public class PatternSample {
	
	public static void main(String[] args){

		// Uso de expresiones regulares
		System.out.println("Ingrese una cadena: ");
		Scanner sc = new Scanner(System.in);
		String cadena = sc.nextLine();

		String expresion_regular = "\\d{3}[a-z]{3}\\d{1}";

		boolean match = Pattern.matches(expresion_regular, cadena);
		System.out.println(match);
		
		// Wrapper class
		String numero = "345";
		System.out.println(numero);

		int numero_int = 0 ;
		numero_int = Integer.parseInt(numero);

		System.out.println(numero_int);

		String numero_2 = "";
		numero_2 = String.valueOf(numero_int);
		System.out.println(numero_2); 		
	}

}