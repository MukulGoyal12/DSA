//GFG QUESTION: First negative integer in every window of size k

package Stack_and_Queue.Queue.Questions;

import java.util.*;
import java.lang.*;
import java.io.*;

public class FirstNegativeIntegerGFG {

    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());

            FirstNegativeIntegerGFG obj = new FirstNegativeIntegerGFG();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;

            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);

        }
    }

    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        long[] res= new long[N-K+1];
        Queue<Integer> q= new LinkedList<>();

        for(int i=0;i<N;i++){
            if(A[i]<0)
                q.add(i);
        }

        for(int i=0;i<N-K+1;i++){
            if(q.size()>0 && q.peek()<i) q.remove();

            if(q.size()>0 && q.peek()<=i+K-1)
                res[i]=A[q.peek()];
            else if(q.size()==0)
                res[i]=0;
            else
                res[i]=0;
        }
        return res;
    }

}
