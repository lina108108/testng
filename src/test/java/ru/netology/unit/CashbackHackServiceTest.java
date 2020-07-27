package ru.netology.unit;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturn1000IfAmountIsZero() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountIsStandart() {
        CashbackHackService service = new CashbackHackService();

        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountLoverBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountIsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountHigherBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalculateRemainIfAmountIsLessZero() {
        CashbackHackService service = new CashbackHackService();

        int amount = -1;

        int actual = service.remain(amount);
        int expected = 1001;

        assertEquals(expected, actual);
    }
}