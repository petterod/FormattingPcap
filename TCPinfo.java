package pcapping;

import io.pkts.Pcap;
import io.pkts.packet.Packet;
import java.io.IOException;
import java.nio.Buffer;
import io.pkts.packet.TCPPacket;
import io.pkts.protocol.Protocol;

public class TCPinfo {
	
	//https://infoskirmish.com/2018/05/28/howto-parse-pcap-files-with-java/
	
	public void tcps() {
		try {
		    Pcap pcap = Pcap.openStream("C:\\Users\\Petter\\Documents\\Master\\Datasets\\first3.pcap");
		    pcap.loop((final Packet packet) -> { 
		        if(packet.hasProtocol(Protocol.TCP)) {
		            TCPPacket tcp = (TCPPacket) packet.getPacket(Protocol.TCP);
		            // Useful information 
		            //The ports involved
		            int dstport = tcp.getDestinationPort();
		            int srcport = tcp.getSourcePort();
		 
		            //Time of packet arrival
		            long packetTime = tcp.getArrivalTime(); 
		            //See if various flags are set
		            boolean isACK = tcp.isACK();
		            boolean isCWR = tcp.isCWR();
		            boolean isECE = tcp.isECE();
		            boolean isFIN = tcp.isFIN();
		            boolean isPSH = tcp.isPSH();
		            boolean isRST = tcp.isRST();
		            boolean isSYN = tcp.isSYN();
		            boolean isTCP = tcp.isTCP();
		            boolean isUDP = tcp.isUDP();
		            boolean isURG = tcp.isURG();
		            boolean isNS = tcp.isNS();
		            //Packet Payload
		            io.pkts.buffer.Buffer payload = tcp.getPayload();
		            //Payload as hex
		            //String hexdump = tcp.getPayload().dumpAsHex();
		            
		            //ackNr som er faktisk, ikke relativ
		            long ackNr = tcp.getAcknowledgementNumber();
		            //seqNr som er faktisk, ikke relativ
		            long seqNr = tcp.getSequenceNumber();
		            
		            int dataOffset = tcp.getHeaderLength();
		            
		            short reserved = tcp.getReserved();
		            
		            int windowSize = tcp.getWindowSize();
		            
		            int urgentPointer = tcp.getUrgentPointer();
		            
		            int checksum = tcp.getChecksum();
		           
		         		            
		            System.out.println("Result: " + urgentPointer);
		        }
		        return true;
		    });                       
		} catch (IOException ex) {
		    System.out.println(ex.getMessage());
		}
	}
	
	public static void main(String[] args) {
		TCPinfo tcp = new TCPinfo();
		tcp.tcps(); 
	}

}
