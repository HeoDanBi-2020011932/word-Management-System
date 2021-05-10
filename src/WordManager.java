import java.util.ArrayList;
import java.util.Scanner;

import word.English;
import word.Japanese;
import word.Korean;
import word.Word;
import word.WordInput;
import word.Wordkind;

public class WordManager {
	ArrayList<WordInput> words = new ArrayList<WordInput>(); //WordInput으로 변경
	Scanner input;
	WordManager(Scanner input){
		this.input=input;
	}
	
	public void Addword() {
		int kind=0;
		WordInput wordInput;
		while(kind!=1 && kind!=2) {
		System.out.println("1.English");
		System.out.println("2.Japanese");
		System.out.println("3. Korean");
		System.out.println("Select num 1,2 or 3 for language kind: ");
		kind =input.nextInt();
		if (kind==1) {
			wordInput = new English(Wordkind.English); 		//새 객체 생성
			wordInput.getWordInput(input);
			words.add(wordInput); 		//항목 추가
			break;
		}
		else if(kind==2){
			wordInput = new Japanese(Wordkind.Japanese);		//새 객체 생성
			wordInput.getWordInput(input);
			words.add(wordInput); 		//항목 추가
			break;
		}
		else if(kind==3){
			wordInput=new Korean(Wordkind.Korean);	//새 객체 생성
			wordInput.getWordInput(input);
			words.add(wordInput); 		//항목 추가
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
	}
	 
	public void Editword() {
		System.out.print("memory word: ");
		String word1 = input.next();
		for(int i=0;i<words.size();i++) {
			WordInput wordInput =words.get(i);
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
						wordInput.setMemorzied_word(memorzied_word);
						break;
					case 2:
						System.out.println("word class: ");
						String wordclass=input.next();
						wordInput.setWordclass(wordclass);
						break;
					case 3:
						System.out.println("meaning of word: ");
						String mean=input.next();
						wordInput.setMean(	mean);
						break;
					case 4:
						System.out.println("pronunciation: ");
						String pronun=input.next();
						((Japanese) wordInput).setAnswer(pronun);
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
