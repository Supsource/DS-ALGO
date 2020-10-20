import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class Link {
    public  String bookName;
    public int millionSold;

    public Link next;
    public Link(String bookName, int millionSold){
        this.bookName = bookName;
        this.millionSold = millionSold;
    }

 public void display(){
     System.out.println(bookName + ": " + millionSold + ",000,00");
 }

 public String toString(){
     return bookName;
 }

    public static void main(String[] args){

        LinkList theLinkedList = new LinkList();

        theLinkedList.insertFirstLink("Don Quixote", 500);
        theLinkedList.insertFirstLink("A tale of two cities", 200);
        theLinkedList.insertFirstLink("After", 400);
        theLinkedList.insertFirstLink("Somthing that i never told you", 800);
           
        theLinkedList.removeFirst();
        theLinkedList.display();

        System.out.println(theLinkedList.find("After").bookName + "was found");

        theLinkedList.removeLink("After");

        theLinkedList.display();



    }
}

class LinkList{
         public Link firstLink;

         LinkList(){
             firstLink = null;
         }

         public boolean isEmpty(){
             return(firstLink == null);
         }

        public void insertFirstLink(String bookName, int millionSold){
            Link newLink = new Link(bookName, millionSold);
            newLink.next = firstLink;
            firstLink = newLink;


        } 

        public Link removeFirst(){
            Link linkReference = firstLink;

            if(!isEmpty()){
                  firstLink = firstLink.next;
            }else
            {
                System.out.println("Empty LinkedList");
            }

            return linkReference;
        }

    public void display(){
        Link theLink = firstLink;

        while(theLink !=null){
            theLink.display();

            System.out.println("Next Link: " + theLink.next);

            theLink = theLink.next;

            System.out.println();
        }
    }

    public Link find(String bookName){
        Link theLink = firstLink;

        if(!isEmpty()){
            while(theLink.bookName =! bookName){
                 if(theLink.next = null != null) {
                     return null;
                 } else {
                     theLink  = theLink.next;
                 }
            }
        } else{
            System.out.println("Empty Linkedlist");
        }

        return theLink;
    }

    public Link removeLink(string bookName){
        Link cuurentLink = firstLink;
        Link previousLink = firstLink;

        while(cuurentLink.bookName =! bookName){
            if(cuurentLink.next == null){
                return null;
            } else{
                previousLink = cuurentLink;

                cuurentLink = firstLink.next;
            }
        }

        if(cuurentLink == firstLink){
            firstLink = firstLink.next;
        }else{
            previousLink.next = cuurentLink.next;
        }

        return cuurentLink;
    }

}
