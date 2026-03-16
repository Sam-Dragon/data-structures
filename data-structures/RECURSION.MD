# Recursion

> Definition

- It is the function which calls itself
- It uses stack i.e. data will be starting from **LIFO** direction
- It works in **reverse** direction

> Condition

- It must have **terminal condition**
- Function must call itself with args, **pass args for collections**

> Variables

- return type -> use it specially in case of aggregation, total, sum
- arguments -> use it in-case of additional variables such as target, count, start, end
- local variables -> use it when it is just required for manipulation

> Complexity

- Time - O(2 ^ n)
- Space - O(n)

> Use cases

- trees
- file parsing
- Binary Search
- Binary Search Tree

> Limitations

- Missing terminal condition can result in overflow of memory

> **Understanding**

- Generally, anything before recursive method call is stored on stack &
- anything after the recursive method call is called unwinding of stack

Note:

- if you want to add the multiple elements using local variables from stack,
  use collections and its effective methods such as addAll()