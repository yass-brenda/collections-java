package collection.stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<Integer> stack = new Stack<>();

        List<Integer>list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        integerStack.add(1);
        integerStack.add(2);
        integerStack.add(3);
        integerStack.add(4);
        integerStack.add(5);

        while (list.size() > 0){
            stack.push(list.remove(0));
        }

        while (stack.size() >0){
            list.add(stack.pop());
        }
        System.out.println(list);

        System.out.println(integerStack);
        System.out.println(integerStack.pop());
        System.out.println(integerStack);
        integerStack.add(5);
        System.out.println(integerStack);
        System.out.println(integerStack.peek());
        System.out.println(integerStack.search(1)); // regresa el indice donde esta ese numero o negativo si no lo encuentra

        Iterator<Integer>it = integerStack.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (Integer element: integerStack){
            System.out.println(element);
        }
        integerStack.stream().forEach((element) ->{
            System.out.println(element);
        });
    }
}
