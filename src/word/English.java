package word;

import java.util.Scanner;

public class English extends Word implements WordInput{
	
	public English(Wordkind kind) {
		super(kind);
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
	public void printInfo() {
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
		System.out.println("kind:"+skind+" memorzied_word: "+memorzied_word+" wordclass: "+wordclass+" mean: "+mean);
	}


}
