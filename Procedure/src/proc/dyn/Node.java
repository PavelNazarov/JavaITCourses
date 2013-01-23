package proc.dyn;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 23.01.13
 * Time: 22:36
 * To change this template use File | Settings | File Templates.
 */
public class Node {
    public int value;
    public Node next;

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString()
    {
        return "value = " + value + ";\n next: " + next;
    }
}
