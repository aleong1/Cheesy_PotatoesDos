### Cheesy_PotatoesDos
###### Alexia Leong, Wenting Li, Bing Li
###### L01 - But What Does the Data Say?
###### 2018-03-14

                                               QuickSort Execution Time Lab
  
**Big O Runtime**

Worst case: if the pivot happens to be the smallest or the largest element in the array, there is no partition to be done because one of the sub-array (either the left one or the right one) is empty. This will degenerate the divide-and-conquer mechanism of the quicksort method and turns into something similar to the selection sort --> O(n^2)

Best case: Occurs when the pivot point is the exact median of the array. There are log2n splits / partitions and the run time for the partion algorithm is O(n) because you have to iterate through every element of the subarrays to generate a swap, which means that number of swaps grow linearly as the size of the array increases. Combining the two processes, the best cae run time for quicksort is O(n log n). 
                                                                                         
**Hypothesis**
The best run time occurs if we set the median of the array as the pivot point. It will have a runtime of O(n log n). The worst run time occurs when the endpoint (min or max) of the array is set as the pivot point. It will have a runtime of O(n^2).

**Background**
We know that O(n^2) is quadratic run time, which means that as the size of the array increases, the run time scales quadratically with the amount of output. We also know that compares to the quadratic run time, the linearithmic run time will have a less steeper curve. Because theoretically, if you have a size of array with 3 elements, the quardratic run time will be 9. However, the linearithmic run time for an array of 3 is only 4.5. In addition to the run time, the amount of space used to store all data processed by the algorithm can affect the efficiency as well, because allocating space for a really large array generally takes the PC longer time to process.

**Methodology**
Our experiment starts off with a size 100 arrays and we will increment it by 100 after 1000 trials until the size reaches 1000. The average values for each test case is the average time that it took to quicksort 1000 times for each of the sizes (100, 200, 300, 400... 1000).The arrays are generated randomly, ascending and descending for each size to see how the arrangement of the array effects the execution time. Also, for each of the three way the data is organized, it tests the best and worst case pivot position: the middle position and the left most position. We did that by adding another helper method to QuickSort.java.

**Results**

We included the results from one run of the code in a Spreadsheet linked below and in the three line graphs. 

![image of graph](https://github.com/aleong1/Cheesy_PotatoesDos/blob/master/bestchart.png)
![image of graph](https://github.com/aleong1/Cheesy_PotatoesDos/blob/master/worstchart.png)
![image of graph](https://github.com/aleong1/Cheesy_PotatoesDos/blob/master/allchart.png)

CSV File Data (this is only the data from one run, but usually after each run, the CSV file will be overwritten):

[CSV File Here](https://github.com/aleong1/Cheesy_PotatoesDos/blob/master/quicksort.csv)



**Conclusions**


your time measurements and analysis of same
how pivot selection and data arrangement affect execution time.
Analysis of raw data (concise explanations of conclusions drawn.)
Explicit mention of any results you *cannot* explain.

Specific:
After analyzing our data from multiple runs, we noticed that the run time of the array in ascending order for both the best and worst cases start off much higher in the beginning and gradually returns to the same level as the other arrangements.This is probably because ascending order takes longer to run than other arrangements for both case work, but rather it is because this arrangement (ascending) is the first to be ran in our algorithm. Generally speaking, opening a new session in the terminal and running the algorithm for the first time requires the SYSTEM to allocate memory to its tasks, which might slow it down at first. However, after the system has gotten used to the tasks, the runtime for the ascending arrangement of both cases decreased dramatically, which explains why there is a sudden dip in the graph for both caeswork at size 800. It also sheds light on why the best case scenario in ascending order takes longer to run than the worst cases.

Unexplanable dips in the data. Ascending array worst case is runs better than the all the best case scenarios arrangement at size 700 

In general: explain how the general trend of the graph matches with the run time in our hypothesis. Will use correlation coefficient to prove the point. 

