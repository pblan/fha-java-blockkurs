# Übungsblatt 2
## Kurzaufgabe 2.1
```java
int menge = 2
```

## Kurzaufgabe 2.2
```java
System.out.print(3/17.);
```

## Kurzaufgabe 2.3
```java
double bruch = 1/7.;
System.out.print(bruch);
```

## Kurzaufgabe 2.4
```java
double pi = Math.PI;
System.out.printf("Pi hat den Wert %f", pi);
```

## Kurzaufgabe 2.5
```java
double root = Math.sqrt(2);
int root_as_int = (int) root;
```

## Kurzaufgabe 2.6
```java
double d = 4.3;
d = (int) d;
```
Ein expliziter Cast wird benötigt bei der Typkonversion `double` zu `int`.

## Kurzaufgabe 2.7
```java
String s = System.console().readLine();
```

## Kurzaufgabe 2.8
```java
int a = Integer.parseInt(System.console().readLine());
```

## Kurzaufgabe 2.9
```java
double d = Double.parseDouble(System.console().readLine());
```

## Kurzaufgabe 2.10
```java
public static void swap(int a, int b) {
    int help = a;
    a = b;
    b = help;
}
```
