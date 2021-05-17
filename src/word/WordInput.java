package word;

import java.util.Scanner;

import exception.WordFormatException;

public interface WordInput {
	public void getWordInput(Scanner input);
	public String getMemorzied_word();
	public void setMemorzied_word(String memorzied_word) throws WordFormatException;
	public void setWordclass(String wordclass);
	public void setMean(String mean);
	public void printInfo();
	public void setWord(Scanner input);
	public void setWordClass(Scanner input);
	public void setWordMean(Scanner input);
	
}
