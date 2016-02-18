package hello;

public class SwapNodes {
    /**
     * @param head a ListNode
     * @return a ListNode
     */
    public ListNode swapPairs(ListNode head) {
        // Write your code here
        ListNode cur = head;
        ListNode lat;

        ListNode pre=head;
        while ( cur.next != null) {
            lat = cur.next;
            lat.next = cur;
            cur.next = cur.next.next;
            lat = pre;
            pre = cur;
            cur = pre.next;

            if ( cur == null) return head;

        }
        return head;
    }
    public class ListNode {
    	      int val;
    	      ListNode next;
    	      ListNode(int x) { val = x; }
    	  }
    public static void main (String[] args) {
    	
    }
}
