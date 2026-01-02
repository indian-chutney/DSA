# Dynamic Programming:

It is used to avoid repeated calculation. The dp problems are usually solved by recursion, but with dp we do recursion and store repeated states in lookup table. This is top-down dynamic programming with memoization.

Classic example is fibonacci problem. It is usually done by recursion and it takes O(2^n) time.
f(n) = f(n - 1).f(n - 2).
by recognizing that we only need O(n) subproblems to solve, i.e we only need to know f(n - 1), f(n -2), ..., f(0). if we can store them in lookup table we don't have to compute them exponentially.

Bottom-up Dynamic Programming is one more approach to solve a dp problem. we start from base values and then keep on building up to the desired values with this base values.
this can sometimes help us reduce usage of memory, from O(n) we can achieve O(1).
In fibonacci we only need last 3 values, so we can store only last 3 values and do % M for further calculation.

The crux of dynamic programming is don't repeat the work you've done before.
