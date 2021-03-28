import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		int num=0;
		Scanner input = new Scanner(System.in);
		
		while(num !=6) {
			System.out.println("бщ My Word Manager Menu бщ");
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
				Addwords();
				break;
			case 2:
				Deletewords();
				break;
			case 3:
				Editwords();
				break;
			case 4:
				Viewwords();
				break;
			}
		}
	}
	public static void Addwords() {
		Scanner input = new Scanner(System.in);
		System.out.print("memory word: ");
		String word = input.next();
		System.out.print("word class: ");
		String wordclass = input.next();
		System.out.print("meaning: ");
		String mean = input.next();
		}
	
	public static void Deletewords() {
		Scanner input = new Scanner(System.in);
		System.out.print("memory word: ");
		String word = input.next();
	}
	public static void Editwords() {
		Scanner input = new Scanner(System.in);
		System.out.print("memory word: ");
		String word = input.next();
	}
	public static void Viewwords() {
		Scanner input = new Scanner(System.in);
		System.out.print("memory word: ");
		String word = input.next();
	}
}

