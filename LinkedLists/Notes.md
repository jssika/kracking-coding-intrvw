# Linked list in Java

*  LinkedList is part of Collections framework from java.util package
*  Dynamic arrays
* 
* Linear data structure where the elements are not stored in contiguous locations and every element is a separate object with a data part and address part. 
* The elements are linked using pointers and addresses. 
* Each element is known as a node. 
* Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays. 
* It also has a few disadvantages like the nodes cannot be accessed directly instead we need to start from the head and follow through the link to reach a node we wish to access.


Algorithm           ArrayList   LinkedList
seek front            O(1)         O(1)
seek back             O(1)         O(1)
seek to index         O(1)         O(N)
insert at front       O(N)         O(1)
insert at back        O(1)         O(1)
insert after an item  O(N)         O(1)