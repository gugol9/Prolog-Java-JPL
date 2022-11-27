choroby(achadlazja).
choroby(glejak_nerwu_wzrokowego).
choroby(ebola).
choroby(goraczka_okopowa).

choroba(achadlazja,zaburzenia_polykania,zgaga,przewlekly_kaszel, krztuszenie_sie).
choroba(glejak_nerwu_wzrokowego,wytrzeszcz_galki_ocznej,zgaga,zgaga,uposledzenie_widzenia).
choroba(ebola, bola_glowy, bol_miesni, bol_stawow, krwawa_biegunka).
choroba(goraczka_okopowa, goraczka, bol_glowy, sztywnosckarku, swiatlowstret).

diagnoza(X,A,B,C,D):-
            read(X),nl,
    choroba(X,A,B,C,D).