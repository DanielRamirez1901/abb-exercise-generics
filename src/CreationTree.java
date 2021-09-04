
public class CreationTree<T extends Comparable<T>>{

	Node <T> root;
	public void createTree(T object) {
		Node <T> nodeToAdd = new Node<>(object);
		if (root==null) {
			root = nodeToAdd;
		}else {
			createTree(root,nodeToAdd);
		}
	}

	private void createTree(Node<T> actual, Node<T> nodeToAdd) {
		if(actual.compareTo(nodeToAdd)==2) {
			if(actual.getRigth()==null) {
				actual.setRigth(nodeToAdd);
			}else {
				createTree(actual.getRigth(),nodeToAdd);
			}
		}
		if(actual.compareTo(nodeToAdd)==1) {
			if(actual.getLeft()==null) {
				actual.setRigth(nodeToAdd);
			}else {
				createTree(actual.getLeft(),nodeToAdd);
			}
		}
	}


	public Node<T> searchNode(T objectToSearch) {
		Node<T> youFoundTheObject = null;
		if(objectToSearch==root.getValue()) {
			return root;
		}else {
			youFoundTheObject = searchNode(root,objectToSearch);
		}
		return youFoundTheObject;
	}


	private Node<T> searchNode(Node<T> actual, T objectToSearch) {
		Node<T> youFoundTheObject = null;
		if(objectToSearch.compareTo(actual.getValue())==1) {
			if(actual.getRigth()!=null) {
				if(objectToSearch.compareTo(actual.getRigth().getValue())==3) {
					return youFoundTheObject = actual.getRigth();
				}else {
					searchNode(actual.getRigth(), objectToSearch);
				}
			}
		}if(objectToSearch.compareTo(actual.getValue())==2) {
			if(actual.getLeft()!=null) {
				if(objectToSearch.compareTo(actual.getLeft().getValue())==3) {
					return youFoundTheObject = actual.getLeft();
				}else {
					searchNode(actual.getLeft(),objectToSearch);
				}
			}
		}
		return youFoundTheObject;
	}
	
	public void delete(Node<T> nodeToDelete) {
		nodeToDelete = null;
	}
	
	public void deleteNode(T object) {
		Node <T> nodeToDelete = searchNode(object);
		if(nodeToDelete != null) {
			if(nodeToDelete.getRigth()==null && nodeToDelete.getLeft()==null) {
				delete(searchNode(object));
			}
		}
	}
}
