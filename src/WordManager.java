import java.util.Scanner;

public class WordManager {
	Word word;
	Scanner input;
	WordManager(Scanner input){
		this.input=input;
	}
	
	public void Addwords() {
		word = new Word();
		System.out.print("word in memory: ");
		word.memorzied_word = input.next();
		System.out.print("word class: ");
		word.wordclass = input.next();
		System.out.print("meaning: ");
		word.mean = input.next();
		}
	
	public void Deletewords() {
		System.out.print("memory word: ");
		String word1 = input.next();
		if (word==null) {
			System.out.println("the word has not been registered");
			return;
		}
		if (word.memorzied_word.equals(word1)) {
			word=null;
			System.out.println("the word is deleted");
		}
	}
	public void Editwords() {
		System.out.print("memory word: ");
		String word1 = input.next();
		if (word.memorzied_word.equals(word1)) {
			System.out.println("the word to be edited is "+ word1);
		}
	}
	public void Viewwords() {
		System.out.print("memory word: ");
		String word1 = input.next();
		if (word.memorzied_word.equals(word1)) {
			word.printInfo();
		}
	}

}
