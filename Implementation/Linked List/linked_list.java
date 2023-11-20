import java.util.Scanner;
class Node
{
    int data;
    Node next;

    public Node (int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Linked list
{
    node head;
    
    //insert at begininning
    public void insertAtBeginning(int data)
    {
        //making an object of node class
        Node newNode = new Node(data);
        //declaring the initial head as newNode.next(this will make it 2 node)
        newNode.next=head;
        //declaring newNode(1 node) as head
        head=newNode;
    }
    
    //insert at end
    public void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        //checking if the node is empty or the list exist
        if (head==null)
        {
            //if not making the node at the begaining
            head=newNode;
            return;
        }
        //if the pointer that point to head allow you traverse without modifying the orginal
        Node temp = head;
        //we will run the while loop till we reach the last node
        while(temp.next!=null)
        {
            //telling it to store last element as temp rather than inital value temp.next
            temp=temp.next;
        }
        //making a new node at the end 
        temp.next=newNode;
        
        
    } 
    public void insertAtPosititon(int data,int position)
    {
        if (position<0)
        {
            System.out.println("invaild position");
        }
        else if(position==1)
        {
            Node newNode = new Node(data);
            //run the function insetAtBeginning
            insertAtBeginning(data);
            return;
        }
        else 
        {
            Node temp =head;
            for (int i=0;i<Position-1;i++)
            {
                //making the last node null
                if (temp.next==null)
                {
                    System.out.println("invaild position")
                }
                //if not null move to the next node until position is reached
                temp=temp.next;
            }
            //this set the pointer newNode to temp allowing them to link
            newNode.next = temp.next;
            //this line insert newNode into the  list
            temp.next = newNode;
        }
        
    }
    public void deleteFromBeginning()
    {
        //if the head is empty
        if(head==null)
        {
            System.out.println("the linked list is empty");

        }
        //if not it will make the 2 node the head( then 1 node akkum)
        head=head.next
    }


public void deleteFromEnd()
{
    if(head==null)
    {
        System.out.println("the linked list is empty");
    }
    //if the next node does not exist
    if(head.next==null)
    {
        //make the value of current head node
        head=null;
        return;
    }

    Node temp = head;
    while(temp.next.next !=null)
    {
        //store the 2nd last element as temp
    temp =temp.next;
    }
    //making the last element as null
    temp.next=null;
}
public void deleteFromPosition(int Position)
{
    if (position <0)
    {
        System.out.println("invaild postiton");
        return;
    }
    if(head==null)
    {
        System.out.println("empty Position");
        return;
    }
    if(position == 0)
    {
        deleteFromBeginning();
        return;
    }
    node temp = head;
    for (int i=0;i<position-1;i++)
    {
        //making the last value  null
        if(temp.next =null)
        {
            System.out.println("invaild position");
            return;
        }
        //storing temp value until you reach position
        temp = temp.next;
    }
    //to traverse until you find the value
    temp.next=temp.next.next;
}
//display the linked list
public void display()
{
    Node temp =head;
    if (head==null)
    {
        System.out.println("g")
        return;
    }
    System.out.println("g");
    while(temp !=null)
    {
         System.out.println("g")
         temp=temp.next;
    }
    System.out.println();

}

}
public class linked_list
{
    public static void main (String [] args)
    {
        linked_list list = new linked_list();
        Scanner sc = new Scanner(System.in);
        System.out.println("1- insert at beginning");
        System.out.println("2- insert at end");
        System.out.println("3- insert at position");
        System.out.println("4-  delete from beginning");
        System.out.println("5- delete from end");
        System.out.println("6- delete from position");
        System.out.println("7- display");
        System.out.println("8- exit");
        int choice=sc.nextInt();
        while(1)
        {
            switch(choice)
            {
                case 1: 
                System.out.println("enter the data");
                int data =sc.nextInt();
                insertAtBeginning(data)
                break;
                case 2: 
                System.out.println("enter the data");
                int data =sc.nextInt();
                insertAtEnd(data)
                break;
                case 3: 
                System.out.println("enter the data and position");
                int data =sc.nextInt();
                int position= sc.nextInt();
                insertAtPosition(data and position)
                break;
                case 4: deleteFromBeginning()
                break;
                case 5: deleteFromEnd()
                break;
                case 6: 
                System.out.println("enter the position");
                int position= sc.nextInt();
                deleteFromPosition(postiton);
                break;
                case 7: display()
                break;
                case 8: System.exit(0);
                default: System.out.println("invaild choice");
            }
        }
        
    }
}
    
