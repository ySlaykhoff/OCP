package BankAnalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


public class ManagerApp {


    private static final String RESOURCES = "C:\\Temp\\resources.csv";

    public static void main(String[] args) throws IOException {

       BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();

       BankStatementParser bankStatementParser = new BankStatementCSVParser();

       BankStatementProcessor bankStatementProcessor = bankStatementAnalyzer.analyze(RESOURCES, bankStatementParser);

       System.out.println(bankStatementProcessor.calculateTotalAmount());

    }

}
