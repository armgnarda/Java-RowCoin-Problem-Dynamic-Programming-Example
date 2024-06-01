# Java-RowCoin-Problem-Dynamic-Programming-Example
Coin-row problem There is a row of n coins whose values are some positive integers c1, c2,...,cn, not necessarily distinct. The goal is to pick up the maximum amount of money subject to the constraint that no two coins adjacent in the initial row can be picked up.

Let F (n) be the maximum amount that can be picked up from the row of n
coins. To derive a recurrence for F (n), we partition all the allowed coin selections into two groups: those that include the last coin and those without it. The largest amount we can get from the first group is equal to cn + F (n − 2)—the value of the nth coin plus the maximum amount we can pick up from the first n − 2 coins. The maximum amount we can get from the second group is equal to F (n − 1) by the definition of F (n). Thus, we have the following recurrence subject to the obvious initial conditions:

pseudo:

ALGORITHM CoinRow(C[1..n]) {
  F[0]← 0; F[1]← C[1]
  for i ← 2 to n do
    F[i]← max(C[i] + F[i − 2], F[i − 1])
  return F[n]
}
