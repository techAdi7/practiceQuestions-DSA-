import java.util.*;

// [link to the EASY question :- https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays&sortBy=submissions ]


class duplicateElements{
  public static ArrayList<Integer> duplicates(int[] arr) {
    
    // [METHOD-1 : USING THE OPTIMIZED BROOTFORCE APPROACH]

      // Declaring the new Array List
      ArrayList<Integer> ARR = new ArrayList<Integer>();
      
      
      //[2,3,1,2,3]
      
      // Iterating over each elements in the array .
      for(int i=0 ; i<arr.length ; i++){
          
        // Checking whether its already been declared as Duplicat element in the Array List that I have created so far.  

        // if  found the duplicate element then we move to the next iteration without even considering it as its already been declared as duplicate element .
          if(ARR.contains(arr[i])) continue;
          

          // Iterating and Comparing the remaining elements in the Array List to check if its equal or not then declared it as Duplicat element
          for(int j=i+1 ; j<arr.length ; j++){
              
              if(arr[i] == arr[j]){

                //After checking the Duplicating element we will add it to the array list.
                  ARR.add(arr[i]);

                // After encountering the first duplicate element we will break through the current iteration and move to the next iteration
                  break;
              }
              
          }
      }

      // here is the trick part if Array List found to be empty(using the isEmpty() or size() method) then we just simply add it to the Array List that we have made earlier.
      if(ARR.isEmpty()) ARR.add(-1);
      
      //[QUESTION REQUIREMENT:- We will sort the entire array list as said in the question in the ascending order . (using the Collections.sort(Array List) method)]
      Collections.sort(ARR); 
      
      // Finally we will return the Array List as the result or the answer of the question.
      return ARR;


      //[METHOD-2 : USING THE HASH MAP OR HASH SET APPROACH LATER IN THIS DSA COURSE]




  }

  public static void main(String[] args) {
    return;
  }
}