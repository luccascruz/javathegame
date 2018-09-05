// CUIDADO MUITOS GATOS A SEGUIR, NAO TOQUE EM NADA SENÂO NUNCA MAIS FUNCIONA!!!!!!!
import java.util.Scanner;

class menus{
public static int opcao;
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
				System.out.println("                                                          JOGAR");
				System.out.println("                                                         Manual");
				System.out.println("                                                         Sobre");
				System.out.println("                                                         Exit");
				break;
			case 2:
				System.out.println("                                                         Jogar");
				System.out.println("                                                          MANUAL");
                                System.out.println("                                                         Sobre");
				System.out.println("                                                         Exit");
				break;
			case 3:
                                System.out.println("                                                         Jogar");
                                System.out.println("                                                         Manual");
				System.out.println("                                                          SOBRE");
                                System.out.println("                                                         Exit");
                                break;
			case 4:
                                System.out.println("                                                         Jogar");
                                System.out.println("                                                         Manual");
                                System.out.println("                                                         Sobre");
                                System.out.println("                                                          EXIT");
                                break;


		}
		for(int pp = 0; pp<=20;pp++)
			System.out.println(" ");

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
