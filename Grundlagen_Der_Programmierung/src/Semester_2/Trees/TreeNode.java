package Semester_2.Trees;

public interface TreeNode {
  public abstract TreeNode getLeft();
  public abstract TreeNode getRight();
  public abstract String getWert();
  public abstract void setLeft(TreeNode left);
  public abstract void setRight(TreeNode right);
  public abstract void setWert(String wert);
  public abstract String toString();
  
}
