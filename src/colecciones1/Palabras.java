package colecciones1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class Palabras {
	
	HashMap<Integer, TreeSet<String>> mapa;
	
	public Palabras() {
		mapa = new HashMap<>();
	}
	
	public Palabras(String palabras) {
		this();  //mapa = new HashMap<>();
		addPalabras(palabras);
	}
	
	public void addPalabra(String palabra) {
		int l = palabra.length();
		TreeSet<String> palabras = mapa.get(l);
		if(palabras == null) {
			palabras = new TreeSet<>();
			mapa.put(l, palabras);
		}
		palabras.add(palabra);
	}
	
	public void addPalabras(String palabras) {
		for(String palabra: palabras.split("\\P{Alpha}"))
			addPalabra(palabra);
	}
	
	public boolean contiene(String palabra) {
		TreeSet<String> palabras = mapa.get(palabra.length());
		return palabras != null && palabras.contains(palabra);
	}
	
	public Set<String> getPalabras(int longitud){
		Set<String> palabras = mapa.get(longitud);
		return palabras == null ? Collections.emptySet() : Collections.unmodifiableSet(palabras);
	}
	
	public static void main(String[] args) throws IOException{
		Palabras p = new Palabras();
		//p.addPalabra("palabra");
		//Set<String> palabras = p.getPalabras(7);
		//System.out.println(palabras);
		//palabras.clear();
		try(BufferedReader in = new BufferedReader(new FileReader("res/El Quijote.txt"))){
			String linea;
			while((linea = in.readLine()) != null)
				p.addPalabras(linea);
			}
		
		p.addPalabra(new File("res/El Quijote.txt"));
			System.out.println(p.getPalabras(5));

	}

}
