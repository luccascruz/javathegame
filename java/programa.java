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
	public static int selecionado,resposta,correta;
	public static String pergunta,alternativa1,alternativa2,alternativa3,alternativa4;
	static void jogadores(){
	String jogador1,jogador2;
	Scanner nome1 = new Scanner (System.in);
	Scanner nome2 = new Scanner (System.in);
	menus.limpatela();

	System.out.print("Digite o nome do jogador 1: ");
	jogador1 = nome1.nextLine();

	menus.limpatela();
	System.out.print("Digite o nome do jogador 2: ");
	jogador2 = nome2.nextLine();
	}
	static void perguntas(){
		int randomm  = 1;
		switch(randomm){
			case 1:
			pergunta = ("Qual é o IP padra para acessar o roteador?");
			alternativa1 = ("192.168.0.4");
			alternativa2 = ("192.168.0.3");
			alternativa3 = ("192.168.0.2");
			alternativa4 = ("192.168.0.1");
			correta = 4;
			break;
			case 2:
			break;
			case 3:
			break;
		}
	}
	static void verificar(){
                if(resposta == correta){
                        System.out.println("Parabens voce acertou");
                }else{
                        System.out.println("Voce errou tente novamente");
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
				}
					menus.limpatela();
					switch(resposta){
                	        	case 1:
                        	       		System.out.println(" ►" + alternativa1);
                                		System.out.println(" "  + alternativa2);
                                		System.out.println(" "  + alternativa3);
                                		System.out.println(" "  + alternativa4);
						resposta = 1;
                                		break;
                        		case 2:
                                		System.out.println(" "  + alternativa1);
                                		System.out.println(" ►" + alternativa2);
                                		System.out.println(" "  + alternativa3);
                                		System.out.println(" "  + alternativa4);
						resposta = 2;
                                		break;
                       		 	case 3:
                               			System.out.println(" "  + alternativa1);
                                		System.out.println(" "  + alternativa2);
                                		System.out.println(" ►" + alternativa3);
                                		System.out.println(" "  + alternativa4);
						resposta = 3;
                                		break;
                       			case 4:
                                		System.out.println(" "  + alternativa1);
                                		System.out.println(" "  + alternativa2);
                                		System.out.println(" "  + alternativa3);
                                		System.out.println(" ►" + alternativa4);
						resposta = 4;
                                		break;
					this.verificar();
			}
	}}
	
}
															
public class programa {
	public  void main(String[] args){
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
					System.out.println("Por: Luccas e Gabriel");
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


