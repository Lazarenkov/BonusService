package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void shouldReturn1000WhenAmount0() {
        int expected = 1000;
        int actual = cashbackHackService.remain(0);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999WhenAmount1() {
        int expected = 999;
        int actual = cashbackHackService.remain(1);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn1WhenAmount999() {
        int expected = 1;
        int actual = cashbackHackService.remain(999);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0WhenAmount1000() {
        int expected = 0;
        int actual = cashbackHackService.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn999WhenAmount1001() {
        int expected = 999;
        int actual = cashbackHackService.remain(1001);
        assertEquals(expected, actual);
    }

}