# Rendszerterv

### 1. A rendszer célja.

A rendszer célja, hogy a régi elavult papíron való adattárolást egy
modernebb, már a mai kor adatbiztonsági szabályainak megfelelő változatra
váltsa le. Az új rendszer már interneten működő, böngészőből elérhető
lesz. A felhasználó így bárhol elérheti majd, ahol lesz internetkapcsolat.
A munka gyorsabb, hatékonyabb és átláthatóbb lesz, így rengeteg felesleges
időpazarlásról szabadítja meg a felhasználót, nem mellesleg a programnak a
költsége elenyésző lesz a korábbihoz képest.

### 2. A project tervezete.

### 3. Ütemterv.

### 3.1 Mérföldkövek

A program elkészítésének fő mérföldkövei:

#### 3.1.1. Sprint I.

- A Trelloban való regisztráció illetve a használatának elkezdése.
- A git repository elkészítése.
- A tagok git-re való regisztrációja és a projecthez való felvétele.
- A Követelémyspecifikáció elkészítése.
- A Funkcionális specifikáció elkészítése.
- A Rendszerterv elkészítése.

#### 3.1.2 Sprint II.

- A program elkészítésének megtervezése, felosztása.
- A program prototípusának elkészítése.
- A program tesztelése a minimálisan működő funkciókkal.
- A programnak a bemutatáshoz szükséges PPT elkészítése.

#### 3.1.3 Sprint III.

- A program adatbázisának elkészítése.
- A program controllerének elkészítése.
- A program tesztjeinek felállítása.
- Az adatbázis hozzákapcsolása a programhoz.
- A program fő tesztjeinek elvégzése.

#### 3.1.4 Sprint IV.

- A felhasználó visszajelzéseinek fogadása és áttekintése.
- Lehetséges hibák javítása.
- Plusz kisebb funkciók belehelyezése.
- A program biztonságának növelése.
- Átadás.

### 4. Üzleti szereplők.

A rendszer használatára való jogosultsága a tulajdonosnak lesz, jelen esetben a barátunknak.
Mindenfajta segítséget megadunk neki, hogy gördélékenyebben menjen a program használata.
Egy esetleges tulajdonos váltás esetén ez a jogosultság átruházható lesz, tehát kompatibilis a tulajdonos váltásra.

### 5. Követelmények.

### 6. Funkcionális terv.

* A program célja, hogy a kölcsönzési feladatokat átláthatóbbá és gyorsabbá tegyük.
A jelenlegi füzetes megoldás már nem naprakész és az alkalmazásunkkal ezt szereznénk lecserélni.
A jelenlegi funkciók mellett további funkciókat adunk hozzá.

* Az alábbi funkciók: 
    - Filmek elérhetőségének megjelenítése
    - Az elérhető filmeknek a mennyiségének megjelenítése 
    - Filmekre való keresés      
    - Filmekre keresés név,kategória,megjelenés éve alapján    
    - Filmek értékelésének kimutatása 
    - A jelenleg kikölcsönzött filmek kimutatása 
    - A kölcsönző ügyfélnek a telefonszámának megjelenítése
    - A kölcsönzés dátumának megjelenítése.
    
* Ezekkel a funkciókkal a kölcsönzés/bérlés mind az ügyfélnek mind a
 tulajnak sokkal kényelmesebbé válik. Keresés sokkal egyszerűbb,
 hiszen az ügyfélnek nem kell elmenni az üzlethez, hogy megtudja,
 az adott film elérhető vagy nem. Emellett a pontozási rendszerrel
 ,a kategóriákkal, az ügyfél könnyen találhat magának egy filmet amit
 kikölcsönözhet, bérelhet, hiszen így van valamilyen viszonyítási alapja.  
  
 * A tulajnak is egyszerűbbé válik ezeknek a feladatoknak a vezetése.
 Ugyanis tudni fogja sokkal egyszerűbben, hogy az adott film (ami már
 ki van kölcsönözve) kihez tartozik és mikor adta ki. Ezen kívül sokkal
 egyszerűbben tudja ellenőrízni,hogy az adott filmből hány példány van még.
           
### 7. Rendszerszereplők.

A rendszert két részre lehet osztani, amelyhez különböző funkciók tartoznak. 

* A két rész az alábbi:
    - Tulaj
    - Ügyfél

* Az alkalmazásban a két rész között nem várható óriási különbség.
Mindkét fél megtudja tekinteni a filmek listáját. Mindkét fél tud szűrni
a filmek között. A nagyobb különbség az, hogy a tulaj megtudja tekinteni, hogy
a bérelt filmhez, melyik telefonszám tartozik.

### 8. Rendszerhasználati esetek és lefutásaik.

### 9. Fejlesztői eszközök.

### 10. Keretrendszer.

### 11. Architekturális terv.

### 12. Adatbázis terv.

A program adatbázisát 3 tábla alkotja:

Elérhető filmek:

* id
* név
* értékelés
* mennyiség
* megjelenés éve
* kategória

Kikölcsönzött filmek:

* id
* telefonszám
* film neve
* kategóriája

Kölcsönzés:

* id
* film id
* kikölcsönöztt film id
* kölcsönzés dátuma

**Logikai Modell**:

![Kép a modellről: ](photos/db.png)

### 13. Implementációs terv.

### 14. Tesztterv.

Pont|Leírás|  
----|---  
01: | A program elindítása.  |
02: | Az adatbázisból egy létező filmre való rákeresés.  |
03: | Az adatbázisból egy nem létező filmre való rákeresés.  |
04: | Az adatbázisból egy létező kategóriára való keresés. |
05: | Az adatbázisból egy nem létező kategóriára való keresés. |
06: | Egy bérlő telefonszámának felvétele az adatbázisba. |
07: | Egy bérlő telefonszámának törlése az adatbázisból. |
08: | Egy film hozzáadása az adatbázishoz. |
09: | Egy film kikölcsönzése. |
10: | Több film kölcsönzése azonos bérlő esetén. |
11: | Filmek számának bérlésekor a mennyiség változik. |
12: | Nem létező évszámra keresés filmeknél.