import java.util.Stack;

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode mergeTwoLists;
        if (l1 == null && l2 == null) return null;

        if (l1 == null || ((l2 != null) && (l1.val > l2.val))) { // наименьшее значение у l2
            mergeTwoLists = new ListNode(l2.val);
            l2 = l2.next;
        } else {
            mergeTwoLists = new ListNode(l1.val);
            l1 = l1.next;
        }

        // теперь у нас есть первоначальное значение для листа и один из входящих сдвинут

        System.out.println();
        ListNode d = mergeTwoLists;
        while (l1 != null || l2 != null) { // пока для равных размеров

            if (l1 == null || ((l2 != null) && (l1.val >= l2.val))) { // минимальное l2
                d.next = new ListNode(l2.val);
                d = d.next;
                l2 = l2.next;  // идем дальше

            } else { // if ((l2 != null) || (l2.val > l1.val))

                d.next = new ListNode(l1.val);
                d = d.next;
                l1 = l1.next;
            }

            System.out.println(d.val);
        }
        return mergeTwoLists;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        int count = 0;
        int realNum = m;

        for (int i = 0; i < n; i++) { // для второго массива
            while (j <= realNum - 1) {
                if ((nums2[i] >= nums1[j] && nums2[i] <= nums1[j + 1]) || (j == 0 && nums2[i] < nums1[0])) {    // если мы нашли внутри массива индекс, когда можно поместить внутри
                    for (int k = realNum - 1; k >= j; k--) {
                        nums1[k + 1] = nums1[k];
                    }

                    if (j == 0 && nums2[i] < nums1[0]) nums1[0] = nums2[i];
                    else nums1[j + 1] = nums2[i];
                    count++;
                    realNum++;
                    break;
                }
                j++;
            }
        }


        for (int k = 0; k < n - count; k++) {
            nums1[m + count + k] = nums2[count + k];
        }

        for (int i = 0; i < n + m; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        int k = m - 1;
        int j = n - 1;

        for (int i = m + n - 1; i >= 0; i--) {
            if (j < 0 || ((k >= 0) && nums1[k] > nums2[j])) {
                nums1[i] = nums1[k];
                k--;
            } else {
                nums1[i] = nums2[j];
                j--;
            }
            System.out.println("i = "  + i + " nums[i] = " + nums1[i] + " j  = " + j + " k = " + k);
        }

        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public boolean isValid(String s){
        if (s.length() == 0) return true;

        Stack<Character> opening = new Stack<>();

        char simb;
        int i = 0;
        char op;
        while (i < s.length()){
            simb = s.charAt(i);
            if (simb == '{' || simb == '[' || simb == '(') opening.push(simb);
            else {
                if (opening.empty()) return false;
                op = opening.pop();
                if ((op == '{' && simb != '}') || (op == '[' && simb != ']') || (op == '(' && simb != ')')) return false;
            }
            i++;
        }
        if (opening.empty()) return  true;
        else return false;
    }


}
