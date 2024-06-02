package vew;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import model.Calculadora;

public class VewCalculadora {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		Calculadora calculadora = new Calculadora();
		final String[] operacao = {""};
		
		// CAMPO DE DIGITACAO
		JTextField campoDigitacao = new JTextField();
		campoDigitacao.setBounds(50, 20, 280, 30);
		campoDigitacao.requestFocusInWindow();// Mantém o foco no campo de digitação
		
		// BOTAO (+)
		JButton botaoSomar = new JButton("+");
		botaoSomar.setBounds(50, 60, 50, 50);
		botaoSomar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculadora.setA(Double.parseDouble(campoDigitacao.getText()));
				campoDigitacao.setText("");
				operacao[0] = "+";
				campoDigitacao.requestFocusInWindow();
			}
		});
		
		// BOTAO (-)
		JButton botaoSubtracao = new JButton("-");
		botaoSubtracao.setBounds(110, 60, 50, 50);
		botaoSubtracao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculadora.setA(Double.parseDouble(campoDigitacao.getText()));
				campoDigitacao.setText("");
				operacao[0] = "-";
				campoDigitacao.requestFocusInWindow();
			}
		});
		
		// BOTAO (/)
		JButton botaoDivisao = new JButton("/");
		botaoDivisao.setBounds(170, 60, 50, 50);
		botaoDivisao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calculadora.setA(Double.parseDouble(campoDigitacao.getText()));
				campoDigitacao.setText("");
				operacao[0] = "/";
				campoDigitacao.requestFocusInWindow();
			}});
		
		// BOTAO (*)
        JButton botaoMultiplicacao = new JButton("*");
        botaoMultiplicacao.setBounds(230, 60, 50, 50);
        botaoMultiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora.setA(Double.parseDouble(campoDigitacao.getText()));
                campoDigitacao.setText("");
                operacao[0] = "*";
                campoDigitacao.requestFocusInWindow();
            }
        });	
		
		// BOTAO (=)
		JButton botaoResultado = new JButton("=");
		botaoResultado.setBounds(290, 60, 50, 50);
		botaoResultado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculadora.setB(Double.parseDouble(campoDigitacao.getText()));
				double resultado = 0;
				
				switch (operacao[0]) {
					case "+":
						resultado = calculadora.somar(calculadora.getA(), calculadora.getB());
						break;
					case "-":
						resultado = calculadora.subtracao(calculadora.getA(), calculadora.getB());
						break;
					case "/":
						resultado = calculadora.divisao(calculadora.getA(), calculadora.getB());
						break;
					case "*":
						resultado = calculadora.multiplicacao(calculadora.getA(), calculadora.getB());
						break;
				}
				
				campoDigitacao.setText(String.valueOf(resultado));
				campoDigitacao.requestFocusInWindow();
			}
		});
		
		// JANELA
		frame.setSize(400, 600);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Calculadora");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ADD JANELA
		frame.add(botaoSomar);
		frame.add(campoDigitacao);
		frame.add(botaoResultado);
		frame.add(botaoSubtracao);
		frame.add(botaoDivisao);
		frame.add(botaoMultiplicacao);
		
		//###NOTA: TIVE DIFICULDADE DE ENTENDER O cODIGO A BAIXO (EXPLICACAO NO FINAL DO MAIN)###
        // Definir o foco no campo de digitação quando a janela for aberta (Chat gpt)
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                campoDigitacao.requestFocusInWindow();
            }
        });
		
		
	}
}


/*
 *         frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                campoDigitacao.requestFocusInWindow();
            }
        });
 * 
 * 
 * frame.addWindowListener: Adiciona um WindowListener ao JFrame chamado frame.
 * 
 * new java.awt.event.WindowAdapter(): Cria uma instância anônima de WindowAdapter.
 * WindowAdapter é uma classe que fornece implementações vazias de todos os métodos de WindowListener.
 * Podemos sobrescrever apenas os métodos que precisamos.
 * 
 * @Override: Anotação que indica que estamos substituindo um método da superclasse (WindowAdapter).
 * 
 * public void windowOpened(java.awt.event.WindowEvent e): Método que será chamado quando a janela for aberta.
 * Este método recebe um evento WindowEvent como parâmetro, que contém informações sobre o evento.
 * 
 * campoDigitacao.requestFocusInWindow(): Este método faz com que o campoDigitacao receba o foco da entrada do teclado.
 * Isso significa que o cursor será colocado no campo de digitação, pronto para o usuário começar a digitar.
 * 
 * 
 * */






