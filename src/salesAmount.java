public class salesAmount {
    public static void main(String[] args)
    {
        String[] urunAdlari = {"Ürün 1", "Ürün 2", "Ürün 3"};
        double[] urunFiyatlari = {10.5, 20.0, 15.75};
        int[] gunlukSatisMiktarlari = {5,7,2};

        double toplamSatisGeliri = 0.0;
        for (int i = 0; i < urunAdlari.length; i++)
        {
            double urunToplamFiyat = urunFiyatlari[i] * gunlukSatisMiktarlari[i];
            toplamSatisGeliri += urunToplamFiyat;
        }

        System.out.println("Toplam Satış Geliri: " + toplamSatisGeliri);
    }
}