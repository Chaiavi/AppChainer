package org.chaiware.model;

import java.io.File;
import java.net.URL;

public class App {
    private String name;
    private String desc;
    private File executable;
    private String commandLineParams;
    private URL linkToDownload;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public File getExecutable() {
        return executable;
    }

    public void setExecutable(File executable) {
        this.executable = executable;
    }

    public String getCommandLineParams() {
        return commandLineParams;
    }

    public void setCommandLineParams(String commandLineParams) {
        this.commandLineParams = commandLineParams;
    }

    public URL getLinkToDownload() {
        return linkToDownload;
    }

    public void setLinkToDownload(URL linkToDownload) {
        this.linkToDownload = linkToDownload;
    }
}
