
public class Node <T extends Comparable<T>> implements Tree<T>{
	private Node<T> rigth;
	private Node <T>left;
	private T value;
	
	
	public Node(T root) {
		value = root;
		rigth = null;
		left= null; 
	}

	@Override
	public Node<T> getRigth() {
		return rigth;
	}
	
	public void setRigth(Node<T> rigth) {
		this.rigth = rigth;
	}
	@Override
	public Node<T> getLeft() {
		return left;
	}
	
	public void setLeft(Node<T> left) {
		this.left = left;
	}
	@Override
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}

	 public int compareTo(Node <T> nodeToCompare) {
	        int parameter =0;
	        if (value.compareTo(nodeToCompare.getValue())>0) {
	        	parameter = 1; //value is bigger
	        	}else if(value.compareTo(nodeToCompare.getValue())<0) {
	        		parameter = 2; //value of node is bigger
	        	}else if(value.compareTo(nodeToCompare.getValue())==0) {
	        		parameter = 3; //value & node value are equals
	        	}
	       return parameter;
	    }

	
}
