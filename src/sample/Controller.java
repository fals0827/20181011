package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;

import java.util.Random;

public class Controller {
    public TextField account = new TextField();
    public PasswordField password = new PasswordField();
    public Button btK = new Button();
    public Button enter = new Button();
    public String acc = "fals";
    public String pass = "3310";
    public String tmp = "" ;
    public PasswordField tmpPassword;
    public Button bt0;
    public Button bt1;
    public Button bt2;
    public Button bt3;
    public Button bt4;
    public Button bt5;
    public Button bt6;
    public Button bt7;
    public Button bt8;
    public Button bt9;
    public Button spin;
    public Button boardEnter;
    public Random rd = new Random();
    public int [] num = new int[10] ;



    public void Spin (ActionEvent event) {
        for (int i = 0; i < 10; i++) {
            num[i] = rd.nextInt(10);
            for (int j = 0; j < i; j++) {
                if (num[i] == num[j]) {
                    num[i] = rd.nextInt(10);
                    j = -1;
                }
            }
        }
        bt0.setText(Integer.toString(num[0]));
        bt1.setText(Integer.toString(num[1]));
        bt2.setText(Integer.toString(num[2]));
        bt3.setText(Integer.toString(num[3]));
        bt4.setText(Integer.toString(num[4]));
        bt5.setText(Integer.toString(num[5]));
        bt6.setText(Integer.toString(num[6]));
        bt7.setText(Integer.toString(num[7]));
        bt8.setText(Integer.toString(num[8]));
        bt9.setText(Integer.toString(num[9]));
        password.setText("");

    }

    public void callKeyboard (Event event){
            try {
                Parent keyboardWindow = FXMLLoader.load(getClass().getResource("Keyboard.fxml"));
                Stage stage1 = new Stage();
                stage1.setTitle("亂數鍵盤");
                stage1.setScene(new Scene(keyboardWindow , 600 , 425));
                stage1.show();

            }catch (Exception e){
                e.printStackTrace();
            }
    }

    public void evB0 (Event event){
        tmpPassword.setText(tmpPassword.getText() + bt0.getText());
    }
    public void evB1 (Event event){
        tmpPassword.setText(tmpPassword.getText() + bt0.getText());
    }
    public void evB2 (Event event){
        tmpPassword.setText(tmpPassword.getText() + bt0.getText());
    }
    public void evB3 (Event event){
        tmpPassword.setText(tmpPassword.getText() + bt0.getText());
    }
    public void evB4 (Event event){
        tmpPassword.setText(tmpPassword.getText() + bt0.getText());
    }
    public void evB5 (Event event){
        tmpPassword.setText(tmpPassword.getText() + bt0.getText());
    }
    public void evB6 (Event event){
        tmpPassword.setText(tmpPassword.getText() + bt0.getText());
    }
    public void evB7 (Event event){
        tmpPassword.setText(tmpPassword.getText() + bt0.getText());
    }
    public void evB8 (Event event){
        tmpPassword.setText(tmpPassword.getText() + bt0.getText());
    }
    public void evB9 (Event event){
        tmpPassword.setText(tmpPassword.getText() + bt0.getText());
    }

    public void enterPass (){
        tmp = tmpPassword.getText();
        password.setText(tmp);
        
    }
}
