import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		WordManager wordManager = new WordManager(input);
		selectmenu(input,wordManager);
	}
	
	
	public static void selectmenu(Scanner input, WordManager wordManager){
		int num=-1;
		while(num !=5) {
			try {
				showmenu();
				num=input.nextInt();
				switch(num) {
				case 1:
					wordManager.Addword();
					break;
				case 2:
					wordManager.Deleteword();
					break;
				case 3:
					wordManager.Editword();
					break;
				case 4:
					wordManager.Viewwords();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5! ");
				if(input.hasNext())
					input.next();
				num=-1;
			}
			}
		}
	public static void showmenu() {
		System.out.println("бщ My Word Manager Menu бщ");
		System.out.println("1. Add word ");
		System.out.println("2. Delete word ");
		System.out.println("3. Edit word ");
		System.out.println("4. View words ");
		System.out.println("5. Exit ");
		System.out.println("Select one number between 1-5");
	}

}

