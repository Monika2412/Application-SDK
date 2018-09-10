package web.www.blockchain;

public class Orderer {
	
	public static String ORDERER_HOSTNAME="orderer0";
	public static String ORDERER_URL="grpcs://orderer0:7050";
	//public static final String ORDERER_PEM=readCryptoFile("ordererOrg.pem");
	
	public Orderer(String ordererHostName,String ordererURL)
	{
		this.ORDERER_HOSTNAME=ordererHostName;
		this.ORDERER_URL=ordererURL;
	}

}
