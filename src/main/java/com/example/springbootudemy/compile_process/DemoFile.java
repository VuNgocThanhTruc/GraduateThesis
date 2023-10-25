package com.example.springbootudemy.compile_process;

import java.io.File;
import java.util.Date;

/**
 * @author DuyND
 * @name DemoFile.java
 * @date 30/09/2023
 */
public class DemoFile {

    private int age;

    private String name;

    private Date birthDay;

    public DemoFile(int age, String name, Date birthDay) {
        this.age = age;
        this.name = name;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "DemoFile{" +
                "age=" + age +
                ", name=" + name +
                ", birthDay=" + birthDay +
                '}';
    }

    public static void main(String[] args) {
        DemoFile demoFile = new DemoFile(20, "Trần Sơn Giang", new Date(2003,06,02));
        System.out.println(demoFile);

        // Đường dẫn tương đối của tệp mã nguồn Java
        String relativePath = "DemoFile.java";

        // Tạo đối tượng File với đường dẫn tương đối
        File file = new File(relativePath);

        // Lấy đường dẫn tuyệt đối của tệp
        String absolutePath = file.getAbsolutePath();

        // In đường dẫn tuyệt đối ra màn hình
        System.out.println("Đường dẫn tuyệt đối của tệp là: " + absolutePath);

    }
}
