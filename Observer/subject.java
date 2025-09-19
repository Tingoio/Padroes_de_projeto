package Observer;

import java.util.ArrayList;
import java.util.List;

public class subject {

    private int state;
    List<AbsObserver> observers = new ArrayList<AbsObserver>();

    private void notificarObservadores(){
        for (AbsObserver o : this.observers){
            o.update();
        }
    }

    public void setState(int state){
        this.state = state;
        this.notificarObservadores();
    }

    public void attach(AbsObserver o){
        this.observers.add(o);
    }

    public void detach(AbsObserver o){
        this.observers.remove(o);    }
}
