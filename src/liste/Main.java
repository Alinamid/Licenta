
package liste;

/**
 *
 * @author Alina Midoschi 
 */
public class Main {
    public static void main(String[] args) {
       // Lista<Integer> L= new Lista<>();
       // L.deleteFirst();
      //  L.printList();
     //L.deleteLast();
       // L.deleteIn(new Nod<>(2));   
        
      /* L.addLast(new Nod<>(7));
        L.addLast(new Nod<>(88));
        L.addLast(new Nod<>(22));
     L.addFirst(new Nod<>(2));
     L.addLast(new Nod<>(10));
    //    L.addAfter(new Nod(3), new Nod(2));
       // L.addLast(new Nod<>(2));
       // L.addAfter(new Nod<>(111),new Nod<>(2));
        L.addFirst(new Nod<>(0));
       // L.addFirst(new Nod<>(90));
          L.printList();
  L.deleteIn(new Nod<>(88)); 
    //L.deleteLast();
       // L.deleteLast();
        L.printList();*/
         
       dubla<Integer> L= new dubla<>();
        L.addLast_d(new Nod<>(7));
        L.addLast_d(new Nod<>(8));
        L.addLast_d(new Nod<>(5));
        L.addAfter_d(new Nod<>(67),new Nod<>(5));
        L.addAfter_d(new Nod<>(55),new Nod<>(67));
      //  L.addFirst_d(new Nod<>(0));
       // L.addFirst_d(new Nod<>(90));
       // L.addLast_d(new Nod<>(113));
        L.printList_d();
          L.deleteIn_d(new Nod<>(8));
          L.deleteIn_d(new Nod<>(7));
          L.deleteIn_d(new Nod<>(5));
          L.deleteIn_d(new Nod<>(53));
           L.printList_d();
  
       // L.printList_di(); 
       
     /*   coada<Integer> L= new coada<>();
        L.add_c(new Nod<>(7));
        L.add_c(new Nod<>(2));
        L.add_c(new Nod<>(5));
        L.add_c(new Nod<>(3));
        L.print_c();
        L.delete_c();  L.delete_c();//  L.delete_c();  L.delete_c();
        L.print_c();
        L.delete_c();  L.delete_c();//  L.delete_c();  L.delete_c();
        L.print_c(); */
       /* 
        stiva <Integer> L= new stiva<>();
        L.add_s(new Nod<>(7));
        L.add_s(new Nod<>(2));
        L.add_s(new Nod<>(5));
        L.add_s(new Nod<>(3));
        L.print_s();
        L.delete_s();  L.delete_s();
        L.print_s();
        L.delete_s(); 
        L.print_s();
         L.delete_s(); 
        L.print_s();
        L.delete_s();
        */
    }
    
}
