package K33_maps.D01_bilgilereUlasma;

import java.util.*;

public class C04_OgrenciMap {

    public static Map<Integer, String> ogrenciMap = new HashMap<>();

    static {
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
        ogrenciMap.put(107, "Esra-Han-11-M-SOZ");


    }


    public static void numaradanOgrenciBul(int ogrenciNo) {

        String ogrenciValue = ogrenciMap.get(ogrenciNo);

        String[] valueArr = ogrenciValue.split("-");

        System.out.println(ogrenciNo + " numaralı ögrenciye ait bilgiler: ");

        System.out.println(

                valueArr[2] + " " +
                        valueArr[3] + " " +
                        valueArr[0] + " " +
                        valueArr[1]

        );


    }

    public static void soyIsimdenOgrenciBul(String soyIsim) {
        Collection<String> ogrenciValues = ogrenciMap.values();
        System.out.println("Soyismi " + soyIsim + " olan ogrenciler : ");


        for (String each : ogrenciValues) {

            String[] valueList = each.split("-");


            if (valueList[1].equalsIgnoreCase(soyIsim)) {

                System.out.println(


                        valueList[2] + " " +
                                valueList[3] + " " +
                                valueList[0] + " " +
                                valueList[1]

                );


            }

        }
    }

    public static void isimdenOgrenciBul(String isim) {


        Set<Integer> isimKeySet = ogrenciMap.keySet();


        for (Integer each : isimKeySet) {

            String eachValue = ogrenciMap.get(each);

            String[] valueArr = eachValue.split("-");

            if (valueArr[0].equalsIgnoreCase(isim)) {


                System.out.println(

                        each + " " +
                                valueArr[2] + " " +
                                valueArr[3] + " " +
                                valueArr[0] + " " +
                                valueArr[1]


                );
            }

        }
    }

    public static void subeListesiYazdir(Integer sinif, String sube) {

        Set<Integer> keySeti = ogrenciMap.keySet();

        for (Integer eachkey : keySeti) {

            String eachValue = ogrenciMap.get(eachkey);

            String[] valueArr = eachValue.split("-");

            if (valueArr[2].equalsIgnoreCase(sinif + "") && valueArr[3].equalsIgnoreCase(sube)) {

                System.out.println(

                        eachkey + " " + valueArr[0] + " " + valueArr[1]

                );


            }
        }
    }

    public static void numaradanSoyIsimUpdate (int verilenNo,String yeniSoyisim){
        String verilenNoValue=ogrenciMap.get(verilenNo);

        String [] valueArr= verilenNoValue.split("-");

        valueArr [1]=yeniSoyisim;

        String yeniValueNo=String.join("-",valueArr);

        ogrenciMap.replace(verilenNo,yeniValueNo);

        System.out.println(ogrenciMap);



    }

    public static void ogrenciEkle (){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ogrenci no girin: ");
        int ogrenciNo= scanner.nextInt();

        String ogrenciValue="";



        scanner.nextLine();
        System.out.println("Ogrenci ismini girin: ");
        ogrenciValue+=scanner.nextLine();
        ogrenciValue+="-";

        System.out.println("Ogrenci soyismini girin: ");

        ogrenciValue+=scanner.nextLine();
        ogrenciValue+="-";


        System.out.println("Ogrenci sınıfını girin: ");

        ogrenciValue+=scanner.nextLine();
        ogrenciValue+="-";


        System.out.println("Ogrenci şubesini girin: ");
        ogrenciValue+=scanner.nextLine();
        ogrenciValue+="-";

        System.out.println("Ogrenci bölümünü girin: ");
        ogrenciValue+=scanner.nextLine();

        ogrenciMap.put(ogrenciNo,ogrenciValue);

    }

    public static void subeUpdate (int sinif,String eskiSube,String yeniSube){



        Set<Integer> ogrenciKeySeti= ogrenciMap.keySet();

        for (Integer eachKey  :ogrenciKeySeti ) {

            String eachValue =ogrenciMap.get(eachKey);

            String [] eachValueArr= eachValue.split("-");

            if (eachValueArr [2].equalsIgnoreCase(sinif+"")
                    && eachValueArr [3].equalsIgnoreCase(eskiSube)){

                eachValueArr [3]=yeniSube;


                String yeniValue= String.join("-",eachValueArr);

                ogrenciMap.put(eachKey,yeniValue);
            }


        }
    }

    public static void bolumUpdate (String eskiBolum, String yeniBolum){


        Set<Integer> ogrenciKeySeti= ogrenciMap.keySet();

        for (Integer eachKey  :ogrenciKeySeti ) {

            String eachValue =ogrenciMap.get(eachKey);

            String [] eachValueArr= eachValue.split("-");

            if (eachValueArr[4].equalsIgnoreCase(eskiBolum)){

                eachValueArr [4]=yeniBolum;
            }

                String yeniValue= String.join("-",eachValueArr);

                ogrenciMap.put(eachKey,yeniValue);
            }


        }

    public static void yilSonuSinifArtir (){


        Set<Integer> ogrenciKeySeti= ogrenciMap.keySet();

        for (Integer eachKey  :ogrenciKeySeti ) {

            String ogrenciValue=ogrenciMap.get(eachKey);

            String [] ogrenciValueArr=ogrenciValue.split("-");


            String eskiSinif=ogrenciValueArr [2];

            switch (eskiSinif){

                case "9":
                    ogrenciValueArr [2]="10";
                    break;

                case "10":
                    ogrenciValueArr [2]="11";
                    break;

                case "11":
                    ogrenciValueArr [2]="12";
                    break;
                case "12":
                    ogrenciValueArr [2]="Mezun";



            }

            String yeniValue= String.join("-",ogrenciValueArr);
            ogrenciMap.put(eachKey,yeniValue);

        }
    }

    }










