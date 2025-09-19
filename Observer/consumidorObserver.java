package Observer;

public class consumidorObserver {

    public static void main(String[] args) {

        subject observado = new subject();

        observadorConcreto ObsA = new observadorConcreto(observado);
        observadorConcreto ObsB = new observadorConcreto(observado);

        observado.setState(1);
    }
}
