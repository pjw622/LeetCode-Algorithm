import java.util.HashMap;

public class Roman_to_Integer_33 {
	
	public static void main(String[] args) {
		int rval = romanToInt("MCMXCIV");
		System.out.println(rval);
	}
	
	public static int romanToInt(String s) {
        int index=0;
        int rval=0;
    	HashMap<String, Integer> roman = new HashMap<>();
    	roman.put("I", 1);
    	roman.put("V", 5);
    	roman.put("X", 10);
    	roman.put("L", 50);
    	roman.put("C", 100);
    	roman.put("D", 500);
    	roman.put("M", 1000);
    	roman.put("IV", 4);
    	roman.put("IX", 9);
    	roman.put("XL", 40);
    	roman.put("XC", 90);
    	roman.put("CD", 400);
    	roman.put("CM", 900);
    	
    	
        while(index+1<s.length()) {
        	String twoNumeral = s.substring(index,index+2);
//        	System.out.println("twoNumeral : "+twoNumeral);
        	if(twoNumeral.equals("IV")||twoNumeral.equals("IX")
        			||twoNumeral.equals("XL")||twoNumeral.equals("XC")
        			||twoNumeral.equals("CD")||twoNumeral.equals("CM")) {
        		rval+=roman.get(twoNumeral);
        		index+=2;
//        		System.out.println("add : "+roman.get(twoNumeral));
        	}
        	else {
        		rval+=roman.get(Character.toString(s.charAt(index)));
        		index++;
//        		System.out.println("add2 : "+roman.get(Character.toString(s.charAt(index))));
        	}
        }
        
        if(index==s.length()-1) {
        	rval+=roman.get(Character.toString(s.charAt(index)));
        }
        
		return rval;
    }
}
