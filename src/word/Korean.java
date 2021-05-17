package word;

import java.util.Scanner;

import exception.WordFormatException;

public class Korean extends Word implements WordInput{
	String meaning;

	public Korean(Wordkind kind) {
		super(kind);
	}

	public void getWordInput(Scanner input) {
		setWord(input);
		setWordClass(input);
		setWordMeanwithYN(input);
	}
		
	public void setWordMeanwithYN(Scanner input) {
		char answer ='x';
		while(answer!='y'&&answer!='Y'&& answer!='n'&&answer!='N') {
			System.out.print("Do you know synonym(y/n)? ");
			answer=input.next().charAt(0);
			if(answer=='y'||answer=='Y') {
				setWordMean(input);
				meaning=" mean(synonym):";
				break;
			}
			else if(answer=='n'||answer=='N') {
				setWordMean(input);
				meaning=" mean:";
				break;
			}
			else {
			}
		}
	}
	public void printInfo() {
		String skind =getkindString();
		System.out.println("kind:"+skind+" memorzied_word: "+memorzied_word+" wordclass:"+wordclass+ meaning +mean);
	}

}
