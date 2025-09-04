package app;

import modelo.Retangulo;
import modelo.Quadrado;

public class Principal {
	public static void main(String[] args) {
		
		Retangulo r = new Retangulo();
		
		r.setAltura(10);
		r.setLargura(20);
		r.imprimir();
		
		System.out.println("---------");
		
		Quadrado q = new Quadrado();
		q.setAltura(15);
		q.setLargura(15);
		q.imprimir();
	}

}
