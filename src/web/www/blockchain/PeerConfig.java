package web.www.blockchain;

public class PeerConfig {
	
	public static String PEER_HOSTNAME="insurance-peer";
	public static String PEER_URL="grpcs://insurance-peer:7051";
	public static String PEER_EVENT_HUB_URL="grpcs://insurance-peer:7053";
	public static String PEER_PEM=readCryptoFile("insuranceOrg.pem");
	
	
	public PeerConfig(String pEER_HOSTNAME, String pEER_URL, String pEER_EVENT_HUB_URL, String pEER_PEM) {
		super();
		PEER_HOSTNAME = pEER_HOSTNAME;
		PEER_URL = pEER_URL;
		PEER_EVENT_HUB_URL = pEER_EVENT_HUB_URL;
		PEER_PEM = pEER_PEM;
	}
	
	

}
