package pcapping;

public class PktIPv4 {
	
		int version;
		long timestamp;
		int internetHeaderLength;
		short dscp;
		short ecn;
		int totalLength;
		int identification;
		boolean reservedSet;
		boolean dontFragment;
		boolean moreFragments;
		short fragmentOffset;
		int timeToLive;
		String protocol;
		int headerChecksum;
		String srcipv4;
		String dstipv4;
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

		public void setInternetHeaderLength(int internetHeaderLength) {
			this.internetHeaderLength = internetHeaderLength;
		}

		public void setDscp(short dscp) {
			this.dscp = dscp;
		}

		public void setEcn(short ecn) {
			this.ecn = ecn;
		}

		public void setTotalLength(int totalLength) {
			this.totalLength = totalLength;
		}

		public void setIdentification(int identification) {
			this.identification = identification;
		}

		public void setReservedSet(boolean reservedSet) {
			this.reservedSet = reservedSet;
		}

		public void setDontFragment(boolean dontFragment) {
			this.dontFragment = dontFragment;
		}

		public void setMoreFragments(boolean moreFragments) {
			this.moreFragments = moreFragments;
		}

		public void setFragmentOffset(short fragmentOffset) {
			this.fragmentOffset = fragmentOffset;
		}

		public void setTimeToLive(int timeToLive) {
			this.timeToLive = timeToLive;
		}

		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}

		public void setHeaderChecksum(int headerChecksum) {
			this.headerChecksum = headerChecksum;
		}

		public void setSrcipv4(String srcipv4) {
			this.srcipv4 = srcipv4;
		}

		public void setDstipv4(String dstipv4) {
			this.dstipv4 = dstipv4;
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

		public int getInternetHeaderLength() {
			return internetHeaderLength;
		}

		public short getDscp() {
			return dscp;
		}

		public short getEcn() {
			return ecn;
		}

		public int getTotalLength() {
			return totalLength;
		}

		public int getIdentification() {
			return identification;
		}

		public boolean isReservedSet() {
			return reservedSet;
		}

		public boolean isDontFragment() {
			return dontFragment;
		}

		public boolean isMoreFragments() {
			return moreFragments;
		}

		public short getFragmentOffset() {
			return fragmentOffset;
		}

		public int getTimeToLive() {
			return timeToLive;
		}

		public String getProtocol() {
			return protocol;
		}

		public int getHeaderChecksum() {
			return headerChecksum;
		}

		public String getSrcipv4() {
			return srcipv4;
		}

		public String getDstipv4() {
			return dstipv4;
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
	    				+ getInternetHeaderLength() + "\t"
	    				+ getDscp() + "\t"
	    	    		+ getEcn() + "\t"
	    	    	  	+ getTotalLength() + "\t"
	    	    	  	+ getIdentification() + "\t"
	    	    	  	+ isReservedSet() + "\t"
	    	    	    + isDontFragment() + "\t"
	    	    	    + isMoreFragments() + "\t"
	    	    	    + getFragmentOffset() + "\t"
	    	    	    + getTimeToLive() + "\t"
	    	    	    + getProtocol() + "\t"
	    	    	    + getHeaderChecksum() + "\t"
	    	    	    + getSrcipv4() + "\t"
	    	    	    + getDstipv4() + "\t"
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
