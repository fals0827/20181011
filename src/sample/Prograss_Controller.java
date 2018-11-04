package sample;

import javafx.collections.FXCollections;
import javafx.concurrent.Task;
import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.util.Timer;

public class Prograss_Controller {
    public MenuItem menuClose = new MenuItem();
    public ChoiceBox<String> mode = new ChoiceBox<String>();
    public Button readChoose = new Button();
    public Button writeChoose = new Button();
    public Button window_close = new Button();
    public Button run = new Button();
    static Stage filestage_In = new Stage();
    static Stage filestage_Out = new Stage();
    public String str;
    public TextField tKey = new TextField();
    public TextField tIn = new TextField();
    public TextField tOut = new TextField();
    public int key = 0;
    public ProgressBar pgb = new ProgressBar();
    public File fileIn ;
    public File fileOut ;

    public void initialize (){
        mode.setItems(FXCollections.observableArrayList("Caesar cipher","XOR"));

    }

    public void close (ActionEvent event){
        Controller.homeStage.show();
        Home_Controller.stagePrograss.close();
    }

    public void chooseIn (ActionEvent event){
        FileChooser chooser = new FileChooser();
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("TXT(*.txt)","*.txt");
        chooser.getExtensionFilters().add(extensionFilter);
        fileIn = chooser.showOpenDialog(filestage_In);
        tIn.setText(fileIn.toString());
    }

    public void chooseOut(ActionEvent event){
        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("TXT(*.txt)","*.txt");
        fileChooser.getExtensionFilters().add(extensionFilter);
        fileOut = fileChooser.showOpenDialog(filestage_Out);
        tOut.setText(fileOut.toString());
    }





    public void run (ActionEvent event) {
        String tmp = "";
        key = Integer.parseInt(tKey.getText());
        pgb.setProgress(0);
        try {
            FileReader fileReader = new FileReader(fileIn);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            str = bufferedReader.readLine();

            for (int i = 0; i < str.length(); i++) {
                tmp = tmp + (char) ((int) str.charAt(i) + key);
                pgb.setProgress((double) i / str.length());
            }
            pgb.setProgress(1);
            FileWriter fileWriter = new FileWriter(fileOut);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(tmp);
            bufferedWriter.flush();
            bufferedWriter.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
