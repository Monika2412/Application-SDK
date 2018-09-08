package web.www.blockchain;

public class Utils {
	
	String channelName=Config.CHANNEL_NAME;
	String ordererHostName=OrdererConfig.ORDERER_HOSTNAME;
	String ordererURL=OrdererConfig.ORDERER_URL;
	String peerName=PeerConfig.PEER_HOSTNAME;
	String url=PeerConfig.PEER_URL;
	String hubUrl=PeerConfig.PEER_EVENT_HUB_URL;
	OrdererConfig ordererConfig;
	PeerConfig peerConfig;
	CAConfig caConfig;
	AdminConfig adminConfig;
	String chaincode_id=Channel.CHAINCODE_ID;
	String chaincode_path=Channel.CHAINCODE_PATH;
	String chaincode_version=Channel.CHAINCODE_VERSION;

	public Utils(String channelName,OrdererConfig ordererConfig,PeerConfig peerConfig,CAConfig caConfig,AdminConfig adminConfig)
	{
		this.channelName=channelName;
		this.ordererConfig=ordererConfig;
		this.peerConfig=peerConfig;
		this.caConfig=caConfig;
		this.adminConfig=adminConfig;
		
	}
	
	//setup channel
		Channel channel=new Channel(channelName);
	
	//Setting up the network
	public void setNetwork()
	{
	
	//setup channel
	//Channel channel=new Channel(channelName);
	
	//setting up orderer
	OrdererConfig orderer=new OrdererConfig(ordererHostName,ordererURL);
	
	//add orderer to channel
	channel.addOrderer(orderer);
	
	//setting default peer
	//PeerConfig defaultPeer=new PeerConfig(peerName,url,);
	
	//add peer to the channel
	channel.addPeer(defaultPeer);
	
	}
	
	//create channel
	
	//join channel
	
	//check channel membership
	
	//check whether chaincode is installed on channel
	/*public boolean checkChaincodeInstalled()
	{
		if(channel.chainCodeInstantiated(chaincode_id,chaincode_version,chaincode_path)==false)
			return false;
		else
			return true;
	}
	
	//installing chaincodes on peers
	
	*/
	
	//Init EventHub
	public EventHub initEventHub(String name,String url)
	{
		EventHub hub=new EventHub(name,url);
		hub.setPeerAddress(PeerConfig.PEER_EVENT_HUB_URL,PeerConfig.PEER_PEM,PeerConfig.PEER_HOSTNAME);
		
		//Code to be written
		return hub;
		
	}
	
	//Getting Organization admin
	public UserInfo getOrgAdmin()
	{
		UserInfo user=new UserInfo();
		return user.createUser(PeerConfig.PEER_HOSTNAME,CAConfig.CA_MSP_ID,AdminConfig.ADMIN_KEY,AdminConfig.ADMIN_CERT);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
