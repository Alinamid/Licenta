package liste;

/**
 *
 * @author Alina Midoschi 
 */
public class Nod<T> {
    T info;
    Nod next;
    
    public Nod(){
        this.info = null;
        this.next = null;
    }
    
    public  Nod (T info){
        this.info = info;
        this.next = null;
    }
}
