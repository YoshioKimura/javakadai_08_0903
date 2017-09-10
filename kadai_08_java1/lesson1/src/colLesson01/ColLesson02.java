package colLesson01;

import java.util.Scanner;	//Scannerクラスを使用するために必要なコード。　Scannerクラスがあることで、プログラムとして(?)テキスト入力を扱える。

public class ColLesson02{

	public static void main(String[] args){		//メインメソッド(関数)。メソッド名：main、引数String型の配列、static修飾子が付与されているメソッド。argはargumentの略で引数という意味。
		//Wordクラスのインスタンス配列
		Word[] words = new Word[10];

		//コマンドラインから入力
		System.out.println("英単語と日本語をスペースで区切って入力してください");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		//カウント用
		int num = 0;

		//ぐるぐる回る　e以外だったら処理を繰り返す
		while(!input.equals("e")){

			//変数inputの中に、入力された英単語スペース日本語を変数tmpの中にいれる。あと配列もつくっとく。
			String[] tmp = new String[2];
			tmp = input.split(" ");
			//Wordクラスのインスタンスをつくる（右側はコンストラクタ）。newで実体つくったから、変数wdの箱の中にいれとく
			Word wd  = new Word(tmp[0], tmp[1]);

			//wdはwhile抜けたら消えるから、while外側にあるwordsに実体をいれる。(そうするとwdが保存される)
			words[num] = wd;
			//実体を入れたら、1カウントする。
			num++;
			//次の入力を促す文
			System.out.println("次の英単語と日本語を入力してください。\"e\"で終了します。");
			//入力を収めるinput
			input = sc.nextLine();
		}
		//while文で回った回数だけ、for文で回す。eが入力されたあとの処理。
		for( int i = 0 ; i < num ; i++ ){
			System.out.println(words[i].toString());
		}
		System.out.println(num + "件、登録しました。");



	}
}