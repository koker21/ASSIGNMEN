
package doublylinkedlist;

    
    
import java.util.Scanner;

public class DoublyLinkedList {  
  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
    
    Node head, tail = null;  
      
    public void addNode(int data) {  
        Node newNode = new Node(data);  
        
        if(head == null) {   
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else {   
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
    }  
      
    public void display() {   
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
      
    public static void main(String[] args) {  
        Scanner myObj = new Scanner(System.in);
        DoublyLinkedList dList = new DoublyLinkedList(); 
            
        for (int j = 1; j > 0; j++){
            System.out.println("\nPress 1 to add a new node\nPress 2 to display\nPress anyother number to quit");
            int listOperation = myObj.nextInt();
                
            if (listOperation == 1) {
                System.out.println("\nHow many nodes do you want to add : ");
                int pushAmount = myObj.nextInt();
                for (int i = 0; i < pushAmount; i++) {
                    System.out.println("\nEnter the number to add in to the node : ");
                    int ele = myObj.nextInt();
                    dList.addNode(ele);
                }
            } else if (listOperation == 2) {
                dList.display();  
            } else {
                System.exit(1);
            }
        }
    }  
}  

