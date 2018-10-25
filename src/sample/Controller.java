package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.text.html.Option;
public class Controller {
    static Stage homeStage = new Stage();
    public TextField account = new TextField();
    public PasswordField password = new PasswordField();
    public Button btK = new Button();
    public Button enter = new Button();


    public String acc = "fals";
    public String pass = "3310";


    public void callKeyboard (Event event){
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Keyboard.fxml"));
                Parent keyboardWindow = loader.load();
                keyboard_controller keyboard_controller = loader.getController();
                keyboard_controller.password_field(password);
                Stage stage1 = new Stage();
                stage1.setScene(new Scene(keyboardWindow , 600 , 425));
                stage1.show();

            }catch (Exception e){
                e.printStackTrace();
            }
    }

    public void login (ActionEvent event){
        if (account.getText().equals(acc) && password.getText().equals(pass)){
            try {
                if (account.getText().equals(acc) && password.getText().equals(pass)){
                    FXMLLoader ld = new FXMLLoader(getClass().getResource("Home.fxml"));
                    Parent homeWindow = ld.load();
                    homeStage.setScene(new Scene(homeWindow, 600,400));
                    homeStage.show();
                    Stage tmp = (Stage)enter.getScene().getWindow();
                    tmp.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
