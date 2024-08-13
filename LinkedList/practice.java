package LinkedList;

public class practice {
    class Node{
        int data;
        Node next;
    }

    Node head=null;
    int size;
    Node tail;

    public void addFirst(int val){
        Node nn= new Node();
        nn.data=val;
        if(size==0){
            head=nn;
            tail=nn;
        }else{
            nn.next=head;
            head=nn;
        }
        size++;
    }

    public void addLast(int val){
        if(size==0)
            addFirst(val);
        else{
            Node nn= new Node();
            nn.data=val;
            tail.next=nn;
            tail=nn;
        }
        size++;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"==>");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public Node getNode(int k){
        Node temp=head;
        for(int i=0;i<k;i++)
            temp=temp.next;
        return temp;
    }

    public void AddAtKthPosition(int val,int k){
        if(k==0)
            addFirst(val);
        else if (k==size)
            addLast(val);
        else{
            Node temp=getNode(k-1);
            Node temp2=temp.next;
            Node nn= new Node();
            nn.data=val;
            temp.next=nn;
            nn.next=temp2;
        }
        size++;
    }

    public void deleteFirst(){
        if(size==1){
            head=null;
            tail=null;
        }
        else{
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
        size--;
    }

    public void deleteLast(){
        if(size==1){
            head=null;
            tail=null;
        }else{
            Node sec_last=getNode(size-2);
            sec_last.next=null;
            tail=sec_last;
        }
        size--;
    }

    public void deleteKth(int k){
        Node temp=getNode(k-1);
        Node temp2=getNode(k+1);
        temp.next=temp2;
    }

    public void reverse(){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        practice ll= new practice();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.display();
        ll.addLast(0);
        ll.display();
        ll.AddAtKthPosition(40,2);
        ll.display();
        ll.deleteFirst();
        ll.display();
        ll.deleteLast();
        ll.display();
        ll.deleteKth(1);
        ll.display();
        ll.reverse();
        ll.display();
    }
}
