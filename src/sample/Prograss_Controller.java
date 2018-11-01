package sample;

import javafx.collections.FXCollections;
import javafx.scene.control.ChoiceBox;

public class Prograss_Controller {
    public ChoiceBox<String> mode = new ChoiceBox<String>();

    private void initialize (){
        mode.setItems(FXCollections.observableArrayList("Caesar cipher","XOR"));
    }

}
