class MyLinkedList {
    class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val=val;
        }
    }

    private ListNode head;
    private ListNode tail;
    int size;

    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
        
    }
    
    public int get(int index) {

        if(index<0 || index>= size){
            return -1;
        }
        else{
            ListNode temp=head;
            for(int i=0;i<index;i++){
                temp=temp.next;
            }
            return temp.val;

        }
    }
    
    public void addAtHead(int val) {
        ListNode temp= new ListNode(val);
        if(head==null){
            head=temp;
            tail=temp;
            size++;
            return;
            
        }
        temp.next=head;
        head=temp;
        size++;

        
    }
    
    public void addAtTail(int val) {
        ListNode temp=new ListNode(val);
        
        if(head==null){
            head=temp;
            tail=temp;
            size++;
            return;
            
        }
        tail.next=temp;
        tail=temp;
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        
        if(index<0 || index > size){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        ListNode temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
            if (size == 1) {
                tail = null;
            }
            size--;
            return;
        }

        ListNode temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        if (index == size - 1) {
            tail = temp;
        }
        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */