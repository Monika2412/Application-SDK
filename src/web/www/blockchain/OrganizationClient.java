package web.www.blockchain;

public class OrganizationClient {
	
	String orgName;
	String channelName;
	String ordererName;
	PeerConfig peerConfig;
	CAConfig caConfig;
	AdminConfig adminConfig;
	
	
	public OrganizationClient(String channelName, String ordererName, PeerConfig peerConfig, CAConfig caConfig, AdminConfig adminConfig) {
		super();
		this.channelName = channelName;
		this.ordererName = ordererName;
		this.peerConfig = peerConfig;
		this.caConfig = caConfig;
		this.adminConfig = adminConfig;
	}


	public OrganizationClient() {
		// TODO Auto-generated constructor stub
	}


	public String getOrgName() {
		// TODO Auto-generated method stub
		return orgName;
	}
	
	public String getOrgInfo(String name)
	{
		return name;
	}
	

}
