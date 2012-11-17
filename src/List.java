import java.util.Iterator;

public class List<Type> extends AbstractSet<Type> implements Iterable<Type>{
	
	 public void add(Type value){
			root = new Node<Type>(value, root);
			++size;
	 }
	    
	 public Type getRandomElement() throws Exception{
		 if(empty())
			 throw new Exception("empty");
		 Node<Type> node = root;
		 for(int i=0; i<size*Math.random(); ++i){
			 node = node.next;
		 }
		 return node.value;
	 }

	@Override
	public Iterator<Type> iterator() {
		return new SetIterator<Type>(root);
	}
}