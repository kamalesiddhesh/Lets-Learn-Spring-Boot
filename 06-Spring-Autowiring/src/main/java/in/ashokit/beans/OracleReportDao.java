package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("oracleDao")
@Primary
public class OracleReportDao implements ReportDao{

	public void getData() {		
		System.out.println("Getting Data from Oracle DB.....");		
	}
}
