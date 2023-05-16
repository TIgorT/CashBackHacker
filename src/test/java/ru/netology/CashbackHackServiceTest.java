package ru.netology;

public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void cashbackHackServiceTestFirst() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(0), 1_000);
    }

    @org.testng.annotations.Test
    public void cashbackHackServiceTestSecond() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(1), 999);
    }

    @org.testng.annotations.Test
    public void cashbackHackServiceTestThird() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(476), 524);
    }

    @org.testng.annotations.Test
    public void cashbackHackServiceTestFourth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(999), 1);
    }

    @org.testng.annotations.Test
    public void cashbackHackServiceTestFifth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(1_000), 0);
    }

    @org.testng.annotations.Test
    public void cashbackHackServiceTestSixth() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        org.testng.Assert.assertEquals(cashbackHackService.remain(1_001), 999);
    }
}
