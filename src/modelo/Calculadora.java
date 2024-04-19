package modelo;

public class Calculadora {
	private int mr;
	public Calculadora() {
		// TODO Auto-generated constructor stub
		mr=0;
	}
	public int suma(int a, int b) {
		mr = a+b;
		return mr;
	}
	public int resta(int a, int b) {
		mr = a-b;
		return mr;
	}
	
	
}
