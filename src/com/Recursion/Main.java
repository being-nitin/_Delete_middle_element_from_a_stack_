package com.Recursion;
import java.util.*;
public class Main {

        // delete the middle element from a stack, and print the stack in reverse.
        public static void main(String[] args) {
            Stack<Integer> st=new Stack<Integer>();
            Scanner sc =new Scanner(System.in);
            int n =sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                // with putting the values in an array, pushing the value in a stack at the same time.
                st.push(arr[i]);
            }
            deletemid(st,st.size(),0);
            while(!st.empty())
            {
                int p=st.pop();
                System.out.print(p+" ");
            }
        }
        public static void deletemid(Stack<Integer> st, int n,int curr){
            if(st.empty() || curr==n)
            {
                return;
            }
            int x=st.pop();
            deletemid(st,n,curr+1);
            if(curr!=n/2)
                st.push(x);
        }
    }
