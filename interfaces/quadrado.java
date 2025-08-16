package interfaces;

public class quadrado implements figura_geometrica {
    public String nomeFigura;
    public int lado;

    @Override
    public String getNomeFigura() {
        return this.nomeFigura;
    }

    @Override
    public int getArea() {
        return this.lado*this.lado;
    }

    @Override
    public int getPerimetro() {
        return this.lado*4;
    }
}
