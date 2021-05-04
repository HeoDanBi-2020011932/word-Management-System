package word;

import java.util.Scanner;

public class Korean extends Word {
	String meaning;

	public Korean(Wordkind kind) {
		super(kind);
	}
	
	public void getWordInput(Scanner input) {
		System.out.print("word in memory: ");
		String memorzied_word = input.next();
		this.setMemorzied_word(memorzied_word);
		
		System.out.print("word class: ");
		String wordclass = input.next();
		this.setWordclass(wordclass);
		
		char answer ='x';
		while(answer!='y'&&answer!='Y'&& answer!='n'&&answer!='N') {
			System.out.print("Do you know synonym(y/n)? ");
			answer=input.next().charAt(0);
			if(answer=='y'||answer=='Y') {
				System.out.println("Write synonym: ");
				String mean =input.next();
				this.setMean(mean);
				meaning=" mean(synonym):";
				break;
			}
			else if(answer=='n'||answer=='N') {
				System.out.println("Write meaning: ");
				String mean =input.next();
				this.setMean(mean);
				meaning=" mean:";
				break;
			}
			else {
			}
		}
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
			skind="kor";
			break;
		case Chinese:
			skind="ch";
			break;
		default:
			}
		System.out.println("kind:"+skind+" memorzied_word: "+memorzied_word+" wordclass:"+wordclass+ meaning +mean);
	}

}
