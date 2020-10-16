# Funkcionális Specifikáció
### 1. Használati esetek

Számos fontos pontban már érveltünk a követelményspecifikációban az új rendszer mellett.

* Az elsődleges érv, amely bizonyítja azt, hogy a programunk a jobb opció az átláthatóság.
Ezzel a programmal sokkal könnyebben tudjuk a kölcsönzéseket.
Most már nem is szükséges elmenni az üzlethelyhez, hiszen weben keresztül
az ügyfél megtekintheti, hogy elérhető a film vagy nem.
Ez mind az ügyfélnek, mind az üzletvezetőnek kényelmesebb.

* Üzletben való keresgélés helyett most már interneten lehet név alapján keresni.
Emellett, ha egy ügyfél nem biztos, hogy milyen filmet akar kölcsönözni, bérelni
most már könnyebben találhat magának, hiszen kereshet a filmkategóriájára, megjelenési évére.

* Az üzletvezető sokkal könnyebben tudja már, hogy egy ügyfél milyen
filmet bérel, hiszen ekkor mindig egy telefonszámot párosítunk hozzá.
Azt is érdemes kiemelni, hogy most már könnyebben le tudja olvasni azt, 
hogy egy adott filmből mennyi példánnyal rendelkezik abban az adott időpontban.

* Fontos az számunkra, hogy a program átlatható legyen minden egyes felhasználónak
,illetve az is fontos, hogy az alkalmazás sötét témájú, hiszen ez most a jelenlegi trend. 

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
   
   * Hány darab elérhető könyv van az adott kérésből.
   
   * A lefoglalt filmekhez legyen elérhető egy azonosító, telefonszám aki kikölcsönözte illetve egy opció miszerint kivan-e kölcsönözve vagy nincs.
   
Maga a felület böngészőből legyen elérhető.
Adattárolására kiválló legyen.
### 5. Képernyőtervek
A kliens számára egy megfelelő, szemkímélő designt próbálunk elkészíteni,
melyet könnyű használni, megjelenése igényes és modern. Ehhez a Bootstrapet
fogjuk felhasználni, mely letisztult designt biztosít, és emellé rengeteg
fontos és hasznos felhasználói eszköz megvalósítását egyszerűsíti. Az oldal
alapja egy főmenü, illetve a menü mellett helyezkedik el a fő tartalom,
a választott menüpontnak megfelelően. Jelenleg három fő képernyő és menüpont
van tervbe véve: 

* Főoldal: Itt az elérhető funkciókat fogjuk bővebben kifejteni.

* Elérhető filmek: Az elérhető filmek kategória és megjelenési dátum
alapján kereshetőek ki az oldalon.

* Kikölcsönzött filmek: Minden kikölcsönzött film rendelkezik egy saját
id-val, a kikölcsönöztt fél telefonszámával és egy checkbox funkcióval,
ahol jelölhető, hogy a film éppen ki van e még kölcsönözve vagy már 
visszhozták. 

A képernyők háttere inkább sötét jellegű lesz. Lehetséges, hogy véletlenszerű
képek lesznek kiválasztva az unsplash.com oldalról. Az oldal reszponzív
megjelenésű lesz, a felhasználó szeme előtt mindig csak a fontos információ
lesz megtalálható.