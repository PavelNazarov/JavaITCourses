package proc.dyn.p2_single_lib;

import proc.dyn.Node;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 23.01.13
 * Time: 23:44
 * To change this template use File | Settings | File Templates.
 */
public class SingleLLUtils_2 {
   public static Node add(Node tail, int elem) {

   }

   /* public static Node remove(Node tail) {...}*/

    public static Node add(Node tail, int index, int elem) {
        if(tail != null)
        {
            if(index < 0)
            {
                throw new IndexOutOfBoundsException("Can't add element at index < 0");
            }
            if(index == 0)
            {
                return new Node(elem, tail);
            }
            Node baseNode = tail;
            Node node = tail;
            while(index > 1)
            {
                if(node.next == null)
                {
                    throw new IndexOutOfBoundsException("Can't add element at index > list length");
                }
                node = node.next;
                index--;
            }
            node.next = new Node(elem, (node == null)? null : node.next);
            return baseNode;
        }
        return new Node(elem, null);
    }

    /*public static Node remove(Node tail, int index) {...}*/
}
