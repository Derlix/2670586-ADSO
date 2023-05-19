import java.util.Scanner;

public class Entrada {
	public static void main(String[] args) {		
		Scanner entrada = new Scanner(System.in);

		byte turno;
		short loteria_risaralda;
		int saldo_bancario;
		long tarjeta_identidad;
		float nota;
		double pi;
		boolean bandera;

		System.out.println("Ingrese turno: ");
		turno = entrada.nextByte();

		System.out.println("Ingrese loteria risaralda: ");
		loteria_risaralda = entrada.nextShort();

		System.out.println("Ingrese saldo bancario: ");
		saldo_bancario = entrada.nextInt();

		System.out.println("Ingrese tarjeta identidad: ");
		tarjeta_identidad = entrada.nextLong();

		System.out.println("Ingrese nota: ");
		nota = entrada.nextFloat();

		System.out.println("Ingrese pi: ");
		pi = entrada.nextDouble();

		System.out.println("Ingrese bandera: ");
		bandera = entrada.nextBoolean();



		System.out.println("turno: "+ turno);
		System.out.println("loteria risaralda: "+ loteria_risaralda);
		System.out.println("saldo bancario: "+ saldo_bancario);
		System.out.println("tarjeta identidad: "+ tarjeta_identidad);
		System.out.println("Nota: "+ nota);
		System.out.println("PI: "+ pi);
		System.out.println("Bandera: "+ bandera);
	}
}