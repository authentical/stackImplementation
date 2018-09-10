import java.util.ArrayList;
import java.util.List;


// Stack: May not contain primitives
class Stack<T>{

    List<T> list = new ArrayList<>();   // Contains the stack
    int top = -1;   // Stack pointer
                    // 0 is a valid index so initialize top with -1

    // Add element to stack
    public void push(T element){
        top++;      // Increment stack pointer
        list.add(top, element);
        System.out.println("Pushed " + element + " onto stack.");
    }

    // If element at top of stack exists, get it and remove it
    T pop(){

        // If top = -1, return null
        if(top == -1) {
            System.out.println("Can't pop. Stack is empty");
            return null;

        } else  // Get element at top of stack, Remove it, then decrement stack pointer
            {
            T poppedElement = list.remove(top--);
            System.out.println("Popping " + poppedElement + " off of stack.");
            return poppedElement;
        }
    }

    // Get element at top of stack
    T peek(){
        return list.get(top);
    }

    // Print entire stack
    void print(){
        System.out.println(list);
    }

}
