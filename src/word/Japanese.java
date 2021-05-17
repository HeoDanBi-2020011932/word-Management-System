package word;

import java.util.Scanner;

public class Japanese extends Word implements WordInput{
	
	public Japanese(Wordkind kind) {
		super(kind);
	}
	String answer;
	public String getAnswer(){
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setWordPronunce(Scanner input) {
		System.out.println("pronunciation: ");
		String pronun=input.next();
		setAnswer(pronun);
	}
	
	public void getWordInput(Scanner input) {
		setWord(input);
		setWordClass(input);
		setWordMean(input);
		setWordPronunce(input);
	}
	public void printInfo() {
		String skind =getkindString();
		System.out.println("kind:"+skind+" memorzied_word: "+memorzied_word+" wordclass: "+wordclass+" mean: "+mean+ "pronunciation: "+answer);
	}
	
}
