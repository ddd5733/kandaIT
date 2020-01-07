package jp.co.f1.superintro.ch8;

import java.util.Scanner;

public class HighAndLowS06 {


	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int leftCard = (int)(Math.random()*9)+1;
		int rightCard = (int)(Math.random()*9)+1;
		String result ="";
		System.out.println("************************");
		System.out.println("*  High & Low  *");
		System.out.println("************************");
		System.out.println("");
		System.out.println("  [問題表示]");
		System.out.println(" ***** 	***** ");
		System.out.println(" *   *	* * * ");
		System.out.println(" * "+leftCard+" *	* * * ");
		System.out.println(" *   *	* * * ");
		System.out.println(" ***** 	***** ");
		System.out.println(" High or Low?(h/l) >");
		String select = sc.next();

		if(select.equals("h")) {
			System.out.println("→High を選択しました。");
			if(leftCard<=rightCard) {
				result ="→You Win!";
			}else {
				result ="→You Lose...";
			}
		}else if(select.equals("l")) {
			System.out.println("→Low を選択しました。");
			if(leftCard>=rightCard) {
				result ="→You Win!";
			}else {
				result ="→You Lose...";
			}
		}

		System.out.println("");
		System.out.println("  [結果表示]");
		System.out.println(" ***** 	***** ");
		System.out.println(" *   *	*   * ");
		System.out.println(" * "+leftCard+" *	* "+rightCard+" * ");
		System.out.println(" *   *	*   * ");
		System.out.println(" ***** 	***** ");

		System.out.println(result);
		System.out.println("");
		System.out.println("--ゲーム終了--");

	}

}
