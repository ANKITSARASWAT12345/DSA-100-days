//Remove Nth Node From End of the linkedlist

/*class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}

class Linkedlist{
    public Node insert(Node head, int val){
        Node newNode=new Node(val);
        if(head==null){
            return newNode;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode; 
        return head;

    }
    public  Node removenthFromEnd(Node head, int n){
        Node dummyNode=new Node(0);
        Node slow=dummyNode;
        Node fast=dummyNode;

        dummyNode.next=head;
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public void display(Node head){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.val+"->");
            curr=curr.next;
        }
        System.out.println();
    }
}
  
public class Main {
     
    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
        Node head=null;
        head=list.insert(head,1);
        head=list.insert(head,2);
        head=list.insert(head,3);
        head=list.insert(head, 4);
        head=list.insert(head, 5);
        list.display(head);

        int n=2;
        head=list.removenthFromEnd(head,n);
        list.display(head);
       
    }
}*/


//find the duplicate number in  an array

class Main{
    public static void main(String[] args) {
        int arr[]={1,2,2};
        int n=arr.length;
        int res=findDuplicate(arr,n);
        System.out.println(res);
    }
    public static int findDuplicate(int arr[], int n){
        int slow=arr[0];
        int fast=arr[0];
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }
        while(slow!=fast);
        fast=arr[0];

        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
}

