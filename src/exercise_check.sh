#!/bin/bash
files=(HelloWorld.java ConsoleExercises.java ControlFlowExercises.java StringExercise.java Bob.java MethodsExercises.java HighLow.java Person.java util/Input.java util/InputTest.java shapes/Circle.java shapes/CircleApp.java ServerNameGenerator.java movies/Movie.java movies/MoviesApplication.java movies/MoviesArray.java shapes/Rectangle.java shapes/Square.java shapes/ShapesTest.java shapes/Measurable.java shapes/Shape.java shapes/Quadrilateral.java)

for file in "${files[@]}"
do
    if ! [ -e "$file" ]
    then echo "$file is missing";
    fi
done