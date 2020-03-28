import org.graalvm.compiler.graph.NodeList;

class ListNode<T> {
   ListNode(T x) {
     value = x;
   }
   T value;
   ListNode<T> next;

   ListNode<T> addItemToTheEnd(T number){
    ListNode c = this;
    
    /*if (this == null){
        System.out.println(this == null);
        this.value = number;
        return this;
    }*/
    if (this.next == null){
        this.next = new ListNode(number);
        return this;
    }
    while(c != null){ 
        if (c.next != null){
            c = c.next;
        }else{
            c.next = new ListNode(number);
            return this;
        }
    }
    c.next = new ListNode(number);
    return c;
   }
   
   public void printNode(){
       ListNode<T> current;
       if (this == null){
            System.out.println("Empty list");
       }else if(this != null){
            System.out.print(this.value + "->");
       }
       current  = this.next;
       while (current != null){
            System.out.print(current.value + "->");
            if (current.next == null)
                break;
            else
                current = current.next;
       }

   }
 }

 class LinkedListRemoveItem{
    public static void main(String[] args) {
        ListNode<Integer> l = new ListNode<>(0);
        System.out.println(l);
        /*l.addItemToTheEnd(6);
        l.addItemToTheEnd(7);
        l.addItemToTheEnd(8);
        for (int i=4;i<10;i++){
            l.addItemToTheEnd(6);

        }*/
        System.out.println(l);

        l.printNode();
        
        l = removeKFromList(l,0);
        System.out.println();
        if (l!=null)
            l.printNode();
        
        //System.out.println(l.next.next.value);
    }

    public static ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
        if (l == null){
            return l;
        }
        while(l.value == k && l != null){
            l = l.next;
            if (l == null)
            break;
        }
        if (l == null){
            return l;
        }
        ListNode c = l;
        while(c.next != null){
            if ((int)(c.next.value) == k){
                c.next = c.next.next;

            }else{
                c=c.next;
            }
        }
        return l;
    
    }
}