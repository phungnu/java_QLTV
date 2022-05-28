/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import model.Book;
import model.SachThieuNhi;
import model.Truyen;

/**
 *
 * @author hp
 */
public class QLTV implements ChucNang {

    List<Book> list;
    Scanner sc = new Scanner(System.in);

    public QLTV() {
        list = new ArrayList<>();
        list.add((SachThieuNhi) new SachThieuNhi(3, "kim dong", "ABC12", "doraemon", "fujiko", 50, 50000));
        list.add((SachThieuNhi) new SachThieuNhi(5, "kim dong", "ABC13", "conan", "nu", 60, 45000));
        list.add((SachThieuNhi) new SachThieuNhi(7, "kim dong", "ABC14", "jaiba", "nu phung", 65, 70000));
        list.add((Truyen) new Truyen("tieu thuyet", "nhat anh", "DEF12", "that tich khong mua", "abc", 50, 50000));
        list.add((Truyen) new Truyen("truyen ngan", "nhat anh", "DEF13", "tam ly hoc toi pham", "abcd", 70, 80000));
        list.add((Truyen) new Truyen("tguyen ngan", "nhat anh", "DEF14", "bi mat nguoi do thai", "def", 80, 90000));
    }

    public Book nhapBook() {
        Book s = new Book();
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("NXB: ");
        String publisher = sc.nextLine();
        System.out.print("So Trang: ");
        int pages = Integer.parseInt(sc.nextLine());
        System.out.print("Ten: ");
        String name = sc.nextLine();
        System.out.print("Tac Gia: ");
        String author = sc.nextLine();
        System.out.print("Gia: ");
        float cost = Float.parseFloat(sc.nextLine());
        s = new Book(publisher, id, name, author, pages, cost);
        return s;
    }

    @Override
    public void NhapSachThieuNhi() {
        Book s = nhapBook();
        int age = Integer.parseInt(sc.nextLine());
        SachThieuNhi stn = new SachThieuNhi(age, s.getPublisher(), s.getId(), s.getName(), s.getAuthor(), s.getPages(), s.getCost());
        list.add(stn);

    }

    @Override
    public void NhapTruyen() {
        Book s = nhapBook();
        String skin = sc.nextLine();
        Truyen tr = new Truyen(skin, s.getPublisher(), s.getId(), s.getName(), s.getAuthor(), s.getPages(), s.getCost());
        list.add(s);
    }

    @Override
    public void InDanhSach() {
        System.out.println("Sach Thieu nhi: ");
        for (Book i : list) {
            if (i instanceof SachThieuNhi) {
                System.out.println(i.toString());
            }
        }
        System.out.println("Truyen: ");

        for (Book i : list) {
            if (i instanceof Truyen) {
                System.out.println(i.toString());
            }
        }
    }

    /**
     *
     * @return
     */
    @Override
    public float TinhTongGiaTien() {
        float sum = 0;
        for (Book i : list) {
            if (i instanceof Truyen) {
                sum += i.getCost();
            }
        }
        return sum;
    }

    @Override
    public void SapXepSachThieuNhiTheoDoTuoi() {
        List<SachThieuNhi> l = new ArrayList<>();
        for (Book i : list) {
            if (i instanceof SachThieuNhi) {
                l.add((SachThieuNhi) i);
            }
        }
//        for (int i = 0; i < l.size(); i++) {
//            for (int j = i + 1; j < l.size(); j++) {
//                if () {
//                    
//                }
//            }
//        }
    }

}
