# ffm-java-23-1-Mocking

Aufgabe: Mocking in Unit Tests

## In dieser Aufgabe werdet ihr das Gelernte anwenden, um Unit-Tests für einen Service zu schreiben.


    Erstelle Unit-Tests für die

        findAllProducts Methode,

        findById Methode,

        updateProduct Methode,

        deleteProductMethode
        des ProductService. Verwendet dabei Mockito, um die Abhängigkeit zum ProductRepository zu mocken.



## Aufgabe Id-Generierung


    Erstelle eine IdService-Klasse, in der du eine Methode bereitstellst um eine zufällige Id zu generieren.

    Nutze diese Klasse im ProductService um die Id für ein neues Produkt zu erstellen. (Nutze Dependency Injection)

    Erstelle einen Unit-Test für die addProduct Methode aus dem ProductService, mocke dazu auch den IdService.


Bonus Aufgabe 


    Prüfe in jedem Unit-Test das auch nur einmal die Methode von deinem Mock aufgerufen wurde und auch sonst keine.


## Bonus Aufgabe Static Mocking

Erstelle einen Unit-Test für die Klasse IdService


    Recherchiere dazu wie du den statischen Methoden-Aufrufe UUID.randomUUID()mocken kannst.



## Bonus Aufgabe Datum/ArguementCaptor


    Erweiter deine Product Klasse um den Zeitpunkt der Erstellung.

    Nutze im ProductService die Methode addProduct, um den aktuellen Zeitpunk festzustellen und mit abzuspeichern.

    Passe deinen Unit-Test an und prüfe das der Erstellzeitpunkt nach dem 01.01.2020 und vor 21Uhr ist. Nutze dafür den ArgumentCaptor von Mockito Li


## Bonus Aufgabe Random Product


    Erstelle im ProductService eine Methode public void setSeed(long seed)

    Erstelle eine Methode getRandomProduct im ProductService, die einen Seed nutzt um ein zufälliges Produkt zurück zu geben.

    Schreibe für diese Methode einen Unit-Test, setzte dazu den Seed auf einen festen Wert damit jedes mal das geiche Produkt ausgewählt wird.


## Bonus Aufgabe Ohne Mockito


    Schreibe alle deine Tests ohne Mockito.


