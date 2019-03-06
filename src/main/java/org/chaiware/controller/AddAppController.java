package org.chaiware.controller;

import javafx.beans.property.SimpleListProperty;
import org.chaiware.model.App;

public class AddAppController {

  private SimpleListProperty<App> currentApps;

  public void setCurrentApps(SimpleListProperty<App> currentApps) {
    this.currentApps = currentApps;

    App app = new App();
    app.setName("NAME");
    app.setDesc("DESCRIPTION");

    currentApps.add(app);
  }
}
