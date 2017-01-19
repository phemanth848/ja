import com.opensymphony.xwork2.ActionSupport;
public class RegisterAction1 extends ActionSupport {
private static final long serialVersionUID = 1L;
RegisterBean reg1=new RegisterBean();
 public RegisterBean getReg1() {
	return reg1;
}
public void setReg1(RegisterBean reg1) {
	this.reg1 = reg1;
}

 
public String execute() throws Exception {
	 return  SUCCESS;
	
}

}





