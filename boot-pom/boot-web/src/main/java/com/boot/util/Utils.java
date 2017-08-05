package com.boot.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class Utils {
	
	public static void printDataText(HttpServletResponse response, String result) {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter pw = null;
		try {
		pw = response.getWriter();
		pw.print(result);
		pw.flush();
		pw.close();
		} catch (IOException e) {
		e.printStackTrace();

		} finally {
		if (null != pw) {
			pw.close();
		}
		}
	}

}
