package pcapping;

public class PktIPv6 {
	
		int version;
		long timestamp;
		short trafficClass;
		int flowLabel;
		int payloadLength;
		String nextHeader;
		int hopLimit;
		String srcipv6;
		String dstipv6;
		int srcport;
		int dstport;
		long seqNr;
		long ackNr;
		int dataOffset;
		short reserved;
		boolean isNS;
		boolean isCWR;
		boolean isECE;
		boolean isURG;
		boolean isACK;
	    boolean isPSH;
	    boolean isRST;
	    boolean isSYN;
	    boolean isFIN;
	    int windowSize;
	    int checksum;
	    int urgentPointer;
	    int length;
	      
	    public void setVersion(int version) {
			this.version = version;
		}
	    
	    public void setTimestamp(long timestamp) {
	    	this.timestamp = timestamp;
	    }

		public void setTrafficClass(short trafficClass) {
			this.trafficClass = trafficClass;
		}

		public void setFlowLabel(int flowLabel) {
			this.flowLabel = flowLabel;
		}

		public void setPayloadLength(int payloadLength) {
			this.payloadLength = payloadLength;
		}

		public void setNextHeader(String nextHeader) {
			this.nextHeader = nextHeader;
		}

		public void setHopLimit(int hopLimit) {
			this.hopLimit = hopLimit;
		}
		
		public void setSrcipv6(String srcipv6) {
			this.srcipv6 = srcipv6;
		}

		public void setDstipv6(String dstipv6) {
			this.dstipv6 = dstipv6;
		}

		public void setDstport(int dstport) {
			this.dstport = dstport;
		}

		public void setSrcport(int srcport) {
			this.srcport = srcport;
		}

		public void setSeqNr(long seqNr) {
			this.seqNr = seqNr;
		}

		public void setAckNr(long ackNr) {
			this.ackNr = ackNr;
		}

		public void setDataOffset(int dataOffset) {
			this.dataOffset = dataOffset;
		}

		public void setReserved(short reserved) {
			this.reserved = reserved;
		}

		public void setNS(boolean isNS) {
			this.isNS = isNS;
		}

		public void setCWR(boolean isCWR) {
			this.isCWR = isCWR;
		}

		public void setECE(boolean isECE) {
			this.isECE = isECE;
		}

		public void setURG(boolean isURG) {
			this.isURG = isURG;
		}

		public void setACK(boolean isACK) {
			this.isACK = isACK;
		}

		public void setPSH(boolean isPSH) {
			this.isPSH = isPSH;
		}

		public void setRST(boolean isRST) {
			this.isRST = isRST;
		}

		public void setSYN(boolean isSYN) {
			this.isSYN = isSYN;
		}

		public void setFIN(boolean isFIN) {
			this.isFIN = isFIN;
		}

		public void setWindowSize(int windowSize) {
			this.windowSize = windowSize;
		}

		public void setChecksum(int checksum) {
			this.checksum = checksum;
		}

		public void setUrgentPointer(int urgentPointer) {
			this.urgentPointer = urgentPointer;
		}

		public void setLength(int length) {
			this.length = length;
		}
		
		public int getVersion() {
			return version;
		}
		
		public long getTimestamp() {
	    	return timestamp;
	    }

		public short getTrafficClass() {
			return trafficClass;
		}

		public int getFlowLabel() {
			return flowLabel;
		}

		public int getPayloadLength() {
			return payloadLength;
		}

		public String getNextHeader() {
			return nextHeader;
		}

		public int getHopLimit() {
			return hopLimit;
		}
		
		public String getSrcipv6() {
			return srcipv6;
		}

		public String getDstipv6() {
			return dstipv6;
		}

		public int getDstport() {
			return dstport;
		}

		public int getSrcport() {
			return srcport;
		}

		public long getSeqNr() {
			return seqNr;
		}

		public long getAckNr() {
			return ackNr;
		}

		public int getDataOffset() {
			return dataOffset;
		}

		public short getReserved() {
			return reserved;
		}

		public boolean isNS() {
			return isNS;
		}

		public boolean isCWR() {
			return isCWR;
		}

		public boolean isECE() {
			return isECE;
		}

		public boolean isURG() {
			return isURG;
		}

		public boolean isACK() {
			return isACK;
		}

		public boolean isPSH() {
			return isPSH;
		}

		public boolean isRST() {
			return isRST;
		}

		public boolean isSYN() {
			return isSYN;
		}

		public boolean isFIN() {
			return isFIN;
		}

		public int getWindowSize() {
			return windowSize;
		}

		public int getChecksum() {
			return checksum;
		}

		public int getUrgentPointer() {
			return urgentPointer;
		}

		public int getLength() {
			return length;
		}

		@Override
	    public String toString() {
	    	
	    	return ""  	+ getVersion() + "\t" 
	    				+ getTimestamp() + "\t"
	    	    	    + getTrafficClass() + "\t"
	    	    	    + getFlowLabel() + "\t"
	    	    	    + getPayloadLength() + "\t"
	    	    	    + getNextHeader() + "\t"
	    	    	    + getHopLimit() + "\t"
	    	    	    + getSrcipv6() + "\t"
	    	    	    + getDstipv6() + "\t"
	    	    	    + getSrcport() + "\t"
	    	    	    + getDstport() + "\t"
	    	    	    + getSeqNr() + "\t"
	    	    	    + getAckNr() + "\t"
	    	    	    + getDataOffset() + "\t"
	    	    	    + getReserved() + "\t"
	    	    	    + isNS() + "\t"
	    	    	    + isCWR() + "\t"
	    	    	    + isECE() + "\t"
	    	    	    + isURG() + "\t"
	    	    	    + isACK() + "\t"
	    	    	    + isPSH() + "\t"
	    	    	    + isRST() + "\t"
	    	    	    + isSYN() + "\t"
	    	    	    + isFIN() + "\t"
	    	    	    + getWindowSize() + "\t"		
	    	    	    + getChecksum() + "\t"
	    	    	    + getUrgentPointer() + "\t"
	    	    	    + getLength() + "\t";
	    }
}
