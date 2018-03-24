package com.javaex.problem05;

public class StringUtil {
	// p.168,221  메소드에 매개변수를 넣어준 값들을 저장시키는 방법 
	public static String concatString(String[] strArray) { //배열을 매개값으로 받음 
		String result="";//결과값 변수를 초기화시켜줘야함 
	
		for(int i=0; i<strArray.length; i++) {
			result+=strArray[i]; //strArry 인덱스에 있는 값들을 모두 저장시킴
		}	
	    //System.out.println(result); //결과값을 출력
		return result; //결과값 리턴 
	}
	

//	public static String concatString(String... strArray) {
//		String arr1=strArray[0];
//		String arr2=strArray[1];
//		String arr3=strArray[2];
//		arr1=arr1.concat(arr2);
//		arr1=arr2.concat(arr3);
//		return arr1;
//	}

    
//    public static String concatString(String[] str){//p.219 배열의 변수를 매개변수로 선언 
//     
//    	String arr1=str[0];
//    	String arr2=str[1];
//    	String arr3=str[2];
//    	arr1=arr1.concat(arr2);
//    	arr1=arr1.concat(arr3);
//    	return arr1;
//    }

}
