package Semester_2.LinkedList;

public class NodeImpl<T> implements Node<T> {
  
  public Node<T> first;
  public Node<T> next;
  public Node<T> last;
  public T wert = null;
  
  public NodeImpl(T wert, Node<T> next) {
    this.wert = wert;
    this.next = next;
  }
  
  public static void main(String[] args) {
    Node<String> node1 = new NodeImpl<String>("Hallo", null);
    Node<String> node2 = new NodeImpl<String>("Welt", null);
    
    node1.setNext(node2);
    
    System.out.println(node1);
    
  }
  
  
  @Override
  public T getWert() {
    return wert;
  }
  
  @Override
  public void setWert(T wert) {
    this.wert = wert;
  }
  
  @Override
  public void setNext(Node<T> next) {
    this.next = next;
  }
  
  @Override
  public Node<T> getNext() {
    return this.next;
  }
  
  @Override
  public boolean hasNext() {
    if (this.next != null) {
      return true;
    }
    return false;
  }
  
  public String toString(){
    return "NodeImpl:[WERT="+wert+ " NEXT="+next+ "]";
  }
  
  
}
