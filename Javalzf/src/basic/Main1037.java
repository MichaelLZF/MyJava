package basic;

import java.util.Scanner;

public class Main1037 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Coin p = new Coin(sc.next().split("[.]"));
		Coin a = new Coin(sc.next().split("[.]"));
		sc.close();
		Coin result = new Coin();
		if(p.galleon>a.galleon){
			System.out.print("-");
			
			if(p.kunt<a.kunt){
				p.kunt+=29;
				p.sickle--;
			}
			result.kunt = p.kunt -a.kunt;
			if(p.sickle<a.sickle){
				p.sickle += 17;
				p.galleon--;
			}
			result.sickle = p.sickle-a.sickle;
			result.galleon = p.galleon -a.galleon;
		}else{
			if(p.kunt>a.kunt){
				a.kunt+=29;
				a.sickle--;
			}
			result.kunt = a.kunt-p.kunt;
			if(p.sickle>a.sickle){
				a.sickle+=17;
				a.galleon--;
			}
			result.sickle = a.sickle -p.sickle;
			result.galleon = a.galleon -p.galleon;
		}
		System.out.print(result.galleon + "." + result.sickle + "." + result.kunt);
	}
}

class Coin{
	int galleon;
	int sickle;
	int kunt;
	
	public Coin(){
		this.galleon = this.sickle = this.kunt = 0;
	}
	public Coin(String[] coin){
		this.galleon = Integer.valueOf(coin[0]);
		this.sickle = Integer.valueOf(coin[1]);
		this.kunt = Integer.valueOf(coin[2]);
	}
}