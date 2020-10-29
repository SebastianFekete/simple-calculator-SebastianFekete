package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;


public class Controller {
    @FXML
    TextField displayField;



    int aktuelleZahl=0;
    List<Integer> list = new ArrayList<Integer>();
    String Rechenoperator;


    @FXML
    Button Button1;

    @FXML
    Button Button2;
    @FXML
    Button Button3;
    @FXML
    Button Button4;
    @FXML
    Button Button5;
    @FXML
    Button Button6;
    @FXML
    Button Button7;
    @FXML
    Button Button8;
    @FXML
    Button Button9;
    @FXML
    Button Button0;
    @FXML
    Button ButtonEQ;
    @FXML
    Button ButtonAdd;
    @FXML
    Button ButtonDiv;
    @FXML
    Button ButtonMul;
    @FXML
    Button ButtonSub;
    @FXML
    Button ButtonCL;


    @FXML
    void handleButtonCL(ActionEvent event){

        displayField.clear();
        aktuelleZahl=0;
    }
    @FXML
    void handleButtonEQ(ActionEvent event){

        String zahl = displayField.getText();
        int x=Integer.parseInt(zahl);
        list.add(x);

        if(Rechenoperator.equals("+")) {
            for (int i : list) {
                aktuelleZahl += i;
            }
        }

        if(Rechenoperator.equals("-")) {
            aktuelleZahl+=list.get(1)*2;
            for (int i : list) {
                aktuelleZahl -= i;
            }
            aktuelleZahl*=-1;
        }
        if(Rechenoperator.equals("*")) {
            aktuelleZahl+=list.get(1);

            for (int i : list) {

                int summe=aktuelleZahl* i;
            }


        }
        if(Rechenoperator.equals("/")) {
            aktuelleZahl+=list.get(1);
            for (int i : list) {
                aktuelleZahl /= i;
            }
        }


                displayField.clear();
                displayField.setText(displayField.getText()+aktuelleZahl);
                aktuelleZahl=0;
                list.clear();
 }

    @FXML
    void handleButtonAdd(ActionEvent event){
        Rechenoperator="+";
        String zahl = displayField.getText();
        int x=Integer.parseInt(zahl);
        list.add(x);
        displayField.clear();

    }
    @FXML
    void handleButtonSub(ActionEvent event){
        Rechenoperator="-";
        String zahl = displayField.getText();
        int x=Integer.parseInt(zahl);
        list.add(x);
        displayField.clear();
    }
    @FXML
    void handleButtonDiv(ActionEvent event){
        Rechenoperator="/";
        String zahl = displayField.getText();
        int x=Integer.parseInt(zahl);
        list.add(x);
        displayField.clear();
    }
    @FXML
    void handleButtonMul(ActionEvent event){
        Rechenoperator="*";
        String zahl = displayField.getText();
        int x=Integer.parseInt(zahl);
        list.add(x);
        displayField.clear();
    }
    @FXML
    void handleButton0(ActionEvent event){

        displayField.setText(displayField.getText()+"0");
    }
    @FXML
    void handleButton1(ActionEvent event){

       displayField.setText(displayField.getText()+"1");
    }

    @FXML
    void handleButton2(ActionEvent event){

        displayField.setText(displayField.getText()+"2");
    }

    @FXML
    void handleButton3(ActionEvent event){

        displayField.setText(displayField.getText()+"3");
    }

    @FXML
    void handleButton4(ActionEvent event){

        displayField.setText(displayField.getText()+"4");
    }

    @FXML
    void handleButton5(ActionEvent event){

        displayField.setText(displayField.getText()+"5");
    }

    @FXML
    void handleButton6(ActionEvent event){

        displayField.setText(displayField.getText()+"6");
    }

    @FXML
    void handleButton7(ActionEvent event){

        displayField.setText(displayField.getText()+"7");
    }

    @FXML
    void handleButton8(ActionEvent event){

        displayField.setText(displayField.getText()+"8");
    }

    @FXML
    void handleButton9(ActionEvent event){

        displayField.setText(displayField.getText()+"9");
    }

}
