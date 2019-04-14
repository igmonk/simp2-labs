tours(Ivanov, Petrov, Vase4kin) :-
    Ivanov = [Ivanov_destination, Ivanov_price],
    Petrov = [Petrov_destination, Petrov_price],
    Vase4kin = [Vase4kin_destination, Vase4kin_price],
    All = [Ivanov, Petrov, Vase4kin],
    permutation([turkey, italy, spain], [Ivanov_destination, Petrov_destination, Vase4kin_destination]),
    permutation([2000, 3000, 5000], [Ivanov_price, Petrov_price, Vase4kin_price]),
    Ivanov_destination \= turkey,
    Petrov_destination \= italy,
    member([turkey, TP], All),
    TP \= 5000,
    member([italy, IP], All),
    IP = 3000,
    Petrov_price \= 2000.
