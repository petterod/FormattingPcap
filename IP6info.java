package pcapping;

import java.io.IOException;

import io.pkts.Pcap;
import io.pkts.packet.IPv6Packet;
import io.pkts.packet.Packet;
import io.pkts.protocol.Protocol;

public class IP6info {
	
	//https://infoskirmish.com/2018/05/28/howto-parse-pcap-files-with-java/
	
	public void ips() {
		try {
		    Pcap pcap = Pcap.openStream("C:\\Users\\Petter\\Documents\\Master\\Datasets\\first3.pcap");
		    pcap.loop((final Packet packet) -> { 
		        if(packet.hasProtocol(Protocol.IPv6)) {
		            IPv6Packet ip = (IPv6Packet) packet.getPacket(Protocol.IPv6);
		            //The IP addresses involved
		            String dstip = ip.getDestinationIP();
		            String srcip = ip.getSourceIP();
		            // The payload data as hex
		            String payload = ip.getPayload().dumpAsHex();
		            // Time packet arrived.
		            long packetTime = ip.getArrivalTime(); 
		            // Is this packet a fragment?
		            boolean isFragment = ip.isFragmented();
		            
		            short fragmentOffset = ip.getFragmentOffset();
		            
		            int headerLength = ip.getHeaderLength();
		            
		            int identification = ip.getIdentification();
		            
		            int version = ip.getVersion();
		            
		            Protocol protocol = ip.getProtocol();
		            
		            int totalLength = ip.getTotalIPLength();
		           
		            int payloadLength = totalLength - headerLength;
		            		            		            
		            Protocol nextHeader = ip.getNextPacket().getProtocol();
		            
		            String nextHeader2 = ip.getProtocol().toString();
		            
		            int flowLabel = ip.getFlowLabel();
		            
		            int hopLimit = ip.getHopLimit();
		            
		            short trafficClass = ip.getTrafficClass();
		           		            
		            
		            System.out.println("this protocol: " + flowLabel);
		        }
		        return true;
		    });                       
		} catch (IOException ex) {
		    System.out.println(ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		IP6info i = new IP6info();
		i.ips();
	}
}
