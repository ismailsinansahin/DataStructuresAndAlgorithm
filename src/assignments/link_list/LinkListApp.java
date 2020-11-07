package assignments.link_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkListApp {

    public static void main(String[] args) {

        MyLinkList linklist = new MyLinkList();

        linklist.addLast(1);
        linklist.addLast(2);
        linklist.addLast(3);
        linklist.addLast(4);
        linklist.addLast(3);
        linklist.addLast(2);
        linklist.addLast(1);
        linklist.printLinkList();
        boolean a = linklist.isPalindrome(linklist);
        System.out.println(a);

//        linklist.addLast(3);
//
//        linklist.printLinkList();
//
//        linklist.removeLast();
//
//        linklist.printLinkList();
//
//        System.out.println("linklist.isEmpty() = " + linklist.isEmpty());
//
//        System.out.println("linklist.size = " + linklist.size);

    }

}
