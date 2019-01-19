import java.lang.management.GarbageCollectorMXBean;
import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.LinkedList;

public class ReferenceExample {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {

        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            LinkedList<ListNode> list = new LinkedList<>();

            list.addFirst(l1);
            SoftReference fc = null;

            return l1;
        }
    }

    public static void main(String[] args) {
        SoftReference sr = null;
        PhantomReference pr = null;
        Reference r = null;
        ReferenceQueue rq = null;
        WeakReference wr = null;


    }
}
