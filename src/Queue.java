public class Queue<Type> extends AbstractSet<Type>{ 
	
	public void enqueue(Type value){
		++size;
		Node<Type> node = root;
		if(root != null) {
			while(node.next != null)
				node =  node.next;
			node.next = new Node<Type>(value, null);
		} else
			root = new Node<Type>(value, null);
	}
	
	public Type dequeue() throws Exception{
		return super.getFirst();
	}
}