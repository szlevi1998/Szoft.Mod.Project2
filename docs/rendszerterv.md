# Rendszerterv

### 1. A rendszer célja.

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

### 5. Követelmények.

### 6. Funkcoinális terv.

### 7. Rendszerszereplők.

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