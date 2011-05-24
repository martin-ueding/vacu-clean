# Copyright (c) Martin Ueding <dev@martin-ueding.de>

vacucleangame.jar: Staubsauger.class
	jar -cfm vacucleangame.jar manifest.txt *.class *.properties

Staubsauger.class: *.java
	javac Staubsauger.java

clean:
	rm -rf *.jar *.class
