package Doctorsys;


import Doctorsys.frame.HospitalManager;

public class App {
    public static void main(String[] args) {
        // 1、创建一个医院管理对象
        HospitalManager h = new HospitalManager();
        h.start();
    }
}
