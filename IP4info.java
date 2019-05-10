package pcapping;


import io.pkts.Pcap;
import io.pkts.packet.Packet;
import java.io.IOException;
import io.pkts.protocol.Protocol;
import io.pkts.packet.IPv4Packet;

public class IP4info {
	
	//https://infoskirmish.com/2018/05/28/howto-parse-pcap-files-with-java/
	
	public void ips() {
		try {
		    Pcap pcap = Pcap.openStream("C:\\Users\\Petter\\Documents\\Master\\Datasets\\first3.pcap");
		    pcap.loop((final Packet packet) -> { 
		        if(packet.hasProtocol(Protocol.IPv4)) {
		            IPv4Packet ip = (IPv4Packet) packet.getPacket(Protocol.IPv4);
		            
		            
		            String dstip = ip.getDestinationIP();
		            String srcip = ip.getSourceIP();
		            
		            String payload = ip.getPayload().dumpAsHex();
		            
		            long packetTime = ip.getArrivalTime(); 
		            
		            boolean isFragment = ip.isFragmented();
		            
		            short fragmentOffset = ip.getFragmentOffset();
		            
		            int internetHeaderLength = ip.getHeaderLength();
		            
		            int identification = ip.getIdentification();		           
		            
		            int version = ip.getVersion();
		            
		            String protocol = ip.getProtocol().toString();
		            Protocol protocol2 = ip.getProtocol();
		            
		            int totalLength = ip.getTotalIPLength();
		           
		            int headerChecksum = ip.getIpChecksum();		            
		            
		            boolean reservedSet = ip.isReservedFlagSet();
		            boolean dontFragment = ip.isDontFragmentSet();
		            boolean moreFragments = ip.isMoreFragmentsSet();
		            
		            
		            int timeToLive = ip.getTimeToLive();
		            
		            short dscp = ip.getDSCP();
		            
		            short ecn = ip.getECN();
		            
		            long arrivalTime = ip.getArrivalTime();
				            		                    		       		            
		            System.out.println("String:" + arrivalTime);
		        }
		        return true;
		    });                       
		} catch (IOException ex) {
		    System.out.println(ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		IP4info i = new IP4info();
		i.ips();
	}

}
