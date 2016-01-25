import com.eviware.soapui.report.TestCaseRunLogReport;

public class ReportGenerator extends TestCaseRunLogReport {

    public ReportGenerator(String outputFolder) {
        super(outputFolder);
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGenerator("D:/SOAPUI Reports");
    }
}
