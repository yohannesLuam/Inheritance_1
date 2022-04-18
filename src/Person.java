import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {


        String surnameYohannes56390, firstNameYohannes56390, streetYohannes56390, cityYohannes56390,
                zipCodeYohannes56390;
        void initialize() throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter surname.");
            surnameYohannes56390= br.readLine();
            System.out.println("Enter first name.");
            firstNameYohannes56390= br.readLine();
            System.out.println("Enter street.");
            streetYohannes56390= br.readLine();
            System.out.println("Enter city.");
            cityYohannes56390= br.readLine();
            System.out.println("Enter zipcode.");
            zipCodeYohannes56390= br.readLine();
        }

        void print(){
            System.out.println("Surname: " + surnameYohannes56390 );
            System.out.println("First name: " + firstNameYohannes56390 );
            System.out.println("Street: " + streetYohannes56390 );
            System.out.println("City: " + cityYohannes56390 );
            System.out.println("ZipCode: " + zipCodeYohannes56390 );
        }
    }

    class Staff extends Person implements Salary{
        String education, position;

        void initialize1()throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            initialize();
            System.out.println("Enter Education.");
            education = br.readLine();
            System.out.println("Enter Position.");
            position = br.readLine();

        }
        void print1(){
            print();
            System.out.println("Education: " + education);
            System.out.println("Position: " + position);
        }

        @Override
        public int salaryToPay(int hoursYohannes56390, int rateYohannes56390) {
            return hoursYohannes56390 * rateYohannes56390;
        }


    }


    class Caller {
        public static void main(String[] args) throws IOException {
            Staff Yohannes56390 = new Staff();
            Yohannes56390.initialize1();
            Yohannes56390.print1();
        }
    }

    interface Salary {
    int salaryToPay (int hoursYohannes56390, int rateYohannes56390);

    default int salaryForOvertime (int overHoursYohannes56390, int overRateYohannes56390){
        return overHoursYohannes56390 * overRateYohannes56390;
    }
    static boolean bonusEligibility (int yearsOfExperienceYohannes56390){
        return yearsOfExperienceYohannes56390 > 5;
    }
    }


