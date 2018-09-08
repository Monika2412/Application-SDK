package web.www.blockchain;

public class EventHub {
	
	String name;
	String grpcUrl;
	String pem;
	
	public EventHub(String name,String grpcUrl)
	{
		this.name=name;
		this.grpcUrl=grpcUrl;
		
	}
	
	public void setPeerAddress(String url,String pem,String hostName)
	{
		this.grpcUrl=url;
		this.pem=pem;
		this.name=hostName;
	}
	
	public static EventHub createNewInstance(String name, String url) {
        return new EventHub(name, url);
}

}
