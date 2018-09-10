package web.www.blockchain;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;
import java.util.EnumSet;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import Exceptions.InvalidArgumentException;
import Exceptions.ProposalException;
import web.www.blockchain.Peer.PeerRole;

public class Channel {
	
	public static String channelName;
	public static String CHAINCODE_ID;
	public static String CHAINCODE_VERSION;
	public static String CHAINCODE_PATH;
	
	private final Collection<Peer> peers = Collections.synchronizedSet(new HashSet<>());
	final Collection<Orderer> orderers = Collections.synchronizedCollection(new LinkedList<>());
	//private Block genesisBlock;
	
	//private final boolean systemChannel;
	private static final Random RANDOM=new Random();
	
	
	
	//@SuppressWarnings("static-access")
	public Channel(String channelName)
	{
		this.channelName=channelName;
	}
	
	public Channel(String channelName,String chaincode_id,String chaincode_version,String chaincode_path)
	{
		this.channelName=channelName;
		this.CHAINCODE_ID=chaincode_id;
		this.CHAINCODE_VERSION=chaincode_version;
		this.CHAINCODE_PATH=chaincode_path;
	}
	
	
	
	public String getChannelName()
	{
		return channelName;
	}
	
	/*
	//Checking system channel
	public boolean isSystemChannel()
	{
		return systemChannel;
	}  */

	public boolean chainCodeInstantiated(String chaincode_id,String chaincode_version,String chaincode_path) {
		// TODO Auto-generated method stub
		if(!(chaincode_id==null && chaincode_version==null && chaincode_path==null))
		{
			return false;
		}
		else
			return false;
		
	}  
	
	public void newChannel()
	{
		
	}

	public void addOrderer(Orderer orderer) {
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
		
		System.out.printf("Adding peer %s to the channel %s",peer,this.channelName);
		peer.setChannel(this);
		
		peers.add(peer);
		
		return this;
	}
	
	
	/*
	
	//Join peer to the channel
	public Channel joinPeer(Peer peer)
	{
		return joinPeer(peer,createPeerOptions());
	}
	
	public Channel joinPeer(Peer peer,PeerOptions peerOptions)
	{
		return joinPeer(getRandomOrderer(),peer,peerOptions);
	}
	
	public Channel joinPeer(Orderer orderer,Peer peer,PeerOptions peerOptions)
	{
		Channel peerChannel=peer.getChannel();
		if(peerChannel!=null && peerChannel!=this)
		{
			throw new ProposalException("Can not add peer to this channel because, it already belongs to the other channel");
		}
		
		if()
		
	}
	
	*/
	
	/*
	
	private Orderer getRandomOrderer()
	{
		final ArrayList<Orderer> randpicks=new ArrayList<>(new HashSet<>(getOrderers()));
		if(randpicks.isEmpty())
			throw new InvalidArgumentException("Channel" +channelName+ " doesn't have any orderer associated with it");
		
		return randpicks.get(RANDOM.nextInt(randpicks.size()));
	}
*/
	
	 /*   public static class PeerOptions implements Cloneable, Serializable {
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

*/

}
