public class Book extends LibraryItem {

    String genre;

    @Override
    public void borrow() {
        System.out.println("Livro emprestado!");
    }

    void readSample() {

    }

    @Override
    public String toString() {
        return "Book [genre=" + genre + ", title=" + title + ", autor=" + author + ", ano=" + ano + ", toString()=" + "]";
    }
}
