package Semester_2.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNodeImpl implements TreeNode{
  
  public TreeNode left;
  public TreeNode right;
  public String wert;
  
  
  public TreeNodeImpl(TreeNode left, String wert, TreeNode right){
  this.left = left;
  this.wert = wert;
  this.right = right;
  }
  
  public static void main(String[] args) {
    TreeNode a = new TreeNodeImpl(null, "A", null);
    TreeNode b = new TreeNodeImpl(null, "B", null);
    TreeNode c = new TreeNodeImpl(null, "C", null);
    TreeNode d = new TreeNodeImpl(null, "D", null);
    TreeNode e = new TreeNodeImpl(null, "E", null);
    TreeNode f = new TreeNodeImpl(null, "F", null);
    TreeNode g = new TreeNodeImpl(null, "G", null);
    
    a.setLeft(b);
    b.setLeft(d);
    b.setRight(e);
    a.setRight(c);
    c.setLeft(f);
    c.setRight(g);
    
    TreeNodeImpl tree = (TreeNodeImpl) a;
    System.out.println("Inorder: " + tree.printInorder(a));
    System.out.println("Preorder: " + tree.printPreorder(a));
    System.out.println("Postorder: " + tree.printPostorder(a));
    System.out.println("Levelorder: " + tree.printLevelorder(a));
  }
  
  @Override
  public TreeNode getLeft() {
    return left;
  }
  
  @Override
  public TreeNode getRight() {
    return right;
  }
  
  @Override
  public String getWert() {
    return wert;
  }
  
  @Override
  public void setLeft(TreeNode left) {
    this.left = left;
  }
  
  @Override
  public void setRight(TreeNode right) {
    this.right = right;
  }
  
  @Override
  public void setWert(String wert) {
    this.wert = wert;
  }
  
  @Override
  public String toString() {
    return "TreeNodeImpl{" +
            "left=" + left +
            ", wert='" + wert +
            ", right=" + right +
            '}';
  }
  
  public String printInorder(TreeNode start){
    if (start == null) return "";
    return printInorder(start.getLeft()) + start.getWert() + " " + printInorder(start.getRight());
  }
  
  public String printPreorder(TreeNode start){
    if (start == null) return "";
    return start.getWert() + " " + printPreorder(start.getLeft()) + printPreorder(start.getRight());
  }
  
  public String printPostorder(TreeNode start){
    if (start == null) return "";
    return printPostorder(start.getLeft()) + printPostorder(start.getRight()) + start.getWert() + " ";
  }
  
  public String printLevelorder(TreeNode start){
    if (start == null) return "";
    StringBuilder result = new StringBuilder();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(start);
    while (!queue.isEmpty()) {
      TreeNode current = queue.poll();
      result.append(current.getWert()).append(" ");
      if (current.getLeft() != null) queue.add(current.getLeft());
      if (current.getRight() != null) queue.add(current.getRight());
    }
    return result.toString();
  }
  
}
