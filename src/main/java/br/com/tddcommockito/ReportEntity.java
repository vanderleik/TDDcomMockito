package br.com.tddcommockito;

import java.util.Calendar;

/**
 * <h1>Entidade Relatório</h1>
 * @author vanderlei.kleinschmidt
 *
 */
public class ReportEntity {

    private Long reportId;
    private Calendar startDate;
    private Calendar endDate;
    private byte[] content;
    
    public Long getReportId() {
        return reportId;
    }
    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }
    public Calendar getStartDate() {
        return startDate;
    }
    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }
    public Calendar getEndDate() {
        return endDate;
    }
    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }
    public byte[] getContent() {
        return content;
    }
    public void setContent(byte[] content) {
        this.content = content;
    }
    
    
}
