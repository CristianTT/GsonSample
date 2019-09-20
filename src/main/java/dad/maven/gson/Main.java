package dad.maven.gson;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Maven GSON\n");
		System.out.println("Generar una persona");
		Persona p = new Persona();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre: ");
		p.setNombre(sc.nextLine());
		System.out.println("Apellidos: ");
		p.setApellidos(sc.nextLine());
		boolean edadCorrecta = false;
		do {
			try {
				Scanner scEdad = new Scanner(System.in);
				System.out.println("Edad: ");
				p.setEdad(scEdad.nextInt());
				edadCorrecta = true;
			} catch (Exception ex) {
				System.out.println("La edad es errónea, inténtalo de nuevo:");
			}
		} while (!edadCorrecta);
		System.out.println(p.json());
	}

}
