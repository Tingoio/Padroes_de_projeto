public class FactoryMagazine implements iFactory {

    @Override
    public LibraryItem create(){
        return new Magazine();
    }

}
