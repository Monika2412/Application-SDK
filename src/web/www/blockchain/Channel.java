package web.www.blockchain;

public class Channel {
	
	public static String CHANNEL_NAME="default";
	public static final String CHAINCODE_ID="bcins";
	public static final String CHAINCODE_VERSION="v2";
	public static final String CHAINCODE_PATH="bcins";
	
	//@SuppressWarnings("static-access")
	public Channel(String channelName)
	{
		this.CHANNEL_NAME=channelName;
	}

	/*public boolean chainCodeInstantiated(String chaincode_id,String chaincode_version,String chaincode_path) {
		// TODO Auto-generated method stub
		if(chaincode_id==null && chaincode_version==null && chaincode_path==null)
		{
			return false;
		}
		return true;
	}   */

	public void addOrderer(OrdererConfig orderer) {
		// TODO Auto-generated method stub
		
		
	}

	public void addPeer(PeerConfig peer) {
		// TODO Auto-generated method stub
		
	}

	
	

}
