import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		int num=0;
		Scanner input = new Scanner(System.in);
		WordManager wordManager = new WordManager(input);
		
		while(num !=5) {
			System.out.println("бщ My Word Manager Menu бщ");
			System.out.println("1. Add words ");
			System.out.println("2. Delete words ");
			System.out.println("3. Edit words ");
			System.out.println("4. View words ");
			System.out.println("5. Exit ");
			System.out.println("Select one number between 1-5");
			
			num=input.nextInt();
			
			switch(num) {
			case 1:
				wordManager.Addwords();
				break;
			case 2:
				wordManager.Deletewords();
				break;
			case 3:
				wordManager.Editwords();
				break;
			case 4:
				wordManager.Viewwords();
				break;
			}
		}
	}

}

