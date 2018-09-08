package web.www.blockchain;

public class OrgInfo {
	
	private final String name;
    private final String mspId;

    OrgInfo(String orgName, String mspId) {
        this.name = orgName;
        this.mspId = mspId;
    }

    public String getName() {
return name;
    }
    public String getMspId() {
        return mspId;
    }

}
