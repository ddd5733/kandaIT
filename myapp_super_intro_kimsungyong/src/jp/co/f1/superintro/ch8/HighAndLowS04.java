package jp.co.f1.superintro.ch8;

import java.util.Scanner;

public class HighAndLowS04 {


	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int leftCard = (int)(Math.random()*9)+1;
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
		}else if(select.equals("l")) {
			System.out.println("→Low を選択しました。");
		}
		System.out.println("");
		System.out.println("--ゲーム終了--");

	}

}
