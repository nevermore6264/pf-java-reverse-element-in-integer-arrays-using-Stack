import java.util.Stack;

public class Mystack {
    public static void main(String[] args) {
        Stack<Integer> listNumber = new Stack<>();
        listNumber.push(1);
        listNumber.push(2);
        listNumber.push(3);
        listNumber.push(4);
        listNumber.push(5);
        System.out.println("List number first: ");
        for (Integer e : listNumber) {
            System.out.print(e + "\t");
        }
        System.out.println("\nList number before");
        while (!listNumber.isEmpty()) {
            System.out.print(listNumber.pop() + "\t");
        }
    }
}
