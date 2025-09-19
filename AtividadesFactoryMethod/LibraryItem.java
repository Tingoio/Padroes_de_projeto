public abstract class LibraryItem implements Borrowable {
    
    String title;
    String author;
    int ano;

    @Override
    public void borrow() {
        System.out.println("Item emprestado!");
    }
    @Override
    public void returnItem() {

    }
    @Override
    public String toString() {
        return "LibraryItem []";
    }

}
