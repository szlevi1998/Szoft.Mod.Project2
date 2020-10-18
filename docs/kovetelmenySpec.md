# Követelmény Specifikáció

### 1. Jelenlegi rendszer leírása

Jelenleg a baráti társaságunk egyik legjobb közös barátja egy saját kisboltot
tart fent a többi hozzá hasonló filmimádó ember számára, ahol kis füzetekben
van felírva a boltjában az összes elérhető film kategória és hozzájuk a
nevek felsorolva. A boltban a cd-n lévő filmeket helyben is meg lehet tekiteni,
vagy akár kikölcsönözni és később visszahozni. Minden kikölcsönzött cd-hez
egy kis azonosítot és telefonszámot rendel, hogy számon tudja tartani,
hogy hány darab van kiadva és kinél kell keresni, ha nem hoznák vissza.
Ezeket az adminisztrációs feladatokat mind papíron végzi, ahol elég nehéz
visszakeresni és számontartani, hogy melyik cd hiányzik és nem tudja már
kiadni másnak. Mivel régebben egy csőtörés miatt teljesen elázott a füzet
amiben tárolta az adatokat, így azon embereket, kik elfelejtették visszahozni
vagy eltulajdonították a cd-ket, nem tudta elérni, ezáltal abban az évben
csődközelbe került. Mivel ismer minket, hogy milyen jól tudunk csapatban és külön
külön is dolgozni, ezért mivel időszűkében van, négyönket megbízta azzal
a feladattal, hogy készítsünk neki egy rendszert, ahol el tudja tárolni
és nyomon tudja követni mindazt, amit papíron vezetett eddig.

### 2. Vágyálomrendszer leírása

A régi papíros felület helyett szeretnénk egy új, már a mai kornak megfelelő
internetes, böngészőből elérhető tárolási és lekérdezési lehetőséget nyújtani
a gyerekkori jó barátunknak.

* Egy olyan, böngészőből elérhető felület, ami jól kinéző és könnyen kezelhető.

* Az oldal inkább a sötét színeket helyezi előtérbe a szem kímélés érdekében.

* Nem regisztárcióhoz kötött a használata, mivel csak egy személy fogja használni.

* Az oldalon elérhető funkciók jól látható helyen helyezkednek el, már az
oldal betöltődése után minden fő funkciót láthatunk, ne legyenek alpontok.

* A főoldalon az oldalon elérhető összes opcióról egy rövid leírás legyen látható.

* Képes kategóriára, névre és évszámra keresni.

* Évszámra keresés esetén az abban az évben megjelenő összes filmet kiadja.
Ez a keresés kategóriákon belül külön érhető el.

* Kategória esetén az összes elérhető és abban a kategóriában szereplő filmet kiadja a rendszer.

* Névre kereséskor csak azonos egyezőség esetén adja ki a filmet, ha elérhető.

* Minden filmből bizonyos mennyiség áll rendelkezésre, a rendszernek jeleznie
kell, hogy hány darab érhető el összesen, és hány darab van még a boltban
ami kikölcsönzésre vár.

* Képesek vagyunk minden lefoglalt filmez megadni egy azonosítót, egy
telefonszámot és egy állítható opciót, hogy a filmet kikölcsönözték
vagy éppen a boltban van.

### 3. Jelenlegi üzleti folyamatok modellje

* A jelenlegi papíros megoldással számos probléma van,ezek közül a legnagyobb az adatok tárolása.
A felhasználók adatait nagyon könnyen elveszthetjük a jelenlegi helyzettel.
Egyre több és több ember csatlakozik, ezeknek a személyeknek az adatait tárolni,
illetve átlátni egyre nehezebb. 

* A kikölcsönzött filmeknek a nyílvántartása sokkal bonyolultabb.
Komoly probléma az is, hogy az új megjelenő filmeknél az érdeklődés miatt,
sokan egyszerre jelennek meg, ezzel újabb lehetőség van a hibázásra.

* Komoly probléma az is, hogy az adatok nem csak, hogy könnyen elveszíthető,
de még szétszórtan is vannak elhelyezve. Ezzel a mostani szituáció eléggé nehezen
átlátható és mindenféleképpen bonyolultan vezethető. Emelett felhozható ez ellen a rendszer ellen is
az, hogy nem tudunk szűrni adatokat, nem tudunk csoportosítani csak egy bizonyos módon.

* Az átláthatóság hiánya miatt, ez a jelenlegi rendszer nem megfelelő és nem hatékony.
Az új rendszerrel, amelyet mi tervezünk sokkal jobban dolgozhatunk.
Ezzel a rendszer az ügyfél interneten keresztül megnézheti, hogy kölcsönözhető egy film vagy nem.
Abban az esetben, ha a felhasználó egy olyan filmet kölcsönöz ki amely elérhető,
akkor a rendszer tárolja, hogy ki milyen filmet kölcsönzött ki.

* Ezzel a rendszerrel sokkal jobban, gyorsabban lehet adatokat leszűrni. Mivel
gyakorlatilag egy kattintással lehet csoportosítani hogy, az adott film
elérhető vagy sem. Fontos kiemelni, hogy a tulaj, már az adott filmre való kattintással
meg tudja jeleníteni a bérelt ügyfeleknek a telefonszámát, ezzel is javítva az átláthatóságot.

* A tulajnak emellett javulni fog a munkamorálja is, hiszen ezzel az 
alkalmazással, most már az adatait csoportosítja tudja lekérdezni, illetve
a sötét megjelenítési témával nem fogja a szemét sem károsítani feleslegesen. 
   

### 4. Igényelt üzleti folyamatok modellje

* Böngészőből elérhető rendszer.
* A felhasználók számára átlátható, könnyen kezelhető.
* Megbízható, tartós adattárolás.
* Egyszerű és gyors adatbevitel.
* Nyilvántartás, egyszerű lekérdezések, nyomonkövethetőség.

### 5. Követelménylista

* Egy olyan rendszer, amelyben a filmek adatai tárolva vannak és lekérdezhetőek.
* A felhasználó a film nevére, típusára, megjelenési évére tudjon rákeresni.
* A rendszerben a felhasználó kikölcsönözheti kedvenc filmeit.
* A rendszerben aki kibérel egy filmet annak a telefonszámát tárolni kell.
* A rendszer feltünteti, hogy egy film elérhető vagy sem.
* A program egyszerűen kezelhető letisztult és átlátható legyen.
   