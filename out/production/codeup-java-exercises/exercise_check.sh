#!/bin/bash
files=(HellowWorld.java ConsoleExercises.java ControlFlowExercises.java StringExercise.java)
  
for file in "${files[@]}"
do
    if ! [ -e "$file" ]
    then echo "$file is missing";
    fi
done
