public class DigitalMedia extends LibraryItem {

    String fileFormat;

    void play(){

    }

    @Override
    public String toString() {
        return "DigitalMedia [fileFormat=" + fileFormat + ", title=" + title + ", autor=" + author + ", ano=" + ano
                + "]";
    }
}
