package br.com.tddcommockito;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class ReportGeneratorServiceTest {
    
    /**
     * <h2>Marcação para injeção do Mockito</h2>
     * 
     * <p>O Mockito tentará injetar "mocks" na seguinte sequência:
     * 1. Injetando o construtor;
     * 2. Setando a injeção;
     * 3. Injetando proprietades.</p>
     * 
     */
    @InjectMocks 
    private ReportGeneratorService reportGeneratorService;
    
    /**
     * <h2>Simulando a interface usando a anotação @Mock</h2>
     */
    @Mock
    private IReportGenerator reportGenerator;
    
    /**
     * <h2>Definindo o argumento captor no {@link: ReportEntity}</h2>
     */
     @Captor
     private ArgumentCaptor<ReportEntity> reportCaptor;
     
     @Before
     public void setUp() {
         /**
          * <h2>Inicializando o Mockito</h2>
          * <p>Inicializando objetos anotados com Mockito para testar as classes.</p>
          */
         MockitoAnnotations.initMocks(this);
     }

     @SuppressWarnings("deprecation")
    @Test
    public void test() {
         Calendar startDate = Calendar.getInstance();
         startDate.set(2016, 11, 25);
         
         Calendar endDate = Calendar.getInstance();
         endDate.set(9999, 12, 31);
         
         String reportContent = "Report Content";
         reportGeneratorService.generateReport(startDate, endDate, reportContent.getBytes());
         
         Mockito.verify(reportGenerator).generateReport(reportCaptor.capture());
         
         ReportEntity report = reportCaptor.getValue();
         
         assertEquals(2016, report.getStartDate().get(Calendar.YEAR));
         assertEquals(11, report.getStartDate().get(Calendar.MONTH));
         assertEquals(25, report.getStartDate().get(Calendar.DAY_OF_MONTH));
         
         assertEquals(10000, report.getEndDate().get(Calendar.YEAR));
         assertEquals(00, report.getEndDate().get(Calendar.MONTH));
         assertEquals(31, report.getEndDate().get(Calendar.DAY_OF_MONTH));
         
         assertEquals("Report Content", new String(report.getContent()));
    }

}
