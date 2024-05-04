package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class ReportService {
	
//	@Qualifier("oracleDao")
	private ReportDao reportDao;	
	

	
//	@Autowired // setter injection
//	public void setReportDao(ReportDao reportDao) {
//		System.out.println("Setter method called....");
//		this.reportDao = reportDao;
//	}
	
//	public ReportService() {
//		System.out.println("ReportService :: Non-Param Constructor");
//	}
    @Autowired  // constructor injection
	public ReportService(ReportDao reportDao) {
		System.out.println("ReportService :: Param - Constructor");
		this.reportDao = reportDao;
	}

	public void generateReport() {
		reportDao.getData();
		System.out.println("Report Generated.......");
	}

}
