# Funkcionális Specifikáció
### 1. Használati esetek
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
### 4. Igényelt üzleti folyamatok
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