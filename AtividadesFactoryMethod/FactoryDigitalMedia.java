public class FactoryDigitalMedia implements iFactory {

    @Override
    public LibraryItem create(){
        return new DigitalMedia();
    }

}