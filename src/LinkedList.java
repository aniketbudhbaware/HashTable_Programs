
public class LinkedList {
	 private Node start;
     private int size;


     public LinkedList() {
         size = 0;
         start = null;
     }

     public void insert(int value){
         Node n;
         n = new Node();
         n.setData(value);
         n.setNext(start);
         start=n;
         size++;
     }
     public boolean isEmpty(){   //true if length of string is 0
         if(start==null){
             return true;
         }
         else{
             return false;
         }
     }

     public void viewList(){
         Node t;
         if(isEmpty()){
             System.out.println("List is empty");
         }
         else{
             t=start;
             for(int i=1;i<=size;i++){
                 System.out.println(""+t.getData());  //now t will get data from next node
                 t = t.getNext();         //now in t giving refernce varibale of next node to continue this cycle;
             }
         }
     }

}
