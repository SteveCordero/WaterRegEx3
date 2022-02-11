import java.util.Scanner;
import java.util.regex.*;

public class RegExWater3Driver {
    public static void main(String args[])
    {
        RegExWater3 watone = new RegExWater3();
        watone.setWaterID("0000000");

        isWaterPresent();



    }//end driver method

    public static void isWaterPresent() {
        Scanner scan = new Scanner(System.in);
        String random = scan.nextLine();

        //put your regex expression into a string
        String regex = "w(?!(w))[^wa]{0,}a(?!(wa))[^wat]{0,}t(?!(wat))[^wate]{0,}e(?!(wate))[^water]{0,}r";

        //create a pattern object to hole the regex expression held in the string
        Pattern water = Pattern.compile(regex);

        //create a Matcher object to be able to match the RegEx to the string of interest using "lookingAt()" method

        for(int i =0; i < random.length()-5;i++)
        {
            if(random.charAt(i)=='w')
            {
                System.out.println(random);
                Matcher matcher = water.matcher(random.substring(i));
                if (matcher.lookingAt()) {
                    System.out.println("The word water is present in the string, disregarding any characters in between the characters of water");

                    //(w){1}[^w]{0,}(a){1}([^w][^a]){0,}(t){1}([^w][^a][^t]){0,}(e){1}([^w][^a][^t][^e]){0,}
                    //(w){1}[^water]{0,}(a){1}([^water]){0,}(t){1}([^water]){0,}(e){1}([water]){0,}
                }
                System.out.println(matcher.lookingAt());
            }


        }

    }
}
