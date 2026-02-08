package K38_Week05_SampleJavaQuestions;

public class RG50_YouTubeUrlReturnEtme {
    public static void main(String[] args) {
        /*50-----
    Youtube video sayfasının urlsinde yer alan video id'sini
    return eden bir method yazınız :

     ÖRNEKLER
    youtubeId("https://www.youtube.com/watch?v=XPEr1cArWRg")
    ID : XPEr1cArWRg

    youtubeId("https://youtu.be/BCDEDi5gDPo")
    ID : BCDEDi5gDPo

    youtubeId("https://youtube.com/watch?t=4m40s&v=vxP3bY-XxY4")
    ID : vxP3bY-XxY4
    */

        String str="https://youtu.be/BCDEDi5gDPo";
        youtubeId(str);
    }

    public static void youtubeId(String str) {
        System.out.print(str.substring(str.length()-11));

    }
}
