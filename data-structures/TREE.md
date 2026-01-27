# Trees

> Definition

- It is the data structure which maintains the hierarchy in some order
- It can contain 0, 1 or 2 nodes
- It uses **Doubly Linked List** internally
- To parse the data, we use **recursion**

> Key Terms

- **Root Node**: A node whose in-degree is zero (OR) who has no ancestors
- **Lead Node**: A node whose out-degree is zero (OR) who has no descendants
- **Descendants**: All the node reachable from given node
- **Ancestors**: All the nodes used to reach given node from root node
- **Level of Node**: Number of edges used to reach a given node from root node
- **Height of Tree**: Max(levels) + 1

> Types

- Balance Trees - Trees with 0 to 2 nodes.
- UnBalanced Trees - Trees with more than 2 nodes

> Limitations

- No O(1) operations
- Unbalanced trees are not useful specially in terms of searching

## Binary Tree

- It is the tree which contains 0 to 2 nodes
- It contains 2 nodes termed as left and right node programmatically

## Binary Search Tree

- It is the tree which contains 0 (OR) 2 nodes
- It contains 2 nodes termed as left and right node

> Complexity

- insert: O(log n)
- delete: O(log n)
- lookup: O(log n)