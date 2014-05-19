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
public class dubla<T> {

    Nod first;
    Nod last ;

    public dubla() {
        this.first = null;
        this.last =null;
    }

    public dubla(Nod<T> nod) {
        this.first = nod;
        this.last = nod;
    }

    public Nod<T> addLast_d(Nod<T> nod) {
        Nod<T> aux = this.first;
        if (aux == null) {
            first = nod;
            last = nod;
            return nod;
        }
        while (aux.next != null) {
            aux = aux.next;
        }
        aux.next = nod;
        nod.prev=aux;
        last=nod;
        return nod;
    }
    
    public Nod<T> addFirst_d(Nod<T> nod) {
        if (first == null) {
            first = nod;
            last = nod;
            return nod;
        }
        nod.prev=null;
        nod.next = first;
        first.prev=nod;
        first = nod;
        return nod;
    }
    
    public Nod<T> addAfter_d(Nod<T> nod,Nod<T> x){
         Nod<T> aux = this.first;
         if(last.info==x.info) {addLast_d(nod); return null; }
         if(aux.info!=x.info) aux=aux.next;
         nod.next=aux.next;
         nod.prev=aux;
         aux.next.prev=nod;
         aux.next=nod;
        return nod;
    }
    
    public void deleteFirst_d() {
        if (first == null) {
            return;}
        if(first.next==null) {first =null; return ;}
        first = first.next;
        first.prev=null;
    }
    
    public void deleteLast_d(){ 
        if(last==null) { return ; }
        Nod<T> aux=this.last;
        aux=last.prev;
        last.prev=null;
        last=aux;
    }

     public Integer verificare_d(Nod<T> nod){
     Nod<T> aux=this.first;
     while(aux.next !=null)
     {    if(nod.info!=aux.info) aux=aux.next;
         else return 1;
    } 
     if(nod.info==aux.info) return 1;
           return 0;
    }
    public Nod<T> deleteI_d(Nod<T> nod){
        Nod<T> aux=this.first;
        if(nod.info==last.prev.info)
        {last.prev.prev.next=last;
            last.prev=last.prev.prev; return null;}
            else {
         if(nod.info==first.next.info)
         {first.next=first.next.next; 
         first.next.next.prev=first; return null;}
        else {
        while(aux.next.info!=nod.info) {aux=aux.next;}
        aux.next=nod.next;
        aux.next.next.prev=aux;
        return nod; }
    }}
    
     public Nod<T> deleteIn_d(Nod<T> nod) {
        Nod<T> aux = this.first;
        if (first == null) {
            System.out.print("\nNu aveti noduri in lista ! \n");return null;}
        if (nod.info == first.info) {
            deleteFirst_d();
            System.out.print("\nNodul ales era primul nod in lista,acesta fost sters!\n");return nod;  }
     if(last.info == nod.info) {    
         deleteLast_d();
         System.out.print("\nNodul ales era ultimul nod in lista,acesta a fost sters ! \n"); 
         return nod; }
        
        if(verificare_d(nod)==0) {System.out.print("\nNu aveti acest nod in lista ! \n"); return null;}
                deleteI_d(nod);
                System.out.print("\nA fost sters nodul " + nod.info + "\n");
                return nod;
    }
    
    public void printList_d() {
        if (first==null) System.out.print("\nNu exista niciun nod in lista! \n");
        else
        {Nod<T> aux = this.first;
        System.out.print("\nParcurgerea de la inceputul listei la sfarsit este : \n < ");
        while (aux.next != null) {
            System.out.print(aux.info.toString() + " ");
            aux = aux.next;
        }
        System.out.print(aux.info.toString() + " ");
        System.out.print(">\n");}
    }
    
    public void printList_di(){
           if (first==null) System.out.print("\nNu exista niciun nod in lista! \n");
        else
           {Nod<T> aux  =this.last;
       System.out.print("\nParcurgerea de sfarsitul listei la inceput este :\n <");
        while(aux.prev!=null) {
            System.out.print(aux.info.toString()+ " ");
            aux=aux.prev;
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
