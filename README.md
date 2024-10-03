Három ajtó

Feladatleírás:
Van 3 ajtó amelyek közül a felhasználó választhat hogy melyiket nyitja ki.
A 3 ajtó mögött véletlenszerűen van az egyikben kincs, kettőben semmi.
A játék célja, hogy azt az ajtót nyissuk ki amelyik mögött a kincs van.

Miután a felhasználó megjelöl egy ajtót, a másik kettő zárt ajtó közül a program feltár egyet ami biztosan nem a kincset rejti. Ezután a felhasználó választhat, hogy azt a maradék egy ajtót nyitja ki, ami zárva maradt, vagy amelyiket megjelölte eredetileg.

A program számoja hogy a felhasználó hányszor nyert csere segítségével, és hányszor nyert csere nélkül. Ezeket a statisztika részen találhatóak az erre szolgáló [JTextField]-ek.

A felhasználó mindig indíthat új kört miután a jelenlegivel végzett, viszont a számlálók ne nullázódjanak le. A GUI-n még el kell helyezni egy leállítás gombbot, miután a felhasználó megnyomja a program összesíti hogy hányszor nyert cserével és hányszor nélküle.

GUI leírás:

Az ajtókhoz tartozó gombbok változó nevei [JButton]:

elsoAjtoGombb
masodikAjtoGombb
harmadikAjtoGombb

Az ajtó képek változó nevei [JLabel]:
elsoAjto
masodikAjto
harmadikAjto

Statisztika számlálók változó nevei [JTextField]:
csereSzamlaloField
csereNelkulSzamlaloField
korokSzama

Játékvezérlő gombbok változó nevei [JButton]:
csereIgen
csereNem
ujJatekGombb

(A játékvezérlőben a Csere elfogadása kérdés és a hozzá tartozó gombbok csak az ajtó választás után jelennek meg.)

![image](https://github.com/user-attachments/assets/05652d67-b54d-422d-98d0-50a9ae8ffa3b)
