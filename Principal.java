package modelo;

public class Retangulo {
	private int altura;
	private int largura;
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	public void imprimir() {
		System.out.println("Altura:"+ this.altura) ;
		System.out.println("Largura:"+ this.largura) ;
	}
	
}
