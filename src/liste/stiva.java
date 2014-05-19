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
public class stiva<T> {

    Nod first;

    public stiva() {
        this.first = null;
    }

    public stiva(Nod<T> nod) {
        this.first = nod;
    }

    public Nod<T> add_s(Nod<T> nod) {
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
    public Integer numara(){
        int n=0;
        Nod<T> aux=this.first;
        while(aux.next.next!=null){ aux=aux.next; n++;}
        n++;
        return n;
    }
    
  public void delete_s(){
       Nod<T> aux=this.first;
        if(this.first==null)
        System.out.print("\n Nu aveti noduri in lista pentru a le putea sterge ! \n"); 
        else 
        {if(first.next==null) first=null; 
          else{
        while(aux.next.next !=null) aux=aux.next;
        aux.next=null;
    }
        }
  } 
    public void print_s() {
       if (this.first==null) System.out.print("Nu exista niciun nod in stiva! \n");
       else{ Nod<T> aux = this.first;
        System.out.print("Parcurgerea stivei : \n < ");
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

