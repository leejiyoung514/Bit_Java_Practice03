package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Friend[] friendArray = new Friend[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		// 친구정보 입력받기
		for (int i = 0; i < friendArray.length; i++) {
			// 입력받은 친구정보를 공백으로 분리
			String str = sc.nextLine(); // 입력
			String strArr[]=str.split(" "); // 나눴어요
			// Friend 객체 생성하여 데이터 넣기
			Friend friend=new Friend(strArr[0],strArr[1],strArr[2]); 
			// 배열에 추가하기
			//Friend friend = new Friend(str.split(" ")[0],str.split(" ")[1],str.split(" ")[2]);
			
//			friend.setName(strArr[0]);
//			friend.setHp(strArr[1]);
//			friend.setSchool(strArr[2]);		
		    friendArray[i]=friend;
		}

		for (int i = 0; i < friendArray.length; i++) {
            friendArray[i].showInfo(); 
		}
		sc.close();
	}

}
