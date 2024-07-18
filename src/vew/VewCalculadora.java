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
		campoDigitacao.setBounds(30, 20, 340, 40);
		campoDigitacao.requestFocusInWindow();// Mantém o foco no campo de digitação
		
		//BOTAO LIMPAR
		JButton limpar = new JButton("C");
		limpar.setBounds(30, 80, 60, 60);
		limpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				campoDigitacao.setText("");//limpa o campo de digitacao
				
			}});
		
		//BOTAO VIRGULA
		JButton virgula = new JButton(",");
		virgula.setBounds(170, 290, 60, 60);
		virgula.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				campoDigitacao.setText(campoDigitacao.getText() + ".");
				//campoDigitacao.requestFocusInWindow();
			}
			
		});
		
		// BOTAO (1)
		JButton botao1 = new JButton("1");
		botao1.setBounds(30, 150, 60, 60);
		botao1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				campoDigitacao.setText(campoDigitacao.getText() + "1");//Este código pega o texto atual no campo de digitação e concatena o número "1" a ele. Dessa forma, se o campo estava vazio, agora exibirá "1". Se já tivesse algum número, adicionará "1" ao final.
                campoDigitacao.requestFocusInWindow();//Este método garante que o foco do teclado (cursor) esteja no campo de digitação após clicar no botão, pronto para mais entrada de usuário.
			}
			
		});
		
		// BOTAO (2)
		JButton botao2 = new JButton("2");
		botao2.setBounds(100, 150, 60, 60);
		botao2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				campoDigitacao.setText(campoDigitacao.getText() + "2");
                campoDigitacao.requestFocusInWindow();
			}
			
		});
		
		// BOTAO (3)
		JButton botao3 = new JButton("3");
		botao3.setBounds(170, 150, 60, 60);
		botao3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				campoDigitacao.setText(campoDigitacao.getText() + "3");
				campoDigitacao.requestFocusInWindow();
			}
			
		});
		
		// BOTAO (4)
		JButton botao4 = new JButton("4");
		botao4.setBounds(30, 220, 60, 60);
		botao4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				campoDigitacao.setText(campoDigitacao.getText() + "4");
				campoDigitacao.requestFocusInWindow();
			}});
		
		// BOTAO (5)
		JButton botao5 = new JButton("5");
		botao5.setBounds(100, 220, 60, 60);
		botao5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				campoDigitacao.setText(campoDigitacao.getText() + "5");
				campoDigitacao.requestFocusInWindow();
			}});
		
		// BOTAO (6)
		JButton botao6 = new JButton("6");
		botao6.setBounds(170, 220, 60, 60);
		botao6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				campoDigitacao.setText(campoDigitacao.getText() + "6");
				campoDigitacao.requestFocusInWindow();
			}});
		
		// BOTAO (7)
		JButton botao7 = new JButton("7");
		botao7.setBounds(30, 290, 60, 60);
		botao7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				campoDigitacao.setText(campoDigitacao.getText() + "7");
				campoDigitacao.requestFocusInWindow();
			}});
		
		// BOTAO (8)
		JButton botao8 = new JButton("8");
		botao8.setBounds(100, 290, 60, 60);
		botao8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				campoDigitacao.setText(campoDigitacao.getText() + "8");
				campoDigitacao.requestFocusInWindow();
			}});
		
		// BOTAO (9)
		JButton botao9 = new JButton("9");
		botao9.setBounds(170, 290, 60, 60);
		botao9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				campoDigitacao.setText(campoDigitacao.getText() + "9");
				campoDigitacao.requestFocusInWindow();
			}});
		
		//BOTAO (0)
        JButton botao0 = new JButton("0");
        botao0.setBounds(100, 360, 60, 60);
        botao0.addActionListener(new ActionListener() {
        	
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	campoDigitacao.setText(campoDigitacao.getText() + "0");
                campoDigitacao.requestFocusInWindow();
            }
        });
		
		// BOTAO (+)
		JButton botaoSomar = new JButton("+");
		botaoSomar.setBounds(240, 150, 60, 60);
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
		botaoSubtracao.setBounds(240, 220, 60, 60);
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
		botaoDivisao.setBounds(240, 290, 60, 60);
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
        botaoMultiplicacao.setBounds(240, 360, 60, 60);
        botaoMultiplicacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora.setA(Double.parseDouble(campoDigitacao.getText()));
                campoDigitacao.setText("");
                operacao[0] = "*";
                campoDigitacao.requestFocusInWindow();
            }
        });	
		
        //BOTAO (%)
        JButton porcentagem = new JButton("%");
        porcentagem.setBounds(170, 360, 60, 60);
        porcentagem.addActionListener(new ActionListener() {

        	//chat gpt fez isso (concertar essa gambiarra depois)
			@Override
			public void actionPerformed(ActionEvent e) {
			    double valor = Double.parseDouble(campoDigitacao.getText());
		        double resultado = calculadora.porcentagem(valor);
		        campoDigitacao.setText(String.valueOf(resultado));
		        campoDigitacao.requestFocusInWindow();	
				
			}
        	
        });
        
		// BOTAO (=)
		JButton botaoResultado = new JButton("=");
		botaoResultado.setBounds(310, 150, 60, 270);
		botaoResultado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculadora.setB(Double.parseDouble(campoDigitacao.getText()));
				double resultado = 0;
				try {
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
					case "%":
						resultado = calculadora.porcentagem(calculadora.getA());
						break;
				}
				
				campoDigitacao.setText(String.valueOf(resultado));//###EXPLICACAO NO FINAL DO MAIN(DIFICULDADE DE ENTENDER)###
				}catch(ArithmeticException E) {
					campoDigitacao.setText("Impossível a divisão por zero");
                    //System.out.println("Impossível a divisão por zero");
				}
				campoDigitacao.requestFocusInWindow();
			}
		});
		
		// JANELA
		frame.setSize(400, 600);
		frame.setVisible(true);
		frame.setLayout(null);//organizacao manual 
		frame.setLocationRelativeTo(null);//sentro da tella
		frame.setTitle("Calculadora");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ADD JANELA
		frame.add(campoDigitacao);
		frame.add(limpar);
		frame.add(virgula);
		frame.add(botaoSomar);
		frame.add(botaoResultado);
		frame.add(botaoSubtracao);
		frame.add(botaoDivisao);
		frame.add(botaoMultiplicacao);
		frame.add(porcentagem);
		frame.add(botao1);
		frame.add(botao2);
		frame.add(botao3);
		frame.add(botao4);
		frame.add(botao5);
		frame.add(botao6);
		frame.add(botao7);
		frame.add(botao8);
		frame.add(botao9);
		frame.add(botao0);
		//###NOTA: TIVE DIFICULDADE DE ENTENDER O CODIGO A BAIXO (EXPLICACAO NO FINAL DO MAIN)###
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
 * .addWindowListener é um método utilizado em Java para adicionar um WindowListener
 * a um componente de janela, como um JFrame. O WindowListener é uma interface que recebe
 * eventos de janela, permitindo que você execute código em resposta a esses eventos.
 *
 *	O que é WindowListener?
 *	WindowListener é uma interface que faz parte do pacote java.awt.event. Ela contém métodos que
 *	são chamados quando ocorrem diferentes tipos de eventos relacionados a janelas. Esses eventos incluem
 * 	abrir, fechar, minimizar, maximizar, ativar ou desativar a janela.
 * 
 * 
 * 
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


/*Quando você chama campoDigitacao.setText(...), você está dizendo ao campo de texto para exibir o valor
 * fornecido como argumento.
 * 
 * 
 * String.valueOf(...) é um método estático da classe String em Java que converte um valor (no caso, um valor numérico)
 * em uma representação de string.
 * */



