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
    public static void display(Node head){
        Node temp=head.next;

        while (temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);




    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node head=new Node();
        LinkedList linkedList=new LinkedList();


        linkedList.append(head,56);
        linkedList.append(head,30);
        linkedList.append(head,70);


        linkedList.display(head);


    }

}
