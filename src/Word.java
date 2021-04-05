
public class Word {
	String memorzied_word;
	String wordclass;
	String mean;
	
	public Word() {
		
	}
	
	public Word(String memorzied_word, String wordclass, String mean) {
		this.memorzied_word=memorzied_word;
		this.wordclass=wordclass;
		this.mean=mean;
	}
	
	public void printInfo() {
		System.out.println("memorzied_word: "+memorzied_word+" wordclass: "+wordclass+" mean: "+mean);
	}
}
