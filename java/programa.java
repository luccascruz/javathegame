// CUIDADO MUITOS GATOS A SEGUIR, NAO TOQUE EM NADA SENÂO NUNCA MAIS FUNCIONA!!!!!!!
import java.util.Scanner;

class menus{
public static int opcao;
	static void pulalinha(){
	for (int aa=0; aa<=25;aa++){
	System.out.println(" ");
	}
	}
	static void limpatela(){
		for (int i = 0 ; i<=500;i++){
			System.out.println(" ");
		}
	}
	static void menuopcao(){
				System.out.println("                                               _     _   __      _   _  _  ___  _ ");
				System.out.println("                                            | |_|| ||_|   | |_| |_  |_ |_|| | ||_ ");
				System.out.println("                                          |_| | ||_|| |   | | | |_  |_|| ||   ||_ ");
		                System.out.println("                                          ========================================");
		for (int pl = 0;pl<= 5;pl++)
			System.out.println(" ");
		switch(opcao){
			case 1:
				System.out.println("                                                         ►JOGAR");
				System.out.println("                                                         Manual");
				System.out.println("                                                         Sobre");
				System.out.println("                                                         Exit");
				break;
			case 2:
				System.out.println("                                                         Jogar");
				System.out.println("                                                         ►MANUAL");
                                System.out.println("                                                         Sobre");
				System.out.println("                                                         Exit");
				break;
			case 3:
                                System.out.println("                                                         Jogar");
                                System.out.println("                                                         Manual");
				System.out.println("                                                         ►SOBRE");
                                System.out.println("                                                         Exit");
                                break;
			case 4:
                                System.out.println("                                                         Jogar");
                                System.out.println("                                                         Manual");
                                System.out.println("                                                         Sobre");
                                System.out.println("                                                         ►EXIT");
                                break;
		}
		for(int pp = 0; pp<=20;pp++)
			System.out.println(" ");
	}

}
															
class gameobjects{
	public static int selecionado,resposta,correta,ponto1,ponto2,rodada;
	public static String jogador1,jogador2,pergunta,alternativa1,alternativa2,alternativa3,alternativa4;

	static void jogadores(){
		Scanner reader = new Scanner(System.in);
		menus.limpatela();

		System.out.print("Digite o nome do jogador 1: ");
		jogador1 = reader.nextLine();
		System.out.println(jogador1);

		menus.limpatela();
		System.out.print("Digite o nome do jogador 2: ");
		jogador2 = reader.nextLine();
		System.out.println(jogador2);
	}
	static void perguntas(){
		int randomm  = 1;
		switch(randomm){
			case 1:
			pergunta = ("Qual é o IP padrao para acessar o roteador?");
			alternativa1 = ("192.168.0.4");
			alternativa2 = ("192.168.0.3");
			alternativa3 = ("192.168.0.2");
			alternativa4 = ("192.168.0.1");
			correta = 4;
			break;
			case 2:
			pergunta = ("Qual é a raiz quadrada de 4?");
                        alternativa1 = ("12");
                        alternativa2 = ("1");
                        alternativa3 = ("2");
                        alternativa4 = ("8");
                        correta = 3;
			break;
			case 3:
			pergunta = ("Quanto é 1+1?");
                        alternativa1 = ("1");
                        alternativa2 = ("2");
                        alternativa3 = ("3");
                        alternativa4 = ("4");
                        correta = 2;
			break;
			case 4:
			break;
			case 5:
			break;
			case 6:
			break;
			case 7:
			break;
			case 8:
			break;
			case 9:
			break;
			case 10:
			break;
			case 11:
			break;
			case 12:
			break;
			case 13:
			break;
			case 14:
			break;
			case 15:
			break;
			case 16:
			break;
			case 17:
			break;
			case 20:
			break;
			case 21:
			break;
			case 22:
			break;
			case 23:
			break;
			case 24:
			break;
			case 25:
			break;
		}
	}

	static void selecao(){
			scroll2: for(int h = 0; h <= 999; h++){
				Scanner enter2 = new Scanner(System.in);
                     		String bla2;
                        	bla2 = enter2.nextLine();
				if (bla2.isEmpty()){
					resposta= resposta +1;
					if(resposta > 4){
						resposta = 1;
					}
				}else{
					if(selecionado == correta){
						System.out.println("Parabens voce acertou");
                			}else{
                        		 	System.out.println("Voce errou tente novamente");
                			}
					break scroll2;

				}
					menus.limpatela();
					System.out.println("                              "+jogador1 + ": "+ ponto1 + " ««»» "+ jogador2+": "+ponto2);
					System.out.println(" ");
					System.out.println("                                                »»»»»»"+rodada+"««««««" );
					System.out.println("                                "+pergunta);
					System.out.println(" ");
					switch(resposta){
                	        	case 1:
                        	       		System.out.println("                                           ►" + alternativa1);
                                		System.out.println("                                          "  + alternativa2);
                                		System.out.println("                                          "  + alternativa3);
                                		System.out.println("                                          "  + alternativa4);
						selecionado = 1;
						menus.pulalinha();
                                		break;
                        		case 2:
                                		System.out.println("                                          "  + alternativa1);
                                		System.out.println("                                           ►" + alternativa2);
                                		System.out.println("                                          "  + alternativa3);
                                		System.out.println("                                          "  + alternativa4);
						selecionado = 2;
						menus.pulalinha();
                                		break;
                       		 	case 3:
                               			System.out.println("                                          "  + alternativa1);
                                		System.out.println("                                          "  + alternativa2);
                                		System.out.println("                                           ►" + alternativa3);
                                		System.out.println("                                          "  + alternativa4);
						selecionado = 3;
						menus.pulalinha();
                                		break;
                       			case 4:
                                		System.out.println("                                          "  + alternativa1);
                                		System.out.println("                                          "  + alternativa2);
                                		System.out.println("                                          "  + alternativa3);
                                		System.out.println("                                           ►" + alternativa4);
						selecionado = 4;
						menus.pulalinha();
                                		break;
			}
	}}}


															
public class programa {
	public static void main(String[] args){
		menus screen =  new menus();
		screen.limpatela();
		scroll: for (int a = 0; a <= 999; a++){
			Scanner enter = new Scanner(System.in);
			String bla;
			bla = enter.nextLine();
			if (bla.isEmpty()){
				screen.opcao = screen.opcao +1;
				if (screen.opcao >4){
					screen.opcao = 1;
					screen.limpatela();
					screen.menuopcao();
				}else{
					screen.limpatela();
					screen.menuopcao();
				}
			}else{
				screen.limpatela();
				entermenu: switch(screen.opcao){
				case 1:
					System.out.println("OK, vamos jogar");
					gameobjects.jogadores();
					gameobjects.perguntas();
					gameobjects.selecao();
					break scroll;
				case 2:
					System.out.println("O manual virá em breve");
					System.out.println("Aperte enter para voltar ao menu");
				break entermenu;
				case 3:
					System.out.println(" GNU LESSER GENERAL PUBLIC LICENSE Version 3, 29 June 2007 Copyright (C) 2007 Free Software Foundation, Inc. https:fsf.org Everyone is permitted to copy and distribute verbatim copies of this license document, but changing it is not allowed. This version of the GNU Lesser General Public License incorporates the terms and conditions of version 3 of the GNU General Public License, supplemented by the additional permissions listed below.");
					System.out.println("Aperte enter para voltar ao menu");
				break entermenu;
				case 4:
					System.out.println("Obrigado por jogar JAVA THE GAME!!!!!!");
					System.exit(0);
				break entermenu;
				}
			}
		}
	}
}


