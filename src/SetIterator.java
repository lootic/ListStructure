import java.util.Iterator;
import java.util.NoSuchElementException;

public class SetIterator<Type> implements Iterator<Type>{
	
	private Node<Type> root;
	
	public SetIterator(Node<Type> root) {
		this.root = root;
	}

	@Override
	public boolean hasNext() {
		return root == null? false: root.next == null;
	}

	@Override
	public Type next() {
		if(root == null)
			throw new NoSuchElementException();
		return root.value;
	}

	@Override
	public void remove() {
		root = root.next;
	}
}