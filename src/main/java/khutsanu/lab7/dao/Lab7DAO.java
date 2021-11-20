package khutsanu.lab7.dao;

import java.io.IOException;

import khutsanu.lab7.model.*;

public interface Lab7DAO {
	public int createPdfReport(ReportData dataForPDF) throws IllegalStateException, IOException;
}
