# Rendszerterv

### 1. A rendszer célja.

### 2. A project tervezete.

### 3. Ütemterv.

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