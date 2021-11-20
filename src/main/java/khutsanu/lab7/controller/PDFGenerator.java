package khutsanu.lab7.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import khutsanu.lab7.dao.Lab7DAO;
import khutsanu.lab7.dao.Lab7DAOImplementation;
import khutsanu.lab7.model.ReportData;

@WebServlet(name="PDFGenerator", urlPatterns="/generate_pdf")

public class PDFGenerator extends HttpServlet {

	public Lab7DAO dao;

	public PDFGenerator() {
		dao = new Lab7DAOImplementation();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		
		ReportData rd = new ReportData();

		rd.userName = request.getParameter("userName");
		rd.groupName = request.getParameter("groupName");
		rd.userMark = request.getParameter("userMark");

		int pdfReport = dao.createPdfReport(rd);
		

		if (pdfReport == 1) {
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR); // Status code 500
		} else {
			request.setAttribute("userName", rd.userName);
			request.setAttribute("groupName", rd.groupName);
			request.setAttribute("userMark", rd.userMark);
			request.setAttribute("reportLink", "report.pdf");
			request.getRequestDispatcher("/Results.jsp").forward(request, response);
		}


	}

}
