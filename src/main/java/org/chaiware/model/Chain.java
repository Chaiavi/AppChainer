package org.chaiware.model;

import com.google.common.collect.Lists;

import java.util.List;

public class Chain {
    private String name;
    private String desc;
    private List<App> listOfApps = Lists.newArrayList();

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

    public List<App> getListOfApps() {
        return listOfApps;
    }

    public void setListOfApps(List<App> listOfApps) {
        this.listOfApps = listOfApps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chain chain = (Chain) o;

        if (!name.equals(chain.name)) return false;
        return listOfApps.equals(chain.listOfApps);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + listOfApps.hashCode();
        return result;
    }
}
