package jp.co.f1.app.bmi;

import java.util.Scanner;

public class BmiStep4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String result ="";
		double weight =0;
		double height =0;
		System.out.println("※※BMI計算プログラムを開始します※※");
		System.out.println("\n");

		do {
		System.out.println("身長（単位ｃｍ)を入力してください＞");
		 height = sc.nextDouble();
		System.out.println("体重（単位kg)を入力してください＞");
		 weight = sc.nextDouble();
		if(weight==0||height==0) System.out.println("※※0以下の数値があるため、再入力してください※※");
		}while(weight ==0 || height==0);

		double bmi = weight/((height/100)*(height/100));

		if( bmi >= 25) {
			result =		"太り気味です。";
		} else if (bmi < 18.5) {
			result = 	"やせ気味です。";
		} else {
			result =		"正常値です。";
		}

		if(height !=0 && weight !=0) {
		System.out.println("身長が　"+height+"cm、  "+"体重が　"+weight+"kgの場合\nBMIの値は　"+bmi+"です。\n"+result);
		System.out.println("\n");
		System.out.println("※※BMI計算プログラムを終了します※※");

		}
	}
}
