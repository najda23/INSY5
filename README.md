# INSY5

# Projektarbeit - Java & PostgreSQL mit Supabase

## Beschreibung
Dieses Projekt beinhaltet die Integration von Java mit einer PostgreSQL-Datenbank, die über Supabase verwaltet wird. Die Aufgaben umfassen die Erstellung von Tabellen, Views, Funktionen, und Cron-Jobs sowie das Schreiben eines Java-Programms, das mit meinem Datenbank kommuniziert.

## Schritte im Projekt:
1. Einrichtung der Supabase: Ein Supabase-Konto wurde erstellt, um die PostgreSQL-Datenbank zu verwalten.
2. Datenbank-Tabellen: Tabellen für Autoren, Bücher, Mitglieder und Ausleihen wurden erstellt und durch Fremdschlüssel miteinander verknüpft
3. Ansichten: Es wurden Ansichten erstellt, um jederzeit Statistiken über Mitglieder und Ausleihen abrufen zu können.
4. Funktionen: Es wurden Funktionen für die Ausleihe und Rückgabe von Büchern, die sich in der Datenbank befinden, zwischen Mitgliedern implementiert.
5. Cron-Jobs: Es wurde ein Cron-Job eingerichtet, der alle 5 Minuten Wetterdaten protokolliert.
6. Java-Programm: Es wurde ein Java-Programm erstellt, das die Bücher aus der Datenbank nach Titeln sortiert anzeigt.