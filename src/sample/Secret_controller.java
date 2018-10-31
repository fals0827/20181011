package sample;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Secret_controller {
    public MenuItem close = new MenuItem();
    public MenuItem open = new MenuItem();
    public MenuItem save = new MenuItem();
    public TextArea textIn = new TextArea();
    public TextArea textOut = new TextArea();
    public ChoiceBox<String> mode = new ChoiceBox<String>();
    public TextField key = new TextField();
    public RadioButton encrypt = new RadioButton();
    public RadioButton decrypt = new RadioButton();
    public Button btClean = new Button();
    public Button btcRun = new Button();
    public Button btClose = new Button();

    public void close (ActionEvent event){
        Controller.homeStage.show();
        Home_Controller.stageSecret.close();
    }

    public void initialize() {
        mode.setItems(FXCollections.observableArrayList("Caesar cipher","XOR"));
        ToggleGroup tg = new ToggleGroup();
        encrypt.setToggleGroup(tg);
        encrypt.setSelected(true);
        decrypt.setToggleGroup(tg);
    }

    public void Run (ActionEvent event){
        if (mode.getValue().equals("Caesar cipher")){
            caesarRun();
        }else if (mode.getValue().equals("XOR")){

        }
    }

    public void caesarRun (){
        int length = textIn.getLength();
        String str = textIn.getText();
        String strKey = key.getText();
        int caesarKey = Integer.parseInt(strKey);
        textOut.setText("");
        if (encrypt.isSelected()){
            for (int i = 0 ; i < length ; i ++){
                textOut.setText(textOut.getText() + (char)((int)str.charAt(i) + caesarKey));
            }
        }else if (decrypt.isSelected()){
            for (int i = 0 ; i < length ; i ++){
                textOut.setText(textOut.getText() + (char)((int)str.charAt(i) - caesarKey));
            }
        }
    }
}
