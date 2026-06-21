package Collection.LinkedList;

public class classLL {

    private Node head;
    private Node tail;
    private int size;

    void addFirst(int value)
    {
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }
void addLast(int value)
{
    if(head==null)
    {
        addFirst(value);
        return;
    }
    Node node=new Node(value);
    tail.next=node;
    tail=node;
    tail.next=null;
    size++;

}
void addAnywhere(int value,int index)
{
    if(index==0)
    {
        addFirst(value);
        return;
    }
    if(index==size)
    {
        addLast(value);
        return;
    }
    Node temp=head;
    for (int i = 0; i < index-1; i++) {
        temp=temp.next;

    }
    Node node=new Node(value,temp.next);
    temp.next=node;
    size++;
}
int deleteFirst()
{
    if(size==0)
    {
        tail=null;
        return -1;
    }
    int val=head.value;
    head=head.next;
    size--;
    return val;
}

Node get(int index)
{
    Node temp=head;
    for (int i = 0; i < index; i++) {
        temp=temp.next;
    }
    return temp;
}
int deleteLast()
{
    if(size<=0)
    {
       return deleteFirst();
    }
    int value=tail.value;
    Node secondLast=get(size-2);
    tail=secondLast;
    tail.next=null;
    size--;
    return value;

}

int deleteAnywhere(int index)
{
    if(index==0)
    {
        return deleteFirst();
    }
 if(index==size-1)
 {
     return deleteLast();
 }
 Node prev=get(index-1);
 int value=prev.next.value;
 prev.next=prev.next.next;
 size--;
 return value;
}
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    private class Node
    {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        classLL ll=new classLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.display();
        ll.addLast(6);
        ll.addLast(7);
        ll.display();
        System.out.println("Size is :" + ll.size);
        ll.addAnywhere(24,2);
        ll.display();
        System.out.println(ll.deleteFirst());
        ll.display();
        System.out.println(ll.deleteLast());
        ll.display();
        System.out.println(ll.deleteAnywhere(2));
        ll.display();
    }
}
