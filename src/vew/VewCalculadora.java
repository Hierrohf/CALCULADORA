package vew;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextField;

import model.Calculadora;

public class VewCalculadora {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		JFrame frame = new JFrame();
		Calculadora calculadora = new Calculadora();
		
		
		//CAMPO DE DIGITACAO
		JTextField campoDgitacao = new JTextField();
		campoDgitacao.setBounds(50, 80, 100, 30);
		campoDgitacao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
			
		});	
		
		//BOTAO (+)
		JButton botaoSomar = new JButton("+");
		botaoSomar.setBounds(0, 0, 200, 30);
		botaoSomar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 calculadora.setA(Double.parseDouble(campoDgitacao.getText()));
				 campoDgitacao.setText("");
			}
			
		});
		
		JButton botaoresultado = new JButton("=");
		botaoresultado.setBounds(0, 150, 200, 30);
		botaoresultado.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 System.out.println("+");
	                double segundoNumero = Double.parseDouble(campoDgitacao.getText());
	                // Soma os dois números e exibe o resultado
	                double resultado = calculadora.somar(calculadora.getA(), segundoNumero);
	                campoDgitacao.setText(String.valueOf(resultado));
				 
				 
			}
			
		});
		
		
		//JANELA
		frame.setSize(400, 600);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Calculadora");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		//ADD JANELA
		frame.add(botaoSomar);
		frame.add(campoDgitacao);
		frame.add(botaoresultado);
		//
		
		
		
		/*
		System.out.println("primeiro valor");
		double vl1 = sc.nextDouble(); 
		calculadora.setA(vl1);
		
		System.out.println("qual o tipo de operação: + - / *");
		char operacao = sc.next().charAt(0);
		
		System.out.println("segundo valor");
		double vl2 = sc.nextDouble(); 
		calculadora.setA(vl2);
		
		
		switch(operacao) {
		case '+':
			System.out.println(calculadora.somar(vl1, vl2));
			break;
		case '-':
			System.out.println(calculadora.subitracao(vl1, vl2));
			break;
		case '*':
			System.out.println(calculadora.multiplicasao(vl1, vl2));
			break;
		case '/':
			try {
			System.out.println(calculadora.divisao(vl1, vl2));
			break;}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		
		
		}
	*/	
	}

}
