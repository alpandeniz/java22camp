package intro;

import javax.sound.midi.SysexMessage;

public class Main {
	// main javada başlangıç noktasıdır
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		// değişken isimlendirmeleri Java'da camelCase(kelimenin ilk harfi küçük sonraki kelimelerin ilk harfi büyük) yazılır
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		// Tanımlanmış olan veriler tırnak işareti olmadan yazılır
		System.out.println(ortaMetin);
	
		//integer = tam sayı
		int vade = 12;
		
		//double = ondalıklı sayı
		double dolarDun = 18.25;
		double dolarBugun = 18.35;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "down.svg";
		
		if (dolarBugun<dolarDun) { //false
			okYonu = "down.swg";
			System.out.println(okYonu);
		} 
		else if(dolarBugun>dolarDun) 
		{
			okYonu = "up.swg";
			System.out.println(okYonu);	
		}
		
		else {
			okYonu = "equal.swg";
			System.out.println(okYonu);
		}
		//array toplu olan veriler , köşeli parantez [] veri listesi için
		String[] krediler = {
				"hızlı kredi" , "halk kredi", "mutlu emekli"};
	
		
	//for döngü yapmak için kullanılır
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);

			
		}
		
	}
	
	

}
