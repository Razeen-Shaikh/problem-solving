# Day 2: Conditional Statements: If-Else
### Task
Complete the getGrade(score) function in the editor. It has one parameter: an integer, ***score***, denoting the number of points Julia earned on an exam. It must return the letter corresponding to her ***grade*** according to the following rules:
* If ***25 &lt; score &le; 30***, then ***grade = A***.
* If ***20 &lt; score &le; 25***, then ***grade = B***.
* If ***15 &lt; score &le; 20***, then ***grade = C***.
* If ***10 &lt; score &le; 15***, then ***grade = D***.
* If ***5 &lt; score &le; 10***, then ***grade = E***.
* If ***0 &lt; score &le; 5***, then ***grade = F***.
### Input Format
Stub code in the editor reads a single integer denoting ***score*** from stdin and passes it to the function.
### Constraints
* ***0 &le; score &le; 30***
### Output Format
The function must return the value of ***grade*** (i.e., the letter grade) that Julia earned on the exam.
### Sample Input 0
```
11
```
### Sample Output 0
```
D
```
### Explanation 0
Because ***score = 11***, it satisfies the condition ***10 &lt; score &le; 15*** (which corresponds to D). Thus, we return D as our answer.
