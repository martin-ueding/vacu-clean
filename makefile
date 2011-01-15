vacucleangame.jar: Staubsauger.class
	jar -cfm vacucleangame.jar manifest.txt *.class *.properties

Staubsauger.class: *.java
	javac Staubsauger.java
