import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegExWater3Test {

    @Test
    void is01234567ValidID(){
        RegExWater3 test = new RegExWater3();
        test.setWaterID("01234567");
        test.setName("test");
        test.validateInfo();
    }



    @Test
    void is012345ValidID(){
        RegExWater3 test = new RegExWater3();
        test.setWaterID("012345");
        test.setName("test");
        test.validateInfo();
    }



    @Test
    void is0asdf0123456ssbValidID(){
        RegExWater3 test = new RegExWater3();
        test.setWaterID("0asdf0123456ssb");
        test.setName("test");
        test.validateInfo();
    }



    @Test
    void is0asdf012345ssbValidNameAndID(){
        RegExWater3 test = new RegExWater3();
        test.setWaterID("0asdf012345ssb");
        test.setName("19hello");
        test.validateInfo();
    }



    @Test
    void is1234567890ValidWaterAge(){
        RegExWater3 test = new RegExWater3();
        test.setWaterID("000000");
        test.setName("test");
        test.setWaterAge("1234567890");
        test.validateInfo();
    }



    @Test
    void is12345678901234ValidWaterAge(){
        RegExWater3 test = new RegExWater3();
        test.setWaterID("000000");
        test.setName("test");
        test.setWaterAge("12345678901234");
        test.validateInfo();
    }



    @Test
    void is12ValidWaterAge(){
        RegExWater3 test = new RegExWater3();
        test.setWaterID("000000");
        test.setName("test");
        test.setWaterAge("12");
        test.validateInfo();
    }



//    @Test
//    void setWaterID() {
//    }
//
//    @Test
//    void getWaterID() {
//    }
//
//    @Test
//    void setWaterAge() {
//    }
//
//    @Test
//    void getWaterAge() {
//    }
//
//    @Test
//    void setName() {
//    }
//
//    @Test
//    void getName() {
//    }
//
//    @Test
//    void validateInfo() {
//    }
//
//    @Test
//    void testToString() {
//    }
}