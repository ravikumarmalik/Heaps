
import java.util.ArrayList;
import java.util.PriorityQueue;
public class PrioritiesQ4 {
    static class Heap {

        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {  //o(logn)
            //add at last index
            arr.add(data);

            int x = arr.size() - 1;//x is child index
            int parents = (x - 1) / 2;//parent index

            while (arr.get(x) < arr.get(parents)) {

                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(parents));
                arr.set(parents, temp);

                x=parents;
                parents=(x-1)/2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            int minIndx = i;

            if (left < arr.size() && arr.get(minIndx) > arr.get(left)) {
                minIndx = left;

            }
            if (right < arr.size() && arr.get(minIndx) > arr.get(right)) {
                minIndx = right;
            }
            if (minIndx != i) {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndx));
                arr.set(minIndx, temp);

                heapify(minIndx);
            }
        }


        public int remove() {
            int data = arr.get(0);

            //step1 swap 1st to last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step2 delete last
            arr.remove(arr.size()-1);

            //step3 heapify

            heapify(0);
            return data;

        }

        public boolean isEmpty(){
            return arr.size()==0;

        }
    }





    public static void main(String[] args) {

        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }

    }
}
/*

1
3
4
5


 */
