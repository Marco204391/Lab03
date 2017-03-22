package it.polito.tdp.spellchecker.model;

public class RichWord {
	
	String word;
	boolean correct=false;
	
	
	public RichWord(String word,boolean correct) {
		this.word = word;
		this.correct = correct;
	}

	/**
	 * @return the correct
	 */
	public boolean isCorrect() {
		return correct;
	}

	/**
	 * @param correct the correct to set
	 */
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}

	/**
	 * @return the word
	 */
	public String getWord() {
		return word;
	}

	/**
	 * @param word the word to set
	 */
	public void setWord(String word) {
		this.word = word;
	}
	

	
}
