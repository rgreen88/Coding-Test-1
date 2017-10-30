package com.example.rynel.testone;

/**
 * Created by rynel on 10/29/2017.
 */

public class MostOccurringInt {

    private static int mostOccurrence(int[] array ) {

        int[] number = new int[ array.length ];
        int highestCount = array[0];
        int answer = 0;

        for( int i = 0; i < array.length; i ++ ) {
            int count = 0;
            for( int n = 0; n < array.length; n++ ){
                if( array[n] == array[i] )
                    count++;
            }

            number[i] = count;

            if( highestCount < number[i] ) {
                highestCount = number[i];
                answer = array[i];
            }
        }

        return answer;
    }
}
