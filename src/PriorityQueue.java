public class PriorityQueue extends Queue{
    Queue priority = new Queue();

    public PriorityQueue(){
        super();
    }// constructor

    //@Override
    public void enQueue(int value , boolean ispriority){

        if (ispriority){
            priority.enQueue(value);
        }else {

            if (rear == null) {
                addFirst(value);
                rear = front();
            } else {
                ListNode n = new ListNode(value);
                rear.setNext(n);
                rear = n;
            }// if rear == null
        }// if priority

    }// enqueue method

    @Override
    public int deQueue (){
        if (priority.getHead() != null){
            return priority.deQueue();
        }else{
            int frontValue = remove().getValue();
            if (front() == null){
                rear = null;
            }// if front = null
            return frontValue;
        }// if thre is something in the priority queue
    }// dequeue method

    public void display (){
        System.out.print("Front ");

        ListNode current = priority.front();

        while (current != null){
            System.out.print("[" + current.getValue() + "][]->");
            current = current.getNext();
        }// while current not equal null


        current = front();

        while (current != null){
            System.out.print("[" + current.getValue() + "][]->");
            current = current.getNext();
        }// while current not equal null

        System.out.println(" Rear");

    }// diplay method

}// class priority queue
