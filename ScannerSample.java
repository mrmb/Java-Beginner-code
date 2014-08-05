import java.util.*;

public class ScannerSample{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese destinatarios");
		String correos = sc.nextLine();

		System.out.println("Ingrese el asunto");
		String asunto = sc.nextLine();

		System.out.println("Ingrese el contenido");
		String contenido = sc.nextLine();

		if( correos.length() > 0 && asunto.length() > 0 &&  contenido.length() > 0) {	
			Scanner parse_correos = new Scanner(correos);
			parse_correos.useDelimiter(";");

			while( parse_correos.hasNext() ){
				System.out.println("HELO mail.galileo.edu,");
				System.out.println("MAIL FROM mrm_31@galileo.edu,");
				System.out.println("RCPT TO " + parse_correos.next() + ",");
				System.out.println("DATA " + contenido);
				System.out.println(".");
				System.out.println("QUIT");
			}
		} else {
			System.out.println("Ingreso valores null");
		}


	}

}