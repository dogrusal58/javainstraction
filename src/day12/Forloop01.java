package day12;

public class Forloop01 {

	public static void main(String[] args) {
		//ilk 30 sayma say�s�n�n toplam�n� ekrana yazd�r�n�z
		int sum = 0;
		for(int i= 1;i<=30;i++) {sum=sum+i;
		
		}
		System.out.println(sum);
		//sadece final sonucunu g�rmek isterseniz System.out.println(sum); ifadesini for-loop un d���na yaz�n.
		//her loop tan sonrakitoplam� g�rmek isterseniz i�ine yaz�n
		
		//ilk 10 sayma say�s�n�n �arp�m�n� yazd�ral�m.
		
		int j = 1;
		for(int k =1;k<=10;k++) { j=j*k;
		
		}
		System.out.println(j);

	}

}
