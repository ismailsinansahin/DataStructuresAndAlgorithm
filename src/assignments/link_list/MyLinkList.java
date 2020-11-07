package assignments.link_list;

import java.util.NoSuchElementException;

public class MyLinkList {

    public Node first;
    public Node last;
    public Node current;
    public Node previous;
    public int size;

    public MyLinkList() {
        this.first=null;
        this.last=null;
        this.size=0;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void addLast(int item){
        var node = new Node(item);
        System.out.println("adding an item : " + item);
        if (isEmpty()) first=last=node;
        else{
            last.next=node;
            last=node;
        }
        size++;
    }

    public void removeLast(){
        if (isEmpty()) throw new NoSuchElementException();
        System.out.println("removing an item : ");
        if (first==last) first=last=null;
        else{
            previous=first;
            current=first;
            while(current.next!=null){
                previous=current;
                current=current.next;
            }
            previous.next=null;
            last=previous;
        }
        size--;
    }

    public void printLinkList(){
        if (isEmpty()) throw new NoSuchElementException();
        current=first;
        while(current!=null){
            System.out.println("Node: " + current);
            System.out.println("Value: " + current.value);
            System.out.println("Next: " + current.next);
            current=current.next;
        }
    }

    //unknown size - one pass
    public void reverseLinkList(MyLinkList linklist){
        if (isEmpty()) throw new NoSuchElementException();
        previous = first;
        current = first.next;
        while (current != null) {
            var nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }
        last = first;
        last.next = null;
        first = previous;
    }

    public int getKthFromTheEnd(int k) {
        if (isEmpty()) throw new IllegalStateException();
        var a = first;
        var b = first;
        for (int i = 0; i < k-1 ; i++) {
            b = b.next;
            if (b == null) throw new IllegalArgumentException();
        }
        while (b != last) {
            a = a.next;
            b = b.next;
        }
        return a.value;
    }

    //find the middle (even-2/odd-1) of unknown size array in one pass
    public void findTheMiddle(MyLinkList linkList){
        int last=1;
        if (isEmpty()) throw new NoSuchElementException();
        current = previous = first;
        while (current.next!=null){
            current=current.next;
            last++;
            if (current.next!=null){
                current=current.next;
                previous=previous.next;
                last++;
            }
        }
        System.out.println(last);
        if (last%2==0) {
            System.out.println(previous.value + " " + previous.next.value);
        }else{
            System.out.println(previous.value);
        }
    }

//    solution from Fatma
//    public void printMiddle() {
//        if (isEmpty())
//            throw new IllegalStateException();
//        var a = first;
//        var b = first;
//        while (b != last && b.next != last) {
//            b = b.next.next;
//            a = a.next;
//        }
//        if (b == last)
//            System.out.println(a.value);
//        else
//            System.out.println(a.value + ", " + a.next.value);
//    }

    public boolean isPalindrome(MyLinkList linkList){
        current=first;
        for (int i=0 ; i<size/2 ; i++){
            if (first.value==last.value){
                first=first.next;
                while(current.next.next!=null){
                    current=current.next;
                }
                last=current;
                last.next=null;
                current=first;
            }else return false;
        }
        return true;
    }

}
