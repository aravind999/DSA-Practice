package Linkedlist;
import java.util.LinkedList;
import java.util.List;

// linked list extends list interface and also deque interface as well because it implements both
public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();//we can also write as list<In >
        //List<Integer> list = new LinkedList<>(); this only implements list interface where only list methods can be accesed because type is list here not linked list but
        // the point we are trying to make here is that we can create a object of type list by using list key but keeping linked list instance on the right
        // we can also create objects using below interfaces because all of these implements list and iterable and collections at the end .
        //How ever there is a small trick here , whatever object type we use on left will be the only interface methods we can acess because of that object being created only of that certain type
        //Queue<Integer> Ll =  new LinkedList<>();
        //Deque<Integer> Ll = new LinkedList<>();

        // the previous for this element is null because there is no element before it but next will be N2 . it saves the address of the next node here
         list1.add("N1");
        // the previous of this node will be N1 and next will be null until some other element is added next to it
        list1.add("N2");
        list1.add("N3");
        System.out.println(list1);


    }
}
   /* Major Operations in LinkedLsit
     1.Creations of List
     2. Addition of elements from list
     3.Retrieval of elements from list
     4.Deletion of elements from list
     5.Verification of elements in the list
     6.Updation of elements in the list*/
/* Purpose of creating a Linkedlist  is to connect the nodes . only way we use or access a linked list is using nodes
A node has a previous,item/data and next.
A LinkedList is a combination of multiple nodes
When creating an LinkedList  it has its  node  default size is 0
first element or first node by default will be null
last node is also null
we cannot create a Linked List with a pre defined size
operations include Add(),remove(),clear()---> we can use these using index of directly.However when using remove method it clears first head element since its the head element and no index is specified before. and we also have tail elements which is the last elements of the linkedlist

 */

/* Accessing the linked list elements are pretty easy. lets say ll size is 10 , it is devided by 2 which is 5 , and lets say target is 5 , if target is less than 5 it asks you to search left from of index 5 if it more it will search on the right
5>4 --> will start from left side of 5 and starts from the beggining and increments 1 at each time  and retrieves the element
if it 6
5<6 ---> it will start searching from right , starts at 10 ,9,8,7,6 and retrieves it
 */