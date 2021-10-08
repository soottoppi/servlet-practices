package helloweb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter pw = response.getWriter();
		pw.print("\r\n"
				+ "\r\n"
				+ "    \r\n"
				+ "    \r\n"
				+ "  \r\n"
				+ "  \r\n"
				+ "  <!DOCTYPE html><html lang=\"ko-KR\"><head resURL=\"/jenkins/static/688b6518\" data-rooturl=\"/jenkins\" data-resurl=\"/jenkins/static/688b6518\" data-imagesurl=\"/jenkins/static/688b6518/images\"><title>로그인 [Jenkins]</title><meta name=\"ROBOTS\" content=\"NOFOLLOW\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><link rel=\"stylesheet\" href=\"/jenkins/static/688b6518/css/simple-page.css\" type=\"text/css\"><link rel=\"stylesheet\" href=\"/jenkins/static/688b6518/css/simple-page.theme.css\" type=\"text/css\"><link rel=\"stylesheet\" href=\"/jenkins/static/688b6518/css/simple-page-forms.css\" type=\"text/css\"></head><body><div class=\"simple-page\" role=\"main\"><div class=\"modal login\"><div id=\"loginIntroDefault\"><div class=\"logo\"></div><h1>Welcome to Jenkins!</h1></div><form method=\"post\" name=\"login\" action=\"j_spring_security_check\"><div class=\"formRow\"><input autocorrect=\"off\" autocomplete=\"off\" name=\"j_username\" id=\"j_username\" placeholder=\"사용자 이름\" type=\"text\" class=\"normal\" autocapitalize=\"off\" aria-label=\"사용자 이름\"></div><div class=\"formRow\"><input name=\"j_password\" placeholder=\"비밀번호\" type=\"password\" class=\"normal\" aria-label=\"비밀번호\"></div><input name=\"from\" type=\"hidden\" value=\"/jenkins/job/servlet-practices/\"><div class=\"submit formRow\"><input name=\"Submit\" type=\"submit\" value=\"로그인\" class=\"submit-button primary \"></div><script type=\"text/javascript\">\r\n"
				+ "                  document.getElementById('j_username').focus();\r\n"
				+ "                  var checkBoxClick = function(event) {\r\n"
				+ "                    document.getElementById('remember_me').click();\r\n"
				+ "                  }\r\n"
				+ "                </script><div class=\"Checkbox Checkbox-medium\"><label class=\"Checkbox-wrapper\"><input type=\"checkbox\" id=\"remember_me\" name=\"remember_me\"><div class=\"Checkbox-indicator\"><svg xmlns=\"http://www.w3.org/2000/svg\" height=\"25\" class=\"svg-icon check\" focusable=\"false\" viewBox=\"0 0 24 24\" width=\"25\"><path d=\"M9 16.17L4.83 12l-1.42 1.41L9 19 21 7l-1.41-1.41z\"></path></svg></div><div class=\"Checkbox-text\">로그인 상태 유지</div></label></div></form><div class=\"footer\"></div></div></div></body></html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}
	
}
