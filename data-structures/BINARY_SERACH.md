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

- It requires array to be sorted for processing

> Complexity

- insert: O(log n)
- delete: O(log n)
- lookup: O(log n)

## Approach

- Try to solve binary search iteratively
    - If asked explicitly to use recursion

- Binary Search + Recursion used in infinite array search, Binary Search Tree [BST]

## PROGRAM BREAKDOWN LOGIC

- Terminal Condition
    - Only focus to break out the recursion. [Don't add extra logic here]
- Main Condition
    - Ensure any logic to reach to the result must be done here
    - Be it lowest, highest, first non-negative number,
- Traversal Condition
    - Only apply traversals here, [Note: We can change searching mid to mid + 1 or mid -1]