#!/bin/bash

# This script reads each line of algo_list.txt and then prints each line shuffled.

input="algo_list.txt"
algo_arr=()

while read -r line
do
  algo_arr+=("$line")
done < "$input"

algo_arr=( $(shuf -e "${algo_arr[@]}") )

printf "%s\n" "${algo_arr[@]}"