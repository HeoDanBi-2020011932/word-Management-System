package word;

import java.util.Scanner;

public interface WordInput {
	public void getWordInput(Scanner input);
	public String getMemorzied_word();
	public void setMemorzied_word(String memorzied_word);
	public void setWordclass(String wordclass);
	public void setMean(String mean);
	public void printInfo();

}
