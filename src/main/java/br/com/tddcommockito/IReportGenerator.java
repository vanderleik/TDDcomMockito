package br.com.tddcommockito;

/**
 * <h1>Interface que gera relatórios</h1>
 * 
 * @author vanderlei.kleinschmidt
 *
 */
public interface IReportGenerator {

    /**
     * <h2>Gera relatórios</h2>
     * @param report
     */
    void generateReport(ReportEntity report);
}
