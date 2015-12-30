

    public class Link
    {
        ListNode head;
        
        public static void main(String args[])
        {

            
            Link list = new Link();
            list.head=null;
//            head=null;
            System.out.println("Linked List");



            list.head = new ListNode(1);
            
            list.insert(2);
            list.display();


        }

        public void insert(int val)
        {

            ListNode node = head;

            
            while(node.next != null)
            {
                node=node.next;
            }
            
            ListNode newNode  = new ListNode(val);
            node.next=newNode;
            

        }

            
            
        public void display()
        {
            
            System.out.println("Printing List : \n");
            ListNode node = head;
            
            
            while(node != null)
            {
                System.out.println(node.val);
                node=node.next;
            }
            
            
            
            
        }





        }



    class ListNode {
            int val;
            ListNode next;
        
        
            ListNode(int x) 
            { 
                val = x; 
                next=null;
            }

    }
