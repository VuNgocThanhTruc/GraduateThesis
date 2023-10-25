package com.example.springbootudemy.compile_process;

import com.example.springbootudemy.antlr.Java8Lexer;
import com.example.springbootudemy.antlr.Java8Parser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * @author DuyND
 * @name Java8ParserExample.java
 * @date 08/10/2023
 */
public class Java8ParserExample {

    public static void main(String[] args) throws IOException {
        Java8Lexer lexer = new Java8Lexer(CharStreams.fromFileName("D:/test/Test.java"));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Java8Parser parser = new Java8Parser(tokens);

        // Đặt lớp xử lý lỗi cho lexer và parser
        lexer.removeErrorListeners();
        lexer.addErrorListener(new MyErrorListener());
        parser.removeErrorListeners();
        parser.addErrorListener(new MyErrorListener());


        ParseTree tree = parser.compilationUnit();

        System.out.println("Parsing successful.");
    }
}

class MyErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // Xử lý lỗi cú pháp ở đây
        System.err.println("Syntax error at line " + line + ", position " + charPositionInLine + ": " + msg);
    }
}