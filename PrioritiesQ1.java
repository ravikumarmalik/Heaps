import java.util.Comparator;
import java.util.PriorityQueue;
public class PrioritiesQ1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(5);//O(logn)
        pq.add(6);
        pq.add(2);
        pq.add(1);

        while (!pq.isEmpty()){
            System.out.println(pq.peek());//O(1)
            pq.remove();//O(logn)
        }
    }
}

/*

6
5
2
1


 */
