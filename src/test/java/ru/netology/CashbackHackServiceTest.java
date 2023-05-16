package ru.netology;


public class CashbackHackServiceTest {
    @org.junit.Test
    /// При нулевой покупке
    public void CashbackHackServiceTestFirst() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(1_000, cashbackHackService.remain(0));
    }

    @org.junit.Test
    /// Стоимость покупки составляет  1 рубль
    public void CashbackHackServiceTestSecond() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(999, cashbackHackService.remain(1));
    }

    @org.junit.Test
    /// Стоимость покупки составляет  549 рублей
    public void CashbackHackServiceTestThird() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(524, cashbackHackService.remain(476));
    }

    @org.junit.Test
    /// Стоимость покупки составляет  999 рублей
    public void CashbackHackServiceTestFourth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(1, cashbackHackService.remain(999));
    }

    @org.junit.Test
    /// Стоимость покупки составляет  1000 рублей / Баг
    public void CashbackHackServiceTestFifth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(0, cashbackHackService.remain(1_000));
    }

    @org.junit.Test
    /// Стоимость покупки составляет  1001 рублей
    public void CashbackHackServiceTestSixth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.Assert.assertEquals(999, cashbackHackService.remain(1_001));
    }

    ///////////////////////////////////////////////////////////////////////////////////////
    @org.junit.jupiter.api.Test
    public void CashbackHackServiceTestSeventh() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.jupiter.api.Assertions.assertEquals(1_000, cashbackHackService.remain(0));
    }

    @org.junit.jupiter.api.Test
    /// Стоимость покупки составляет  1 рубль
    public void CashbackHackServiceTestEighth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.jupiter.api.Assertions.assertEquals(999, cashbackHackService.remain(1));
    }

    @org.junit.jupiter.api.Test
    /// Стоимость покупки составляет  549 рублей
    public void CashbackHackServiceTestNinth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.jupiter.api.Assertions.assertEquals(524, cashbackHackService.remain(476));
    }

    @org.junit.jupiter.api.Test
    /// Стоимость покупки составляет  999 рублей
    public void CashbackHackServiceTestTenth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.jupiter.api.Assertions.assertEquals(1, cashbackHackService.remain(999));
    }

    @org.junit.jupiter.api.Test
    /// Стоимость покупки составляет  1000 рублей / Баг
    public void CashbackHackServiceTestEleventh() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.jupiter.api.Assertions.assertEquals(0, cashbackHackService.remain(1_000));
    }

    @org.junit.jupiter.api.Test
    /// Стоимость покупки составляет  1001 рублей
    public void CashbackHackServiceTestTwelfth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.junit.jupiter.api.Assertions.assertEquals(999, cashbackHackService.remain(1_001));
    }
}
