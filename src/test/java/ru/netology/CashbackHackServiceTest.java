package ru.netology;


public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    /// При нулевой покупке
    public void CashbackHackServiceTestFirst() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(0),1000);
    }
    @org.testng.annotations.Test
    /// Стоимость покупки составляет  1 рубль
    public void CashbackHackServiceTestSecond() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(1),999);
    }
    @org.testng.annotations.Test
    /// Ограничение на отрицательную покупку / Баг
    public void CashbackHackServiceTestThird() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertThrows(RuntimeException.class, () ->{
            cashbackHackService.remain(-1);
        });
    }
    @org.testng.annotations.Test
    /// Стоимость покупки составляет  549 рублей
    public void CashbackHackServiceTestFourth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(549),451);
    }
    @org.testng.annotations.Test
    /// Стоимость покупки составляет  999 рублей
    public void CashbackHackServiceTestFifth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(999),1);
    }
    @org.testng.annotations.Test
    /// Стоимость покупки составляет  1000 рублей / Баг
    public void CashbackHackServiceTestSixth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(1000),0);
    }
    @org.testng.annotations.Test
    /// Стоимость покупки составляет  1001 рублей
    public void CashbackHackServiceTestSeventh() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(1001),999);
    }
}
