package lesson12;

import java.util.Arrays;

public class Ex250421_1 {
	
		public static void main(String[] args) {
			
		
////			String[] url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=9f324k01".split("");
//			System.out.println(Arrays.toString(url));
			String  url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=9f324k01";
			
//			System.out.println(url.substring(url.indexOf("h"), url.lastIndexOf(":")));
//			System.out.println(url.substring(url.indexOf("search"), url.lastIndexOf("/")));
//			System.out.println(url.substring(url.indexOf("search.naver?"), url.lastIndexOf("?")));
//			System.out.println(url.substring(url.indexOf("where")));
//
//			System.out.println("===============================");
//			String arr = (url.substring(url.indexOf("search.naver?")));
//			System.out.println(arr);
//
//			String[] arr = (url.substring(url.indexOf("where"))).split("&");
//			for (int i = 1; i < arr.length; i++) {
//				System.out.println(i + "쌍 > " + arr[i]);
//			}
//
//			System.out.println("===============================");
//			String[] arr2 = (url.substring(url.indexOf("where"))).split("=");
//			String[] arr3 = (url.substring(url.indexOf("where"))).split("=");
//			String str = String.join("-", arr3);
//			System.out.println(str);
//			
//			for (int i = 1; i < arr2.length; i++) {
			////
//				System.out.println(i + "키 > " + arr2[i]);
			////
//				System.out.println(i + "값 >" + arr3[i]);
//			}
//		}
//
//}
			String[] pro = url.split("://");
			for(int i = 1; i < pro.length; i++) {
				System.out.println("프로토콜 > "+ pro[0]);
			}
			String[] domain = pro[1].split("/");
			for(int i = 1; i < domain.length; i++) {
				System.out.println("도메인 > "+ domain[0]);
			}
			String[] file = domain[1].split("\\?");
			for(int i = 1; i < file.length; i++) {
				System.out.println("파일 > "+ file[0]);
			}
			String query = file[1];
			for(int i = 1; i < pro.length; i++) {
				System.out.println("쿼리 > "+ query);
			}
			
			System.out.println("===============================");
			String[] que = query.split("&");
			for (int i = 0; i < que.length; i++) {
				System.out.println(i + "쌍 > " + que[i]);
			} 
			
			System.out.println("===============================");
		
//			for (int i = 0; i < que.length; i++) {
//			System.out.print(String.join(",", que[0]));
//			System.out.println("키,값 > " + que[0]);
//			}
		}
		

		


//		
		
		// 프로토콜://도메인/파일명?쿼리스트링
		// 1. 위의 항목에 맞춰 문자열 자르기

		// where=nexearch & sm=top_hty & fbm=0 & ie=utf8 &
		// query=%EA%B3%A0%EC%96%91%EC%9D%B4 & ackey=9f324k01
		// 쿼리스트링은 키1=값1&키2=값2 잘라서 보여주기
		// 즉 값의 쌍은 &로 구분, 키와 값은 =로 구분

			
}