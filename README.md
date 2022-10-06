# JavGANYAN

---
JAVGANYAN (JAVA + GANYAN)

Laboratuvar dersinde loto örneği üzerinde yaptığımız çalışma sonucu aklıma takılan
ve kendimce eğlenceli olduğunu düşündüğüm "At yarışında tahmini olarak kazanacak atın
eldeki verilerle incelenmesi" konusunda bir çalışma yaptım.
At yarışından pek anlamadığım için kendimce yorumladığım koşullar şunlar;

 1 -> 4  adet at yarışmakta
 2 -> yarışma tur tur değil tek turmuş gibi varsayalım
 
---

Notlar:
  	Sınırlı bilgiye sahip olduğum için yaptığım araştırma sonucu dosya işlemleri (txt) ile yapmaya karar verdim. İleriki aşamada veri xls veya farklı bir türde dosyadan çekilebilir.

   Dosya verilerini integer tipinde çekmenin yolunu bulamadığımdan bu aşamada verileri kod içinde işleyeceğim. 
  Yarışmada her atın verilerinin saklandıgı kendi dosyası var.


---
   Kriterler:<br><br>
         **Sağlık Durumu**<br>
        ** Hız**<br>
         **Güç**<br>
         **Son yarışma sıralaması**<br>

   Puanlama: <br><br> **İYİ->ORTA->KÖTÜ***

---

Proje sırasında fark ettiklerim 
⁃	Dosya işlemlerinin farklı işlevleri olduğu; kapsama alanının sadece txt dosyaları gibi değil bu verilerin excel vs. Gibi platformlar ile de yapılabileceği veya bu tarz bir işlemin bir veri tabanından direk olarak çekilebileceği.
⁃	Projeye ilk başladığımda — File file = new File(“dosyaismi.txt”); — kısmında, “dosya ismi” ibaresini fonksiyon içerisinde değiştiremediğimden her at için ayrı bir fonksiyon oluşturdum, 140 satırlık kodun 60 ı fonksiyonlardan oluşmaktaydı. Bu kısım kendimi çok tekrar ettirmemi sağladı. Bu kısmı her dosya adını bir String formatında değişkene atayıp fonksiyon değerini de bununla kullanabileceğimi fark ettim


Proje hataları - sorunlar 
⁃	Dosya işlemlerinden int veri tipi çekmeyi başaramadığından ötürü işlem kısmında kendimi çok fazla sınırlamak zorunda kaldım
⁃	Dosyalar at başına açıldığı için karışıklık yaratma ihtimali bulunmakta



