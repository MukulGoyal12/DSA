package Stack_and_Queue.Stack.Questions;
import java.util.*;

public class  RemoveConsecutiveSubsequences {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int res[]=remove(arr);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]+" ");
        }
    }

    public static int[] remove(int[] arr){
         int n=arr.length;
         Stack<Integer> st= new Stack<>();

         for(int i=0;i<n;i++) {
             if(st.size()==0 || st.peek()!=arr[i])
                 st.push(arr[i]);
             else if (st.peek() == arr[i]) {
                 if (i==n-1 || arr[i] != arr[i + 1]) {
                     st.pop();
                 }
             }
         }

             int[] newArr = new int[st.size()];
             for (int j = st.size()-1; j>=0; j--) {
                 newArr[j] = st.pop();
             }
         return newArr;
    }
}
