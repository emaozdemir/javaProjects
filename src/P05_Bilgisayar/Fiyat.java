package P05_Bilgisayar;


import java.util.*;

public class Fiyat {
    static Scanner scan=new Scanner(System.in);
    static List<Data> list=new ArrayList<>();
    static List<Integer> idList=new ArrayList<>();
    public void mainMenu() throws InterruptedException {
        System.out.println("\n ****ANA MENU****");
        System.out.println("Admin girisi icin - 1");
        System.out.println("Kullanici girisi icin - 2");
        System.out.println("Cikis icin - 3");
        System.out.println("Seciniz : ");
        int secim=0;
        try {
            secim=scan.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Hatali giris yaptin sadece sayısal değer girebilirsin harf değil. Tekrar dene");
            scan.nextLine();
            mainMenu();
        }
        if (secim==1){
            scan.nextLine();
            System.out.println("\nAdmin Kullanici Adinizi Giriniz");
            String admin=scan.nextLine();
            System.out.println("Sifrenizi giriniz");
            String sifre=scan.next();
            String adminUser="admin";
            String adminPass="admin01";
            if (admin.equals(adminUser)&&sifre.equals(adminPass)){
                System.out.println("\nAdmin Menuye Yonlendiriliyorsunuz");
                Thread.sleep(2000);//cte verir mainde throws InterruptedException yapar
                adminMenu();
            }else {
                System.out.println("Sifreniz veya kullanici adiniz hatali. Tekrar deneyiniz");
                mainMenu();
            }
        } else if (secim==2) {
            if (!list.isEmpty()){
                printf();
                System.out.println("Lutfen ID girerek bir bilgisayar seciniz");
                int id=scan.nextInt();
                if (idList.contains(id)){
                    int totalFiyat=getFiyat(id);
                    System.out.println("Laptop fiyati = "+totalFiyat);
                    System.out.println("Indirimli Fiyat = "+getDiscount(totalFiyat,20));
                    System.out.println("Urun Sepete eklenmistir");
                }else {
                    System.out.println("Kayitli olmayan bir bilgisyar sectiniz");
                    mainMenu();
                }
            }else {
                System.out.println("Sitemiz bakimdadir cikis yapiyorsunuz yeniden bekleriz");
            }
        } else if (secim==3) {
            System.out.println("Cikis yapiyorsunuz. Tekrar bekleriz");
        }else {
            System.out.println("Hatali giris. Tekrar deneyiniz");
            mainMenu();
        }
    }

    private int getDiscount(int totalFiyat, int discount) {
        return totalFiyat-(totalFiyat*discount/100);
    }

    private int getFiyat(int id) {
        int index=idList.indexOf(id);
        Data data=list.get(index);
        return Hesap.getRam(data.getRam())+Hesap.getCPU(data.getCpu())+
                Hesap.getColor(data.getColor())+Hesap.getSize(data.getBoyut());
    }

    private void adminMenu() throws InterruptedException {
        System.out.println("*** ADMİN MENÜSÜ ***");
        System.out.println("Bilgisayar eklemek için - 1");
        System.out.println("Bilgisayar silmek için - 2");
        System.out.println("Bilgisayarlari görüntülemek için - 3");
        System.out.println("Bilgisayar guncelleme - 4");
        System.out.println("Ana menüye dönmek icin - 5");
        System.out.println("Çıkış için - 6");
        System.out.print("Seçiniz : ");
        int secim = scan.nextInt();
        scan.nextLine();
        if (secim == 1) bilgisayarEkleme();
        else if (secim == 2) bilgisayarSilme();
        else if (secim == 3) bilgsayarlariGoruntule();
            //else if (secim == 4) bilgisayarGuncelleme();
        else if (secim == 5) mainMenu();
        else if (secim == 6) System.out.println("\nÇıkış yaptnız.");
        else {
            System.out.println("\nHatalı Giriş. Yeniden Deneyiniz.");
            adminMenu();
        }
    }

    private void bilgsayarlariGoruntule() throws InterruptedException {
        System.out.println("Bilgisayar listemiz asagidadir : ");
        printf();
        System.out.println();
        Thread.sleep(2000);
        adminMenu();
    }

    private void bilgisayarSilme() throws InterruptedException {
        System.out.println();
        printf();
        try {
            System.out.println("Silmek istediginiz bigisayarin ID'sini giriniz : ");
            int id=scan.nextInt();
            if (idList.contains(id)){
                int index=idList.indexOf(id);
                Data data=list.remove(index);
                System.out.println(data+" bilgisayari basariyla silindi.\nAdmin menuye yonlendiriliyorsunuz");
                idList.remove(index);
                Thread.sleep(2000);
                adminMenu();
            }else {
                throw new ResourceNotFoundException(id+" nolu id sistemde kayitli degil");
            }
        }catch (ResourceNotFoundException e){
            System.out.println(e.getMessage());
            adminMenu();
        }

    }

    private void bilgisayarEkleme() throws InterruptedException {
        System.out.println();
        try {
            System.out.println("Bilgisayarin markasini giriniz : ");
            String marka=scan.nextLine();
            marka=marka.substring(0,1).toUpperCase()+marka.substring(1);
            System.out.println("Bilgisayarin modelini giriniz : ");
            String model=scan.nextLine();
            model=model.substring(0,1).toUpperCase()+model.substring(1);
            System.out.println("Bilgisayarin ramini giriniz : ");
            String ram=scan.next().toLowerCase();
            System.out.println("Bilgisayarin cpu giriniz : ");
            String cpu=scan.next().toLowerCase();
            System.out.println("Bilgisayarin boyutunu giriniz : ");
            String size=scan.next();
            System.out.println("Bilgisayarin rengini giriniz : ");
            scan.nextLine();
            String color=scan.nextLine();
            color=color.substring(0,1).toUpperCase()+color.substring(1);
            Data data=new Data();
            data.setMarka(marka);
            data.setModel(model);
            data.setRam(ram);
            data.setCpu(cpu);
            data.setBoyut(size);
            data.setColor(color);
            list.add(data);
            int dataId=Data.laptopID++;
            idList.add(dataId);
            System.out.println("Bilgisayar basariyla eklendi.\nAdmin menuye yonlendiriliyorsunuz");
            Thread.sleep(2000);
            adminMenu();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Her degiskene bir deger atamak gerekiyor");
            bilgisayarEkleme();
        }
    }

    private void printf() {
        System.out.printf("%20s%20s%20s%20s%20s%20s%20s", "LaptopID", "Marka", "Model", "Ram", "CPU", "Boyut", "Color");
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%20s%20s%20s%20s%20s%20s%20s\n", idList.get(i), list.get(i).getMarka(),
                    list.get(i).getModel(), list.get(i).getRam(), list.get(i).getCpu(), list.get(i).getBoyut(), list.get(i).getColor());
        }
    }}