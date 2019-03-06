package org.chaiware.controller;

import javafx.beans.property.SimpleListProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.chaiware.model.App;


public class AddAppController {

  @FXML
  private TextField tfName;

  @FXML
  private TextField tfDesc;

  private SimpleListProperty<App> currentApps;

  public void setCurrentApps(SimpleListProperty<App> currentApps) {
    this.currentApps = currentApps;
  }

  public void onSaveNewApp(ActionEvent actionEvent) {
    App app = new App();
    app.setName(tfName.getText());
    app.setDesc(tfDesc.getText());

    currentApps.add(app);
    closeWindow(actionEvent);
  }

  public void onCancel(ActionEvent actionEvent) {
    closeWindow(actionEvent);
  }

  private void closeWindow(ActionEvent event) {
    Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();
  }
}
