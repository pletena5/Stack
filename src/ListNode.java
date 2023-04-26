public class ListNode {
    private int value;
    private ListNode next;

    public ListNode(int value) {
        this.value = value;
        this.next = null;
    }

    public ListNode(int value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    public void setNext(ListNode pointer) {
        next = pointer;
    }

    public void setValue(int newValue) {
        value = newValue;
    }
}
