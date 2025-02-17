package testprioritization.core.demo;

import testprioritization.core.ExecutionResult;
import testprioritization.core.katalonstudio.KatalonReportsParser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main {
    static public void main(String[] argv) {
        KatalonReportsParser parser = new KatalonReportsParser();
        String reportPath = "/Users/cpu12071/thesis/scripts/katalon_reports/group_01/20190519_155348.csv";
        ExecutionResult result = parser.readOneExecutionResultFromReport(reportPath);
        System.out.println(result.getNumberOfFailedTests());
    }
}
