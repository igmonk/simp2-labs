gt(apple, plum).
gt(avocado, plum).
gt(papaya, avocado).
gt(durian, papaya).
gt(plum, cherry).

isGreater(X, Y) :- gt(X, Y).
isGreater(X, Y) :-
    gt(X, Z),
    gt(Z, Y).
