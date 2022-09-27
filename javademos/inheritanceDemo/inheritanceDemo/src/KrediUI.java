public class KrediUI {
    //BaseKrediManager ile her iki krediyide yönetebildiğimiz için onu buraya atadık ve böylece daha temiz bir kod yazdık.
    //+ olarak değişime direnç göstermeyen bir programlama yapmış olduk.
    public void KrediHesapla(BaseKrediManager baseKrediManager){
    baseKrediManager.hesapla();
    }
}
