package factory_method;

import interfaces.triangulo;

public class fabrica_triangulo implements iFabrica {

    @Override
    public iForma criar() {
        return new triangulo();
    }
}
