package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;

import java.util.Random;

public class keyboard_controller {
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
    public Button back;
    public Random rd = new Random();
    public int [] num = new int[10] ;
    public PasswordField tmpPassword;
    public String str = "";

    public void btn (ActionEvent event) {
        Button button = (Button) event.getSource();
        tmpPassword.setText(tmpPassword.getText() + button.getText());
    }

    public void btnBack(ActionEvent event){
        tmpPassword.setText(tmpPassword.getText().substring(0,tmpPassword.getLength()-1));
    }

    protected void password_field (PasswordField passwordField) {
        this.tmpPassword = passwordField;
    }

    public void initialize () {
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
    }
}
