#!/bin/bash
files=(HelloWorld.java ConsoleExercises.java ControlFlowExercises.java StringExercise.java Bob.java)
  
for file in "${files[@]}"
do
    if ! [ -e "$file" ]
    then echo "$file is missing";
    fi
done
