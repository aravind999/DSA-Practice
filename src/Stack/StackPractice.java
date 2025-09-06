
/* Just for the imagination stack is anti clockwise turned vector
LIFO-Last in First out -Stack
Stack is class in java which implements list interface and extends the vector class and also represents the LIFO principle
Stack should always be created with no size or with list of elements
in stack we usually dont use add , remove , or update functions in order to respect LIFO principle
Stack provides special methods like
PUSH--> adding an element,
POP--> delete an last  element
PEEK--> Just to see last element since its LIFO,
SEARCH-->search operations does in top to bottom
 */

package Stack;
import  java.util.Stack;
public class StackPractice { public static void main(String[] args){

Stack<String> books = new Stack<>();
books.push("Red");// push and add are exactly same
books.push("Black");
books.push("white");
      // System.out.println(books.pop());// will take out the last element from the stack and will return in the result as well
        System.out.println(books);
    System.out.println(books.peek());//peek will basically deletes or takes away the element from the stack since its lifo it will take the last element
    System.out.println(books.search("white"));// it basically counts from 1 instead of index so its basically totally different and also while counting it counts top to bottum as per lifo principle
    System.out.println(books.indexOf("Red"));
    System.out.println(books.empty());
    System.out.println(books.isEmpty());
}
    }