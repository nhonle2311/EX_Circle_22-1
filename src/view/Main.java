package view;

import model.Circle;
import manager.ManagerCircle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng đối tượng muốn tạo");
        int n = scanner.nextInt();
        Circle[] circles = new Circle[n];
        for (int i = 0; i < n; i++) {
            System.out.println("đối tượng thứ: " + (i + 1));
            circles[i] = new Circle();
            System.out.println("nhập radius");
            circles[i].setRadius(scanner.nextDouble());
            System.out.println(circles[i].toString());}
        ManagerCircle managerCircle = new ManagerCircle();
        while (true){
            System.out.println("menu");
            System.out.println("1. hiển thị thông tin các hình tròn");
            System.out.println("2. tính diện tích hình tròn");
            System.out.println("3. tính chu vi hình tròn");
            System.out.println("4. tìm bán kính lớn nhất");
            System.out.println("5. tính tổng diện tích các hình tròn");
            System.out.println("6. thoát");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for (int i = 0; i < n; i++) {
                        managerCircle.display(circles[i]);
                    }
                    break;
                case 2:
                    System.out.println("nhập id hình tròn muốn tính diện tích");
                    String id = scanner.next();
                    System.out.println("diện tích hình tròn là: " + managerCircle.calculateS(circles[Integer.parseInt(id.substring(1)) - 1]));
                    break;
                case 3:
                    System.out.println("nhập id hình tròn muốn tính chu vi");
                    String id1 = scanner.next();
                    System.out.println("chu vi hình tròn là: " + managerCircle.calculateC(circles[Integer.parseInt(id1.substring(1)) - 1]));
                    break;
                case 4:
                    System.out.println("bán kính lớn nhất là: " + managerCircle.maxRadiusCircle(circles));
                    break;
                case 5:
                    System.out.println("tổng diện tích các hình tròn là: " + managerCircle.sumS(circles));
                    break;
            }
        }
    }
}