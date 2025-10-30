package restoranUygulamasi;
//bu sınıf uygulamanın main metodudur.sistem buaradan başlar
import java.util.Scanner; // scanner ile kullanıcıdan veri alınır

		public class RestoranUygulamasi {
		    public static void main(String[] args) {
		        Scanner giris = new Scanner(System.in); //kullanıcıdan veri alınır.restron sınıfında oluşturulmuş nesne siparişleri burada tutacak
		        Restoran restoran = new Restoran();

		        int secim;
		        do {
		            System.out.println("\n=== RESTORAN SİPARİŞ SİSTEMİ ===");
		            System.out.println("1- Sipariş Ekle");
		            System.out.println("2- Siparişleri Listele");
		            System.out.println("3- Tüm Siparişleri Sil");
		            System.out.println("4- Çıkış");
		            System.out.print("Seçiminiz: ");//menüyü ekrana getirir.kullanıcı 1 ile 4 arasında seçim yapar
		            secim = giris.nextInt(); // kullanılacak sayısal giriş alır
		            giris.nextLine(); // Boşluk hatasını önler.satır atlatılmasın diye yazdık

		            switch (secim) {
		                case 1:
		                    System.out.print("Yemek adı: ");
		                    String yemek = giris.nextLine();
		                    System.out.print("Fiyat: ");
		                    double fiyat = giris.nextDouble();
		                    Siparis yeniSiparis = new Siparis(yemek, fiyat);
		                    restoran.siparisEkle(yeniSiparis); //metodu ile listeye eklenir
		                    break;// kullanıcıdan yemek adı ve fiyat alınır.bu bilgilerle sipariş nesnesi oluşturulur
		                case 2:
		                    restoran.siparisleriListele();
		                    break; // restron sınıfındaki listeleme metodunu çağırır.Tüm siparişleri ve toplam tutarı gösterir
		                case 3:
		                    restoran.siparisleriTemizle();
		                    break; //tüm siparişleri siler(clear() metodu çalışır)
		                case 4:
		                    System.out.println("Sistemden çıkılıyor...");
		                    break;//kullanıcı 4'ü seçtiğinde döngüden çıkar. program sona erer
		                default:
		                    System.out.println("Geçersiz seçim!");// 1-4 dışında bir sayı girilirse bu mesaj çıkar
		            }
		        } while (secim != 4);//kullanıcı 4'ü seçene kadar döngü tekrarlanır.Böylece kullanıcı birden fazla işle yapabilir
		    }
		

	}


