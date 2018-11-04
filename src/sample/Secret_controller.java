package sample;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;

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
    static Stage fileStage = new Stage();

    public void close (ActionEvent event){
        Controller.homeStage.show();
        Home_Controller.stageSecret.close();
    }

    public void open (ActionEvent event){
        FileChooser Chooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT (*.txt)","*.txt");
        Chooser.getExtensionFilters().add(extFilter);
        File file = Chooser.showOpenDialog(fileStage);

        try {
            FileReader frd = new FileReader(file.getAbsoluteFile());
            BufferedReader brd = new BufferedReader(frd);
            String str = brd.readLine();
            textIn.setText(str);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void save (ActionEvent event){
        FileChooser Chooser = new FileChooser();
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT (*.txt)","*.txt");
        Chooser.getExtensionFilters().add(extFilter);
        File file = Chooser.showSaveDialog(fileStage);
        try {
            FileWriter fwt = new FileWriter(file);
            BufferedWriter bwt = new BufferedWriter(fwt);
            String str = textOut.getText();
            bwt.write(str);
            bwt.flush();
            bwt.close();
        }catch (Exception e){
            e.printStackTrace();
        }
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

    public void clean (ActionEvent event){
        textIn.setText("");
        textOut.setText("");
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
