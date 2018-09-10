package web.www.blockchain;

import java.util.HashSet;
import java.util.Collections;
import java.util.EnumSet;
import java.io.Serializable;
import java.util.Collection;

import Exceptions.InvalidArgumentException;
import web.www.blockchain.Peer.PeerRole;

public class Channel {
	
	public static String CHANNEL_NAME;
	public static String CHAINCODE_ID;
	public static String CHAINCODE_VERSION;
	public static String CHAINCODE_PATH;
	
	private final Collection<Peer> peers = Collections.synchronizedSet(new HashSet<>());
	
	private final boolean systemChannel;
	
	
	//@SuppressWarnings("static-access")
	public Channel(String channelName)
	{
		this.CHANNEL_NAME=channelName;
	}
	
	public Channel(String channelName,String chaincode_id,String chaincode_version,String chaincode_path)
	{
		this.CHANNEL_NAME=channelName;
		this.CHAINCODE_ID=chaincode_id;
		this.CHAINCODE_VERSION=chaincode_version;
		this.CHAINCODE_PATH=chaincode_path;
	}
	
	
	
	public String getChannelName()
	{
		return CHANNEL_NAME;
	}
	
	//Checking system channel
	public boolean isSystemChannel()
	{
		return systemChannel;
	}

	public boolean chainCodeInstantiated(String chaincode_id,String chaincode_version,String chaincode_path) {
		// TODO Auto-generated method stub
		
		
	}  
	
	public void newChannel()
	{
		
	}

	public void addOrderer(OrdererConfig orderer) {
		// TODO Auto-generated method stub
		
		
	}

	public Channel addPeer(Peer peer) throws InvalidArgumentException{
		// TODO Auto-generated method stub
		if(peer==null)
		{
			throw new InvalidArgumentException("Peer can not be null.");
		}
		
		if(peer.getChannel()!=null && peer.getChannel()!=null)
		{
			throw new InvalidArgumentException("Peer alraedy connected to channel");
		}
		
		System.out.printf("Adding peer %s to the channel %s",peer,this.CHANNEL_NAME);
		peer.setChannel(this);
		
		peers.add(peer);
		
		return this;
	}
	
	public Channel joinPeer(Peer peer)
	{
		
	}

	
	public static class PeerOptions implements Cloneable, Serializable {
        private static final long serialVersionUID = -6906605662806520793L;

        protected EnumSet<PeerRole> peerRoles;
        protected Boolean newest = true;
        protected Long startEvents;
        protected Long stopEvents = Long.MAX_VALUE;
        protected boolean registerEventsForFilteredBlocks = false;

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(1000);
            sb.append("PeerOptions( " + format("newest: %s, startEvents: %s, stopEvents: %s, registerEventsForFilteredBlocks: %s", "" + newest, "" + startEvents, "" + stopEvents, registerEventsForFilteredBlocks));

            if (peerRoles != null && !peerRoles.isEmpty()) {

                sb.append(", PeerRoles:[");

                String sep = "";

                for (PeerRole peerRole : peerRoles) {
                    sb.append(sep).append(peerRole.getPropertyName());
                    sep = " ,";
                }
                sb.append("]");
            }
            sb.append(")");
            return sb.toString();
}

}
