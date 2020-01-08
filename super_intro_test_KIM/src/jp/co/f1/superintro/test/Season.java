package jp.co.f1.superintro.test;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1から12のうち、好きな月を1つ入力しなさい--＞");
		int month = sc.nextInt();
			String result ="";
		if (month == 3) {
			result="春です。";
		} else if (month == 6) {
			result="夏です。";
		} else if (month == 9) {
			result="秋です。";
		} else if (month == 12) {
			result="冬です。";
		} else {
			result="季節未設定です。";
		}
		System.out.println(result);
	}
}
