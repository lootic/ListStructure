public class Node<Type> {
	
	public Type value;
	public Node<Type> next;
	
	public Node(Type value, Node<Type> next){
		this.value = value;
		this.next = next;
	}
}