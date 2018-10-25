package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Home_Controller {
    static Stage stageOOXX = new Stage();
    public MenuBar mnb = new MenuBar();
    public MenuItem item_Secret = new MenuItem();
    public MenuItem item_OOXX = new MenuItem();

    public void openOOXX (ActionEvent event){
        try{
            FXMLLoader loaderOOXX = new FXMLLoader(getClass().getResource("OOXXsample.fxml"));
            Parent parentOOXX = loaderOOXX.load();
            stageOOXX.setScene(new Scene(parentOOXX , 600 , 420));
            stageOOXX.show();
            Controller.homeStage.close();

        }catch (Exception e){

        }
    }
}
