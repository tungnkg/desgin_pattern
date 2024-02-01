package behavioral.observer;

import behavioral.observer.base.Subject;

public class VideoData extends Subject {
    private String tittle;
    private String description;
    private String fileName;
    public VideoData(){}
    public VideoData(String tittle, String description, String fileName) {
        this.tittle = tittle;
        this.description = description;
        this.fileName = fileName;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
        videoDataChanged();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        videoDataChanged();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
        videoDataChanged();
    }

    public void videoDataChanged(){
        notifyObservers(this, null);
    }
}
