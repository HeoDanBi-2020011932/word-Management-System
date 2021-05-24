import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		WordManager wordManager = getObject("wordManager.ser");
		if(wordManager ==null) {
			wordManager =new WordManager(input);
		}
		
		selectmenu(input,wordManager);
		putObject(wordManager,"wordManager.ser");
		
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
					logger.log("add a word"); 
					break;
				case 2:
					wordManager.Deleteword();
					logger.log("delete the word"); 
					break;
				case 3:
					wordManager.Editword();
					logger.log("edit the word"); 
					break;
				case 4:
					wordManager.Viewwords();
					logger.log("view the word"); 
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
	public static WordManager getObject(String filename) {
		WordManager wordManager =null;
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(wordManager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return wordManager;
	}
	public static void putObject(WordManager wordManager,String filename) {
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			wordManager =(WordManager)in.readObject();
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
}

