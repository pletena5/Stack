public class Queue extends List{
    ListNode rear;

    public Queue(){
        super();
    }

    private ListNode front(){
        return getHead();
    }// get head

    public void enQueue(int value){

        if (rear == null){
            addFirst(value);
            rear = front();
        }else {
            ListNode n = new ListNode(value);
            rear.setNext(n);
            rear = n;
        }// if rear == null

    }// enqueue method

    public int deQueue(){
        int frontValue = remove().getValue();
        if (front() == null){
            rear = null;
        }// if front = null
        return frontValue;
    }// dequeue method

    @Override
    public void display(){
        System.out.print("Front ");
        ListNode current = front();

        while (current != null){
            System.out.print("[" + current.getValue() + "][]->");
            current = current.getNext();
        }// while current not equal null

        System.out.println(" Rear");
    }// display method

}// public class list
