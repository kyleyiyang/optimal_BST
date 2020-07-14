OPTIMAL-BST.p; q; n/
1 leteOE1 : : n C 1; 0 : : n, wOE1 : : n C 1; 0 : :n,
and rootOE1: : n;1: :n be new tables
2 for i D 1 to n C 1
3 eOEi; i  1 D qi1
4 wOEi; i  1 D qi1
5 for l D 1 to n
6 for i D 1 to n  l C 1
7 j D i C l  1
8 eOEi; j  D 1
9 wOEi; j  D wOEi; j  1 C pj C qj
10 for r D i to j
11 t D eOEi; r  1 C eOEr C 1; j  C wOEi; j 
12 if t < eOEi;j
13 eOEi; j  D t
14 rootOEi; j  D r
15 return e and root
