package LinkedList;

public class Linked_List {
    class Node {
        int data;
        Node next;
    }

    Node head = null;
    int size;
    Node tail;

    public void addFirst(int val) {
        Node nn = new Node();
        nn.data = val;
        if(size==0){
            head = nn;
            tail=nn;
        }else{
            nn.next = head;
            head=nn;
        }
        size++;
    }

    public void addLast(int val){
        Node nn=new Node();
        if(size==0){
            head=nn;
            tail=nn;
        }
        else{
            nn.data=val;
            tail.next=nn;
            tail=nn;
        }
        size++;
    }

    public void AddAtKthPosition(int val,int k){
        if(k==0)
            addFirst(val);
        else if(k==size)
            addLast(val);
        else{
            Node temp=getNode(k-1);
            Node temp2=temp.next;
            Node nn= new Node();
            nn.data=val;
            temp.next=nn;
            nn.next=temp2;
            size++;
//            System.out.println(temp.data);

        }
    }

    public Node getNode(int k){
        Node temp=head;
        for(int i=1;i<=k;i++)
            temp=temp.next;
        return temp;
    }

    public int getFirst(){
        return head.data;
    }
    public int getLast(){
        return tail.data;
    }

    public int getKth(int k){
        Node temp=getNode(k);
        return temp.data;
    }

    public void deleteFirst(){
        if(size==1){
            head=null;
            tail=null;
        }else{
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        size--;
    }

    public void deleteLast(){
        Node last= getNode(size-2);
        last.next=null;
        tail=last;
        size--;
    }

    public void deleteKth(int k){
        Node temp=getNode(k-1);
        Node temp2=temp.next;
        temp.next=temp2.next;
        size--;
    }

    public void reverse(){
        Node prev =null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void reverseR(int size,int x){
        if(x==size/2) return;

        Node temp=getNode(x);
        Node temp1=getNode(size-1-x);
        swap(temp,temp1);
        reverseR(size,x+1);
    }

    public void swap(Node temp1,Node temp2){
        int temp= temp1.data;
        temp1.data=temp2.data;
        temp2.data=temp;
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addLast(50);
        ll.addLast(60);
        ll.Display();
        ll.AddAtKthPosition(80,3);
        ll.Display();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.getKth(3));
        ll.deleteFirst();
        ll.deleteLast();
        ll.Display();
        System.out.println(ll.size());
        ll.deleteKth(2);
        ll.Display();
        int size=ll.size();
        ll.reverseR(size,0);
        ll.Display();
        ll.reverse();
        ll.Display();
    }

}