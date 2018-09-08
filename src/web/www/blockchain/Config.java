package web.www.blockchain;

//import java.util.HashMap;
//import java.util.Map;

public class Config {
	
	
	public static final String CHANNEL_NAME="default";
	public static final String CHAINCODE_ID="bcins";
	public static final String CHAINCODE_VERSION="v2";
	public static final String CHAINCODE_PATH="bcins";
	
	
	//Orderer 
	public static final String ORDERER_HOSTNAME="orderer0";
	public static final String ORDERER_URL="grpcs://orderer0:7050";
	public static final String ORDERER_PEM=readCryptoFile("ordererOrg.pem");
	
	
	//Insurance Organization
	    //Peer
		public static final String PEER_HOSTNAME="insurance-peer";
		public static final String PEER_URL="grpcs://insurance-peer:7051";
		public static final String PEER_EVENT_HUB_URL="grpcs://insurance-peer:7053";
		public static final String PEER_PEM=readCryptoFile("insuranceOrg.pem");
		
		//Certificate Authority
		public static final String CA_HOSTNAME="insurance-ca";
		public static final String CA_URL="https://insurance-ca:7054";
		public static final String CA_MSP_ID="InsuranceOrgMSP";
		
		//Admin
		public static final String ADMIN_KEY=readCryptoFile("Admin@insurance-org-key.pem");
		public static final String ADMIN_CERT=readCryptoFile("Admin@insurance-org-cert.pem");

		
		
		/*
	//Police Organization
		//Peer
		public static final String POLICE_PEER_HOSTNAME="police-peer";
		public static final String POLICE_PEER_URL="grpcs://police-peer:7051";
		public static final String POLICE_PEER_EVENT_HUB_URL="grpcs://police-peer:7053";
		public static final String POLICE_PEER_PEM=readCryptoFile("policeOrg.pem");
		
		//Certificate Authority
		public static final String POLICE_CA_HOSTNAME="police-ca";
		public static final String POLICE_CA_URL="https://police-ca:7054";
		public static final String POLICE_CA_MSP_ID="PoliceOrgMSP";
		
		//Admin
		public static final String POLICE_ADMIN_KEY=readCryptoFile("Admin@police-org-key.pem");
		public static final String POLICE_ADMIN_CERT=readCryptoFile("Admin@police-org-cert.pem");
		
		
	//Shop Organization
		//Peer
		public static final String SHOP_PEER_HOSTNAME="shop-peer";
		public static final String SHOP_PEER_URL="grpcs://shop-peer:7051";
		public static final String SHOP_PEER_EVENT_HUB_URL="grpcs://shop-peer:7053";
		public static final String SHOP_PEER_PEM=readCryptoFile("shopOrg.pem");
		
		//Certificate Authority
		public static final String SHOP_CA_HOSTNAME="shop-ca";
		public static final String SHOP_CA_URL="https://shop-ca:7054";
		public static final String SHOP_CA_MSP_ID="SHopOrgMSP";
		
		//Admin
		public static final String SHOP_ADMIN_KEY=readCryptoFile("Admin@shop-org-key.pem");
		public static final String SHOP_ADMIN_CERT=readCryptoFile("Admin@shop-org-cert.pem");
		
		
	//Repair Shop Organization
		//Peer
		public static final String REPAIRSHOP_PEER_HOSTNAME="repairshop-peer";
		public static final String REPAIRSHOP_PEER_URL="grpcs://repairshop-peer:7051";
		public static final String REPAIRSHOP_PEER_EVENT_HUB_URL="grpcs://repairshop-peer:7053";
		public static final String REPAIRSHOP_PEER_PEM=readCryptoFile("RepairshopOrg.pem");
		
		//Certificate Authority
		public static final String REPAIRSHOP_CA_HOSTNAME="repairshop-ca";
		public static final String REPAIRSHOP_CA_URL="https://repairshop-ca:7054";
		public static final String REPAIRSHOP_CA_MSP_ID="RepairshopOrgMSP";
		
		//Admin
		public static final String REPAIRSHOP_ADMIN_KEY=readCryptoFile("Admin@repairshop-org-key.pem");
		public static final String REPAIRSHOP_ADMIN_CERT=readCryptoFile("Admin@repairshop-org-cert.pem");
		
		
		
		if(process.env.LOCALCONFIG==true)
		{
			ORDERER_URL="grpcs://localhost:7050";
			
			  INSURANCE_PEER_URL = "grpcs://localhost:7051";
			  SHOP_PEER_URL = "grpcs://localhost:8051";
			  REPAIRSHOP_PEER_URL = "grpcs://localhost:9051";
			  POLICE_PEER_URL = "grpcs://localhost:10051";

			  INSURANCE_PEER_EVENT_HUB_URL = "grpcs://localhost:7053";
			  SHOP_PEER_EVENT_HUB_URL = "grpcs://localhost:8053";
			  REPAIRSHOP_PEER_EVENT_HUB_URL = "grpcs://localhost:9053";
			  POLICE_PEER_EVENT_HUB_URL = "grpcs://localhost:10053";

			  INSURANCE_CA_URL = "https://localhost:7054";
			  SHOP_CA_URL = "https://localhost:8054";
			  REPAIRSHOP_CA_URL = "https://localhost:9054";
			  POLICE_CA_URL = "https://localhost:10054";
		}
		
		*/
		
}
