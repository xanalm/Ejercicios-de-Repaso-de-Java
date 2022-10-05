package colecciones1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("¿Cuantos nombres vas a introducir?");
		int n = Integer.parseInt(in.readLine());
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nombre: ");
			set.add(in.readLine());
			
		}
		System.out.println(set);

	}

}
