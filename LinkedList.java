import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(){
        next=null;
    }
    Node(int value){
        data=value;
        next=null;
    }
}
public class LinkedList {

    public static void insert(Node head,int value){
       Node newnode=new Node(value);
       Node temp=head;
       while (temp.next!=null){
           temp=temp.next;
       }
       temp.next=newnode;

    }

    public static  void append(Node head,int value){
        Node newnode=new Node(value);

        if(head==null){
            head=newnode;
            return;
        }

        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=newnode;



    }
    public static void insert_between(Node head,int value){
        Node temp=head;
        Node newnode=new Node(value);

        while (temp.next.data==56 && temp.next.next.data==70){

            temp= temp.next;

        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public static void pop_first(Node head){

        Node temp=head;
        if(temp.next.next!=null) {
            head.next = temp.next.next;
        }

    }

    public static void pop_last(Node head){
        Node temp=head;

       while (temp.next.next!=null){
           temp=temp.next;
       }

       temp.next=null;
    }

    public static Node search(Node head,int value){

        Node temp=head.next;

        while (temp!=null){
            if(temp.data==value){

                return temp;

            }
            temp=temp.next;
        }

        return null;




    }
    public static void insert_after(Node val,int value){
        Node temp=val;
        Node newnode=new Node(value);

        newnode.next=temp.next;
        temp.next=newnode;



    }
    public static void delete_val(Node head,int value){
        Node temp=head;

        while (temp.next.data!=value){
            temp=temp.next;
        }

        temp.next=temp.next.next;



    }
    public static void size(Node head){
        Node temp=head.next;

        int count=0;

        while (temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("the size of Linked_list is "+count);

    }
    public static void sortedLinkedList(Node head,int value){

        Node temp=head;
        Node newnode=new Node(value);
        if(head.next==null){
            head.next=newnode;
            return;
        }


        while (temp.next!=null && temp.next.data<value){

            temp= temp.next;

        }
        newnode.next=temp.next;
        temp.next=newnode;


    }
    public static void display(Node head){
        Node temp=head.next;

        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }





    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node head=new Node();
        LinkedList linkedList=new LinkedList();

        linkedList.sortedLinkedList(head,56);
        linkedList.sortedLinkedList(head,30);
        linkedList.sortedLinkedList(head,40);
        linkedList.sortedLinkedList(head,70);




        linkedList.display(head);





    }

}



