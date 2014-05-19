/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package liste;

/**
 *
 * @author HP
 */
public class coada<T> {

    Nod first;

    public coada() {
        this.first = null;
    }

    public coada(Nod<T> nod) {
        this.first = nod;
    }

    public Nod<T> add_c(Nod<T> nod) {
        Nod<T> aux = this.first;
        if (aux == null) {
            first = nod;
            return nod;
        }
        while (aux.next != null) {
            aux = aux.next;
        }
        aux.next = nod;
        nod.prev=aux;
        return nod;
    }
    
    public void delete_c() {    
        if (this.first == null) {System.out.print("\nNu aveti ce elemente sa stergeti !\n");
            return;   } 
        first = first.next;
    }
    
    public void print_c() {
        if (first==null) System.out.print("Nu aveti elemente in coada pentru a le putea sterge ! \n");
        else {Nod<T> aux = this.first;
        System.out.print("Parcurgerea cozii : \n < ");
        while (aux.next != null) {
            System.out.print(aux.info.toString() + " ");
            aux = aux.next;
        }
        System.out.print(aux.info.toString() + " ");
        System.out.print(">\n");}
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

