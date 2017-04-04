	/**
	 * Sample Skeleton for 'SpellChecker.fxml' Controller Class
	 */

	package it.polito.tdp.spellchecker.controller;

	import java.net.URL;
	import java.util.LinkedList;
	import java.util.List;
	import java.util.ResourceBundle;
	import it.polito.tdp.spellchecker.model.Dictionary;
	import it.polito.tdp.spellchecker.model.RichWord;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.TextArea;

	public class SpellCheckerController {
		
		private Dictionary dizionario;

	    @FXML // ResourceBundle that was given to the FXMLLoader
	    private ResourceBundle resources;

	    @FXML // URL location of the FXML file that was given to the FXMLLoader
	    private URL location;

	    @FXML // fx:id="cmbbox"
	    private ComboBox<String> cmbbox; // Value injected by FXMLLoader

	    @FXML // fx:id="txtImput"
	    private TextArea txtImput; // Value injected by FXMLLoader

	    @FXML // fx:id="btn_spell"
	    private Button btn_spell; // Value injected by FXMLLoader

	    @FXML // fx:id="txtOutput"
	    private TextArea txtOutput; // Value injected by FXMLLoader

//	    @FXML // fx:id="lblerr"
//	    private Label lblerr; // Value injected by FXMLLoader
	    
	    @FXML // fx:id="btnclear"
	    private Button btnclear; // Value injected by FXMLLoader

	    @FXML
	    void doClear(ActionEvent event) {
	    	txtImput.clear();
	    	txtOutput.clear();
	    }

	    @FXML
	    void doSpell(ActionEvent event) {
	    	int c=0;
	    	dizionario.cancella();
	    	dizionario.loadDictionary(cmbbox.getValue());
	    	List<String> list= new LinkedList<String>();
	    	String result="";
	    	String input=txtImput.getText().replaceAll("[\\p{Punct}]", "");
	    	String str []= input.split(" ");
	    	for(int i=0; i<str.length; i++){
	    		list.add(str[i]);
	    	}
	    	for(RichWord r: dizionario.spellCheckText(list))
	    		if(!r.isCorrect()){
	    			c++;
	    			result+=r.getWord()+"\n";
	    		}
	    	txtOutput.setText(result);
	    }

	    @FXML // This method is called by the FXMLLoader when initialization is complete
	    void initialize() {
	        assert cmbbox != null : "fx:id=\"cmbbox\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert txtImput != null : "fx:id=\"txtImput\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert btn_spell != null : "fx:id=\"btn_spell\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert txtOutput != null : "fx:id=\"txtOutput\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert btnclear != null : "fx:id=\"btnclear\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	       // assert lblerr != null : "fx:id=\"lblerr\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        cmbbox.getItems().addAll("English", "Italian");
	        if(cmbbox.getItems().size()>0)
	            cmbbox.setValue(cmbbox.getItems().get(0));
	    }

		public void setDictionaryModel (Dictionary dizionario) {
			this.dizionario=dizionario;
			// TODO Auto-generated method stub
			
		}
	}
