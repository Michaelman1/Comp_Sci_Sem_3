import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();

	//	int[] arnold = new int[10];
	//	arnold[9] = 0;
	//	arnold[8] = 0;
	//	arnold[7] = 0;
	//	arnold[6] = 0;
	//	arnold[5] = 0;
	//	arnold[4] = 0;
	//	arnold[3] = 0;
	//	arnold[2] = 0;
	//	arnold[1] = 0;
	///	System.out.println(arnold[9]);
	//	System.out.println(arnold[8]);
	//	System.out.println(arnold[7]);
	//	System.out.println(arnold[6]);
	//	System.out.println(arnold[5]);
	//	System.out.println(arnold[4]);
	//	System.out.println(arnold[3]);
	//	System.out.println(arnold[2]);
	//	System.out.println(arnold[1]);
	//	System.out.println(arnold[0]);
	//	
		
		   Random digit = new Random();

        int Random[] = new int[20];

        for (int x=0;x<20;x++) {
            Random[x] = digit.nextInt(10);
        }

        int Digits[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};

        int Count[] = new int[20];


        for (int i = 0; i < Digits.length; i++) {


            for (int j = 0; j < Random.length; j++) {
			                if (Digits[i] == Random[j])
                    Count[i]++;
            }

        }


        for (int i = 0; i < Count.length; i++) {

            if (Count[i] == 1)
                System.out.printf( " ",Digits[i]);

            else
                System.out.printf( " ", Digits[i], Count[i]);

        }

		
	
		
	}
}
