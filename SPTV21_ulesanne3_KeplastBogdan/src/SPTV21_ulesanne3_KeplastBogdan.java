import java.util.Scanner;
public class SPTV21_ulesanne3_KeplastBogdan {
        public static int yearAns;
        static enum mounth {Januar,Veebruar,
            Mart, Aprill, Mai, Juuni, Juuli,
            August, September, Oktoober, Novenmer, Disember}
        public static void main(String[] args) {
            System.out.println("Введите Имя, фамилию и исикукод(как только ввели что-то, нажимаете на ентер) ");
            Scanner scanner_name = new Scanner(System.in);
            String firstName = scanner_name.nextLine();
            Scanner scanner_lastname = new Scanner(System.in);
            String secondName = scanner_lastname.nextLine();
            Scanner scanner_isik = new Scanner(System.in);
            String Isik = scanner_isik.nextLine();
            String year = String.valueOf(Isik);
            year = year.substring(1, 3);
            int year1 = new Integer(year);
            if(year1>0 && year1<24){
                yearAns = 20;
            } else {
                yearAns = 19;
            }
            String mounth1 = String.valueOf(Isik);
            mounth1 = mounth1.substring(3,5);
            int mounth2 = new Integer(mounth1);
            String day = String.valueOf(Isik);
            day = day.substring(5,7);

            System.out.println(secondName+" "+firstName+" "+" родился "+mounth.values()[mounth2-1]+" "+day+" "+yearAns+year +" года ");
    }
}
