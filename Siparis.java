package restoranUygulamasi;

//Siparis.java
//Bu sınıf bir siparişi temsil eder.
//Kapsülleme (encapsulation): değişkenler private, erişim metotlarla sağlanır.

public class Siparis {
 private String yemekAdi;
 private double fiyat;    	// yemekAdi ve fiyat private değişkenleri ile tanımlanır ve dışarıdan doğruca etkilenemez

 public Siparis(String yemekAdi, double fiyat) {
     this.yemekAdi = yemekAdi; // sınıfın içindeki değişkene atanır
     this.fiyat = fiyat;	   // sınıfın içindeki değişkene atanır
 }

 public String getYemekAdi() {
     return yemekAdi;
 }

 public double getFiyat() {   //bu iki get metot dışarıdan bu bilgilere güvenli erişimi sağlar
     return fiyat;
 }
}
// özetle bu sınıf bir siparişin içeriğini tutar (yemek+fiyat) tutulur