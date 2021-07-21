package br.com.tddcommockito;

import java.util.Calendar;

/**
 * <h1>Classe de serviço que gera os relatórios.</h1>
 * 
 * @author vanderlei.kleinschmidt
 *
 */
public class ReportGeneratorService {

    private IReportGenerator reportGenerator;
    
    public void generateReport(Calendar startDate, Calendar endDate, byte[] content) {

        ReportEntity report = new ReportEntity();
        report.setContent(content);
        report.setStartDate(startDate);
        report.setEndDate(endDate);
        reportGenerator.generateReport(report);
        
    }


    
}
