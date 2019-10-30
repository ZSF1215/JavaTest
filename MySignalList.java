class ListNode{
    public int data;
    public ListNode next;
    public ListNode(int data){
        this.data=data;
        this.next=null;
    }
}//节点类
class MySignalList {
    public ListNode head;


    public MySignalList(){
     this.head=null;
    }
    //头插法    
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head==null){
            this.head=node;
        }else{
            node.next=this.head;
            this.head=node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        ListNode cur = this.head;
        if(this.head==null){
            this.head=node;
        }else{
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=node;
        }
    }
    //查找是否包含关键字key是否在单链表当中
     public boolean contains(int key){
         ListNode cur = this.head;
         while (cur != null) {
             if (cur.data == key) {
                 return true;
             }
             cur = cur.next;
         }
         return false;
     }
    //得到单链表的长度
    public int  getLength(){
        ListNode cur = this.head;
        int count=0;
        while (cur != null) {  
            count++;
            cur=cur.next;
        }
        return count;
    }
    //任意位置插入,第一个数据节点为0号下标
    //找到index-1的位置
    private ListNode searchIndex(int index) {
        ListNode cur = this.head;
        int count = 0;
        while (count < index - 1) {
            count++;
            cur = cur.next;
        }
        return cur;
    }
    public boolean addIndex(int index,int data){
        if(index<0||index>getLength()){
            System.out.println("不合法");
        }
        if(index==0){
            addFirst(data);
            return true;
        }
        //找到index的位置
        ListNode cur =searchIndex(index);
        ListNode node =new ListNode(data);
        node.next=cur.next;
        cur.next=node;
        return true;
    }
    // 删除第一次出现关键字为key的节点
    private ListNode searchPrev(int key){
        ListNode prev =this.head;
       while(prev.next!=null){
            if(prev.next.data==key){
                return prev;
            }
            prev=prev.next;
        }
        return   null;
    }
    public void remove(int key){
        if(this.head==null){
            System.out.println("kong");
            return;
        }
     //0.删除的是否为头节点
        if(this.head.data==key){
            this.head=this.head.next;
            return;
        }
     //1.找到前驱
        ListNode prev = searchPrev(key);
        if(prev==null){
            return;
        }
        ListNode del = prev.next;
        prev.next = del.next;
    }
    //删除所有值为key的节点
     public void removeAllKey(int key){
        ListNode prev =this.head;
        ListNode cur = prev.next;
        while(cur!=null){
            if(prev.next.data==key){
                prev.next=cur.next;
                cur =cur.next;
            }else {
                prev =cur;
                cur=cur.next;
            }
        }
        if(this.head.data==key){
            this.head=this.head.next;
        }
     }
      //反转单链表
      public ListNode reverseList() {
        ListNode prev = null;
        ListNode newHead = null;
        ListNode cur = this.head;
        while(cur!=null) {
             ListNode curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
                cur.next = prev;
                prev = cur;
                cur = curNext;
        }
        return  newHead;
      }
     //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
    // 如果有两个中间结点，则返回第二个中间结点
      public ListNode middleNode(){
        ListNode slow =  this.head;
        ListNode fast = this.head;
        while(fast!=null||fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
         return slow;
      }
      // 输入一个链表，输出该链表中倒数第k个结点
      public  ListNode  FindKthToTail(int k){
       if(k<=0||head==null){
         return null;
     }
        ListNode fast = this.head;
        ListNode slow = this.head;
        while(k-1>0){
            if(fast.next!=null)  {
                fast=fast.next;
                k--;
            }        else {
                System.out.println("无此节点");
                return null;
            }
         while (fast.next!=null){
                fast=fast.next;
                slow=slow.next;

         }
        }
        return slow;
      }
}//单链表



