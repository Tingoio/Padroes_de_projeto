public class Magazine extends LibraryItem {

    int issueNumber;

    void flipPages(){

    }

    @Override
    public String toString() {
        return "Magazine [issueNumber=" + issueNumber + ", title=" + title + ", autor=" + author + ", ano=" + ano + "]";
    }

}
