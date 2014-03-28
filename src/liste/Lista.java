package liste;

/**
 *
 * @author Alina Midoschi
 */
public class Lista<T> {

    Nod first;

    public Lista() {
        this.first = null;
    }

    public Lista(Nod<T> nod) {
        this.first = nod;
    }

    public Nod<T> addLast(Nod<T> nod) {
        Nod<T> aux = this.first;

        if (aux == null) {
            first = nod;
            return nod;
        }

        while (aux.next != null) {
            aux = aux.next;
        }

        aux.next = nod;

        return nod;
    }
    
    public Nod<T> addFirst(Nod<T> nod) {

        if (first == null) {
            first = nod;
            return nod;
        }
        
        nod.next = first;
        first = nod;

        return nod;
    }
    
    public void deleteFirst() {

        if (first == null) {
            return;
        }
       
        first = first.next;
       
    }

    public void printList() {
        Nod<T> aux = this.first;
        System.out.print("< ");
        while (aux.next != null) {
            System.out.print(aux.info.toString() + " ");
            aux = aux.next;
        }
        System.out.print(">\n");
    }
    
    public String getListAsString() {
        Nod<T> aux = this.first;
        String s = "< ";
        
        while (aux.next != null) {
            s += aux.info.toString() + " ";
            aux = aux.next;
        }
        s += ">";
        return s;
    }
}
