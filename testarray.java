

public class testarray {

  
    public static void main(String[] args) {
        MyArrayList arlist = new MyArrayList ();
        //add elements
          arlist.add("a");
          arlist.add("b");
          arlist.add("c");
          arlist.add(4);
          arlist.add(5);
          arlist.add(3.5);

          System.out.println("List: ");

          for(int i=0;i<arlist.size();i++)

          {
              System.out.print(arlist.get(i)+" ");

          }
          System.out.println();
          //Replace an element at position 4

          arlist.add(4,"d");

          System.out.println("After placement a new element, the updated List: ");

          for(int i=0;i<arlist.size();i++)

          {

              System.out.print(arlist.get(i)+" ");

          }

          System.out.println();

         

          if(arlist.find("c")!=-1)

              System.out.println("Element 'c' found in the List");

          else

              System.out.println("Element 'c' does not found in the List");

         

          if(arlist.isEmpty()==true)

              System.out.println("List is empty");

          else

              System.out.println("List is not emtpy");

         

          if(arlist.isIn("a")==true)

              System.out.println("'a' Exist in the List");

          else

              System.out.println("'a' Does not exist in the List");

          //Remove an element

          arlist.remove("b");

          System.out.println("After removing 'b', the updated List: ");

          for(int i=0;i<arlist.size();i++)

          {

              System.out.print(arlist.get(i)+" ");

          }

          System.out.println();

             

          arlist.remove("z");

     }

}