package ru.netology;

public class CashbackHackServiceTest {
    @org.junit.Test
    /// При нулевой покупке
    public void CashbackHackServiceTestFirst() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(cashbackHackService.remain(0), 1_000);
    }

    @org.junit.Test
    /// Стоимость покупки составляет  1 рубль
    public void CashbackHackServiceTestSecond() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(cashbackHackService.remain(1), 999);
    }

    @org.junit.Test
    /// Стоимость покупки составляет  549 рублей
    public void CashbackHackServiceTestThird() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(cashbackHackService.remain(476), 524);
    }

    @org.junit.Test
    /// Стоимость покупки составляет  999 рублей
    public void CashbackHackServiceTestFourth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(cashbackHackService.remain(999), 1);
    }

    @org.junit.Test
    /// Стоимость покупки составляет  1000 рублей / Баг
    public void CashbackHackServiceTestFifth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(cashbackHackService.remain(1_000), 0);
    }

    @org.junit.Test
    /// Стоимость покупки составляет  1001 рублей
    public void CashbackHackServiceTestSixth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(cashbackHackService.remain(1_001), 999);
    }
}
