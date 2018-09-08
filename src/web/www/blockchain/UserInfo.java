package web.www.blockchain;

public class UserInfo {
	
	 public void setName(String name) {
         this.name = name;
     }

     protected String name;
     protected String mspid;
       String adminKey;
       String adminCert;

     
     public UserInfo createUser(String hostName,String mspid,String key,String cert)
     {
    	 this.name=hostName;
    	 this.mspid=mspid;
    	 this.adminKey=key;
    	 this.adminCert=cert;
     }
     
    	 

     public String getMspid() {
         return mspid;
     }

     public void setMspid(String mspid) {
         this.mspid = mspid;
     }


     UserInfo(String mspid, String name) {
         this.name = name;
         this.mspid = mspid;
     }


    public UserInfo() {
		// TODO Auto-generated constructor stub
	}



	// @Override
     public String getName() {
         return name;
     }

     public String getMspId() {
         return mspid;
}

 }


}
