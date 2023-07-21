package collectionframework.listinterfaceclasses;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(4);
        System.out.println(st);
        Object v=st.pop();
        System.out.println("Popped element: "+v);// removes and returns 4
        System.out.println("removes the last element added: "+st.pop());// remove and returns 6
        System.out.println(st);
        System.out.println("returns the top element: "+st.peek());// returns the top level element 6
        System.out.println(st);
        System.out.println("first element of the stack: "+st.firstElement());
        System.out.println("last element: "+st.lastElement());
        System.out.println("is stack empty? "+st.empty());
        System.out.println("Returns position of element 3 counting top to bottom: "+st.search(3));
        System.out.println("element in index 4: "+st.get(4));
    }
}
