package pcapping;


import io.pkts.Pcap;
import io.pkts.packet.Packet;
import java.io.IOException;
import io.pkts.packet.UDPPacket;
import io.pkts.protocol.Protocol;


public class UDPinfo{
	
	//https://infoskirmish.com/2018/05/28/howto-parse-pcap-files-with-java/
	
	
	public void udps() {
		try {
		    Pcap pcap = Pcap.openStream("C:\\Users\\Petter\\Documents\\Master\\Datasets\\first3.pcap");
		    pcap.loop((final Packet packet) -> { 
		        if(packet.hasProtocol(Protocol.UDP)) {
		            UDPPacket udp = (UDPPacket) packet.getPacket(Protocol.UDP);
		            // Useful information 
		            //The ports involved
		            int dstport = udp.getDestinationPort();
		            int srcport = udp.getSourcePort();
		            //Time of packet arrival
		            long packetTime = udp.getArrivalTime(); 
		            //Packet Payload
		            io.pkts.buffer.Buffer payload = udp.getPayload();
		            //Payload as hex
		            //String hexdump = udp.getPayload().dumpAsHex();
		 		     
		            int headerLength = udp.getHeaderLength();
		            		            
		            int length1 = udp.getLength();
		            
		            int payloadLength = udp.getPayload().capacity();
		            
		            int length2 = headerLength + payloadLength;
		            
		            int checksum = udp.getChecksum();
		            
		            System.out.println(length1 + "-" + length2);
		        }
		        return true;
		    });                       
		} catch (IOException ex) {
		    System.out.println(ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		UDPinfo udp = new UDPinfo();
		udp.udps();
	}

}
