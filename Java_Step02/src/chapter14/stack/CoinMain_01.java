package chapter14.stack;

import java.util.Stack;

public class CoinMain_01 {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(200000));
		coinBox.push(new Coin(5000000));
		coinBox.push(new Coin(1000000));
		coinBox.push(new Coin(50000));
		coinBox.push(new Coin(300000));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("������ ��: "+coin.getValue());
		}
		
		
		

	}

}
