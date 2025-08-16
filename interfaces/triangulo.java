package interfaces;

public class triangulo implements figura_geometrica {

    public String nomeFigura;
    public int base;
    public int altura;
    public int ladoA;
    public int ladoB;
    public int ladoC;
    @Override
    public String getNomeFigura() {
        return this.nomeFigura;    
    }
    @Override
    public int getArea() {
        return (this.altura*this.base)/2;
    }
    @Override
    public int getPerimetro() {
        return this.ladoA*this.ladoB*this.ladoC;
    }


}
