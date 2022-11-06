import java.util.ArrayList;
import java.util.Collections;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Merge_Two_Sorted_Lists_21 {

	public static void main(String[] args) {
	
	}
	
	 public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		 ListNode result = new ListNode();
		 ListNode curNode = result;
		 
		 while(l1!=null||l2!=null) {
			 
			 if(l1==null) {
				 curNode.next = new ListNode(l2.val);
				 l2 = l2.next;
				 curNode = curNode.next;
				 continue;
			 }
			 else if(l2==null) {
				 curNode.next = new ListNode(l1.val);
				 l1 = l1.next;
				 curNode = curNode.next;
				 continue;
			 }
			 
			 if(l1.val<=l2.val) {
				 curNode.next = new ListNode(l1.val);
				 l1 = l1.next;
			 }
			 else if(l1.val>l2.val) {
				 curNode.next = new ListNode(l2.val);
				 l2 = l2.next;
			 }
			 
			 curNode = curNode.next;
		 }
		 
		 return result.next;
	 }

}
