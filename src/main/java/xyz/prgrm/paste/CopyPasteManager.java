package xyz.prgrm.paste;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import xyz.prgrm.paste.controllers.IconController;

import java.util.Scanner;


public class CopyPasteManager extends Application {

    public static void main(String[] args) {
        launch();
    }

    public void start(Stage stage) throws Exception {
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setMaxHeight(0);
        stage.setMaxWidth(0);
        stage.setX(Double.MAX_VALUE);
        CopyPasteManager.setIconScene(stage);
    }

    public static void setIconScene(Stage stage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(CopyPasteManager.class.getResource("/icon.fxml"));

        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setAlwaysOnTop(true);
        IconController iconController = (IconController) fxmlLoader.getController();
        iconController.setStage(stage);
    }
}
