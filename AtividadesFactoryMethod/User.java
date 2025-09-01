public class User {

    public void borrow(iFactory iFactory){
        LibraryItem libraryItem = iFactory.create();
        libraryItem.borrow();
    }
}
