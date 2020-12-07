# Jegyzőkönyv Team.Asd

## Esetek

| Pontok | Teszteset                             | Elvárt eredmény                       | Eredmény     | Tesztelte
| -------|---------------------------------------|------------------------------------------|--------------|--------------
| 1.     | Új személy hozzáadása sikeres         | Sikeres hozzáadás megjelenik a képernyőn | Átment       | Udvardy Márton   
| 2.     | Új személy hozzáadása hibás adatokkal | Hibaüzenet jelenik meg                   | Átment       | Udvardy Márton   
| 3.     | Új személy hozzáadás üres body-val    | Hibaüzenet jelenik meg                   | Átment       | Udvardy Márton
| 4.     | Személyek lekérdezése                 | Az adatbázisban lévő adatok visszadódnak | Átment       | Udvardy Márton
| 5.     | Személy módosítása rossz adattal      | Hibaüzenet jelenik meg                   | Átment       | Udvardy Márton
| 6.     | Személy módosítása üres adattal       | Hibaüzenet jelenik meg                   | Átment       | Udvardy Márton
| 7.     | Személy módosítása helyes adattal     | Sikeres módosítás megjelenik             | Átment       | Udvardy Márton
| 8.     | Személy törlése létező id-val         | Sikeres törlés megjelenik                | Átment       | Udvardy Márton
| 9.     | Személy törlése nem létező id-val     | Hibaüzenet megjelenik                    | Átment       | Udvardy Márton
| 10.    | Új film hozzáadása a filmekhez        | Új film megjelenik a beadott adatokkal   | Sikeres      | Szűcs Levente
| 11.    | Új film felvétele rossz adatokkal     | Hibakód megjelenik                       | Sikeres      | Szűcs Levente
| 12.    | Új film felvétele adatok nélkül       | Hibakód megjelenik                       | Sikeres      | Szűcs Levente
| 13.    | Film adatainak lekérdezése            | Adatbázisban megjelennek az adatok       | Sikeres      | Szűcs Levente
| 14.    | Film módosítása helyes adattal        | Módosítás sikeresen megtörténik          | Sikeres      | Szűcs Levente
| 15.    | Film módosítása rossz adattal         | Hibakód megjelenik                       | Sikeres      | Szűcs Levente
| 16.    | Film módosítása üres adattal          | Hibakód megjelenik                       | Sikeres      | Szűcs Levente
| 17.    | Film törlése létező id-val            | Sikeres törlés megtörténik               | Sikeres      | Szűcs Levente
| 18.    | Film törlése nem létező id-val        | Hibakód megjelenik                       | Sikeres      | Szűcs Levente
| 19.    | Új kategória hozzáadása        | Új kategória megjelenik a beadott adatokkal   | Sikeres      | Antal Balázs
| 20.    | Új kategória felvétele rossz adatokkal     | Hibakód megjelenik                       | Sikeres      | Antal Balázs
| 21.    | Új kategória felvétele adatok nélkül       | Hibakód megjelenik                       | Sikeres      | Antal Balázs
| 22.    | Kategória adatainak lekérdezése            | Adatbázisban megjelennek az adatok       | Sikeres      | Antal Balázs
| 23.    | Kategória módosítása helyes adattal        | Módosítás sikeresen megtörténik          | Sikeres      | Antal Balázs
| 24.    | Kategória módosítása rossz adattal         | Hibakód megjelenik                       | Sikeres      | Antal Balázs
| 25.    | Kategória módosítása üres adattal          | Hibakód megjelenik                       | Sikeres      | Antal Balázs
| 26.    | Kategória törlése létező id-val            | Sikeres törlés megtörténik               | Sikeres      | Antal Balázs
| 27.    | Kategória törlése nem létező id-val        | Hibakód megjelenik                       | Sikeres      | Antal Balázs