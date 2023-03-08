package com.example.posteitaliane;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Objects;

public class HelloController {

    ArrayList<String> poste = new ArrayList<String>();
    @FXML
    private Button remove;
    @FXML
    private Button add;
    @FXML
    private Button serve;

    @FXML
    private TextField textAdd;
    @FXML
    private TextField textRemove;
    @FXML
    private ListView lista;

    @FXML
    private Label welcomeText;

    //metodi

    /**
     * metodo che aggiunge nella coda una persona
     */
    @FXML
    protected void clickAggiungi() {
        if (!Objects.equals(textAdd.getText(), "")) {
            poste.add(textAdd.getText());
            welcomeText.setText("persona " + textAdd.getText() + " servita");
        }
        aggiornaLista();
    }

    /**
     * toglo il tipo nella prima posizione e aggiorno la lista gui
     */
    @FXML
    protected void clickServe (){
        poste.remove(0);
        aggiornaLista();
    }

    /**
     * rimuovo in una posizione intermedia e aggiorno la lista
     */
    @FXML
    protected void clickRmv (){
        for(int i=0; i < poste.size();i++){
            if (Objects.equals(poste.get(i), textRemove.getText()))
                aggiornaPoste(i);
            aggiornaLista();
        }
    }


    /**
     * aggiorna gui lista
     */
    @FXML
    protected void aggiornaLista(){
        lista.getItems().clear();
        for(int i=0; i<poste.size(); i++){
            lista.getItems().add(poste.get(i));
        }
    }

    /**
     * arraylist toglie spazi vuoti
     */
    protected void aggiornaPoste(int i){
        poste.remove(i);
    }

}