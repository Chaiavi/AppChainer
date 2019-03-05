package org.chaiware.controller;

import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import org.chaiware.model.App;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

  SimpleListProperty<App> currentApps = new SimpleListProperty(FXCollections.observableArrayList());
  @FXML
  private ListView listViewApps;

  public void initialize(URL url, ResourceBundle rb) {
    listViewApps.itemsProperty().bind(currentApps);
  }

  public void onAddApp(ActionEvent actionEvent) {
    App app = new App();
    app.setName("NAME");
    app.setDesc("DESCRIPTION");

    currentApps.add(app);
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
