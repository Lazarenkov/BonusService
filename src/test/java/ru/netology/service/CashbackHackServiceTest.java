package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturn1WhenAmount999() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int actual = CashbackHackService.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1000WhenAmount1000() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int actual = CashbackHackService.remain(1000);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999WhenAmount1001() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int actual = CashbackHackService.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn1000WhenAmount0() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int actual = CashbackHackService.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn999WhenAmount1() {
        CashbackHackService CashbackHackService = new CashbackHackService();
        int actual = CashbackHackService.remain(1);
        int expected = 999;
        assertEquals(actual, expected);
    }

}