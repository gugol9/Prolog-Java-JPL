choroby(achadlazja).
choroby(glejak_nerwu_wzrokowego).
choroby(ebola).
choroby(goraczka_okopowa).
choroby(swiatlowstret).
choroby(depresja).
choroby(schizofrenia).
choroby(anoreksja).

choroba(achadlazja,zaburzenia_polykania,zgaga,przewlekly_kaszel, krztuszenie_sie).
choroba(glejak_nerwu_wzrokowego,wytrzeszcz_galki_ocznej,zgaga,zgaga,uposledzenie_widzenia).
choroba(ebola, bola_glowy, bol_miesni, bol_stawow, krwawa_biegunka).
choroba(goraczka_okopowa, goraczka, bol_glowy, sztywnosckarku, swiatlowstret).
choroba(swiatlowstret,zapalenie_spojowek, zapalenie_wnetrza_galki_ocznej, bezteczowkowosc, bezsoczewkowosc).
choroba(depresja, zaburzenia_snu, spadek_libido, zmniejszenie_lub_utrata_apetytu, dobowe_wahanie_samopoczucia).
choroba(schizofrenia, halucynacje, urojenia_ksobne, anhedonia, awolicja).
choroba(anoreksja, obnizenie_nastroju, poczucie_braku_sensu_zycia, mysli_samobojcze, objawy_myslenia_obsesyjnego).

diagnoza(X,A,B,C,D):-
            read(X),nl,
    choroba(X,A,B,C,D).