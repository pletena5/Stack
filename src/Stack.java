public class Stack extends List{

    public Stack(){
        super();
    }// constructor

    public void push(int i){
        ListNode newHead = new ListNode(i);
        newHead.setNext(head);
        head = newHead;
    }// push

    public int pop (){
        ListNode temp = head;
        head = head.getNext();
        return temp.getValue();
    }// pop method

    public int peek (){
        return head.getValue();
    }// peek method

}// class stack