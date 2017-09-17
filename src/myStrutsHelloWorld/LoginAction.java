package myStrutsHelloWorld;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private UserService uservice;
	private User user;
	private String valicode;
	private String tip;
	public UserService getUservice() {
		return uservice;
	}

	public void setUservice(UserService uservice) {
		this.uservice = uservice;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	public String getValicode() {
		return valicode;
	}

	public void setValicode(String valicode) {
		this.valicode = valicode;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	@Override
    public String execute() throws Exception {
		ActionContext actionContext = ActionContext.getContext();
		String rand = (String)actionContext.getSession().get("rand");
		if(valicode.equals(rand)){
			 if(uservice.validation(user.getUsername(), user.getPass())){
		            return "success";
		        }else{
		            addActionError(getText("error.login"));
		            setTip("username or password is wrong");
		            return "error";
		        }
		}else{
			setTip("valicode is wrong");
			return "relogin";
		}
       
    }
}
