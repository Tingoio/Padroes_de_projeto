public class FactoryBook implements iFactory {

    @Override
    public LibraryItem create(){
        return new Book();
    }

}
