package debug;

import java.util.LinkedList;
import java.util.List;

public class ClaseParaDepurar {
	
	//Atributos
	private double suma;
	private List<Double> lista;
	
	//Constructores
	public ClaseParaDepurar() {
		System.out.println("Construyendo clase");
	}
	
	//Métodos
	public double echaCuentas() {
		lista = new LinkedList<Double>();
		
		for (int i = 0; i < 100; i++) {
			lista.add((double)i);
		}
		
		suma = 0.0;
		
		for(Double valor : lista) {
			suma+=valor;
		}
		
		return suma;
	}

}
