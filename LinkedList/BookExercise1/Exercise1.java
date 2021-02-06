import java.util.Random;

public class Exercise1{


	public static void main(String[] args) {

		SimpleList sl = new SimpleList();
		Random num = new Random();
		int counter = 0;

		while(counter < 5){

			int geNum = num.nextInt(50);

			sl.taleInserton(geNum);
			counter++;
		}

		// sl.taleInserton(4);
		// sl.taleInserton(3);
		// sl.taleInserton(2);
		// sl.taleInserton(1);

		System.out.println("Showing elements\n");
		sl.showList();

		System.out.println("Showing elements after deleting\n");
		sl.DeleteNode(25);
		
		sl.showList();
	}
}

class Node{
		protected int data;
		protected Node nextNode;

		public Node(int data){
			this.data = data;
			nextNode = null;
		}

		public void setData(int data){
			this.data = data;
		}

		public void setNextNode(Node nextNode){
			this.nextNode = nextNode;
		}

		public int getData(){
			return data;
		}

		public Node getNextNode(){
			return nextNode;
		}
	}

class SimpleList{
	protected Node first;
	protected Node last;

	public SimpleList()
	{
		first = last = null;
	}

	public void headInsertion(int data){
			Node newNode = new Node(data);

			if(first == null){
				first = last = newNode;
			}
			else{
				newNode.setNextNode(first);
				first = newNode;
			}
	}

	public void taleInserton(int data){
		Node newNode = new Node(data);

		if(first == null){
			first = last = newNode;
		}
		else{
			last.setNextNode(newNode);
			last = newNode;
		}
	}

	public void showList(){
		Node aux = first;

		while(aux != null){
			System.out.println("Elements = "+aux.getData());
			aux = aux.getNextNode();
		}
	}

	//Delete all nodes that pass a given value
	public void DeleteNode(int value){
		Node actualNode = first;
		Node prev = actualNode;
		Node aux = null;

		if(actualNode != null)
		{
			while(actualNode != null)
			{
				if(actualNode.getData() > value ){
					
					if(actualNode == first){ //Verifing if the first node is greater
						first = actualNode.getNextNode();
						aux = actualNode;
						aux=null;
					}
					prev.setNextNode(actualNode.getNextNode());
					aux = null;
				}
				prev = actualNode;
				aux = actualNode; 
				actualNode = actualNode.getNextNode();						
			}
		}
		else{
			System.out.println("List is empthy");
		}
	}

}