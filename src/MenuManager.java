import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		int num=0;
		Scanner input = new Scanner(System.in);
		
		while(num !=6) {
			System.out.println("1. Add words ");
			System.out.println("2. Delete words ");
			System.out.println("3. Edit words ");
			System.out.println("4. View words ");
			System.out.println("5. Show the menu ");
			System.out.println("6. Exit ");
			System.out.println("Select one number between 1-6");
			
			num=input.nextInt();
			
			switch(num) {
			case 1:
				System.out.print("memory word: ");
				String word = input.next();
				break;
			case 2:
			case 3:
			case 4:
			}
		}
	}
}

