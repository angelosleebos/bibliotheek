## Getting Started

Opdracht 1 - Bibliotheek
Angelo Sleebos

feedback docent
!
Terugkoppeling op laatste poging
Datum:05-10-2022 17:03
Door:Arjan Kok
Je uitwerking is nog steeds onvoldoende. Er moet nog heel wat worden verbeterd.

Functionaliteit

Methode printAuteurs zonder parameters ontbreekt nog steeds.
Methode telExemplaren heeft een verkeer terugkeertype. Wanneer een getal gevraagd wordt is het niet logisch om een String terug te geven.
Het toevoegen van boeken gaat niet altijd goed door een fout in de implementatie.
Het tellen van exemplaren gaat niet goed omdat je je niet houdt aan de beschrijving daarvan in de opdracht.
Implementatie


-----  Twee verschillende uitkomsten

Gemeentelijke bibliotheek Heerlen is geopend!

nieuw exemplaar -> Nooit meer slapen van Willem Frederik Hermans in het Nederlands
kopie van exemplaar -> Nooit meer slapen van Willem Frederik Hermans in het Nederlands
kopie van exemplaar -> Nooit meer slapen van Willem Frederik Hermans in het Nederlands
nieuw exemplaar -> Onder professoren van Willem Frederik Hermans in het Nederlands
nieuw exemplaar -> De buitenvrouw van Joost Zwagerman in het Nederlands
kopie van exemplaar -> De buitenvrouw van Joost Zwagerman in het Nederlands
nieuw exemplaar -> Het laatste bevel van Pieter Aspe in het Nederlands
nieuw exemplaar -> Einstein van Walter Isaacson in het Engels
kopie van exemplaar -> Einstein van Walter Isaacson in het Engels
kopie van exemplaar -> De buitenvrouw van Joost Zwagerman in het Nederlands

Het assortiment van de bibliotheek bestaat uit:
exemplaar -> Nooit meer slapen van Willem Frederik Hermans in het Nederlands
exemplaar -> Nooit meer slapen van Willem Frederik Hermans in het Nederlands
exemplaar -> Nooit meer slapen van Willem Frederik Hermans in het Nederlands
exemplaar -> Onder professoren van Willem Frederik Hermans in het Nederlands
Willem Frederik Hermans
Willem Frederik Hermans
Joost Zwagerman
Joost Zwagerman
Joost Zwagerman

Er zijn 3 exemplaren van Nooit meer slapen van Willem Frederik Hermans in het Nederlands
Er zijn 2 exemplaren van Einstein van Walter Isaacson in het Engels
Er zijn 0 exemplaren van Einstein van Walter Isaacson in het Nederlands
PS C:\Users\MyAdmin\Documents\java-projects\inleveren>  c:; cd 'c:\Users\MyAdmin\Documents\java-projects\inleveren'; & 'C:\Program Files\Eclipse Adoptium\jdk-17.0.4.101-hotspot\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '@C:\Users\MyAdmin\AppData\Local\Temp\cp_60j8qvuas4f64y30a41mbfrxo.argfile' 'bibliotheek.Biblio' 
Gemeentelijke bibliotheek Heerlen is geopend!

nieuw exemplaar -> Nooit meer slapen van Willem Frederik Hermans in het Nederlands
kopie van exemplaar -> Nooit meer slapen van Willem Frederik Hermans in het Nederlands
kopie van exemplaar -> Nooit meer slapen van Willem Frederik Hermans in het Nederlands
nieuw exemplaar -> Onder professoren van Willem Frederik Hermans in het Nederlands
nieuw exemplaar -> De buitenvrouw van Joost Zwagerman in het Nederlands
kopie van exemplaar -> De buitenvrouw van Joost Zwagerman in het Nederlands
nieuw exemplaar -> Het laatste bevel van Pieter Aspe in het Nederlands
nieuw exemplaar -> Einstein van Walter Isaacson in het Engels
kopie van exemplaar -> Einstein van Walter Isaacson in het Engels
kopie van exemplaar -> De buitenvrouw van Joost Zwagerman in het Nederlands

