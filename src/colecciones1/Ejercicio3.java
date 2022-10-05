package colecciones1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));		
		
		Set<String> noSeRepiten = new HashSet<>();
		Set<String> seRepiten = new HashSet<>();
		
		System.out.println("> ");
		Scanner s = new Scanner(in.readLine());
		s.useDelimiter("[^\\p{alpha}]+");
		while(s.hasNext()) {
			String palabra = s.next();
			if(!noSeRepiten.add(palabra)) {
				noSeRepiten.remove(palabra);
				seRepiten.add(palabra);
			}
		}
		
		System.out.printf("Las que no se repeiten: %s", noSeRepiten);
		System.out.printf("Las que se repeiten: %s", seRepiten);

	}

}
