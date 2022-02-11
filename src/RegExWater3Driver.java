import java.util.Scanner;

public class RegExWater3Driver {
    public static void main(String args[])
    {
        RegExWater3 watone = new RegExWater3();
        watone.setWaterID("0000000");

        //watone.validateInfo();

        String temp = "long";
        if(temp.matches("(long)?"))
        {
            System.out.println("Congrats1");
        }

        temp = "longlonglong";
        if(temp.matches("(long)+"))// has to match the previous "long" if string isn't all long then no congrats
        {
            System.out.println("Congrats2");
        }

        temp = "longadfasdfadf";
        if(temp.matches("(long).*")) //only works for the character at the beginning of the string. The "." needs to be paired with*
        {
            System.out.println("Congrats3");
        }

        temp = "jasdlfjlajsdlkfjl1234567890ajskdfljsaljdflk";
        if(temp.matches("[^0-9]{0,}[0-9]{10}[^0-9]{0,}"))//this will check for a 10 digit number in the middle of the string
        {
            System.out.println("Congrats4");
        }

        temp = "long long";
        if(temp.matches("(long)+"))
        {
            System.out.println("Congrats5");
        }

    }//end driver method

    public void isWaterPresent(String random) {
        Scanner scan = new Scanner(System.in);
        if (random.matches("w(?!(w))[^wa]*a(?!(wa))[^wat]*t(?!(wat))[^wate]*e(?!(wate))[^water]*r")) {
            System.out.println("The word water is present in the string, disregarding any characters in between the characters of water");

            //(w){1}[^w]{0,}(a){1}([^w][^a]){0,}(t){1}([^w][^a][^t]){0,}(e){1}([^w][^a][^t][^e]){0,}
            //(w){1}[^water]{0,}(a){1}([^water]){0,}(t){1}([^water]){0,}(e){1}([water]){0,}
        }
    }
}
