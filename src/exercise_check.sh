#!/bin/bash
files=(    src/HelloWorld.java
           src/ConsoleExercises.java
           src/ControlFlowExercises.java
           src/StringExercise.java
           src/MethodsExercises.java
           src/HighLow.java
           src/Person.java
           src/util/Input.java
           src/shapes/Circle.java
           src/shapes/CircleApp.java
           src/ServerNameGenerator.java
           src/movies/Movie.java
           src/movies/MoviesArray.java
           src/movies/MoviesApplication.java
           src/shapes/Rectangle.java
           src/shapes/Square.java
           src/shapes/ShapesTest.java
           src/shapes/Shape.java
           src/shapes/Measurable.java
           src/shapes/Quadrilateral.java
           src/grades/Student.java
           src/grades/GradesApplication.java )

for file in "${files[@]}"
do
    if ! [ -e "$file" ]
    then echo "$file is missing";
    fi
done