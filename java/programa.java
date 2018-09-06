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
	public static int selecao,resposta;
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
			System.out.println("                                  "+ vez +"")
			break;
			case 2:
			break;
			case 3:
			break;
		}
	static void selecao(){
	
	}
	}
}
															
public class programa {
	public static void main(String[] args){
		menus screen =  new menus();
		screen.limpatela();
		String space = " ";
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
