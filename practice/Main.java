import java.sql.Array;
import java.util.*;

public class Main {
//    private final static Scanner scan = new Scanner(System.in);
//    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
//        int totalEvents = Integer.parseInt(scan.nextLine());
//        List<String> events = new ArrayList<>();

        Solution stn = new Solution();
        int trib = stn.tribonacci(4);
        System.out.println(trib);

        boolean flag = stn.isPalindrome(121);
        System.out.println(flag);
        int[] nums = {1,1,2};
        System.out.println(stn.removeDuplicates(nums));
        int[] nums2 = {0,1,2,2,3,0,4,2};
        System.out.println(stn.removeElement(nums2,2));
        System.out.println("(35) Search Insert Position:");
        System.out.println("Output: "+stn.searchInsert(nums2,3));
        String sent = "   fly me   to   the moon  ";
        System.out.println("(58) Length of Last Word");
        System.out.println("Output: "+stn.lengthOfLastWord(sent));
        System.out.println("(66) Plus One");
        System.out.println("output: "+stn.plusOne(nums));
        System.out.println("(67) Add Binary");
        System.out.println("output: "+stn.addBinary("1010", "1011"));
        System.out.println("(69) Sqrt(x)");
        System.out.println("output: "+stn.mySqrt(2147483647));
        System.out.println("(70) Climbing Stairs");
        System.out.println("output: "+stn.climbStairs(2));
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums3 = {2,5,6};
        System.out.println("(88) Merge Sorted Array");
        System.out.print("output: ");
        stn.merge(nums1, 3, nums3, 3);
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2,node3,null);
        TreeNode root = new TreeNode(1,null,node2);
        System.out.println("(94) Binary Tree Inorder Traversal");
        List<Integer> tree = stn.inorderTraversal(root);
        for(Integer m:tree){
            System.out.print(m+" ");
        }
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(2,node4,null);
        TreeNode base = new TreeNode(1,null,node5);
        System.out.println("(100) Same Tree");
        System.out.println("output: "+stn.isSameTree(root,base));
        System.out.println("(104) Maximum Depth of Binary Tree");
        System.out.println("output: "+stn.maxDepth(root));
        System.out.println("(118) Pascal's Triangle");
        System.out.println("output: "+stn.generate(5));
        System.out.println("(119) Pascal's Triangle II");
        System.out.println("output: "+stn.getRow(5));
        int[] prices = {7,1,5,3,6,4};
        System.out.println("(121) Best Time to Buy and Sell Stock");
        System.out.println("output: "+stn.maxProfit(prices));
        System.out.println("(125) Valid Palindrome");
        System.out.println("output: "+stn.isPalindrome("A man, a plan, a canal: Panama"));
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
        System.out.println("(141) Linked List Cycle");
        System.out.println("output: "+stn.hasCycle(n1));
        System.out.println("(144) Binary Tree Preorder Traversal");
        System.out.println("output: "+stn.preorderTraversal(root));
        System.out.println("(145) Binary Tree Postorder Traversal");
        System.out.println("output: "+stn.postorderTraversal(root));
        System.out.println("(168) Excel Sheet Column Title");
        System.out.println("output: "+stn.convertToTitle(701));
        int[] nums4 = {2,2,1,1,1,2,2};
        System.out.println("(169) Majority Element");
        System.out.println("output: "+stn.majorityElement(nums4));
        System.out.println("(171) Excel Sheet Column Number");
        System.out.println("output: "+stn.titleToNumber("AB"));
        System.out.println("(191) Number of 1 Bits");
        System.out.println("output: "+stn.hammingWeight(00000000000000000000000000001011));
        n1 = new ListNode(1);
        n2 = new ListNode(2);
        n3 = new ListNode(3);
        n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        System.out.println("(206) Reverse Linked List");
        System.out.println("output: "+stn.reverseList(n1));
        System.out.println("(217) Contains Duplicate");
        System.out.println("output: "+stn.containsDuplicate(nums4));
        System.out.println("(234) Palindrome Linked List");
        System.out.println("output: "+stn.isPalindrome(n1));
        System.out.println("(242) Valid Anagram");
        System.out.println("output: "+stn.isAnagram("anagram","nagaram"));
        int[] nums6 = {0,1,0,3,12};
        stn.moveZeroes(nums6);
        System.out.println("(283) Move Zeroes");
        System.out.println("output: ");
        for(int i:nums6){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("(326) Power of Three");
        System.out.println("output: "+stn.isPowerOfThree(1162261467));
        char[] s = {'h','e','l','l','o'};
        stn.reverseString(s);
        System.out.println("(344) Reverse String");
        System.out.println("output: ");
        for(char i:s){
            System.out.print(i+" ");
        }
        System.out.println();
        String[] word = {"flower","flow","flight"};
        System.out.println("(14) Longest Common Prefix");
        System.out.println("output: "+stn.longestCommonPrefix(word));
//
//        while (totalEvents-- != 0) {
//            String event = scan.nextLine();
//            events.add(event);
//        }
//
//        List<Student> students = priorities.getStudents(events);
//
//        if (students.isEmpty()) {
//            System.out.println("EMPTY");
//        } else {
//            for (Student st: students) {
//                System.out.println(st.getName());
//            }
//        }
    }
}

