import java.util.Stack;

public class ResursionDemo {

    public static int fib(int n){
        if (n <= 1) // <- base case
            return 1;
        return fib(n-1) + fib(n-2);
    }

    public static int fib_iterative(int n){
        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        int result = 0;

        while (!stack.isEmpty()){
            int current = stack.pop();
            if (current <= 1){
                result += 1;
            }else{
                stack.push(current-1);
                stack.push(current-2);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.traverse_iterative2();

    }

}
