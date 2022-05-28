/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.QLTV;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLTV q = new QLTV();
        while(true){
            System.out.println("Nhap n: ");
            int n = Integer.parseInt(sc.nextLine());
            switch(n){
                case 1:
                    System.out.println("Nhap sach thieu nhi: ");
                    q.NhapSachThieuNhi();
                    break;
                case 2:
                    System.out.println("Nhap truyen: ");
                    q.NhapTruyen();
                    break;
                case 3:
                    System.out.println("Ds toan bo sach: ");
                    q.InDanhSach();
                    break;
                case 4:
                    System.out.println("Tong gia tien cua truyen: " + q.TinhTongGiaTien());
                    break;
                case 5:
                    System.out.println("Ds sach thieu nhi duoc sap xep theo do tuoi: ");
                    q.SapXepSachThieuNhiTheoDoTuoi();
                    break;
                case 0:
                    System.exit(0);
            }
        }
        
    }
    
}
