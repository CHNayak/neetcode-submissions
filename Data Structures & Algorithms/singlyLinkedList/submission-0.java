class ListNode{
    int val;
    ListNode next;

     // Constructor that sets 'next' to null by default
    public ListNode(int val) {
        this(val, null);
    }

    // Constructor that accepts both value and next node
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class LinkedList {
    public ListNode head;
    public ListNode tail;
    
    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = this.head;

    }

    public int get(int index) {
        ListNode curr = head.next;
        int i = 0;
        while (curr != null) {
            if (i == index) {
                return curr.val;
            }
            i++;
            curr = curr.next;
        }
        return -1;  // Index out of bounds or list is empty
    }

    public void insertHead(int val) {
        ListNode temp = new ListNode(val);
        temp.next = head.next;
        head.next = temp;
        if(temp.next == null){
            tail = temp;
        }
        
        
    }

    public void insertTail(int val) {
        ListNode temp = new ListNode(val);
        this.tail.next = temp;
        this.tail = temp;


    }

    public boolean remove(int index) {
        int i = 0;
        ListNode curr = this.head;
         while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }
          if (curr != null && curr.next != null) {
            if (curr.next == this.tail) {
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
        
    }

    public ArrayList<Integer> getValues() {
        ListNode temp = this.head.next;
         ArrayList<Integer> values = new ArrayList<>();
        while(temp != null){
            values.add(temp.val);
            temp = temp.next;

        }
        return values;

    }
}
