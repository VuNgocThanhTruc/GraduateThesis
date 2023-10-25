package com.example.springbootudemy.compile_process;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author DuyND
 * @name RunJavaProgram.java
 * @date 30/09/2023
 */
public class RunJavaProgram {

    public static void main(String[] args) {
        try {
            File f = new File("/Users/duynguyenak/Documents/SpringBoot-Edemy/springboot-udemy" +
                    "-master/src/main/java/com/example/springbootudemy/compile_process" +
                    "/DemoFileNew" +
                    ".java");
            Process compileProcess = new ProcessBuilder("javac", f.getAbsolutePath()).start();
            int compileExitCode = compileProcess.waitFor();

            if (compileExitCode == 0) {
                Process runProcess = new ProcessBuilder("java", f.getAbsolutePath()).start();
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(runProcess.getInputStream()));
                // Đọc thông báo lỗi nếu có
                BufferedReader errorReader = new BufferedReader(new InputStreamReader(runProcess.getErrorStream()));
                String line;
                String lineError;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                while ((lineError = errorReader.readLine()) != null) {
                    System.err.println(lineError); // In thông báo lỗi ra màn hình
                }

                int runExitCode = runProcess.waitFor();
                System.out.println("Chương trình kết thúc với mã lỗi:" + runExitCode);

            } else {
                System.err.println("Biên dịch thất bại");
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();

        }
    }
}
