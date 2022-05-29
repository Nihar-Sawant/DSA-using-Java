import java.util.ArrayList;
import java.util.Collections; // this import is used for using collections.sort() function
import java.util.List;

public class collections_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> li =new ArrayList<Integer>();// Intializes Array of size 10
    
        //add elements to the ArrayList i.e. at the end of current posistion
        System.out.println("Adding element to the list : ");
        li.add(93);
        li.add(10);
        li.add(18);
        li.add(47);
        li.add(2);
        li.add(21);
        li.add(122);

        //Display List
        System.out.println(li);

        //Display elements present in List
        for(int i:li)
            System.out.println(i);

        //add element at specific index
        li.add(0,21);  //added 21 at specific index

        //Display List
        System.out.println(li);

        // Print number of element present in the list
        System.out.println("Number of elements in list : "+li.size());

        //return index of the searched number
        int num=47; // number to be searched
        System.out.println("the number "+num+" present at index : "+li.indexOf(num)); //if present will return index else returns -1

        //Deleting a number from specified index
        //I will be deleting the last number
        System.out.println("Deleting the last number i.e. : "+li.remove(li.size()-1));
        //Display List
        System.out.println("Afer Deleteing the last number : ");
        System.out.println(li);

        //Retreving number from a specified index
        System.out.println("Retreving number i.e. on index 2 : "+li.get(2));

        //Retreving number from a specified index
        li.set(2, 101);

        //Display List
        System.out.println("Afer setting 101 at index 2 : ");
        System.out.println(li);

        //check if list is empty or not
        System.out.println("Checking if list is empty  : "+li.isEmpty());

        //Sorting all elements in ascending order
        Collections.sort(li);

        //Dsiplay list
        System.out.println("After sorting list in ascending order : ");
        System.out.println(li);

        //Creating sublist from existing list from index 2 to last
        List<Integer> li2=li.subList(2,li.size()-1);

        //Display List
        System.out.println("after creating sublist li2 from index 2 to last : ");
        System.out.println(li2);
    

        //removing all element from the list
        li.removeAll(li);

        //Display List
        System.out.println("List after removing all elements in the list : ");
        System.out.println(li);

        



    }
    
}
