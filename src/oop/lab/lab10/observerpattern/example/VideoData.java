package oop.lab.lab10.observerpattern.example;

public class VideoData extends Subject {
    private String title = "heheheh";
    private String description = "Nam's video";
    private String fileName = "AVWFAQWSFW";

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        videoDataChance();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        videoDataChance();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        videoDataChance();
    }
    public void videoDataChance() {
        notifyObserver(this, null);
    }
}
