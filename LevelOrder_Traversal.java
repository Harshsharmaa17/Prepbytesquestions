/* Complete the function levelOrderTraversal given below.
For your reference
class Node
{
    long value;
    Node left, right;
    public Node(long item)
    {
        value = item;
        left = right = null;
    }
}
*/

void levelOrderTraversal(Node node) {

    //write your code here
    if(node == null) {
      return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    q.add(null);
    while(! q.isEmpty())
    {
      Node currNode = q.remove();
      if(currNode == null){
        // System.out.print();
        if(q.isEmpty()) {
          break;
        }
        else {
          q.add(null);
        }
      }
      else {
        System.out.print(currNode.value + " ");
        if(currNode.left != null) {
          q.add(currNode.left);
        }
        if(currNode.right != null) {
          q.add(currNode.right);
        }
      }
    }
}
