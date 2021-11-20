package khutsanu.lab7.dao;

import java.io.IOException;

import khutsanu.lab7.model.*;
import khutsanu.lab7.util.PDFUtil;

public class Lab7DAOImplementation implements Lab7DAO {

	String output = null;

	@Override
	public int createPdfReport(ReportData dataForPDF) throws IllegalStateException, IOException {
		
		final String APP_NAME = "lab7khutsanu";

		final String TOMCAT_DIR = System.getProperty("catalina.base");
		final String PDF_PATH = TOMCAT_DIR + "/webapps/" + APP_NAME + "/report.pdf";
		final String IMAGE_PATH = TOMCAT_DIR + "/webapps/" + APP_NAME + "/img/favicon.png";
		final String FONT_PATH = TOMCAT_DIR + "/webapps/" + APP_NAME + "/fonts/";

		if (!(PDFUtil.generateNewPDF(dataForPDF, FONT_PATH, IMAGE_PATH, PDF_PATH))) return 1;
		
		return 0;
	
	}

}
