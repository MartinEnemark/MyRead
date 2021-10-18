Excel file PEP_listen er converteret til csv fil. Jeg har renset filen så den er nemmere at bruge. Jeg har fjernet whitespaces, Samt den første kolonne m.m.

Denne konvertering/rensning kan senere implementeres direkte i koden. 

Vi antager at vi står i mappen pep. Vi kan så læse filen ved hjælp af filereader: FileReader("PEP_listenNY.csv").

Koden er er i filen ReadInput.java som compiles ved: 

javac ReadInput.java


Her efter tilføjes to argumenter til når filen køres:
    1 : fulde navn (i stringklammer)
    2: fødselsdato i formatet : "20.03.1969"

det ser ud på følgende måde:
    
    java ReadInput "Garbi Schmidt" "20.03.1969"


Koden er ikke testet for bogstaver som æ,ø,å
Man skal angivve hele navnet - der bliver altså ikke tjekket for om der mangler et mellemnavn.
Og mange flere tests mangler selvfølgelig. 
Jeg har brugt ca. 3 timer og 30 min.
