# hedgehog
My Solution to the hedgehog problem

# Hedgehog problem
## Conditions
Imagine the rectangular garden sized M x N. Garden consists of square zones with one appletree
in each zone. There can be several apples under each tree.

### There is an hedgehog in upper left square of the garden. It moves to lower right corner with
some restrictions:
1. the hedgehog only can move to the next right or to the next lower square.
Please, make an application to count the max amount of apples the hedgehog can collect on its
way.

### Tech conditions
- The garden plan is given as a table "apples" witch consists of M rows and N
columns.
- Table element apples[i,j] indicates a number of apples under the tree with coordinates
i,j.
- Text file "input.txt" structured in this way:
  1. first row consist of numbers M and N separated with space
  2. each of the next M rows consists of N values of apples[i,j] separated with
space
- File "output.txt" must contain one natural number (result of calculations).

### File samples:
#### Input.txt 
```property
3 3
1 2 3
1 2 3
1 2 3
```
#### Output.txt
```property
12
```
