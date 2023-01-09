/* Complete the function calculateHeight given below
For your reference:

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

int calculateHeight(Node node) {
    //write your code here
    if(node == null){
      return 0;
    }
    int leftHeight = calculateHeight(node.left);
    int rightHeight = calculateHeight(node.right);
    
    int myHeight = Math.max(leftHeight, rightHeight) + 1;
    return myHeight;
}
