package factory_method;

public class app_paint {
    public static void main(String[] args) {
        desenhista paint = new desenhista();
        paint.desenhar(new fabrica_retangulo());
    }
}
