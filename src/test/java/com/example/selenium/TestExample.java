package com.example.selenium;

import org.testng.Assert;

public class TestExample {
    public static void main(String[] args) {
        String actual = "Hello, TestNG!";
        String expected = "Hello, TestNG!";
        Assert.assertEquals(actual, expected, "Kiểm tra thất bại: Giá trị không khớp!");
        System.out.println("Kiểm tra thành công!");
    }
}
