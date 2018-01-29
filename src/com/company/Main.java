package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList List1= new LinkedList();
        Node firstNode=new Node(1);
        List1.headNode=firstNode;
        Node secondNode= new Node(2);
        firstNode.setNext(secondNode);
        Node thirdNode= new Node(3);
        secondNode.setNext(thirdNode);
        List1.push(4);
        List1.insertAtEnd(5);
        List1.insertAfter(6,5);
        List1.insertBefore(7,2);
       // System.out.println("the element at 3rd position is"+List1.getFromPosition(3).getData());
        List1.deleteNode(3);
    }

    }

