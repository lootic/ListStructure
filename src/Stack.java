public class Stack<Type> extends AbstractSet<Type>{
	
	void push(Type value){
		++size;
		root = new Node<Type>(value, root);
	}
	
	Type pop() throws Exception{
		return super.getFirst();
	}
}