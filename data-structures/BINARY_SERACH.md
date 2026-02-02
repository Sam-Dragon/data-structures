# Binary Search

> Definition

- It works on the **sorted** array
- It the process of finding the element by continuously breaking the array from middle

> Works

- first find the middle element
    - Check if the target meets the middle element, print and stop
    - Check if the target is less than middle element, move left with **low to mid - 1** and search
    - Check if the target is greater than middle element, move right with **mid + 1 to high** and search

> Limitations

-

> Complexity

- insert: O(log n)
- delete: O(log n)
- lookup: O(log n)