
public interface Tree <T extends Comparable<T>>{
	public Node<T> getRigth();
	public Node<T> getLeft();
	public T getValue();
}
