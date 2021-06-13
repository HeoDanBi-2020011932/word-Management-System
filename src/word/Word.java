package word;

import java.util.Scanner;

import exception.WordFormatException;

public abstract class Word implements WordInput{
	protected Wordkind kind=Wordkind.English;
	protected String memorzied_word;
	protected String wordclass;
	protected String mean;

	public Word(Wordkind kind) {
		this.kind=kind;
	}
	
	public Word(String memorzied_word, String wordclass, String mean) {
		this.memorzied_word=memorzied_word;
		this.wordclass=wordclass;
		this.mean=mean;
	}
	
	public Word(Wordkind kind,String memorzied_word, String wordclass, String mean) {
		this.kind=kind;
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

	public void setMemorzied_word(String memorzied_word) throws WordFormatException {
		if((memorzied_word.matches("^[a-zA-Z]*$")))
			throw new WordFormatException();
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
	public abstract void printInfo();
	
	
	
	public void setWord(Scanner input) {
		String memorzied_word="";
		while(memorzied_word.matches("^[a-zA-Z]*$")){
			System.out.println("word in memory: "); 
			memorzied_word=input.next();
			try {
				this.setMemorzied_word(memorzied_word);
			} catch (WordFormatException e) {
				System.out.println("Please put "+kind+" not English");
			}
		}
	}
	public void setWordClass(Scanner input) {
		System.out.println("word class: ");
		String wordclass=input.next();
		this.setWordclass(wordclass);
		input.nextLine();
	}
	public void setWordMean(Scanner input) {
		System.out.println("meaning of word: ");
		String mean=input.nextLine();
		this.setMean(mean);
	}
	public String getkindString() {
		String skind="none";
		switch(this.kind) {
		case English:
			skind="eng";
			break;
		case Japanese:
			skind="jp";
			break;
		case Korean:
			skind="kr";
			break;
		case Chinese:
			skind="ch";
			break;
		default:
		}
		return skind;
	}

}
