
package liste;

/**
 *
 * @author Alina Midoschi 
 */
public class Main {
    public static void main(String[] args) {
        Lista<Integer> L= new Lista<>();
        L.addLast(new Nod<>(7));
        L.addLast(new Nod<>(2));
        L.addLast(new Nod<>(5));
        L.addLast(new Nod<>(3));
        L.addFirst(new Nod<>(0));
        L.printList();
        L.deleteFirst();
        L.printList();
    }
    
}
