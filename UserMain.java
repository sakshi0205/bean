package bean;

import java.util.ArrayList;
import java.util.Iterator;

public class UserMain {
        private String userName;
        private String userPassword;
      	private Integer accountNo;
        private String emailId;
        private long phoneNo;
        private Integer balance=0;
        
        ArrayList<String>Transaction=new ArrayList<String>();
     
    
      
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getUserPassword() {
			return userPassword;
		}
		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}
		
		public Integer getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(Integer accountNo) {
			this.accountNo = accountNo;
		}
		 
		
		public String getTransaction()
		{
                 String s=" ";
                 Iterator i=Transaction.iterator();
                 while(i.hasNext()){
                	 s=s+"\n"+(String)i.next();
                 }
                 return s;
		}
		public void setTransaction(String transaction)
		{
					Transaction.add(transaction);
		}
		public Integer getBalance()
		{
				return balance;
		}
		public void setBalance(Integer balance)
		{
				this.balance = balance;
		}
		public String getEmailId()
		{
					return emailId;
		}
		public void setEmailId(String emailId)
		{
					this.emailId = emailId;
		}
		public long getPhoneNo()
		{
					return phoneNo;
		}
		public void setPhoneNo(long phoneNo)
		{
					this.phoneNo = phoneNo;
		}
}
