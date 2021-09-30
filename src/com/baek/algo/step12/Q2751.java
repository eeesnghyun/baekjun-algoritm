package com.baek.algo.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 * Q. N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
		 *
		 * 입력
		 * - 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
		 * - 둘째 줄부터 N개의 줄에는 수가 주어진다.
		 *
		 * 조건
		 * - 절댓값이 1,000,000보다 작거나 같은 정수이다.
		 * - 수는 중복되지 않는다.
		 * - 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
		 * - 제한시간 2초
		 */
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb  = new StringBuilder();

		int n = Integer.parseInt(bf.readLine());

		List<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < n; i++) {
			list.add(Integer.parseInt(bf.readLine()));
		}

		Collections.sort(list);

		for(int num : list) {
			sb.append(num).append("\n");
		}

		System.out.println(sb);

		bf.close();
	}
}