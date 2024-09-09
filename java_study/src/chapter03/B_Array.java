package chapter03;
// 다차원 배열
// : 배열의 배열(2, 3, 4,.... 차원)
// >> 데이터를 테이블 형태로 구성할 때 유용
// >> 게임 보드, 데이터 분서그 그래픽 등에 사용 

public class B_Array {
	public static void main(String[] args) {
		// ===다차원 배열의 선언 및 초기화===
		// 2차원 배열 선언: 데이터타입
		int[][] matrix;
		
		
		
		matrix = new int[3][3];
		
		// 각 요소에 값 할당
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		
		matrix[1][2] = 4;
		
		// 선언과 동시에 초기화 
		// : 4행 3열
		int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		// 다차원 배열 출력
		// >> 각 행을 순회하여, 해당 행 내부의 요소를 순회
		for(int[] row: matrix2) {
			for(int value: row) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}
}
