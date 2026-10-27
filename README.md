# SWP Programmiertest – Übungsaufgaben

Übungsaufgaben zur Vorbereitung auf den Programmiertest im Software-Projekt
(Java mit BlueJ, 3 Aufgaben in 45 Minuten, je 10 Punkte, bestanden ab 15 Punkten).

In jeder Aufgabe ist eine Methode leer, die Aufgabenstellung steht im Javadoc
der Klasse. Dazu gibt es jeweils einen JUnit-5-Test für den Standardfall.

**Lösungen** gibt es nur in `Klausuraufgaben - Darian/loesungen/`. Wer erst
selbst üben will, öffnet `Klausuraufgaben - Darian/aufgaben/`.

## Aufgaben

| Ordner | Aufgabe | Methode |
|---|---|---|
| `beispielaufgaben/1-Analyser` | Häufigkeiten zählen | `calcFrequencies(int[])` |
| `beispielaufgaben/2-Trees` | Postorder-Traversierung | `traversePostOrder()` |
| `beispielaufgaben/3-Average` | Durchschnitt berechnen | `calcAverage(int[])` |
| `weitere-aufgaben/1-Analyser` | Zahl mit exakter Häufigkeit | `getNumberWithExactFrequency(List<Integer>, int)` |
| `weitere-aufgaben/2-TreeNode` | Summe aller Knoten | `calcSum()` |
| `weitere-aufgaben/3-Transformer` | Umdrehen und zyklisch verschieben | `reverseAndShift(int[], int)` |
| `Klausuraufgaben - Darian/aufgaben/1-Analyser` | Zahl mit Häufigkeit am nächsten am Ziel | `getNumberClosestToTargetFrequency(int[], int)` |
| `Klausuraufgaben - Darian/aufgaben/2-TreeNode` | Summe der geraden Knotenwerte | `sumOfEven()` |
| `Klausuraufgaben - Darian/aufgaben/3-Transformer` | Kumulative Summen | `toCumulativeSums(int[])` |

`beispielaufgaben/` sind die offiziellen Beispielaufgaben aus dem Kurs.

## Benutzung

1. Einen Aufgabenordner in BlueJ öffnen (*Project → Open Project*).
2. Methode gemäß Javadoc implementieren, dabei auch die Randfälle aus `@throws` beachten.
3. Kompilieren, dann Rechtsklick auf die Testklasse → *Test All*.

Tipp: Zeit stoppen, Ziel sind höchstens 15 Minuten pro Aufgabe.
