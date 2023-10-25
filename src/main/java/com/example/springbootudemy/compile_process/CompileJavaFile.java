package com.example.springbootudemy.compile_process;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The type Compile java file.
 *
 * @author DuyND
 * @name CompileJavaFile.java
 * @date 01 /10/2023
 */
public class CompileJavaFile {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        try {
            File f = new File("D:/test/Test.java");
            Process compileProcess = new ProcessBuilder("javac", f.getAbsolutePath()).start();
            int compileExitCode = compileProcess.waitFor();

            // Đọc thông báo lỗi nếu có
            BufferedReader errorReader = new BufferedReader(new InputStreamReader(compileProcess.getErrorStream()));
            String line;
            while ((line = errorReader.readLine()) != null) {
                System.err.println(line); // In thông báo lỗi ra màn hình
            }

            if (compileExitCode == 0) {
                System.out.println("Biên dịch thành công.");
            } else {
                System.err.println("Biên dịch thất bại. Mã lỗi: " + compileExitCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}