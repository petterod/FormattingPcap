package pcapping;

import io.pkts.PacketHandler;
import io.pkts.Pcap;
import io.pkts.packet.IPv4Packet;
import io.pkts.packet.IPv6Packet;
import io.pkts.packet.Packet;
import io.pkts.packet.TCPPacket;
import io.pkts.packet.UDPPacket;
import io.pkts.protocol.Protocol;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MainSplit {
	
	Pcap pcap;
	
	public MainSplit(String pcapFile, String fnameipv4, String fnameipv6) throws FileNotFoundException, IOException {	
		this.pcap = Pcap.openStream(pcapFile);
		parsing();
		toTextFile(fnameipv4,fnameipv6);
	}
	
	static ArrayList<PktIPv4> listeIPv4 = new ArrayList<PktIPv4>();
	static ArrayList<PktIPv6> listeIPv6 = new ArrayList<PktIPv6>();
	
	public ArrayList<PktIPv4> getListeIPv4(){
		return listeIPv4;
	}
	
	public ArrayList<PktIPv6> getListeIPv6(){
		return listeIPv6;
	}
	
	public static boolean nextTransportProtocolIPv4(Packet packet, PktIPv4 pkt) throws IOException{
		if (packet.hasProtocol(Protocol.TCP)) {
			TCPPacket tcpPacket = (TCPPacket) packet.getPacket(Protocol.TCP);			
			pkt.setSrcport(tcpPacket.getSourcePort());
			pkt.setDstport(tcpPacket.getDestinationPort());
			pkt.setSeqNr(tcpPacket.getSequenceNumber());
			pkt.setAckNr(tcpPacket.getAcknowledgementNumber());
			pkt.setDataOffset(tcpPacket.getHeaderLength());
			pkt.setReserved(tcpPacket.getReserved());
			pkt.setNS(tcpPacket.isNS());
			pkt.setCWR(tcpPacket.isCWR());
			pkt.setECE(tcpPacket.isECE());
			pkt.setURG(tcpPacket.isURG());
			pkt.setACK(tcpPacket.isACK());
			pkt.setPSH(tcpPacket.isPSH());
			pkt.setRST(tcpPacket.isRST());
			pkt.setSYN(tcpPacket.isSYN());
			pkt.setFIN(tcpPacket.isFIN());
			pkt.setWindowSize(tcpPacket.getWindowSize());
			pkt.setChecksum(tcpPacket.getChecksum());
			pkt.setUrgentPointer(tcpPacket.getUrgentPointer());
			listeIPv4.add(pkt);
			
		} else if (packet.hasProtocol(Protocol.UDP)) {
			UDPPacket udpPacket = (UDPPacket) packet.getPacket(Protocol.UDP);
			pkt.setSrcport(udpPacket.getSourcePort());
			pkt.setDstport(udpPacket.getDestinationPort());
			pkt.setLength(udpPacket.getLength());
			pkt.setChecksum(udpPacket.getChecksum());
			listeIPv4.add(pkt);
		}
		return true;
	}
	
	public static boolean nextTransportProtocolIPv6(Packet packet, PktIPv6 pkt) throws IOException{
		if (packet.hasProtocol(Protocol.TCP)) {
			TCPPacket tcpPacket = (TCPPacket) packet.getPacket(Protocol.TCP);			
			pkt.setSrcport(tcpPacket.getSourcePort());
			pkt.setDstport(tcpPacket.getDestinationPort());
			pkt.setSeqNr(tcpPacket.getSequenceNumber());
			pkt.setAckNr(tcpPacket.getAcknowledgementNumber());
			pkt.setDataOffset(tcpPacket.getHeaderLength());
			pkt.setReserved(tcpPacket.getReserved());
			pkt.setNS(tcpPacket.isNS());
			pkt.setCWR(tcpPacket.isCWR());
			pkt.setECE(tcpPacket.isECE());
			pkt.setURG(tcpPacket.isURG());
			pkt.setACK(tcpPacket.isACK());
			pkt.setPSH(tcpPacket.isPSH());
			pkt.setRST(tcpPacket.isRST());
			pkt.setSYN(tcpPacket.isSYN());
			pkt.setFIN(tcpPacket.isFIN());
			pkt.setWindowSize(tcpPacket.getWindowSize());
			pkt.setChecksum(tcpPacket.getChecksum());
			pkt.setUrgentPointer(tcpPacket.getUrgentPointer());
			listeIPv6.add(pkt);
			
		} else if (packet.hasProtocol(Protocol.UDP)) {
			UDPPacket udpPacket = (UDPPacket) packet.getPacket(Protocol.UDP);
			pkt.setSrcport(udpPacket.getSourcePort());
			pkt.setDstport(udpPacket.getDestinationPort());
			pkt.setLength(udpPacket.getLength());
			pkt.setChecksum(udpPacket.getChecksum());
			listeIPv6.add(pkt);
		}
		return true;
	}

	public void parsing() throws IOException {
		pcap.loop(new PacketHandler() {
			public boolean nextPacket(Packet packet) throws IOException {
				PktIPv4 pkt4 = new PktIPv4();
				PktIPv6 pkt6 = new PktIPv6();
				
				if (packet.hasProtocol(Protocol.IPv4)) {
					IPv4Packet ipv4 = (IPv4Packet) packet.getPacket(Protocol.IPv4);
					pkt4.setVersion(ipv4.getVersion());
					pkt4.setTimestamp(ipv4.getArrivalTime());
					pkt4.setInternetHeaderLength(ipv4.getHeaderLength());
					pkt4.setDscp(ipv4.getDSCP());
					pkt4.setEcn(ipv4.getECN());
					pkt4.setTotalLength(ipv4.getTotalIPLength());
					pkt4.setIdentification(ipv4.getIdentification());
					pkt4.setReservedSet(ipv4.isReservedFlagSet());
					pkt4.setDontFragment(ipv4.isDontFragmentSet());
					pkt4.setMoreFragments(ipv4.isMoreFragmentsSet());		
					pkt4.setTimeToLive(ipv4.getTimeToLive());
					pkt4.setProtocol(ipv4.getProtocol().toString());
					pkt4.setHeaderChecksum(ipv4.getIpChecksum());
					pkt4.setSrcipv4(ipv4.getSourceIP());
					pkt4.setDstipv4(ipv4.getDestinationIP());
					nextTransportProtocolIPv4(packet, pkt4);					
										
				} else if (packet.hasProtocol(Protocol.IPv6)) {
					IPv6Packet ipv6 = (IPv6Packet) packet.getPacket(Protocol.IPv6);
					pkt6.setVersion(ipv6.getVersion());
					pkt6.setTimestamp(ipv6.getArrivalTime());
					pkt6.setTrafficClass(ipv6.getTrafficClass());
					pkt6.setFlowLabel(ipv6.getFlowLabel());
					pkt6.setPayloadLength(ipv6.getTotalIPLength() - ipv6.getHeaderLength());
					pkt6.setNextHeader(ipv6.getProtocol().toString());
					pkt6.setHopLimit(ipv6.getHopLimit());
					pkt6.setSrcipv6(ipv6.getSourceIP());
					pkt6.setDstipv6(ipv6.getDestinationIP());
					nextTransportProtocolIPv6(packet,pkt6);					
				}
				return true;
			}
			});
		}
	
	public void toTextFile(String fnameipv4, String fnameipv6) {
		final String FNAMEIPv4 = fnameipv4;
		final String FNAMEIPv6 = fnameipv6;
		try ( BufferedWriter bw1 = new BufferedWriter (new FileWriter (FNAMEIPv4)) ) 
		{			
			for (PktIPv4 line : listeIPv4) {
				bw1.write(line + "\n");
			}
			System.out.println("Created file " + FNAMEIPv4);
			bw1.close ();
			
		} catch (IOException e) {
			e.printStackTrace ();
		}
		
		try(BufferedWriter bw2 = new BufferedWriter (new FileWriter (FNAMEIPv6)) )
		{
			for(PktIPv6 line : listeIPv6) {
				bw2.write(line + "\n");
			}
			System.out.println("Created file " + FNAMEIPv6);
			bw2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		if (args.length !=3) {
		      System.err.println("usage: java -jar jarfile.jar pcapfileInput.pcap IPv4output.dat IPv6output.dat\n");
		      System.exit(-1);
		    }
		else {
			MainSplit m = new MainSplit(args[0],args[1],args[2]);
		}
	}
}