Het assortiment van de bibliotheek bestaat uit:
exemplaar -> Nooit meer slapen van Willem Frederik Hermans in het Nederlands
exemplaar -> Nooit meer slapen van Willem Frederik Hermans in het Nederlands
exemplaar -> Nooit meer slapen van Willem Frederik Hermans in het Nederlands
exemplaar -> Onder professoren van Willem Frederik Hermans in het Nederlands
exemplaar -> De buitenvrouw van Joost Zwagerman in het Nederlands
exemplaar -> De buitenvrouw van Joost Zwagerman in het Nederlands
exemplaar -> Het laatste bevel van Pieter Aspe in het Nederlands
exemplaar -> Einstein van Walter Isaacson in het Engels
exemplaar -> Einstein van Walter Isaacson in het Engels
exemplaar -> De buitenvrouw van Joost Zwagerman in het Nederlands

De exemplaren in het Engels zijn:
exemplaar -> Einstein van Walter Isaacson in het Engels
exemplaar -> Einstein van Walter Isaacson in het Engels

Auteurs zonder een prijs zijn:
Pieter Aspe
Walter Isaacson
Walter Isaacson

Auteurs met een prijs zijn:
Willem Frederik Hermans
Willem Frederik Hermans
Willem Frederik Hermans
Willem Frederik Hermans
Joost Zwagerman
Joost Zwagerman
Joost Zwagerman

Er zijn 3 exemplaren van Nooit meer slapen van Willem Frederik Hermans in het Nederlands
Er zijn 2 exemplaren van Einstein van Walter Isaacson in het Engels
Er zijn 0 exemplaren van Einstein van Walter Isaacson in het Nederlands

Geef methoden/constructors en attributen altijd een toegangsspecificatie (private of public). Maak daarbij de attributen altijd private (information hiding) tenzij er een goede reden is dat niet te doen (maar die is er niet bij deze opdracht). Maak functionele methoden public en hulpmethoden private.
Gebruik geen verpakkingsklassen wanneer je gewoon een primitief type kunt gebruiken.
Probeer dubbele code te zo veel mogelijk te voorkomen. Ik zie nu de code om de gegevens van een boek te printen op 6 verschillende plaatsen staan (en in 3 verschillende klassen). Dat is vervelend wanneer besloten wordt de layout daarvan te veranderen. Dat moet je dan ook op verschillende plaatsen doen.
Je maakt nog een aantal basisfouten (die je echt zelf moet vinden; het zijn zaken die zijn besproken in de eerste bijeenkomsten).
Javadoc

Javadoc die de verantwoordelijkheid van de klasse beschrijft ontbreekt overal.
Niet alle constructors zijn voorzien van Javadoc.
De Javadoc bij de methoden is over het algemeen goed.
Testen

Zet testcode altijd in een eigen package.
Heel mager. Denk ook eens aan een lege bibliotheek, een bibliotheek waarin verschillende boeken voorkomen, een boek dat niet voorkomt in een gevulde bibliotheek, een bibliotheek waar de exemplaren van hetzelfde boek niet allemaal achter elkaar staan, …
Dit was de tweede poging voor deze opdracht. Je hebt nu nog één kans om deze opdracht voldoende te maken. Dus zorg ervoor dat het goed werkt, en dat je inzending volledig is. Kijk of je alle  aanwijzingen hebt opgevolgd. Controleer dit goed voor je het inlevert. Is de volgende inzending nog steeds onvoldoende, dan kun je voor deze opdracht geen voldoende meer halen. Dat betekent ook dat je het practicum OP dit jaar niet meer kunt halen, en daarmee de hele cursus Premaster programmeertechnieken 1 niet meer succesvol kunt afronden. Dat zou betekenen dat je je volgend jaar opnieuw moet inschrijven wil je de premaster alsnog halen.

