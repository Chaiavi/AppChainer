package org.chaiware.controller;

import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.chaiware.model.App;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

  @FXML
  private ListView listViewApps;

  SimpleListProperty<App> currentApps = new SimpleListProperty(FXCollections.observableArrayList());

  public void initialize(URL url, ResourceBundle rb) {
    listViewApps.itemsProperty().bind(currentApps);
  }

  public void onAddApp(ActionEvent actionEvent) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/AddApp.fxml"));
    Stage stage = new Stage();
    stage.initModality(Modality.APPLICATION_MODAL);
    stage.initStyle(StageStyle.UTILITY);
    stage.setTitle("Add New App");
    stage.setScene(new Scene(fxmlLoader.load()));

    AddAppController addAppController = fxmlLoader.<AddAppController>getController();
    addAppController.setCurrentApps(currentApps);
    stage.showAndWait();
  }

  public void onExportToUsb(ActionEvent actionEvent) {

  }

  public void onQuit(ActionEvent actionEvent) {

  }

  public void onNewChain(ActionEvent actionEvent) {

  }

  public void onDeleteChain(ActionEvent actionEvent) {

  }

  public void onNewApp(ActionEvent actionEvent) {

  }

  public void onEditApp(ActionEvent actionEvent) {

  }

  public void onRemoveApp(ActionEvent actionEvent) {

  }

  public void onAbout(ActionEvent actionEvent) {

  }

  public void onCheckForUpdates(ActionEvent actionEvent) {

  }

  public void onAppRemove(ActionEvent actionEvent) {

  }

  public void onMoveUp(ActionEvent actionEvent) {

  }

  public void onMoveDown(ActionEvent actionEvent) {

  }

  public void onSaveChain(ActionEvent actionEvent) {

  }

  public void onRunChain(ActionEvent actionEvent) {

  }
}
