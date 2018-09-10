package web.www.blockchain;

import Exceptions.InvalidArgumentException;

public class Utils {
	
	String channelName=Config.CHANNEL_NAME;
	String ordererHostName=Orderer.ORDERER_HOSTNAME;
	String ordererURL=Orderer.ORDERER_URL;
	String peerName=Peer.PEER_HOSTNAME;
	String url=Peer.PEER_URL;
	String hubUrl=Peer.PEER_EVENT_HUB_URL;
	Orderer orderer;
	Peer peer;
	CAConfig caConfig;
	AdminConfig adminConfig;
	String chaincode_id=Channel.CHAINCODE_ID;
	String chaincode_path=Channel.CHAINCODE_PATH;
	String chaincode_version=Channel.CHAINCODE_VERSION;

	public Utils(String channelName,Orderer ordererConfig,Peer peerConfig,CAConfig caConfig,AdminConfig adminConfig)
	{
		this.channelName=channelName;
		this.orderer=ordererConfig;
		this.peer=peerConfig;
		this.caConfig=caConfig;
		this.adminConfig=adminConfig;
		
	}
	
	//setup channel
		Channel channel=new Channel(channelName);
	
	//Setting up the network
	public void setNetwork() throws InvalidArgumentException
	{
	
	//setup channel
	//Channel channel=new Channel(channelName);
	
		
	//setting up orderer
	Orderer orderer=new Orderer(ordererHostName,ordererURL);
	
	//add orderer to channel
	channel.addOrderer(orderer);
	
	//setting default peer
	//PeerConfig defaultPeer=new PeerConfig(peerName,url,);
	
	//add peer to the channel
	channel.addPeer(peer);
	
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
		hub.setPeerAddress(Peer.PEER_EVENT_HUB_URL,Peer.PEER_HOSTNAME);
		
		//Code to be written
		return hub;
		
	}
	
	//Getting Organization admin
	public UserInfo getOrgAdmin()
	{
		UserInfo user=new UserInfo();
		return user.createUser(Peer.PEER_HOSTNAME,CAConfig.CA_MSP_ID,AdminConfig.ADMIN_KEY,AdminConfig.ADMIN_CERT);
	}
	
	//Checking the channel membership
	public boolean checkChannelMembership(Channel ch)
	{
		if(ch.getChannelName()!=Config.CHANNEL_NAME)
		{
			return false;
		}
		return true;
		
	}
	
	//Checking whether chaincode installed on channel
	public boolean checkInstalled(String chaincode_id,String chaincode_version,String chaincode_path)
	{
		if(!((channel.chainCodeInstantiated(chaincode_id,chaincode_version,chaincode_path))==true))
		{
			return false;
		}
		return true;
		//System.out.println("Chaincode installed on channel");
	}
	
	
	
	
	
	
	
	
	
	

}
