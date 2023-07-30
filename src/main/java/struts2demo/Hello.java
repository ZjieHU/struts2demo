package struts2demo;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import ognl.OgnlException;

public class Hello {
	
	public String test() throws OgnlException {
		ActionContext context = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest) context.get(StrutsStatics.HTTP_REQUEST);
		String nameString = request.getParameter("name");
		request.getAttribute(nameString);
		return "success";
	}
	
}
