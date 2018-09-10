package web.www.blockchain;

import java.util.EnumSet;

import Exceptions.InvalidArgumentException;

public class Peer {
	
	public static String PEER_HOSTNAME="insurance-peer";
	public static String PEER_URL="grpcs://insurance-peer:7051";
	public static String PEER_EVENT_HUB_URL="grpcs://insurance-peer:7053";
	//public static String PEER_PEM=readCryptoFile("insuranceOrg.pem");
	public String channelName;
	
	Channel channel;
	
	
	public Peer(String pEER_HOSTNAME, String pEER_URL, String pEER_EVENT_HUB_URL) {
		super();
		PEER_HOSTNAME = pEER_HOSTNAME;
		PEER_URL = pEER_URL;
		PEER_EVENT_HUB_URL = pEER_EVENT_HUB_URL;
		//PEER_PEM = pEER_PEM;
	}
	
	public Channel getChannel()
	{
		return channel;
	}
	
	public void setChannel(Channel channel) throws InvalidArgumentException
	{
		if(this.channel!=null)
		{
			throw new InvalidArgumentException("This Peer already belongs to other channel");
		}
		this.channel=channel;
		this.channelName=channel.getChannelName();
	}
	
	//Roles of a peer
	public enum PeerRole
	{
		ENDORSING_PEER("endorsingPeer"),// installs and runs chaincode
		
		CHAINCODE_QUERY("chaincodeQuery"),//used to invoke chaincode on chaincode query requests.
		
		LEDGER_QUERY("ledgerQuery"), //monitor block events for the channel it belongs to.
		
		EVENT_SOURCE("eventSource"),
		
		SERVICE_DISCOVERY("serviceDiscovery");
		
		
		public static final EnumSet<PeerRole> all=EnumSet.allOf(PeerRole.class);
		
		public static final EnumSet<PeerRole> NO_EVENT_SOURCE = EnumSet.complementOf(EnumSet.of(PeerRole.EVENT_SOURCE));
        private final String propertyName;
        
        PeerRole(String propertyName)
        {
        	this.propertyName=propertyName;
        }

		public String getPropertyName()
		{
			return propertyName;
		}
		
	}

}
