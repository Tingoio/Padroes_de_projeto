package interfaces;

public class consumidor {
    public static void main(String[] args) {
        quadrado q = new quadrado();
        q.nomeFigura = "Quadrado azul";
        q.lado =2;

        triangulo t = new triangulo();
        t.nomeFigura = "Triangulo alvi verde";
        t.altura = 6;
        t.base = 4;
        t.ladoA = 3;
        t.ladoB = 3;
        t.ladoC = 3;

        desenhista paint = new desenhista();
        paint.desenhar(q);
        System.out.println("\n");
        paint.desenhar(t);
    }
}
