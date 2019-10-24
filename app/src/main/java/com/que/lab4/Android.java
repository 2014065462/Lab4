package com.que.lab4;

public class Android {
    int logo;

    String name, version, level, release, info;

    public Android(int cLogo, String name, String version, String level, String release, String info) {
        this.logo = cLogo;
        this.name = name;
        this.version = version;
        this.level = level;
        this.release = release;
        this.info = info;
    }

    public int getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getLevel() {
        return level;
    }

    public String getRelease() {
        return release;
    }

    public String getInfo() {
        return info;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
