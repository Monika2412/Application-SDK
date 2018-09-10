package web.www.blockchain;

import java.utils.*;

public class HFCClient {
	
	public Channel newChannel(String channelName)
	{
		if(Utils.isNullOrEmpty(channelName))
		{
			throw new InvalidArgumentException("Channel name can not be null or empty");
		}
		return false;
		
	}

	
}
