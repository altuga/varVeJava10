package com.kodcu.baslangic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Reader {

    public static void main(String[] args) {


        //readAndPrint();
        readAndPrintWithJava10();
    }


    // okumasi zor
    public static void readAndPrint() {
        Path path = Paths.get("src/web.log");
        try (Stream<String> lines = Files.lines(path)){
            long warningCount =
                    lines.filter(line -> line.contains("WARNING"))
                            .count();
            System.out.println(
                    "Found " + warningCount + " warnings in the log file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // daha okunabilir
    public static void readAndPrintWithJava10() {
        var path = Paths.get("src/web.log");
        try (var lines = Files.lines(path)){
            var warningCount =
                    lines.filter(line -> line.contains("WARNING"))
                            .count();
            // warningCount = 8 ;  // 8 sayısı atanabilir
            // warningCount = "8" ;   // String bir ifade atanamaz.
            System.out.println(
                    "Found " + warningCount + " warnings in the log file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
