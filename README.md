# Heaps

Heap is a special data structure in java this ds can be classified as a complete binary tree and all node are arranged in respective order.

two types of heap
1. max heap:- In a Max-Heap the root node key is the greatest of all the keys in the heap. It should be ensured that the same property is true for all the subtrees in the heap recursively.
2. min heap:-In the case of a Min-Heap, the root node key is the smallest or minimum among all the other keys present in the heap. As in the Max heap, this property should be recursively true in all the other subtrees in the heap.


A heap data structure can be used in the following areas:

Heaps are mostly used to implement Priority Queues.
Especially min-heap can be used to determine the shortest paths between the vertices in a Graph.
As already mentioned, the heap data structure is a complete binary tree that satisfies the heap property for the root and the children. This heap is also called a binary heap.


Binary Heap
A binary heap fulfills the below properties:

A binary heap is a complete binary tree. In a complete binary tree, all the levels except the last level are completely filled. At the last level, the keys are as far as left as possible.
It satisfies the heap property. The binary heap can be max or min-heap depending on the heap property it satisfies.
A binary heap is normally represented as an Array. As it is a complete binary tree, it can easily be represented as an array. Thus in an array representation of a binary heap, the root element will be A[0] where A is the array used to represent the binary heap.

So in general for any ith node in the binary heap array representation, A[i], we can represent the indices of other nodes as shown below.

Heap is not implemented as a class because it's take too much time (o(n)+extra time)

node index=i
left child=2i+1
right child=2i+2
