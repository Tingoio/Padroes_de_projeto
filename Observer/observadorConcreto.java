package Observer;

public class observadorConcreto extends AbsObserver {

    observadorConcreto(subject observado){
        this.observado = observado;
        this.observado.attach(this);
    }

    @Override
    public void update(){
        System.out.println("Notificação recebida em:" + this);
    }
}
