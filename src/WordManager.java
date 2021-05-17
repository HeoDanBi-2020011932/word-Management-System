import java.util.ArrayList;
import java.util.InputMismatchException;
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
		while(kind<1 || kind>	3) {
			try {
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
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3! ");
				if(input.hasNext())
					input.next();
				kind=-1;
			}
		 }
	}
	public void Deleteword() {
		System.out.print("memory word: ");
		String word1 = input.next();
		int index = findIndex(word1);
		removefromWord(index, word1);
		} 	
	
	public int findIndex(String word) {
		int index = -1; // -1이다, 배열에서 인덱스를 찾지 못한 것
		for(int i=0;i<words.size();i++) {
			if (words.get(i).getMemorzied_word().equals(word)) {
				index = i;
				break;
			}
		}	
		return index;
	}
	
	public int removefromWord(int index, String word) {
		if(index>=0) {
			words.remove(index);
			System.out.println("the word "+word+" is deleted");
			return 1; 
		}
		else {
			System.out.println("the word has not been registered");
			return -1;
		}
	}
	public void Editword() {
		System.out.print("memory word: ");
		String word1 = input.next();
		for(int i=0;i<words.size();i++) {
			WordInput word =words.get(i);
			if (words.get(i).getMemorzied_word().equals(word1)) {
				int num=-1;
				while(num !=5) {
					showEditMenu();
					num=input.nextInt();
					switch(num) {
					case 1:
						word.setWord(input);
						break;
					case 2:
						word.setWordClass(input);
						break;
					case 3:
						word.setWordMean(input);
						break;
					case 4:
						((Japanese) word).setWordPronunce(input);
						break;
					default:
						continue;
						}
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
	public void showEditMenu() {
		System.out.println("☆ My Word Manager Menu ☆");
		System.out.println("1. Edit word ");
		System.out.println("2. Edit word class");
		System.out.println("3. Edit meaning ");
		System.out.println("4. Edit pronunciation ");
		System.out.println("5. Exit ");
		System.out.println("Select one number between 1-5");
	}
}
