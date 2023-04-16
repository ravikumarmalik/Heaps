
import java.util.PriorityQueue;
public class PrioritiesQ2 {

    static class Student implements Comparable<Student> { //overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }

    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("a",1));
        pq.add(new Student("b",5));
        pq.add(new Student("d",10));
        pq.add(new Student("f",3));
        pq.add(new Student("e",18));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}

/*

a->1
f->3
b->5
d->10
e->18

 */


