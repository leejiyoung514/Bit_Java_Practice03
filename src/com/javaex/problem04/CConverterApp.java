package com.javaex.problem04;


public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        //백만원을 달러로 출력
        double result1=CConverter.toDoller(1000000);
        System.out.println("백만원은 "+result1+"달러입니다.");
        
        //100달려를 원으로 출력
        double result2=CConverter.toKWR(100);
        System.out.println("백달러은 "+result2+"원입니다.");
    }

}
