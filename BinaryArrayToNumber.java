package cw;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class BinaryArrayToNumber {
	
	public static int ConvertBinaryArrayToInt(ArrayList<Integer> binary) {
		int number = 0;
		Collections.reverse(binary);
		for(int i = 0; i < binary.size() ; i++){
			if(binary.get(i) != 0){
				number += Math.pow(2, i);
			}
		}
		
     return number;   
    }
}
