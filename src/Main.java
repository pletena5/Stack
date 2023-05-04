class Main {
    public static void main(String[] args) {
        // create a simple list
        int[] testValues = {13,7,19,68};
        List testList = new List(testValues);
        testList.display();

        Queue q = new Queue();
        q.enQueue(5);
        q.display();

    }// main
}// class main
