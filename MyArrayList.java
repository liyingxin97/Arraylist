
import java.util.Arrays;
        
public class MyArrayList
{   
    private int size = 0;//Total capacity of the list
    private int length= 0;//Number of elements in the list
    private Object[] list;//List to store any type of objects
    //Default constructor
    
    public MyArrayList()
    {
        length = 0;
        list = new Object[100];
        size = 100;
    }
    //constructor
     public MyArrayList(int n)
     {
        length = 0;
        list = new Object[n];
        size = n;
    }
     //A method that allows you to place a value at the end of arraylist
    public void add(Object x)
    {
        if(length>=size)
        {
            System.out.println("Exception: Size exceeds");
            return;
        }
        list[length] = x;
        length++;
    
     }  
    //A method that allows you to place a value at a given location
    public void add(int index, Object x)
    {
        //if index is out of range, print error message
        if (index<0 || index > size)
        {
            System.out.println(index + " is an invalid index to add");
            return;
        }
        //make a space at index to place new element
        for (int i = length; i>index; i--)
            list[i] = list [i-1];
        //place  the new element at index
         list[index] = x;
         length++;
    }
    //A method that allows you to retrieve a value from a given location
     public Object get(int index)
     {
         //if index is out of range, return nothing
         if (index<0 || index > length)
             return null;
         else
          //if the index is valid, return the element at index
             return list[index];
     }
     //A method that allows you the number of elements in the arraylist
     public int size()
     {
         return length;
     }
     //A method would test to see if the isempty
     public boolean isEmpty()
     {
         if(length ==0)
             return true;
         else
             return false;
     }
     //A method that see if a particular object exist in the 
     public boolean isIn(Object ob)
     {
         for (int i=0; i<length;i++)
         {
             //return true, if ob is found in the list
             if (list[i]==ob)
                 return true;
     }
         //return false, if ob is not found in the list
         return false;
     //A method that will return the location of first occurrence of an Object 
     //Starting from location 0
     }
     public int find (Object n)
     {
         //find n in each location
         for (int i = 0; i<length; i++)
         {
             //return index i for n, if n is found at 1
             if(list[i]==n)
                 return i;
   
     }
         return -1;
     }
     //A method that will remove the first occurrence of an Object
     //starting from location 0
     public void remove (Object n)
     {
         if(find(n)!=-1)
         {
             //remove by moving elements to fromt
             for (int j = find (n);j<length-1; j++)
             {
                 list[j] = list[j+1];
                 
             }
              System.out.println("Removed successfully");
              length--;
         }
         else 
             System.out.println("No such element exist to remove");
     }      
     
}
