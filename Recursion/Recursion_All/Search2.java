package Recursion;

import java.util.ArrayList;
import java.util.List;

class Search2 {
    public static void main(String s[]){
        int arr[]={1,2,2,5,3,4,5,6,1,2,3,3,3,3};
        int val=3;
        System.out.println(mujheDhundhkeDikhao(arr,val,0));
    }

    static int mujheDhundhkeDikhao(int arr[],int val, int index){
        if(arr[index]==val)
            return index;

        return mujheDhundhkeDikhao(arr,val,index+1);
    }
}

