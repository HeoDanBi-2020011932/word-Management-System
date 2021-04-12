package word;

import java.util.Scanner;

public class Japanese extends Word {
	
	String answer;
	public String getAnswer(){
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public void getWordInput(Scanner input) {
		System.out.print("word in memory: ");
		String memorzied_word = input.next();
		this.setMemorzied_word(memorzied_word);
		
		System.out.print("Please write pronunciation in alphabet");
		String answer = input.next();
		this.setAnswer(answer);
		
		System.out.print("word class: ");
		String wordclass = input.next();
		this.setWordclass(wordclass);
		
		System.out.print("meaning: ");
		String mean = input.next();
		this.setMean(mean);
	}
}
