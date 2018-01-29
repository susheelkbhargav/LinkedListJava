package com.company;

public class LinkedList {
    Node headNode;
//inserting a node in different ways
    public void push(int data) {
        Node node = new Node(data);
        node.setNext(headNode);
        headNode = node;
        System.out.println("The list is now");
        printList();
    }

    public void insertBefore(int data,int node){
        Node n=headNode;
        Node prev=null;
        while(n!=null){
            if(n.getData()==node){
                Node newNode=new Node(data);
                prev.setNext(newNode);
                newNode.setNext(n);
                break;
            }
            else{
                prev=n;
                n=n.getNext();
            }
        }
        if(n.getNext()==null){
            Node newNode= new Node(data);
            prev.setNext(newNode);
            newNode.setNext(null);

        }
        System.out.println("New LinkedList after insert before is:");
        printList();
    }

    public void insertAfter(int data, int node){
        Node n=headNode;

            while(n.getNext()!=null){
                if(n.getData()==node){
                    Node newNode=new Node(data);
                    newNode.setNext(headNode.getNext());
                    headNode.setNext(newNode);
                }
                else
                    n=n.getNext();
        }
        if(n.getNext()==null){
            Node newNode= new Node(data);
            newNode.setNext(null);
            n.setNext(newNode);
        }
        System.out.println("New LinkedList is:");
        printList();
    }
    public void insertAt(int data,int position){
        Node n=headNode;

            for(int i=1;i<position;i++){
              n= n.getNext();
            }
            Node newNode=new Node(data);
            newNode.setNext(n.getNext());
            n.setNext(newNode);
        System.out.println("The list is now");
        printList();


    }

    public void insertAtEnd(int data){
        Node n= headNode;
        while(n.getNext()!=null){
            n=n.getNext();
        }
        Node newNode= new Node(data);
        newNode.setNext(null);
        n.setNext(newNode);
        System.out.println("The list is now");
        printList();
    }

    //retreiving an element from the list
    public Node getFromPosition(int position){
        Node n= headNode;
        for(int i=1;i<position;i++){
            n=n.getNext();
        }
        return n;
    }
    //deleting a node
    public void deleteNode(int position){
        Node n= headNode;
        Node prev=null;
        for(int i=1;i<position;i++){
            prev=n;
            n=n.getNext();
        }
        prev.setNext(n.getNext());
        System.out.println("NEw linked List after deletion is :");
        printList();
    }
    public void printList() {
        Node n = headNode;
        while (n != null) {
            System.out.println(n.getData());
            n = n.getNext();
        }
    }


}


