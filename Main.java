public class Main{
    public static void main(String[] args){
        // Buradaki açtığımız sınıfı dizi olarak kullandık(array).
        // Base logger array'in içindekilerinin hepsinin annesi olduğu için kabul etti. Eğer BaseLogger'ı extends etmeyen bir sınıf koysaydık o zaman hata alıcaktık.
        BaseLogger[] loggers =new BaseLogger[]{new FileLogger(), new ConsoleLogger(), new DatabaseLogger()};

        // BaseLogger yerine mesela filelogger diyemezdik çünkü extends'in kaynağı BaseLogger
        for (BaseLogger baseLogger : loggers) { // baseLogger loggers'taki bütün elemanları dolaşıcak.
            baseLogger.log("Log Mesaji"); // Bu kodda bütün hepsi çalıştı.
        }
    }
}