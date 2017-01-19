///import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;

//import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction1 extends ActionSupport  {
private static final long serialVersionUID = 1L;
//private String username;
//private String password;
LoginBean user1=new LoginBean();
   

	
 public LoginBean getUser1() {
		return user1;
	}


	public void setUser1(LoginBean user1) {
		this.user1 = user1;
	}


public String execute() throws Exception {
/*System.out.println("action class");
System.out.println("username is valid"+username);
System.out.println("password is valid"+password);*/
	  
	 if(user1.getUsername()!=null && user1.getPassword()!=null)
	  {
		  return  SUCCESS;
	  }
	  else
	  {
	  
       return  INPUT;
		  
	  }
	
//return  SUCCESS;
}
  
/*RegisterBean reg1=new RegisterBean();
public RegisterBean getReg1() {
	return reg1;
}
public void setReg1(RegisterBean reg1) {
	this.reg1 = reg1;
}


public String execute1() throws Exception {
	 return  SUCCESS;
	
}*/

   /* public String getusername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }*/
    
  /* public void validate()
    {
    	if (username == null || username.trim().equals(""))
        {
           addFieldError("username","The name is required");
        }
    	if (password == null || password.trim().equals(""))
        {
           addFieldError("password","Password is required");
        }
    }*/
  
}
