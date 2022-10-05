package colecciones1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		
		for(int i = 0; i < 1000; i++) 
			list.add((int) Math.round(Math.random() * 99 + 1));
		list.forEach((nombre) -> System.out.println(nombre));
		
		Set<Integer> set1 = new HashSet<>(list);
			System.out.printf("sin repetidos (%d elementos)\n", set1.size());
			for(int n : set1)
				System.out.println(n);
			
		Set<Integer> set2 = new TreeSet<>(list);
			System.out.printf("sin repetidos y duplicados (%d elementos)\n", set2.size());
			Iterator<Integer> i = set2.iterator();
			while(i.hasNext())
				System.out.println(i.next());
		}
	}
