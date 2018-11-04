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
    static Stage stageSecret = new Stage();
    static Stage stagePrograss = new Stage();
    public MenuBar mnb = new MenuBar();
    public MenuItem item_Secret = new MenuItem();
    public MenuItem item_OOXX = new MenuItem();
    public MenuItem item_Prograss = new MenuItem();
    public MenuItem item_Exit = new MenuItem();

    public void openOOXX (ActionEvent event){
        try{
            FXMLLoader loaderOOXX = new FXMLLoader(getClass().getResource("OOXXsample.fxml"));
            Parent parentOOXX = loaderOOXX.load();
            stageOOXX.setScene(new Scene(parentOOXX , 600 , 420));
            stageOOXX.show();
            Controller.homeStage.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void openSecret (ActionEvent event){
        try {
            FXMLLoader loaderSecret = new FXMLLoader(getClass().getResource("Secret.fxml"));
            Parent parentSecret = loaderSecret.load();
            stageSecret.setScene(new Scene(parentSecret,633,482));
            stageSecret.show();
            Controller.homeStage.close();

        }catch (Exception e ){
            e.printStackTrace();
        }
    }

    public void openPrograss (ActionEvent event){
        try {
            FXMLLoader proLoader = new FXMLLoader(getClass().getResource("Prograss.fxml"));
            Parent proParent = proLoader.load();
            stagePrograss.setScene(new Scene(proParent , 600 , 213));
            stagePrograss.show();
            Controller.homeStage.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void exit(ActionEvent event){
        System.exit(0);
    }
}
