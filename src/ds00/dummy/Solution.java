package ds00.dummy;
import java.util.*;
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        // Use a PriorityQueue to maintain the minimum element among all lists
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));

        // Add the first node of each list to the PriorityQueue
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        // Dummy node to simplify the result list creation
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Continue until the PriorityQueue is not empty
        while (!minHeap.isEmpty()) {
            // Extract the minimum node from the PriorityQueue
            ListNode minNode = minHeap.poll();

            // Add the minimum node to the result list
            current.next = minNode;
            current = current.next;

            // Move to the next node in the list
            if (minNode.next != null) {
                minHeap.offer(minNode.next);
            }
        }

        return dummy.next;
    }
}