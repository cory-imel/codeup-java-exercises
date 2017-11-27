#!/bin/bash
files=(HelloWorld.java ConsoleExercises.java ControlFlowExercises.java StringExercise.java Bob.java MethodsExercises.java HighLow.java Person.java util/Input.java)

for file in "${files[@]}"
do
    if ! [ -e "$file" ]
    then echo "$file is missing";
    fi
done