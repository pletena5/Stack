class Main {
    public static void main(String[] args) {
        // create a simple list
        Integer[] testValues = {13,7,19,68};

        StackQueue sq = new StackQueue(testValues);

        sq.deQueue();
        sq.display();
        sq.enQueue(5);
        sq.display();
        sq.enQueue(3);
        sq.enQueue(8);
        sq.display();

    }// main
}// class main
