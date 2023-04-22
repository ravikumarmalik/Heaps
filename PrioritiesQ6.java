

import java.util.*;
public class PrioritiesQ6 {//sliding window
    public static class Pair implements Comparable<Pair> {
        int value;
        int index;

        public Pair(int value, int index){
            this.value=value;
            this.index=index;
        }

        @Override
        public int compareTo(Pair p2) {
            //ascending order
            //return this.value- p2.value;
            //descending order
            return p2.value - this.value;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int result[] = new int[arr.length - k+1]; //n-k+1

        PriorityQueue<Pair> pq= new PriorityQueue<>();

        //1st window
        for (int i=0; i<k; i++){
            pq.add(new Pair(arr[i], i));
        }

        result[0]=pq.peek().value;
        for (int i=k; i<arr.length;i++){
            while (pq.size()>0 && pq.peek().index <= (i-k)){
                pq.remove();
            }


            pq.add(new Pair(arr[i], i));
            result[i-k+1]=pq.peek().value;
        }

        //print result
        for (int i=0; i<result.length;i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();
    }
}

/*

3,3,5,5,6,7

 */
