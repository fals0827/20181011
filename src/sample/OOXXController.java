package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class OOXXController {

    public Button bt00;
    public Button bt01;
    public Button bt02;
    public Button bt10;
    public Button bt11;
    public Button bt12;
    public Button bt20;
    public Button bt21;
    public Button bt22;
    public Button btRE;
    public Button btExit;

    public Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    boolean a = true;

    public void Ev00 (ActionEvent event){
        if (a){
            bt00.setText("O");
            a = !a;
        }else {
            bt00.setText("X");
            a = !a;
        }
        bt00.setDisable(true);
        scan();
    }
    public void Ev01 (ActionEvent event){
        if (a){
            bt01.setText("O");
            a = !a;
        }else {
            bt01.setText("X");
            a = !a;
        }
        bt01.setDisable(true);
        scan();
    }
    public void Ev02 (ActionEvent event){
        if (a){
            bt02.setText("O");
            a = !a;
        }else {
            bt02.setText("X");
            a = !a;
        }
        bt02.setDisable(true);
        scan();
    }
    public void Ev10 (ActionEvent event){
        if (a){
            bt10.setText("O");
            a = !a;
        }else {
            bt10.setText("X");
            a = !a;
        }
        bt10.setDisable(true);
        scan();
    }
    public void Ev11 (ActionEvent event){
        if (a){
            bt11.setText("O");
            a = !a;
        }else {
            bt11.setText("X");
            a = !a;
        }
        bt11.setDisable(true);
        scan();
    }
    public void Ev12 (ActionEvent event){
        if (a){
            bt12.setText("O");
            a = !a;
        }else {
            bt12.setText("X");
            a = !a;
        }
        bt12.setDisable(true);
        scan();
    }
    public void Ev20 (ActionEvent event){
        if (a){
            bt20.setText("O");
            a = !a;
        }else {
            bt20.setText("X");
            a = !a;
        }
        bt20.setDisable(true);
        scan();
    }
    public void Ev21 (ActionEvent event){
        if (a){
            bt21.setText("O");
            a = !a;
        }else {
            bt21.setText("X");
            a = !a;
        }
        bt21.setDisable(true);
        scan();
    }
    public void Ev22 (ActionEvent event){
        if (a){
            bt22.setText("O");
            a = !a;
        }else {
            bt22.setText("X");
            a = !a;
        }
        bt22.setDisable(true);
        scan();
    }
    public void scan (){
        if (bt00.getText().equals(bt01.getText())  && bt00.getText().equals(bt02.getText()) && !bt00.getText().equals("")){
            alert.setTitle( "Win!");
            alert.setHeaderText(bt00.getText() + "Win!");
            alert.show();
        }else if (bt10.getText().equals(bt11.getText()) && bt10.getText().equals(bt12.getText()) && !bt10.getText().equals("")){
            alert.setTitle(" Win!");
            alert.setHeaderText(bt10.getText() + "Win!");
            alert.show();
        }else if (bt20.getText().equals(bt21.getText()) && bt20.getText().equals(bt22.getText()) && !bt20.getText().equals("")){
            alert.setTitle(" Win!");
            alert.setHeaderText(bt20.getText() + "Win!");
            alert.show();
        }else if (bt00.getText().equals(bt10.getText()) && bt00.getText().equals(bt20.getText()) && !bt00.getText().equals("")){
            alert.setTitle(" Win!");
            alert.setHeaderText(bt00.getText() + "Win!");
            alert.show();
        }else if (bt01.getText().equals(bt11.getText()) && bt01.getText().equals(bt21.getText()) && !bt01.getText().equals("")){
            alert.setTitle(" Win!");
            alert.setHeaderText(bt01.getText() + "Win!");
            alert.show();
        }else if (bt02.getText().equals(bt12.getText()) && bt02.getText().equals(bt22.getText()) && !bt02.getText().equals("")){
            alert.setTitle(" Win!");
            alert.setHeaderText(bt02.getText() + "Win!");
            alert.show();
        }else if (bt00.getText().equals(bt11.getText()) && bt00.getText().equals(bt22.getText()) && !bt00.getText().equals("")){
            alert.setTitle(" Win!");
            alert.setHeaderText(bt00.getText() + "Win!");
            alert.show();
        }else if (bt02.getText().equals(bt11.getText()) && bt02.getText().equals(bt20.getText()) && !bt02.getText().equals("")){
            alert.setTitle(" Win!");
            alert.setHeaderText(bt02.getText() + "Win!");
            alert.show();
        }
    }
    public void EvReset (ActionEvent event){
        bt00.setDisable(false);
        bt01.setDisable(false);
        bt02.setDisable(false);
        bt10.setDisable(false);
        bt11.setDisable(false);
        bt12.setDisable(false);
        bt20.setDisable(false);
        bt21.setDisable(false);
        bt22.setDisable(false);
        bt00.setText("");
        bt01.setText("");
        bt02.setText("");
        bt10.setText("");
        bt11.setText("");
        bt12.setText("");
        bt20.setText("");
        bt21.setText("");
        bt22.setText("");
    }

    public void exit (ActionEvent event){
        Controller.homeStage.show();
        Home_Controller.stageOOXX.close();
    }
}
