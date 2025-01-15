package com.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {
    public static void main(String[] args) {
        // Đường dẫn đến Edge WebDriver
        System.setProperty("webdriver.edge.driver", "E:\\Lms\\msedgedriver.exe");

        // Khởi tạo WebDriver cho Edge
        WebDriver driver = new EdgeDriver();

        try {
            // Mở trang web mẫu
            driver.get("file:///E:/Lms/selenium/src/main/resources/index.html");

            // Test trường hợp đăng nhập thành công
            WebElement usernameField = driver.findElement(By.id("username"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("loginButton"));

            usernameField.sendKeys("admin");
            passwordField.sendKeys("1234");
            loginButton.click();

            // Kiểm tra kết quả
            WebElement resultDiv = driver.findElement(By.id("result"));
            String successMessage = resultDiv.getText();
            if ("Đăng nhập thành công!".equals(successMessage)) {
                System.out.println("Test đăng nhập thành công: Passed");
            } else {
                System.out.println("Test đăng nhập thành công: Failed");
            }

            // Test trường hợp đăng nhập thất bại
            usernameField.clear();
            passwordField.clear();
            usernameField.sendKeys("wrong_user");
            passwordField.sendKeys("wrong_password");
            loginButton.click();

            String errorMessage = resultDiv.getText();
            if ("Tên đăng nhập hoặc mật khẩu sai!".equals(errorMessage)) {
                System.out.println("Test đăng nhập thất bại: Passed");
            } else {
                System.out.println("Test đăng nhập thất bại: Failed");
            }

        } finally {
            // Đóng trình duyệt
            driver.quit();
        }
    }
}
