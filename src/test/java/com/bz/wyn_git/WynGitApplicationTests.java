package com.bz.wyn_git;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WynGitApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("one");
    }

    public static void main(String[] args) {
        System.out.println("111");
        System.out.println("Git上些的代码");
    }

    @Test
    public void testThree() {
        System.out.println("three");
    }

    @Test
    public void testThre() {
        System.out.println("本地写的代码");
        System.out.println("本地追加");
        System.out.println("本地追加2");
        System.out.println("本地追加3");
        int b =15;
        int a =12;
        for (int i = 0; i < 100; i++) {
             a = b+a;
        }
        int c = 12;
        System.out.println(a + b);
    }
}
