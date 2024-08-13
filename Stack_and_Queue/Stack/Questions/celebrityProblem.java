package Stack_and_Queue.Stack.Questions;

import java.io.*;
import java.util.*;

public class celebrityProblem {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new celebrityProblem().celebrity(M,N));
            t--;
        }
    }
    int celebrity(int M[][], int n)
    {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++)
            st.push(i);
        while(st.size()>1){
            int v1=st.pop();
            int v2=st.pop();
            if(M[v1][v2]==0) st.push(v1);
            else if(M[v2][v1]==0) st.push(v2);
        }
        if(st.size()==0) return -1;
        int potential=st.pop();
        for(int i=0;i<n;i++){
            if(M[potential][i]==1) return -1;
        }
        for(int i=0;i<n;i++){
            if(i==potential) continue;
            if(M[i][potential]==0) return-1;
        }

        return potential;
    }
}