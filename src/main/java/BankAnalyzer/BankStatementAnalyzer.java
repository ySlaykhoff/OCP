package BankAnalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankStatementAnalyzer {
    public BankStatementProcessor analyze(String fileName, BankStatementParser bankStatementParser) throws IOException {
        Path path = Paths.get(fileName);
        List lines = Files.readAllLines(path);

        List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFrom(lines);

        BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);
    return bankStatementProcessor;
    }
}

