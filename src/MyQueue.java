/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-12
 * Time:19:32
 **/
public class MyQueue {

    static class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        public Node head;
        public Node tail;
        //入队列
        public void offer(int val){
            Node node = new Node(val);
            if (head == null){
                head = node;
                tail = node;
                return;
            }
            tail.setNext(next);
            tail = tail.getNext();
        }
        //出队列
        public Integer poll(){
            if (head == null){
                return null;
            }
            int ret = head.getVal();
            head = head.getNext();
            if (head == null){
                tail = null;
            }
            return ret;
        }
        public Integer peek(){
            if (head == null){
                return null;
            }
            return head.getVal();
        }
    }

    public static void main(String[] args) {

    }
}
