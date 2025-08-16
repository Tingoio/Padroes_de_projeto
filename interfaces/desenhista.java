package interfaces;

public class desenhista {
    public void desenhar(figura_geometrica f) {
        System.out.println("Figura: " + f.getNomeFigura());
        System.out.println("Perimetro: " + f.getPerimetro());
        System.out.println("Area: " + f.getArea());
    }
}
