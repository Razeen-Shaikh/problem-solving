# Mean, Median and Mode

**Task**
Given an array, *X*, of *N* integers, calculate and print the respective mean, median, and mode on separate lines. If your array contains more than one modal value, choose the numerically smallest one.

**Note:** Other than the modal value (which will always be an integer), your answers should be in decimal form, rounded to a scale of *1* decimal place (i.e., *12.3*, *7.0* format).

**Input Format**

The first line contains an integer, *N*, denoting the number of elements in the array.
The second line contains *N* space-separated integers describing the array's elements.

**Constraints**
* ![n](https://latex.codecogs.com/gif.latex?10%20%5Cleq%20N%20%5Cleq%202500)
* ![x](https://latex.codecogs.com/gif.latex?0%20%3C%20x_%7Bi%7D%20%5Cleq%2010%5E%7B5%7D), where x<sub>i</sub> is the i<sup>th</sup> element of the array.

**Output Format**

Print *3* lines of output in the following order:

Print the mean on a new line, to a scale of *1* decimal place (i.e., *12.3*, *7.0*).
Print the median on a new line, to a scale of *1* decimal place (i.e., *12.3*, *7.0*).
Print the mode on a new line; if more than one such value exists, print the numerically smallest one.

**Sample Input**
```
10
64630 11735 14216 99233 14470 4978 73429 38120 51135 67060
```

**Sample Output**
```
43900.6
44627.5
4978
```

**Explanation**

**Mean:**
We sum all *N* elements in the array, divide the sum by *N*, and print our result on a new line.

![mean](https://latex.codecogs.com/gif.latex?%5Cmu%20%3D%20%5Cfrac%7Bx_%7B0%7D&plus;x_%7B1%7D&plus;x_%7B2%7D&plus;x_%7B3%7D&plus;x_%7B4%7D&plus;x_%7B5%7D&plus;x_%7B6%7D&plus;x_%7B7%7D&plus;x_%7B8%7D&plus;x_%7B9%7D%7D%7B10%7D%20%3D%20%5Cfrac%7B439006%7D%7B10%7D%20%3D%2043900.6)

**Median:**
To calculate the median, we need the elements of the array to be sorted in either non-increasing or non-decreasing order. The sorted array ![X](https://latex.codecogs.com/gif.latex?X%20%3D%20%5C%7B4978%2C%2011735%2C%2014216%2C%2014470%2C%2038120%2C51135%2C%2064630%2C%2037060%2C%2073429%2C%2099233%20%5C%7D). We then average the two middle elements:

  ![median](https://latex.codecogs.com/gif.latex?median%20%3D%20%5Cfrac%7Bx_%7B4%7D%20&plus;%20x_%7B5%7D%7D%7B2%7D%20%3D%20%5Cfrac%7B89255%7D%7B2%7D%20%3D%2044627.5)

and print our result on a new line.

**Mode:**
We can find the number of occurrences of all the elements in the array:
```
 4978 : 1
11735 : 1
14216 : 1
14470 : 1
38120 : 1
51135 : 1
64630 : 1
67060 : 1
73429 : 1
99233 : 1
```

Every number occurs once, making *1* the maximum number of occurrences for any number in *X*. Because we have multiple values to choose from, we want to select the smallest one, *4978*, and print it on a new line.