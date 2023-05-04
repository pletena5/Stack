class Main {
    public static void main(String[] args) {
        // create a simple list
        int[] testValues = {13,7,19,68};
        List testList = new List(testValues);
        testList.display();

        Queue q = new Queue();
        q.enQueue(5);
        q.display();

        PriorityQueue queue = new PriorityQueue();
        queue.enQueue(5 , false);
        queue.enQueue(2 , true);
        queue.display();
        queue.deQueue();
        queue.display();

    }// main
}// class main
