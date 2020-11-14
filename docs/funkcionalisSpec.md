# Funkcionális Specifikáció
### 1. Használati esetek

Számos fontos pontban már érveltünk a követelményspecifikációban az új rendszer mellett.
Mivel maga tulajdonos fogja csak ezt látni ezért számára lesznek fontosak ezek a használati esetek.

   * Egy filmről való név lekérdezés során.
   
   * Egy filmről való kategória lekérdezés során.
   
   * Egy adott évben lévő összes film lekérdezése során.
   
   * Egy adott film kivan-e kölcsönözve vagy van-e szabad darab.
   
   * Egy adott film összes példányának a számáról való lekérdezés során.
   
   * Egy adott film kölcsönözhető példányainak számáról való lekérdezés során.
   
   * Ha egy film kivan kölcsönözve akkor megtudjuk nézni, hogy ki kölcsönözte ki egy telefonszám alapján.
   
   * Meglehessen nézni, hogy milyen értékelést kapott az adott film.


### 2. Jelenlegi helyzet
A régi papír alapú adatrögzítést szeretnénk egy újabb, korszerűbb megoldásra
váltani, mivel ez a tárolási mód régebben is bebizonyította, hogy manapság
már nem elég biztonságos. Bármikor eltűnhet, elázhat, így az adatok elvesztése
miatt kárt okozva annak az üzletnek, ahol az adatrögzítésnek csak ezt
az egyetlen fajtáját alkalmazzák. Egy idő után, ha túl sok adatot kell
tárolni az egész követhetetlenné válhat, mivel lehetetlen minden adatot
papíron visszakövetni, és az anyagi költségek is túl magasra nőhetnek.
A környezetünkben is elkezdődött az elmúlt időben a papíron történő 
tárolási mód leváltása, intenetes változatra. Így merült fel az igény,
hogy elkészüljön minél hamarabb az internetes változat.
- Jelenleg alkalmazott lehetőségek papíron:

   * Boltban elérhető film neveinek tárolása
   
   * Adott filmből a boltban elérhető mennyiség tárolása
   
   * Filmet kivevő személy adatainak tárolása
   
   * Filmek elérhetőségének tárolása
   
### 3. Jelenlegi üzleti folyamatok modellje

A barátunk jelenlegi boltja igencsak széleskörű választékot biztosít filmek terén, viszont az adminisztratív munka hagy némi elégedetlenséget.
A nemrég bekövetkezett csőtörésből adodó gondok is mutatják, hogy a jelenlegi felállás nem túl korszerű és igényes.
A jelenlegi üzleti folyamatok igencsak átlagos a konkurens cégekhez képest.
Sajnos külső okokból származó bajok még jobbana eltudják rontani a bolt hírnevét.

   * Papír alapú adminisztratív munka.
   
   * Boltban történő film kölcsönzés.
   
   * Időigényes film kölcsönzés.
   
   * Esetleges elírásból adodó késleltetési idő.
   
   * Időigényes film keresés.
   
   * Szinte lehetetlenség évszám szerinti keresés.
   
   * Korszerű technológia nélküli munka.
    
### 4. Igényelt üzleti folyamatok modellje

Maga az ötlet azért vetődött fel mivel egy szerencsétlenség miatt elveszett elég sok fajta dokumentáció ami késöbbi gondokhoz vezethet, tegyük fel pénzbeli kiesés vagy akár rossz hírnév a bolt számára.
Egy egyszerű, letisztult rendszer kialakítása a kérelem aminek több fajta funkciót kell tartalmaznia.
Az esetleges hibákat megelőzve a programnak kitünően kell futnia.
Magának az interfésznek átláthatónak kell lennie és törekedni kell az egyszerűségre.
Lehetőleg minél jobban testreszabható legyen maga a rendszer.
A szem kimélése érdekében a háttér színek és maga a kinézet legyen szemkimélő.
A rendszerben az alábbi dolgokat lehessen csinálni

   * Keresés névre, kategóriára illetve kiadásu évszámra is.
   
   * Hány darab film van összesen az adott kérésből.
   
   * Hány darab elérhető film van az adott kérésből.
   
   * A lefoglalt filmekhez legyen elérhető egy azonosító, név, kategória, értékelés, megjelenés éve.
   
   
Maga a felület böngészőből legyen elérhető.
Adattárolására kiválló legyen.
### 5. Képernyőtervek
A kliens számára egy megfelelő, szemkímélő designt próbálunk elkészíteni,
melyet könnyű használni, megjelenése igényes és modern. Ehhez a Bootstrapet
fogjuk felhasználni, mely letisztult designt biztosít, és emellé rengeteg
fontos és hasznos felhasználói eszköz megvalósítását egyszerűsíti. Az oldal
alapja egy főmenű. Jelenleg öt fő képernyő van tervbe véve: 

* Főoldal: Itt az elérhető funkciókat fogjuk bővebben kifejteni.

* Elérhető filmek: Az elérhető filmek kategóriában lesz film azonosító,
név, kategória, értékelés és a film megjelenésének éve..

* Kategóriák: A kategóriáknál a hozzáadott kategóriák neve szerepel.

* Kölcsönzés: A kölcsönzésnél a kölcsönző neve, az adatbázisból kiválasztva és
a film neve, az adatbázisból kiválasztva.

* Személyek: A személyeknél látható dolgok a név, telefonszám, város, adószám, nem
és a születési év.

A képernyők háttere inkább sötét jellegű lesz. Az oldal reszponzív
megjelenésű lesz, a felhasználó szeme előtt mindig csak a fontos információ
lesz megtalálható.