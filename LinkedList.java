
 class Node {
int data;
Node next;
Node(int data,Node next)
{
	this.data=data;
	this.next=next;
	
}
}
class LinkedList
{
	Node head;
	public void insert(int data) {
		Node node=new Node(data,null);
		//node.next=null;
		
		if(head==null)
		{
		head=node;
		
		}
		else
		{
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	public void display()
	{
		Node node=head;
		while(node.next!=null)
		{
			System.out.println("element"+node.data);
			node=node.next;
		}
		System.out.println("element"+node.data);
	}
	public void delete(int position)
	{
		Node n=head;
		int i=1;
		while(i<position-1)
		{
			
			n=n.next;
			i++;
		}
		n.next=n.next.next;
	}
	public void insertAt(int pos,int key)
	{
		Node node=new Node(key,null);
		Node n=head;
		int i=1;
		if(head!=null) {
		while(i<pos-1)
		{
			
			n=n.next;
			i++;
		}
		node.next=n.next;
		n.next=node;
		
		}
		else insert(key);
	}
}
class Running
{
	public static void main(String args[]) {
		LinkedList list=new LinkedList();
		list.insertAt(0, 415);
		for(int i=0;i<10;i++)
		{
		list.insert(10+i);
		if(i>5)
		{
		list.delete(3);
		
		}
		
		}
		list.insertAt(3, 45);
	list.insertAt(3, 45);
		list.display();
	}
}









