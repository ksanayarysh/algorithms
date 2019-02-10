package basic;

public class Main {
    public static void main(String[] args) {

//        basic.ListNode l1 = new basic.ListNode(1);
//
//        basic.ListNode d1 = l1;
//        for (int i = 2; i < 10; i++) {
//            d1.next = new basic.ListNode(i);
//            d1 = d1.next;
//        }
//
//        basic.ListNode next1 = l1;
//        while (next1 != null) {
//            System.out.println(next1.val);
//            next1 = next1.next;
//        }
//
//
//        System.out.println();
//
//        basic.ListNode l2 = new basic.ListNode(1);
//
//        basic.ListNode d2 = l2;
//        for (int i = 2; i < 5; i++) {
//            d2.next = new basic.ListNode(i);
//            d2 = d2.next;
//        }
//
//        basic.ListNode next2 = l2;
//        while (next2 != null) {
//            System.out.println(next2.val);
//            next2 = next2.next;
//        }
//
//        basic.Solution m = new basic.Solution();
//
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int m1 = 3;
//        int[] nums2 = {2, 4, 6};
//        int n1 = 3;
//
//        m.merge(nums1, m1, nums2, n1);
//
//        int[] nums1_2 = {2, 0};
//        int m_1 = 1;
//        int[] nums2_2 = {1};
//        int n_1 = 1;
//        m.merge1(nums1_2, m_1, nums2_2, n_1);
        //basic.ListNode next = m.mergeTwoLists(l1, l2);

//        basic.ListNode nn = m.mergeTwoLists(null, null);
//
//        System.out.println();
//        while (nn != null){
//            System.out.println(nn.val);
//            nn = nn.next;
//        }

//        basic.highPoint h = new basic.highPoint();
//        int[] a = {0, 1, 1, 1, 0, 2, 3, 0, 1, 1, 1, 1, 1, 1, 0};
//        System.out.println(h.countHigh(a));

//        basic.Evaluate e = new basic.Evaluate();
//        e.calc("( ( 5 * 2 ) + 1 )");
        Solution m = new Solution();
//        System.out.println("is valid '()' = " + m.isValid( "()"));
//        System.out.println("is valid \"()[]{}\" = " + m.isValid( "()[]{}"));
//        System.out.println("is valid \"(]\" = " + m.isValid( "(]"));
//        System.out.println("is valid \"([)]\" = " + m.isValid( "([)]"));
//        System.out.println("is valid \"{[]}\" = " + m.isValid( "{[]}"));
//        System.out.println("is valid \"]\" = " + m.isValid( "]"));
//        System.out.println("is valid \"[\" = " + m.isValid( "["));

        int[] nums = {0,4,4,0,4,4,4,0,2};
        int res = m.removeElement(nums, 4);
        System.out.println(res);
        for (int i = 0; i < res; i++) {
            System.out.print(nums[i] + " ");
        }
        //basic.BinarySearch.

    }
}
