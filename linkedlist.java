class Node {
    int val;
    Node next;
    Node(){
        val = 0;
    }
    Node(int value){
        this.val=value;
    }
    public void middleNode (Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.val);
    }
}
public class linkedlist extends Node {
public static void main(String[] args){
        linkedlist call = new linkedlist();
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        System.out.print(a.val+ " ");
        System.out.print(b.val+ " ");
        System.out.print(c.val+ " ");
        System.out.print(d.val+ " ");
        System.out.print(e.val+ " ");
        System.out.println(f.val+ " ");
        call.middleNode(a);

}
}