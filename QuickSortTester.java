// QuickSortTester.java
//Team Cheesy Potatoes -- Alexia Leong, Bing Li, Wenting Li
//APCS2 pd01
//L#01 -- But What Does the Data Say?
//2018-03-14

public class QuickSortTester{
    private static int ave = 0;
    
    public static void main(String[] args){
	int sizearr = 100;

	//best case
	System.out.println("Randomly generated ints trial 1:");
	while(sizearr < 1000){
	    int trial = 1;
	    ave = 0;
	
	    int[] arrN = new int[sizearr]; //size 100 array first
	    for( int i = 0; i < arrN.length; i++ )
		arrN[i] = i;
	    while(trial <= 1000){ //for 1000 trials per size of array
	
		QuickSort.shuffle(arrN);

		long startTime = System.nanoTime();   //start timing
		QuickSort.qsortHelper1( arrN, 0, arrN.length-1 );    //****choosing the middle value as pvtpoint
		long estimatedTime = System.nanoTime() - startTime;   //end timing
		
		if(trial <= 10){   //only print the data for 10 trials
		    System.out.println("Trial " + trial + ": " + estimatedTime + " nanoseconds.");
		}
		trial += 1;
		ave += estimatedTime;   //but this is the average of 1000 trials
	    }
	    sizearr += 100;
	    
	    System.out.println("Average of 1000 trials of size " + sizearr + " is " + (ave/1000) + " nanoseconds.\n\n");
	}

	System.out.println("--------------------------------------");


	
	// randomly-generated arrays of sizearr distinct vals  --> starts at size 100 then it increments by 100 until it gets to 1000  **this is the worst case**
	System.out.println("Randomly generated ints trial 2:");
	while(sizearr < 1000){
	    int trial = 1;
	    ave = 0;
	
	    int[] arrN = new int[sizearr]; //size 100 array first
	    for( int i = 0; i < arrN.length; i++ )
		arrN[i] = i;
	    while(trial <= 1000){ //for 1000 trials per size of array
	
		QuickSort.shuffle(arrN);

		long startTime = System.nanoTime();   //start timing
		QuickSort.qsort( arrN );   //******this uses the left bound as pvtpoint
		long estimatedTime = System.nanoTime() - startTime;   //end timing
		
		if(trial <= 10){   //only print the data for 10 trials
		    System.out.println("Trial " + trial + ": " + estimatedTime + " nanoseconds.");
		}
		trial += 1;
		ave += estimatedTime;   //but this is the average of 1000 trials
	    }
	    sizearr += 100;
	    
	    System.out.println("Average of 1000 trials of size " + sizearr + " is " + (ave/1000) + " nanoseconds.\n\n");
	}

    }
}

