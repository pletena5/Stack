public class StackQueue{

    Stack s1 = new Stack();
    Stack s2 = new Stack();
    int length;

    public StackQueue(Integer[] values){
        for (int i = 0; i < values.length; i++){
            s1.push(values[values.length - i - 1]);
        }// for loop to add values
        length = values.length;
    }// constructor

    public void enQueue(int i){
        s1.push(i);
        length = length + 1;
    }// method adds value to th queue

    public int deQueue(){

        for (int i = 0; i < length - 1; i ++){
            s2.push(s1.pop());
        }// iterates through first stack
        int first = s1.pop();

        for (int i = 0; i < length - 1; i ++){
            s1.push(s2.pop());
        }// adds values back to original stack

        length = length - 1;
        return first;
    }// removes element from the queue

    public void display(){
        s1.display();
    }// displays elements of stack

}// stack queue class
