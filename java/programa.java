// CUIDADO MUITOS GATOS A SEGUIR, NAO TOQUE EM NADA SENÂO NUNCA MAIS FUNCIONA!!!!!!!
import java.util.Scanner;
import java.util.Random;
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
	public static int questoes[] = {0,1,2,3,4};
	public static int selecionado,resposta,correta,rodada,njogadores;
	public static int ponto[] = new int[4];
	public static String jogador1,jogador2,pergunta,alternativa1,alternativa2,alternativa3,alternativa4,alternativa5;
	public static String[] nomesjogadores = new String[4];
	//void dadosjogadores(){
	//	String nome;
	//	int pontuação;
	//}
	//RECUPERANDO O NOME DOS JOGADORES
	static void jogadores(){
		String enter2;
		Scanner entrada2 = new Scanner(System.in);
		scroll3: for  (int lu =0; lu <= 900;lu ++){
			enter2 = entrada2.nextLine();
			if(enter2.isEmpty()){
				menus.limpatela();
				njogadores = njogadores +1;
                                if(njogadores >= 4){
                                        njogadores = 1;
                                }

					switch(njogadores){
                                                case 1:
                                                        System.out.println("                                           ► 2 JOGADORES");
                                                        System.out.println("                                            3 Jogadores");
                                                        System.out.println("                                            4 Jogadores");
                                                break;
                                                case 2:
                                                        System.out.println("                                            2 Jogadores");
                                                        System.out.println("                                           ► 3 JOGADORES");
                                                        System.out.println("                                            4 Jogadores");
                                                break;
                                                case 3:
                                                        System.out.println("                                            2 Jogadores");
                                                        System.out.println("                                            3 Jogadores");
                                                        System.out.println("                                           ► 4 JOGADORES");
                                                break;
                                             }
			menus.pulalinha();
			}else{ 
				Scanner nomes = new Scanner(System.in);
				for(int i = 0 ; i < njogadores + 1; i++){
					menus.limpatela();
					System.out.println("Digite o nome do jogador "+i);
					nomesjogadores[i] = nomes.nextLine();
				}
			break scroll3;
			}
		}
	}
	static void perguntas(){
		Random randomm  = new Random();
		int sorteado = randomm.nextInt(14);
		switch(sorteado){
			case 0:
			pergunta = ("Em quantas camadas se divide o modelo de referencia OSI?");
			alternativa1 = ("12 camadas");
			alternativa2 = ("5 camadas");
			alternativa3 = ("3 camadas");
			alternativa4 = ("7 camadas");
			alternativa5 = ("6 camadas");
			correta = 4;
			break;
			case 1:
			pergunta = ("Qual é o IP padrao para acessar o roteador?");
			alternativa1 = ("192.168.0.4");
			alternativa2 = ("192.168.0.3");
			alternativa3 = ("192.168.0.2");
			alternativa4 = ("192.168.0.1");
			alternativa5 = ("Nenhuma das alternativas");
			correta = 4;
			break;
			case 2:
			pergunta = ("O que é uma rede de computadores?");
                        alternativa1 = ("Conjunto de perifericos integrados");
                        alternativa2 = ("Conjunto de computadores interligados entre si, compartilhando recursos");
                        alternativa3 = ("União de equipamentos com a unica finalidade de compartilhar internet");
                        alternativa4 = ("Varios computadores que fazer parte dos setores de uma organizacao");
			alternativa5= ("Uma materia");
                        correta = 3;
			break;
			case 3:
			pergunta = ("Quanto a dispersao deografica como sao classificadas as redes de computadores");
                        alternativa1 = ("MAN, NAN, LAN");
                        alternativa2 = ("LAN, MAN, WAN");
                        alternativa3 = ("LAN, NAN, WAN");
                        alternativa4 = ("LAN, MAN, TAN");
			alternativa5 = ("PAN, RAM, TAN");
                        correta = 2;
			break;
			case 4:
			pergunta = ("Quanto á topologia fisica, como sao denominadas as redes");
			alternativa1 = ("Barra, Anular, Estrela e Token");
			alternativa2 = ("Anel, Hibrida, Estrelar e Camada");
			alternativa3 = ("Barramento, Anel, Estrela e Hibrida");
			alternativa4 = ("Segmento, Hibrida, Estrela e Token");
			alternativa5 = ("Nenhuma das alternativas");
			correta = 3;
			break;
			case 5:
			pergunta = ("O que é a tecnologia Broadcast?");
			alternativa1 = ("Transmissao simutanea para todos os hosts na rede");
			alternativa2 = ("Tramissao aleatoria na rede");
			alternativa3 = ("Modo de transferencia de arquivos mais rapido");
			alternativa4 = ("Modo de transferencia de arquivos lento");
			alternativa5 = ("Um arquivo de configuração");
			correta = 1;
			break;
			case 6:
			pergunta = ("Dos equipamentos de rede abaixo, qual tem a funcao de escolher o melhor caminho para o envio da informacao");
                        alternativa1 = ("Swith");
                        alternativa2 = ("Roteador");
                        alternativa3 = ("Acess Point");
                        alternativa4 = ("Path Panel");
                        alternativa5 = ("Computador");
                        correta = 2;
			break;
			case 7:
			pergunta = ("Qual dos cabos abaixo foi o primeiro a aparecer na estrutura de rede?");
                        alternativa1 = ("Cabo par trancado");
                        alternativa2 = ("Cabo de fibra optica");
                        alternativa3 = ("Cabo coaxial");
                        alternativa4 = ("Cabo categoria 5e");
                        alternativa5 = ("Cabo de energia");
                        correta = 3;
			break;
			case 8:
			pergunta = ("Como se classificam as fibras opticas");
                        alternativa1 = ("Nodal e Modal");
                        alternativa2 = ("Monomodo e multimodo");
                        alternativa3 = ("Monofibra e Mutifibra");
                        alternativa4 = ("Fina e Grossa");
                        alternativa5 = ("Platico e borracha");
                        correta = 3;
			break;
			case 9:
			pergunta = ("Quais sao os principais protocolos da camada de transporte");
                        alternativa1 = ("IP e TCP");
                        alternativa2 = ("TCP e UDP");
                        alternativa3 = ("HTTP e SMTP");
                        alternativa4 = ("UDP e POP");
                        alternativa5 = ("SSH e HOST");
                        correta = 2;
			break;
			case 10:
			pergunta = ("Quais sao os principais funcoes da camada de rede?");
                        alternativa1 = ("Enquadramento e Empacotamento");
                        alternativa2 = ("Encaminhamento e roteamento");
                        alternativa3 = ("Segmentacao e empacotamento");
                        alternativa4 = ("Roteamento e enquadramento");
                        alternativa5 = ("Busca e encalapsulamento");
                        correta = 2;
			break;
			case 11:
			pergunta = ("Como e denominado o dado (PDU) na camada de transporte?");
                        alternativa1 = ("Segmento");
                        alternativa2 = ("Pacote");
                        alternativa3 = ("Bit");
                        alternativa4 = ("Quadro");
                        alternativa5 = ("Mega");
                        correta = 1;
			break;
			case 12:
			pergunta = ("Quantas camadas tem o modelo padrap TCP/IP?");
                        alternativa1 = ("3 Camadas");
                        alternativa2 = ("4 Camadas");
                        alternativa3 = ("7 Camadas");
                        alternativa4 = ("2 Camadas");
                        alternativa5 = ("1 Camada");
                        correta = 2;
			break;
			case 13:
			pergunta = ("A qual camada pertence o protocolo IP?");
                        alternativa1 = ("Enlace");
                        alternativa2 = ("Transporte");
                        alternativa3 = ("Rede");
                        alternativa4 = ("Fisica");
                        alternativa5 = ("Apresentacao");
                        correta = 3;
			break;
			case 14:
			pergunta = ("Como é denominado o protocolo de configuracao dinamica de IP?");
                        alternativa1 = ("HTTP");
                        alternativa2 = ("FTP");
                        alternativa3 = ("DHCP");
                        alternativa4 = ("DNS");
                        alternativa5 = ("SSH");
                        correta = 3;
			break;
			case 15:
			pergunta = ("");
                        alternativa1 = ("");
                        alternativa2 = ("");
                        alternativa3 = ("");
                        alternativa4 = ("");
                        alternativa5 = ("");
                        correta = 1;
			break;
			case 16:
			pergunta = ("");
                        alternativa1 = ("");
                        alternativa2 = ("");
                        alternativa3 = ("");
                        alternativa4 = ("");
                        alternativa5 = ("");
                        correta = 1;
			break;
			case 17:
			pergunta = ("");
                        alternativa1 = ("");
                        alternativa2 = ("");
                        alternativa3 = ("");
                        alternativa4 = ("");
                        alternativa5 = ("");
                        correta = 1;
			break;
			case 20:
			pergunta = ("");
                        alternativa1 = ("");
                        alternativa2 = ("");
                        alternativa3 = ("");
                        alternativa4 = ("");
                        alternativa5 = ("");
                        correta = 1;
			break;
			case 21:
			pergunta = ("");
                        alternativa1 = ("");
                        alternativa2 = ("");
                        alternativa3 = ("");
                        alternativa4 = ("");
                        alternativa5 = ("");
                        correta = 1;
			break;
			case 22:
			pergunta = ("");
                        alternativa1 = ("");
                        alternativa2 = ("");
                        alternativa3 = ("");
                        alternativa4 = ("");
                        alternativa5 = ("");
                        correta = 1;
			break;
			case 23:
			pergunta = ("");
                        alternativa1 = ("");
                        alternativa2 = ("");
                        alternativa3 = ("");
                        alternativa4 = ("");
                        alternativa5 = ("");
                        correta = 1;
			break;
			case 24:
			pergunta = ("");
                        alternativa1 = ("");
                        alternativa2 = ("");
                        alternativa3 = ("");
                        alternativa4 = ("");
                        alternativa5 = ("");
                        correta = 1;
			break;
			case 25:
			pergunta = ("");
                        alternativa1 = ("");
                        alternativa2 = ("");
                        alternativa3 = ("");
                        alternativa4 = ("");
                        alternativa5 = ("");
                        correta = 1;
			break;
		}
	}


	static void selecao(){
			String entrada;
			Scanner leitor = new Scanner(System.in);
			//VAMOS TER UM FOR DE 1000 LOOPS 
			scroll2: for(int h = 0; h <= 999; h++){
                           	entrada = leitor.nextLine();
				if (entrada.isEmpty()){
					resposta= resposta +1;
					if(resposta > 5){
						resposta = 1;
					}
				}else{
					if(selecionado == correta){
						if (rodada >= njogadores){
							rodada = 0;
						}else{
							rodada = rodada +1;
						}
						System.out.println("Parabens voce acertou");
						ponto[rodada] = ponto[rodada] +1;
						gameobjects.perguntas();
						gameobjects.selecao();
                			}else{
                        		 	System.out.println("Voce errou tente novamente");
						if (rodada >= njogadores){
							rodada = 0;
						}else{
							rodada = rodada +1;
						}
						gameobjects.perguntas();
						gameobjects.selecao();
                			}
					break scroll2;

				}
					menus.limpatela();
					System.out.println("                              "+gameobjects.nomesjogadores[0] + ": "+ ponto[0] + " | "+ gameobjects.nomesjogadores[1]+": "+ponto[1] + " | " + gameobjects.nomesjogadores[2]+ ": "+ponto[2] + " | " + gameobjects.nomesjogadores[3]+ ": "+ponto[3]);
					System.out.println(" ");
					System.out.println("                                                »»»»»»"+gameobjects.nomesjogadores[rodada]+"««««««" );
					System.out.println("                                "+pergunta);
					System.out.println(" ");
					switch(resposta){
                	        	case 1:
                        	       		System.out.println("                                           ►" + alternativa1);
                                		System.out.println("                                          "  + alternativa2);
                                		System.out.println("                                          "  + alternativa3);
                                		System.out.println("                                          "  + alternativa4);
						System.out.println("                                          "  + alternativa5);
						selecionado = 1;
						menus.pulalinha();
                                		break;
                        		case 2:
                                		System.out.println("                                          "  + alternativa1);
						System.out.println("                                           ►" + alternativa2);
                                		System.out.println("                                          "  + alternativa3);
                                		System.out.println("                                          "  + alternativa4);
						System.out.println("                                          "  + alternativa5);
						selecionado = 2;
						menus.pulalinha();
                                		break;
                       		 	case 3:
                               			System.out.println("                                          "  + alternativa1);
                                		System.out.println("                                          "  + alternativa2);
                                		System.out.println("                                           ►" + alternativa3);
                                		System.out.println("                                          "  + alternativa4);
						System.out.println("                                          " + alternativa5);
						selecionado = 3;
						menus.pulalinha();
                                		break;
                       			case 4:
                                		System.out.println("                                          "  + alternativa1);
                                		System.out.println("                                          "  + alternativa2);
                                		System.out.println("                                          "  + alternativa3);
                                		System.out.println("                                           ►" + alternativa4);
						System.out.println("                                          " + alternativa5);
						selecionado = 4;
						menus.pulalinha();
                                		break;
					case 5:
						System.out.println("                                          "  + alternativa1);
                                                System.out.println("                                          "  + alternativa2);
                                                System.out.println("                                          "  + alternativa3);
                                                System.out.println("                                          " + alternativa4);
                                                System.out.println("                                          ►" + alternativa5);
                                                selecionado = 5;
                                                menus.pulalinha();
				
			}
	}}}


															
