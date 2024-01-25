package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FreelancerServiceTest {
    @Test
    public void testCalculateCase1() {
        FreelancerService service = new FreelancerService();
        int actual = service.calculate(10_000, 3000, 20_000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalculateCase2() {
        FreelancerService service = new FreelancerService();
        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

}
