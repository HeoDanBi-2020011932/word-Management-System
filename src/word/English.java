package word;

import java.util.Scanner;

import exception.WordFormatException;

public class English extends Word {
	
	public English(Wordkind kind) {
		super(kind);
	}
	
	public void getWordInput(Scanner input) {
		setWord(input);
		setWordClass(input);
		setWordMean(input);
	}

	public void setMemorzied_word(String memorzied_word) {
		this.memorzied_word = memorzied_word;
	}
	public void setWord(Scanner input) {
		System.out.println("word in memory: "); 
		String memorzied_word=input.next();
		this.setMemorzied_word(memorzied_word);
	}
	public void printInfo() {
		 String skind =getkindString();
		System.out.println("kind:"+skind+" memorzied_word: "+memorzied_word+" wordclass: "+wordclass+" mean: "+mean);
	} 

	
}
