package Collection.LinkedList;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    void addFirst(int value)
    {
        Node node=new Node(value);
        node.next=head;
        if(head!=null)
        {
            head.prev=node;
        }
        head=node;
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }

    void addLast(int value)
    {
        if(tail==null)
        {
            addFirst(value);
            return;
        }

        Node node=new Node(value);
        node.prev=tail;
        node.next=null;
        tail.next=node;
        tail=node;
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
        Node nextNode=temp.next;
        Node node=new Node(value);
        temp.next=node;
        node.prev=temp;
        node.next=nextNode;
        nextNode.prev=node;
        size++;

    }

    int deleteFirst()
    {
        if(size==0)
        {
            tail=null;
            return -1;
        }
        int val= head.value;
        head=head.next;
        size--;
        return val;
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
    Node get(int index)
    {
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
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
        Node prevNode = get(index - 1);
        int value = prevNode.next.value;
        prevNode.next = prevNode.next.next;
        size--;
        return value;

    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value + " <-> ");
            temp=temp.next;
        }
        System.out.println("End");
    }
    private class Node
    {

        private int value;
        private Node prev;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        DLL dll=new DLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.display();
        System.out.println("Size is: " + dll.size);
        dll.addLast(4);
        dll.display();
        dll.addAnywhere(20,3);
        dll.display();
        System.out.println(dll.deleteFirst());
        dll.display();
        System.out.println(dll.deleteLast());
        dll.display();
        System.out.println(dll.deleteAnywhere(2));
        dll.display();
    }
}