class Solution{
    public int tribonacci(int n) {
        int A[] = new int[n+1];
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        A[0] = 0;
        A[1] = 1;
        A[2] = 1;
        for(int i = 3;i <= n;i++){
            A[i] = A[i-1]+A[i-2]+A[i-3];
        }
        return A[n];
    }

    public boolean isPalindrome(int x) {
        String right = Integer.toString(x);
        char ch;
        String left = "";
        for(int i=0;i<right.length();i++){
            ch = right.charAt(i);
            left = ch+left;
        }
        if(right.equalsIgnoreCase(left)){
            return true;
        }
        else{
            return false;
        }
    }

    public int removeDuplicates(int[] nums) {
        int k=0;
        for(int i=1;i< nums.length;i++){
            if(nums[k] != nums[i]) {
                nums[k+1] = nums[i];
                k++;
            }
        }
        return k+1;
    }

    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
        }
        return k;
    }

    public int searchInsert(int[] nums, int target) {
        int ind=0;
        while(ind<nums.length){
            if(nums[ind]>=target){
                break;
            }
            ind++;
        }
        return ind;
    }

    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length-1].length();
    }

    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    public String addBinary(String a, String b) {
        int indA = a.length()-1;
        int indB = b.length()-1;
        String str = "";
        int car=0;
        int sum=0;
        while(indA>=0 || indB>=0){
            sum=car;
            if(indA>=0){
                sum = Integer.parseInt(String.valueOf(a.charAt(indA))) + sum;
                indA--;
            }
            if(indB>=0){
                sum = Integer.parseInt(String.valueOf(b.charAt(indB))) + sum;
                indB--;
            }
            str = Integer.toString(sum%2) + str;
            car = sum>1?1:0;
        }
        if(car!=0) str = "1"+str;
        return str;
    }

    public int mySqrt(int x) {
        int sqrt=1;
        for(int i=1;i<=x/2+1;i++){
            if(i*i==x){
                sqrt=i;
                break;
            }
            else if(i*i>x || i>Integer.MAX_VALUE/i){
                sqrt=i-1;
                break;
            }
        }
        return sqrt;
    }

    public int climbStairs(int n) {
        int ways = 0;
        for(int i=0;i<=n;i++){
            if(i+1<=n){
                ways++;
            }
            if(i+2<=n){
                ways++;
            }
        }
        return ways;
    }

    public ListNode deleteDuplicates(ListNode head) {
        while(head.next != null){
            if(head.val == head.next.val){
                ListNode temp = head.next;
                head.next = head.next.next;
                temp.next = null;
                temp = null;
            }
            else{
                head = head.next;
            }
        }
        return head;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while((temp1 != null && temp1.next!=null) && (temp2 != null && temp2.next!=null)){
            if(temp2.val>temp1.val){
                temp1 = temp2.next;
            }
            else{
                ListNode head = temp1;
                temp1.val = temp2.val;
                temp1.next = head;
                temp2=temp2.next;
            }
        }
        return temp1;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int allNum[] = new int[m+n];
        int im = 0;
        int in = 0;
        for(int i=0;i<m+n;i++){
            if(im<m && in<n){
                if(nums1[im]<nums2[in]){
                    allNum[i] = nums1[im];
                    im++;
                }
                else{
                    allNum[i] = nums2[in];
                    in++;
                }
            }
            else if(im<m){
                allNum[i] = nums1[im];
                im++;
            }
            else if(in<n){
                allNum[i] = nums2[in];
                in++;
            }
        }
        nums1 = allNum;
        for(int j=0;j<nums1.length;j++){
            System.out.println(nums1[j]);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode temp = root;
        List<Integer> tree = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while(temp != null || !stack.isEmpty()){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
                continue;
            }
            temp = stack.pop();
            tree.add(temp.val);
            temp = temp.right;
        }
        return tree;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        TreeNode temp = p;
        TreeNode temp2 = q;
        Stack<TreeNode> stackp = new Stack<>();
        Stack<TreeNode> stackq = new Stack<>();
        while(temp != null || temp2 != null || !stackp.isEmpty() || !stackq.isEmpty()){
            if(temp != null && temp2 != null){
                stackp.push(temp);
                stackq.push(temp2);
                if(temp.val == temp2.val) {
                    temp = temp.left;
                    temp2 = temp2.left;
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(temp != null || temp2 != null)
                return false;
            temp = stackp.pop();
            temp2 = stackq.pop();
            if(temp.val == temp2.val) {
                temp = temp.right;
                temp2 = temp2.right;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> numList = new ArrayList<List<Integer>>();
        numList.add(new ArrayList<Integer>(Arrays.asList(1)));
        for(int i=1;i<numRows;i++){
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++){
                if(j==0) {
                    list.add(1);
                }
                else if(j==i){
                    list.add(1);
                }
                else {
                    int m = numList.get(i - 1).get(j - 1);
                    int n = numList.get(i - 1).get(j);
                    list.add(m + n);
                }
            }
            numList.add(list);
        }
        return numList;
    }

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> numList = new ArrayList<List<Integer>>();
        numList.add(new ArrayList<Integer>(Arrays.asList(1)));
        for(int i=1;i<=rowIndex;i++){
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++){
                if(j==0) {
                    list.add(1);
                }
                else if(j==i){
                    list.add(1);
                }
                else {
                    int m = numList.get(i - 1).get(j - 1);
                    int n = numList.get(i - 1).get(j);
                    list.add(m + n);
                }
            }
            numList.add(list);
        }
        return numList.get(rowIndex);
    }

    public int maxProfit(int[] prices) {
        int prof = 0;
        int low = Integer.MAX_VALUE;
        for(int i=0; i<prices.length;i++){
            if(prices[i]<low){
                low = prices[i];
            }
            if((prices[i]-low)>prof){
                prof = prices[i]-low;
            }
        }
        return prof;
    }

    public boolean isPalindrome(String s) {
        String pal = s.toLowerCase();
        pal = pal.replaceAll("[^a-z0-9]","");
        for(int i=0,j=pal.length()-1;i<=j;i++,j--){
            if(pal.charAt(i)!=pal.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int val=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue() == 1) {
                val = entry.getKey();
            }
        }
        return val;
    }

    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        while(temp.next!=null){
            if(temp.val == 1000000){
                return true;
            }
            temp.val = 1000000;
            temp = temp.next;
        }
        return false;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        Stack<TreeNode> stc = new Stack<>();
        while(root!=null || !stc.isEmpty()){
            if(root!=null){
                pre.add(root.val);
                stc.push(root);
                root = root.left;
                continue;
            }
            root = stc.pop();
            root = root.right;
        }
        return pre;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        Stack<TreeNode> stc = new Stack<>();
        while(root!=null || !stc.isEmpty()){
            if(root!=null){
                pre.add(root.val);
                stc.push(root);
                root = root.left;
                continue;
            }
            root = stc.pop();
            root = root.right;
        }
        return pre;
    }

    public String convertToTitle(int columnNumber) {
        int ind = columnNumber;
        String col = "";
        while(ind>0){
            ind--;
            int ascii = 65 + (ind%26);
            String str = new Character((char) ascii).toString();
            col = str+col;
            ind = ind/26;
        }
        return col;
    }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int num=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]) == null){
                map.put(nums[i],1);
            }
            else{
                int val = map.get(nums[i])+1;
                map.put(nums[i],val);
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue() > nums.length/2){
                num = entry.getKey();
            }
        }
        return num;
    }

    public int titleToNumber(String columnTitle) {
        double pow = (double) columnTitle.length()-1;
        int num = 0;
        for(int i=0;i<columnTitle.length();i++){
            char ch = columnTitle.charAt(i);
            num = num+(((int)ch-64)*(int) Math.pow(26,pow));
            pow--;
        }
        return num;
    }

    public int hammingWeight(int n) {
        String num = Integer.toString(n);
        int count = 0;
        for(int i=0;i<num.length();i++){
            if(num.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> st = new Stack<>();
        int size = 0;
        while(temp!=null){
            st.push(temp.val);
            temp = temp.next;
            size = size+1;
        }
        for(int i=0;i<size/2;i++){
            if(head.val!=st.pop()){
                return false;
            }
            head = head.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:nums){
            if(set.contains(i)){
                return true;
            }
            else{
                set.add(i);
            }
        }
        return false;
    }

//    public boolean isAnagram(String s, String t) {
//        if(s.length()!=t.length())
//            return false;
//        HashMap<Character,Integer> sMap = new HashMap<>();
//        HashMap<Character,Integer> tMap = new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            if(sMap.get(s.charAt(i))==null){
//                sMap.put(s.charAt(i),1);
//            }else{
//                int val = sMap.get(s.charAt(i))+1;
//                sMap.put(s.charAt(i),val);
//            }
//            if(tMap.get(t.charAt(i))==null){
//                tMap.put(t.charAt(i),1);
//            }else{
//                int val = tMap.get(t.charAt(i))+1;
//                tMap.put(t.charAt(i),val);
//            }
//        }
//        return sMap.equals(tMap);
//    }

    public boolean isAnagram(String s, String t){
        if(s.length()==t.length()){
            char[] arrS = s.toCharArray();
            char[] arrT = t.toCharArray();
            Arrays.sort(arrS);
            Arrays.sort(arrT);
            return Arrays.equals(arrS,arrT);
        }
        return false;
    }

    public void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                k++;
            }else{
                int temp = nums[i-k];
                nums[i-k] = nums[i];
                nums[i] = temp;
            }
        }
    }

    public boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        if(n<1 || n%3!=0){
            return false;
        }
        return isPowerOfThree(n/3);
    }

    public void reverseString(char[] s) {
        for(int i=0,j=s.length-1; i<j;i++,j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

    public String longestCommonPrefix(String[] strs) {
        List<Character> com = new ArrayList<>();
        if(strs.length==1)
            return strs[0];
        int i=0;
        String first = strs[0];
        String sec = strs[1];
        while(i<first.length() && i<sec.length()){
            if(first.charAt(i)==sec.charAt(i)){
                com.add(first.charAt(i));
            }
            else {
                break;
            }
            i++;
        }
        int j=2;
        while(j<strs.length){
            String w = strs[j];
            if(w.isEmpty()){
                return "";
            }
            int p=0;
            while(p<w.length() || p< com.size()){
                if(p== com.size())
                    break;
                if(p==w.length()){
                    com = com.subList(0,p);
                    break;
                }
                if(com.get(p)!=w.charAt(p)){
                    com = com.subList(0,p);
                    break;
                }
                p++;
            }
            j++;
        }
        String sb = "";
        for(char ch:com){
            sb = sb+ch;
        }
        return sb;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; next = null;}
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Student{
    int id;
    String name;
    double cgpa;
    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {
    List<Student> student = new ArrayList<>();
    String arr[] = new String[4];
    List<Student> getStudents(List<String> events) {
        for(int i=0; i< events.size(); i++){
            if(events.get(i).equals("SERVED")){
                student = removeHighest(student);
                continue;
            }
            arr = (events.get(i)).split(" ");
            Student s = new Student(Integer.parseInt(arr[3]), arr[1], Double.parseDouble(arr[2]));
            student.add(s);
        }

        return student;
    }
    List<Student> removeHighest(List<Student> student){
//        Student s = student.get(0);
//        Double maxCgpa = s.getCgpa();
//        Student maxS = s;
//
//        for(int i=1; i< student.size(); i++){
//            Student ss = student.get(i);
//            if(ss.getCgpa()>maxCgpa){
//                maxCgpa = ss.getCgpa();
//                maxS = ss;
//                continue;
//            } else if (ss.getCgpa()==maxCgpa) {
//                if ((ss.getName()).equals(maxS.getName())) {
//                    if (ss.getId() > maxS.getId()) {
//                        maxS = ss;
//                    }
//                }
//            }
//        }
        Collections.sort(student,new Sortbycgpa());
        Student maxS = student.get(0);
        for(int i=1; i< student.size(); i++){
            Student s = student.get(i);
            if (s.getCgpa()== maxS.getCgpa()){
                Collections.sort(student.subList(0, i),new Sortbyname());
                maxS = student.get(student.size()-1);
            }
        }
        student.remove(maxS);

        return student;
    }
}
class Sortbycgpa implements Comparator<Student> {

    // Method
    // Sorting in ascending order of roll number
    public int compare(Student a, Student b)
    {

        return -(String.valueOf (a.cgpa)).compareTo(String.valueOf(b.cgpa));
    }
}

class Sortbyname implements Comparator<Student> {

    // Method
    // Sorting in ascending order of name
    public int compare(Student a, Student b)
    {

        return a.name.compareTo(b.name);
    }
}