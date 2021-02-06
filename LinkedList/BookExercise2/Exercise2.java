public class Exercise2{

	public static void main(String[] args) {
		
		SimpleList sl = new SimpleList();
		//Inserting polynomial
		sl.taleInserton(3,4);
		sl.taleInserton(4,2);
		sl.taleInserton(11,0);

		//Showing list
		System.out.println("Showing elements\n");
		sl.showList();
	}
}

class Node
{
	protected int number;
	protected int raised;
	protected Node nextNode;

	public Node(int number, int raised){
		this.number = number;
		this.raised = raised;
		nextNode = null;
	}

	public void setNumber(int number){
		this.number = number;
	}

	public void setRaised(int raised){
		this.raised = raised;
	}

	public void setNextNode(Node nextNode){
		this.nextNode = nextNode;
	}

	//Getters
	public int getNumber(){
		return number;
	}

	public int getRaised(){
		return raised;
	}

	public Node getNextNode(){
		return nextNode;
	}
}

class SimpleList
{
	protected Node first;
	protected Node last;

	public SimpleList()
	{
		first = last = null;
	}

	public void taleInserton(int data, int raised){
		Node newNode = new Node(data, raised);
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
			System.out.print( aux.getNumber() + "^" +aux.getRaised()+ " + ");
			aux = aux.getNextNode();
		}
	}
}