import java.util.ArrayList;
import java.util.Scanner;

public class WordManager {
	ArrayList<Word> words = new ArrayList<Word>();
	Scanner input;
	WordManager(Scanner input){
		this.input=input;
	}
	
	public void Addword() {
		Word word = new Word(); //�� ��ü ����
		System.out.print("word in memory: ");
		word.memorzied_word = input.next();
		System.out.print("word class: ");
		word.wordclass = input.next();
		System.out.print("meaning: ");
		word.mean = input.next();
		words.add(word); //�׸� �߰�
		}
	
	public void Deleteword() {
		System.out.print("memory word: ");
		String word1 = input.next();
		
		int index = -1; // -1�̴�, �迭���� �ε����� ã�� ���� ��
		for(int i=0;i<words.size();i++) {
			if (words.get(i).memorzied_word.equals(word1)) {
				index = i;
				break;
			}
		}
		
		if(index>=0) {
			words.remove(index);
			System.out.println("the word "+word1+" is deleted");
		}
		else {
			System.out.println("the word has not been registered");
			return;
		}
	} // �����ִ� �ϳ��� ã�� �� �־��ٸ� �̹����� �迭 ��ü�� ���ƺ��� ��
	 
	public void Editword() {
		System.out.print("memory word: ");
		String word1 = input.next();
		for(int i=0;i<words.size();i++) {
			Word word =words.get(i);
			if (words.get(i).memorzied_word.equals(word1)) {
				int num=-1;
				while(num !=4) {
					System.out.println("�� My Word Manager Menu ��");
					System.out.println("1. Edit word ");
					System.out.println("2. Edit word class");
					System.out.println("3. Edit meaning ");
					System.out.println("4. Exit ");
					System.out.println("Select one number between 1-4");
			
					num=input.nextInt();
					switch(num) {
					case 1:
						System.out.println("word in menory: "); 
						word.memorzied_word=input.next();
						break;
					case 2:
						System.out.println("word class: ");
						word.wordclass=input.next();
						break;
					case 3:
						System.out.println("meaning of word: ");
						word.mean=input.next();
						break;
					}//switch
				}//while
			}//if
		}
	}
	public void Viewwords() {
//		System.out.print("memory word: ");
//		String word1 = input.next();
		for(int i=0;i<words.size();i++) {
			words.get(i).printInfo(); //������ �ε����� ������ �´�
		}				
	}
}
