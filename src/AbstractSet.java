import java.util.NoSuchElementException;

public abstract class AbstractSet<Type> {
	
	protected Node<Type> root;
	protected int size = 0;
	
	public int size(){
		return size;
	}
	
	public boolean empty() {
		return size == 0;
	}
	
	protected Type getFirst() throws Exception {
		if(empty())
			throw new NoSuchElementException();
		Type retval = root.value;
		root = root.next;
		--size;
		return retval;
	}
}