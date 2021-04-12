package word;

import java.util.Scanner;

public class Word {
	protected Wordkind kind=Wordkind.English;
	protected String memorzied_word;
	protected String wordclass;
	protected String mean;
	
	public Word() {
		
	}
	
	public Word(String memorzied_word, String wordclass, String mean) {
		this.memorzied_word=memorzied_word;
		this.wordclass=wordclass;
		this.mean=mean;
	}
	
	public Wordkind getKind() {
		return kind;
	}

	public void setKind(Wordkind kind) {
		this.kind = kind;
	}

	public String getMemorzied_word() {
		return memorzied_word;
	}

	public void setMemorzied_word(String memorzied_word) {
		this.memorzied_word = memorzied_word;
	}

	public String getWordclass() {
		return wordclass;
	}

	public void setWordclass(String wordclass) {
		this.wordclass = wordclass;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}
	
	public void printInfo() {
		System.out.println("memorzied_word: "+memorzied_word+" wordclass: "+wordclass+" mean: "+mean);
	}
	
	public void getWordInput(Scanner input) {
		System.out.print("word in memory: ");
		String memorzied_word = input.next();
		this.setMemorzied_word(memorzied_word);
		
		System.out.print("word class: ");
		String wordclass = input.next();
		this.setWordclass(wordclass);
		
		System.out.print("meaning: ");
		String mean = input.next();
		this.setMean(mean);
	}

}
