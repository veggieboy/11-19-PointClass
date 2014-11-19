11-19-PointClass
================

## Objectives
- Understand how to represent an object's state as *fields*
- Understand how to represent an object's behavior as instance *methods*
- Be able to implement a class with *Accessors* and *Mutators*

## Assignment

Every class should be placed into its own file.  In the directory "src", you will find two files PointMain.java and Point.java. **DO NOT** modify PointMain.java. Use the file Point.java to create a class named Point. A Point object stores the (x, y) coordinates of a position in two-dimensional space as integers. **HINT** - you can find most of this code in the reading pp 505-517.

- Create two integer fields to store the coordinates of each instance of Point
- Create the following instance methods:
  - ACCESSORS:
    - **getX**: no parameters, returns the integer value of the field x;
    - **getY**: no parameters, returns the integer value of the field y;
    - **distanceFromOrigin**: no parameters, returns a double that is the Point object’s distance from the origin (0, 0).
    - **distance**: takes one Point parameter, returns a double that is the Point object’s distance from the Point parameter. The distance between two points is equal to the square root of the sum of the squares of the differences of their x- and y-coordinates. In other words, the distance between two points (x1, y1) and (x2, y2) can be expressed as the square root of (x2 – x1)2 + (y2 – y1)2. Two points with the same (x, y) coordinates should return a distance of 0.0.
    - **toString**: no parameters, returns a string in the form "(x, y)"
  - MUTATORS:
    - **setX**: takes one integer parameter, sets the value of the field x to the value of the parameter, returns void
    - **setY**: takes one integer parameter, sets the value of the field y to the value of the parameter, returns void
    - **translate**: takes two integer parameters, adds the value of the first parameter to the value of the field x and adds the value of the second parameter to the value of the field y, returns void

## Output
Your output should be identical to [output.txt](./output.txt)