public class programa {
	public static void main(String[] args){
		menus screen =  new menus();
		//DA UMA LIMPADA MONSTRA NA TELA 
		screen.limpatela();
		String entrada;
		scroll: for (int a = 0; a <= 999; a++){
			Scanner enter = new Scanner(System.in);
			//SE ENTRADA RECEBE UM VALOR DO TECLADO
			entrada = enter.nextLine();

			//SE ENTRADA FOR VAZIA
			if (entrada.isEmpty()){
				//OPCAO NA CLASSE MENU RECE +1
				screen.opcao = screen.opcao +1;
				if (screen.opcao >4){
					//OCAO SERA 1 
					screen.opcao = 1;
					//LIMPAMOS A TELA
					screen.limpatela();
					//APRESENTAR O MENU NOVAMENTE COMECANDO DA OPCAO 1
					screen.menuopcao();
				}else{
					//SENÃO LIMPAMOS A TELA 
					screen.limpatela();
					//APRESENTAMOS O MENU DE ACORDO COM O CASE DA CLASSE MENU
					screen.menuopcao();
				}
			}else{
				//LIMPAMOS A TELA
				screen.limpatela();
				//DE ACORDO COM O VALOR DA OPCAO DA CLASSE MENUS IREMOS FAZER UMA ACAO
				entermenu: switch(screen.opcao){
				case 1:
					System.out.println("Pressione enter para continuar...");
					//CAPTURA OS NOMES DOS JOGADORES 
					gameobjects.jogadores();
					//INICIA AS PERGUNTAS 
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


