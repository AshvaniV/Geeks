package ds00.limkedList.level1;

class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        LinkedList ll = new LinkedList();
        ll.head = new LinkedList.ListNode(1);
        System.out.println(ll.size);
    }



    public static class LinkedList {
        ListNode head;
        int size;

        // O(n)
        public int get(int index) {
            if (index < 0 || index >= this.size) {
                return -1;
            }

            ListNode curr = head.next;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }

            return curr.val;
        }

        // O(1)
        public void addAtHead(int val) {
            ListNode newNode = new ListNode(val);

            newNode.next = head.next; // wire new node to first item
            head.next = newNode; // wire dummy head to new node
            size++;
        }

        /*
          O(n) - can be made O(1) if we make the tail node doubly linked
          so it can "look back". This will complicate deletion and insertion
          a bit so for simplicity the linear approach is shown.
        */
        public void addAtTail(int val) {
            ListNode newNode = new ListNode(val);

            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            size++;
        }

        // O(n)
        public void addAtIndex(int index, int val) {
            if (index < 0 || index > this.size) {
                return;
            }

            ListNode newNode = new ListNode(val);

            ListNode curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;

            size++;
        }

        // O(n)
        public void deleteAtIndex(int index) {
            if (index < 0 || index >= this.size) {
                return;
            }

            ListNode curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;

            size--;
        }

        private static class ListNode {
            int val;
            ListNode next;

            public ListNode() { }

            public ListNode(int val) {
                this.val = val;
            }
        }
    }
}
