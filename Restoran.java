package restoranUygulamasi;

//Restoran.java
//Bu sınıf restoranın siparişlerini yönetir.
//Soyutlama: Kullanıcı sadece metotları kullanır, siparişlerin nasıl tutulduğunu bilmez.

import java.util.ArrayList;  //Arraylist tanımlanır bu liste yeni eleman eklemeye, silmeye , sayısını değiştirmemize yarar

public class Restoran {
 private ArrayList<Siparis> siparisListesi = new ArrayList<>(); //restron adında class oluşturduk ve içine tanımladığımız arraylist nesneleri (yemek+fiyat) burada saklanıyor

 // Yeni sipariş ekleme
 public void siparisEkle(Siparis s) {
     siparisListesi.add(s);
     System.out.println(s.getYemekAdi() + " siparişe eklendi.");//sipariş nesnesini alır ve add ile listeye ekler sonra sipariş eklendi diye ekrana yazdırır
 }

 // Siparişleri listeleme
 public void siparisleriListele() {
     if (siparisListesi.isEmpty()) {
         System.out.println("Henüz bir sipariş yok.");
         return;
     }

     System.out.println("\n--- Sipariş Listesi ---");
     double toplam = 0;
     for (Siparis s : siparisListesi) {
         System.out.println("- " + s.getYemekAdi() + " : " + s.getFiyat() + " TL");
         toplam += s.getFiyat();
     }
     System.out.println("Toplam Tutar: " + toplam + " TL");  // tüm siparişleri tek tek for-each döngüsü ile listeler. fiyatları toplayarak toplam tutarı gösterir
 }

 
 public void siparisleriTemizle() {
     siparisListesi.clear();
     System.out.println("Tüm siparişler silindi."); // clear metodu ile listedeki tüm siparişleri siler
 }
}