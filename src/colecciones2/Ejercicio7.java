package colecciones2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Ejercicio7 {

	public static void eliminarSiMayoresEncima(Deque<Integer> pila) {
		if(!pila.isEmpty())
		{
			LinkedList<Integer> aux = new LinkedList<>();
			while(!pila.isEmpty()) {
				int n = pila.pop();
				if(aux.isEmpty() || n > aux.peek())
					aux.push(n);

			}
			do{
				pila.push(aux.poll());
			}
			while(!aux.isEmpty());
		}
	}
	public static void main(String[] args) {
		ArrayDeque<Integer> pila = new ArrayDeque<>();
		Arrays.asList(6, 22, 17, 17, 10, 7, 9, 14, 5, 12, 7, 2).forEach(n -> pila.push(n));
		eliminarSiMayoresEncima(pila);
		System.out.println(pila);
	}
}