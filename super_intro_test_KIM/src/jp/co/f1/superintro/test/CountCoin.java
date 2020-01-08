package jp.co.f1.superintro.test;

import java.util.Scanner;

public class CountCoin {
	public static void main(String[] args) {
		int count = 0;
		int coin = 0;
		System.out.println("ゲイム開始");
		while(true) {
			coin = (int)(Math.random()*2);
			if(coin==0) {
				System.out.println("コイントスの結果「表」が出ました。");
				break;
			}else if(coin==1) {
				System.out.println("コイントスの結果「裏」が出ました。");
				count++;
			}
		}
		System.out.println(count+"回目のコイントスで終わりました。");
	}
}
