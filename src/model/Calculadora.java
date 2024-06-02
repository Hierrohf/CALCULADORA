package model;

public class Calculadora {

	double a;
	double b;
	
	public double somar(double a, double b) {
		this.a = a;
		this.b = b;
		return a + b;
	}
	
	public double subtracao(double a, double b) {
		this.a = a;
		this.b = b;
		return a - b;
	}
	
	public double divisao(double a, double b) {
		this.a = a;
		this.b = b;
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
		return a / b;
	} 
	
	public double multiplicacao(double a, double b) {
		this.a = a;
		this.b = b;
		return a * b;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
}
