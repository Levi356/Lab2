package Denomination;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	MergeSort mergeSort = new MergeSort();
	NotesCount notesCount = new NotesCount();
	
	System.out.println("enter the size of currency denominations ");
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("enter the currency denominations value");
		int notes []  = new int[size];
		for (int i = 0; i<size; i++) {
		              notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSort.sort(notes,0,notes.length-1); 
		notesCount.notesCountImplementation(notes, amount); 
	}
   }
 
