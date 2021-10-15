package Day12;

import java.util.Arrays; // import : 다른 패키지로부터 클래스 가져오기
import java.util.Collections;
// java.lang : 패키지는 생략

public class Day12_1 {
// P.521
	
	public static void main(String[] args) {
		// 1. Arrays 클래스
			// copyOf(복사열 배열, 복사길이) : 배열 복사
		
		char[] arr1 = {'J', 'A', 'V', 'A'};
		// char : 기본 자료형 ['문자']
		// String : 클래스["문자열"]
		
		// 배열 길이 = 배열명.length : 필드
		// 문자열 길이 = 문자열.length() : 메소드
		
		// 방법1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		// 현재 클래스에서 다른 클래스 내 메소드 호풀하는 방법
			// . : 접근 제한자를 통한 메소드 호출
			// 1. 객체를 통한 메소드의 호출
				// 클래스명 객체명 = new 생성자()
				// 객체명.메소드명()
			// 2. static 메소드 객체없이 호출
				// 클래스명.메소드명()
		
		// Arrays.toString(배열) : 인덱스 순으로 데이터 출력
		System.out.println(Arrays.toString(arr2));
		// 3. copyOfRange(복사열 배열, 시작 인덱스, 끝 인덱스)
		
		// 방법2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3); // [1] ~ [2] 복사
		System.out.println(Arrays.toString(arr3));
		// 4. System.arraycopy(원본 배열, 시작 인덱스, 타겟배열, 타겟 자작 인덱스, 복사개수)
		
		// 방법3
		char[] arr4 = new char[arr1.length]; // 배열1의 길이만큼 배열4 선언
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(Arrays.toString(arr4));
		
// P.522
		// 5. Arrays.equals(배열1, 배열2) : 1차원 배열
		// 6. Arrays.deepEquals(배열1, 배열2) : 2차원 배열 비교
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println("1차 배열 비교 : " + Arrays.equals(arr1, arr2));
		// System.out.println("2차 이상 배열 비교 : " + Arrays.deepEquals(arr1, arr2));
		
		// 7. Arrays.sort(배열명) : 해당 배열 내 정렬 // sort는 오름차순 정렬
		Arrays.sort(arr1);
		System.out.println("배열 주소 정보 : " + arr1.toString());
		System.out.println("배열 내 데이터 정보 : " + Arrays.toString(arr1));
		
		// 8. Arrays.sort(배열명, Collections.reverseOrder()) : 배열 내 내림차순
			// * 주의! : 해당 배열이 기본 자료형일 경우 불가
		// Arrays.sort(arr1, Collections.reverseOrder()); // Character 사용
		
// P.526
		// 9. Arrays.binarySearch(배열명, 데이터) : 해당 데이터의 인덱스 번호
		// * 주의 : 오름차순(sort 후에 사용) 정렬 후 사용
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		int index = Arrays.binarySearch(scores, 99);
		System.out.println(index);
		System.out.println(Arrays.binarySearch(arr1, 'J'));
	}
}