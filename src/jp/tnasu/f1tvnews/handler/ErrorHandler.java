package jp.tnasu.f1tvnews.handler;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletResponse;

public class ErrorHandler {

	public static void writeErrorHtml(HttpServletResponse response, String content) throws IOException {
		response.setContentType("text/html; charset=UTF8");
		response.getWriter().write(content);
		response.getWriter().flush();
		response.getWriter().close();
	}

	public static void writeErrorLogger(Exception e, Logger logger) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		logger.info(sw.toString());
		pw.close();
	}

}
