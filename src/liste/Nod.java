package liste;

/**
 *
 * @author Alina Midoschi 
 */
public class Nod<T> {
    T info;
    Nod next,prev,left,right;
    
    public Nod(){
        this.info = null;
        this.next = null;
        this.prev=null;
        this.right=null;
    }
    
    public  Nod (T info){
        this.info = info;
        this.next = null;
        this.prev=null;
        this.right=null;
    }
}
