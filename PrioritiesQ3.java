import java.util.Comparator;
import java.util.PriorityQueue;

public class PrioritiesQ3 {
    static class Student implements Comparable<PrioritiesQ2.Student> { //overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(PrioritiesQ2.Student s2) {
            return this.rank - s2.rank;
        }

    }

    public static void main(String[] args) {
        PriorityQueue<PrioritiesQ2.Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new PrioritiesQ2.Student("a",1));
        pq.add(new PrioritiesQ2.Student("b",5));
        pq.add(new PrioritiesQ2.Student("d",10));
        pq.add(new PrioritiesQ2.Student("f",3));
        pq.add(new PrioritiesQ2.Student("e",18));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}

/*

e->18
d->10
b->5
f->3
a->1

 */
