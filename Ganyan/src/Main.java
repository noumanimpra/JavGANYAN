import java.io.*;           //dosya işlemleri için ilgili kütüphane
import java.util.Arrays;    //min max işlemini hızlıca yaptırmak için yaptırmak için array kütüphanesi
public class Main {
    public static void main(String[] args) throws IOException {  //Bir ifadede derleme hatası aldıgımdan dolayı throws kullandım.
            int [] puanTablosu =new int[4];        //atların puanlarının saklanacagı array
            int at1Puan,at2Puan,at3Puan,at4Puan;   //geçici olarak puanları saklayacak deegişken
            String file1 ="at1.txt";
            String file2 ="at2.txt";
            String file3 ="at3.txt";
            String file4 ="at4.txt";
            at1Puan = at1veri(file1);                    //at başına hazırladıgım fonksiyon verileri işleyip array dizisine atmakta
            puanTablosu[0]=at1Puan;
            at2Puan = at1veri(file2);
            puanTablosu[1]=at2Puan;
            at3Puan = at1veri(file3);
            puanTablosu[2]=at3Puan;
            at4Puan = at1veri(file4);
            puanTablosu[3]=at4Puan;

            System.out.println("---------------------------------------");
            System.out.println("Verileri alınan atların sırası ile puanları alttaki gibidir.");
            for(int i=0;i<puanTablosu.length;i++)                                       //atların toplam puanını göster
                System.out.println("At ["+(i+1)+"]"+"puan: "+puanTablosu[i]);

            System.out.println("---------------------------------------");
            int max= Arrays.stream(puanTablosu).max().getAsInt();                              //dizi içi maximumu bul
            System.out.println("Alınan veriye göre ["+ max+"] puanlı at yarışı kazanacak:");  //kazanacak atı yazdır
            System.out.println("---------------------------------------");



    }
    /*
    Bu kısımda at başına veri çekme işlemi yaptırdım
     */
    public static int at1veri(String b) throws IOException {  //Dosya işlemleri fonksiyonunu kullanırken aldıgım hata
                                                             //sebebi ile throws kullandım
        File file = new File(b);                      //ilgili dosyayı aç(burada veriler var oldugu için "var olmama durumunu ele almadım")
        FileReader fReader = new FileReader(file);    //yeni  reader atadım
        String line;
        int at1=0;
        int a=0;
        BufferedReader bReader = new BufferedReader(fReader);
        while((line = bReader.readLine())!=null){   //satır null(boş) olana kadaar sayfayı oku
            if(line.equals("GOOD"))
                at1=10;
            else if(line.equals("NOT BAD"))
                at1=5;
            else if(line.equals("BAD"))
                at1=0;
            a+=at1;
        }
        bReader.close();
        return a;
    }
}