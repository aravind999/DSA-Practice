package Queue;
import java.util.*;
import java.util.Collections;
//Queue is class in java that Extends collections framework  or interface and priorityQueue class  implements QUEUE interface
public class QueuePractice {
    public static void main(String[] args) {
        // Priority >>>> when outing the element based on the basis of the priority its called Priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        //Addition --> we can use ADD or Offer
        pq.offer(25);
        pq.add(22);
        pq.add(33);
        pq.add(88);
        pq.offer(44);
        System.out.println(pq);

        //Retrieval--> we can use peek--> it Retrieves Head but never deletes it or removes it
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.contains(55));

        //Removal --> we can use poll or remove
        //We cannot actually use for each loop in Priority queue because it denies the highest priority principle and follows iterating all the elements in order
        //However we can use while loop
     while(!pq.isEmpty()){
         System.out.println(pq.poll());
         //Priority Queue creates an array by size 11 by default and even initial capacity is 11
         //It allows null values and duplicates too
         //it doesn't maintain any insertion order nor sorted order
         //It doesn't offer random access because only Highest  priority element is retrieved
         //It is not synchronized. It is good when we are using priority as a case scenario
         //Priority Queue starts with Head as first position and tail as last position
         //Head always points towards highest priority. lowest integer has highest priority in integers
         //In priority Queue elements are not added in sorted order however the head is always points towards the lowest integer which is always in highest priority in Queue by default
         //Highest priority element is always first out.
         //Queue follows FIFO. Internally it implements object type arrays and its default size or value is null
         //In Priority Queue you can only retrieve Head since its FIFO and also High priority is always at head
         //Contains() --> will verify if an element is present or not in the Queue
         //If remove is use when there are no elements it gives an exception . if poll is used it gives null value

     }

        System.out.println("From down here its going to be ArrayDeque");

     Deque<String> ad = new ArrayDeque<>();
        //Addition --> we can use Offer , OfferFirst , OfferLast, Add, AddLast,AddFirst
        //only add or offer it will add at last by default
     ad.add("Apple");
     ad.addFirst("Banana");
     ad.addLast("Orange");
     ad.offer("Mango");
     ad.offerFirst("Pinaplle");
     ad.offerLast("Pear");
     System.out.println(ad);
        //Retrieval--> we can use peek,peekFirst,peekLast
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

        //Remove--> we can use poll,pollFirst , pollLast , remove ,removeFirst, removeLast
        System.out.println(ad.poll());
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        System.out.println(ad);
        System.out.println(ad.size());


        //ArrayDeque also has Head and Tail. it is a Double ended queue
        //We can insert at Head nd delete and insert at tail and delete
        // Default size is 17. it also implements Arrays internally .
        //Array deque is Two way basically thats what makes it different. For that reason we tend have more methods in this
        //

        System.out.println("From down here its going to be LinkedList");

        LinkedList<String> ll = new LinkedList<>();
        //Addition --> we can use Offer , OfferFirst , OfferLast, Add, AddLast,AddFirst
        //only add or offer it will add at last by default
        ll.add("Apple");
        ll.addFirst("Banana");
        ll.addLast("Orange");
        ll.offer("Mango");
        ll.offerFirst("Pinaplle");
        ll.offerLast("Pear");
        System.out.println(ad);
        //Retrieval--> we can use peek,peekFirst,peekLast
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

        //Remove--> we can use poll,pollFirst , pollLast , remove ,removeFirst, removeLast
        System.out.println(ad.poll());
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        System.out.println(ad);
        System.out.println(ad.size());

    }


}

