SinglyLinkedListNode curr = llist;
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = curr.next;
        }   
        
        return prev;