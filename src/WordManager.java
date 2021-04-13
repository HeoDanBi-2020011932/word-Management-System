import java.util.ArrayList;
import java.util.Scanner;

import word.Japanese;
import word.Word;

public class WordManager {
	ArrayList<Word> words = new ArrayList<Word>();
	Scanner input;
	Japanese jp = new Japanese(); 
	WordManager(Scanner input){
		this.input=input;
	}
	
	public void Addword() {
		int kind=0;
		Word word;
		while(kind!=1 && kind!=2) {
		System.out.println("1.English");
		System.out.println("2.Japanese");
		System.out.println("Select num for language kind");
		kind =input.nextInt();
		if (kind==1) {
			word = new Word(); 		//새 객체 생성
			word.getWordInput(input);
			words.add(word); 		//항목 추가
			break;
		}
		else if(kind==2){
			word = new Japanese();		//새 객체 생성
			word.getWordInput(input);
			words.add(word); 		//항목 추가
			break;
		}
		else {
			System.out.println("Select num for language kind");
			}
		}
	}	
	public void Deleteword() {
		System.out.print("memory word: ");
		String word1 = input.next();
		
		int index = -1; // -1이다, 배열에서 인덱스를 찾지 못한 것
		for(int i=0;i<words.size();i++) {
			if (words.get(i).getMemorzied_word().equals(word1)) {
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
	} // 저번주는 하나만 찾을 수 있었다면 이번에는 배열 전체를 돌아보는 것
	 
	public void Editword() {
		System.out.print("memory word: ");
		String word1 = input.next();
		for(int i=0;i<words.size();i++) {
			Word word =words.get(i);
			if (words.get(i).getMemorzied_word().equals(word1)) {
				int num=-1;
				while(num !=5) {
					System.out.println("☆ My Word Manager Menu ☆");
					System.out.println("1. Edit word ");
					System.out.println("2. Edit word class");
					System.out.println("3. Edit meaning ");
					System.out.println("4. Edit pronunciation ");
					System.out.println("5. Exit ");
					System.out.println("Select one number between 1-5");
			
					num=input.nextInt();
					switch(num) {
					case 1:
						System.out.println("word in menory: "); 
						String memorzied_word=input.next();
						word.setMemorzied_word(memorzied_word);
						break;
					case 2:
						System.out.println("word class: ");
						String wordclass=input.next();
						word.setWordclass(wordclass);
						break;
					case 3:
						System.out.println("meaning of word: ");
						String mean=input.next();
						word.setMean(mean);
						break;
					case 4:
						System.out.println("pronunciation: ");
						String pronun=input.next();
						word.setAnswer(pronun);
						}
						break;
					}//switch
				}//while
			}//if
		}
	
	public void Viewwords() {
//		System.out.print("memory word: ");
//		String word1 = input.next();
		System.out.println("of registered words: "+words.size());
		for(int i=0;i<words.size();i++) {
			words.get(i).printInfo(); //각각의 인덱스를 가지고 온다
		}				
	}
}
