	/**
	 * Sample Skeleton for 'SpellChecker.fxml' Controller Class
	 */

	package it.polito.tdp.spellchecker.controller;

	import java.net.URL;
	import java.util.ResourceBundle;
	import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.ComboBox;
	import javafx.scene.control.TextArea;

	public class SpellCheckerController {

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

	    @FXML // fx:id="btnclear"
	    private Button btnclear; // Value injected by FXMLLoader

	    @FXML
	    void doClear(ActionEvent event) {

	    }

	    @FXML
	    void doSpell(ActionEvent event) {

	    }

	    @FXML // This method is called by the FXMLLoader when initialization is complete
	    void initialize() {
	        assert cmbbox != null : "fx:id=\"cmbbox\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert txtImput != null : "fx:id=\"txtImput\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert btn_spell != null : "fx:id=\"btn_spell\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert txtOutput != null : "fx:id=\"txtOutput\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        assert btnclear != null : "fx:id=\"btnclear\" was not injected: check your FXML file 'SpellChecker.fxml'.";
	        cmbbox.getItems().addAll("English", "Italian");
	        if(cmbbox.getItems().size()>0)
	            cmbbox.setValue(cmbbox.getItems().get(0));
	    }
	}
