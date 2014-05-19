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
    
    public Nod<T> addAfter(Nod<T> nod,Nod<T> x){
         Nod<T> aux = this.first;
         if(aux.info!=x.info) aux=aux.next;
         nod.next=aux.next;
         aux.next=nod;
        return nod;
    }
    
    public void deleteFirst() {
        if (first == null) {
            return;
        }
        if(first.next==null) {first=null;return;}
        first = first.next;
    }
    
    public void deleteLast(){ 
        if(first==null) { System.out.print("\nNu aveti noduri in lista ! \n"); return ; }
        Nod<T> aux=this.first;
        while(aux.next.next !=null) {aux=aux.next; }
        aux.next=null;
       }

    /**
     *
     * @param nod
     * @return
     */
    public Integer verificare(Nod<T> nod){
     Nod<T> aux=this.first;
     while(aux.next !=null)
     {    if(nod.info!=aux.info) aux=aux.next;
         else return 1;
    } 
     if(nod.info==aux.info) return 1;
           return 0;
    }
    public Nod<T> ultim(){
         Nod<T> aux=this.first;
     while(aux.next !=null)
          aux=aux.next;
         return aux;
    }
    
    public Nod<T> deleteI(Nod<T> nod){
           Nod<T> aux=this.first;
           while(aux.next.info!=nod.info) 
        {aux=aux.next;}
        aux.next=aux.next.next; 
            return nod;
    }  
   
    public Nod<T> deleteIn(Nod<T> nod) {
        Nod<T> aux = this.first;
        Nod<T> ul=ultim();
        if (first == null) {
            System.out.print("\nNu aveti noduri in lista ! \n");return null;}
     if(ul.info == nod.info) {    
         deleteLast();
         System.out.print("\nNodul ales era ultimul nod in lista,acesta a fost sters ! \n"); 
         return nod; }
        if (nod.info == first.info) {
            deleteFirst();
            System.out.print("\nNodul ales era primul nod in lista,acesta fost sters");return nod;  }
        if(verificare(nod)==0) {System.out.print("\nNu aveti acest nod in lista ! \n"); return nod;}
                else {deleteI(nod);
                    System.out.print("\nA fost sters nodul " + nod.info + "\n");
                    return nod;}
    }


    public void printList() {
         if(first==null) { System.out.print("\nNu aveti noduri in lista de afisat ! \n"); return ; }
        Nod<T> aux = this.first;
        System.out.print("\nLista este : \n< ");
        while (aux.next != null) {
            System.out.print(aux.info.toString() + " ");
            aux = aux.next;
        }
        System.out.print(aux.info.toString() + " ");
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
