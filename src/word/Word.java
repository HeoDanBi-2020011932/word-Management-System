package word;

import java.util.Scanner;

public abstract class Word {
	protected Wordkind kind=Wordkind.English;
	protected String memorzied_word;
	protected String wordclass;
	protected String mean;
	
	public Word() {
		
	}
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
	
	public abstract void printInfo();
	

}
