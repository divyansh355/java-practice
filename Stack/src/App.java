import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Stack = LIFO data structure. Last-In First-Out
         *         stores objects into a sort of "vertical tower" 
         *         push() to add to the top
         *         pop() to remove from the top
         */

        Stack <String> stack = new Stack<String>();

        // System.out.println(stack.isEmpty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop(); // ERROR this line gives : Bcz Stack is full empty.
        // System.out.println(stack);

        // String myFavGame = stack.pop(); /*By this method you can get the topmost value of the stack, but this is not a good way to get the top value. Bcz this method removes the value from the stack */ 
        // System.out.println(myFavGame);
        // System.out.println(stack);

        // System.out.println(stack.peek()); /*By using this method you can get the TOPMOST value of the stack. Without removing the value of the stack. */
        // System.out.println(stack);

        // System.out.println(stack.search("FFVII")); /*This returns the index value from the stack's Top*/
        // System.out.println(stack.search("GTAVI")); /*This line gonna return an ERROR bcz, this element does not exist in the Stack. [ -1 ] */

        // for (int i = 0; i < 1000000000; i++) {
        //     stack.push("Fallout76"); // This will give an ERROR for the OutOfMemory : Java heap space
        // }

        /*
         * uses of stacks?
         * 1. undo/redo features in text editors
         * 2. moving back/forward through browser history
         * 3. backtracking algorithms (maze, file directories)
         * 4. calling functions (call stack)
         */
    }
}
