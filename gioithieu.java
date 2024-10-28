package com.mycompany.mavenproject1;

import java.util.Scanner;

public class gioithieu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine();
        System.out.print("Nhập lớp: ");
        String className = scanner.nextLine();
        System.out.print("Nhập mã số sinh viên: ");
        String studentId = scanner.nextLine();
        System.out.println("Thông tin sinh viên:");
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Lớp: " + className);
        System.out.println("Mã số sinh viên: " + studentId);
    }
}
