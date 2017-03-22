package it.polito.tdp.spellchecker.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Dictionary {
	
	protected List<String> dizionario;
	protected List<RichWord> parole;
	
	public Dictionary() {
		dizionario=new LinkedList<String>();
		parole = new LinkedList<RichWord>();
	}
	
	public void loadDictionary(String language){
	try {
		FileReader fr = new FileReader("rsc/"+language+".txt");
		BufferedReader br = new BufferedReader(fr);
		String word;
		while ((word = br.readLine()) != null) {
		// Aggiungere parola alla struttura dati
			dizionario.add(word);
		}
		br.close();
		} catch (IOException e){
		System.out.println("Errore nella lettura del file");
		}
	}
	public List<RichWord> spellCheckText(List<String> inputTextList){
		
		RichWord r;
		for (String s : inputTextList){
			if (dizionario.contains(s.toLowerCase()))
				r = new RichWord(s, true);
			else 
				r = new RichWord(s, false);
			parole.add(r);
		}
			return parole;
	}
	
}