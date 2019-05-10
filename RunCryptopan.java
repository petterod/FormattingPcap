package pcapping;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RunCryptopan {

	
	public static void main(String[] args) throws IOException {
		
//	makes 32-bit key

	int raw_srcip;
	int raw_dstip;
	int anonymized_srcip;
	int anonymized_dstip;
	
	//Main test = new Main(args[0]);
	
// 	Create an instance of PAnonymizer with the key
// 	PAnonymizer my_anonymizer(my_key);
	
	int version, internetHeaderLength, totalLength, identification, timeToLive, headerChecksum, flowLabel, payloadLength, hopLimit, dstport, srcport, dataOffset, windowSize, checksum, urgentPointer, length;
	short dscp, ecn, fragmentOffset, trafficClass, reserved;
	boolean reservedSet, dontFragment, moreFragments, isNS, isCWR, isECE, isURG, isACK, isPSH, isRST, isSYN, isFIN;
	String protocol, srcip, dstip, nextHeader;
	long seqNr, ackNr;
	
//	System.out.println("lengden er " + args.length);
//	
//	if (args.length !=1) {
//	      System.err.println("usage: sample raw-trace-file\n");
//	      System.exit(-1);
//	    }
//	
//	
//	File inFile = new File(args[0]);	
	File inFile = new File("C:\\Users\\Petter\\Documents\\Master\\Datasets\\output.dat");
	BufferedReader br = new BufferedReader(new FileReader(inFile));
	String line = null;
//	if (br.readLine() == null) {
//	      System.err.printf("Cannot open file %s\n", args[0]);
//	      System.exit(-2);
//	    }
	
	while((line = br.readLine()) != null) {
		String[] columns = line.split("\t");
		String[] srcips = columns[13].split("\\.");
		String[] dstips = columns[14].split("\\.");
		
		columns[13] = "13";
		//alt1
		//long srcipAdded = Long.parseLong(srcips[0] + srcips[1] + srcips[2] + srcips[3]);
		//long dstipAdded = Long.parseLong(dstips[0] + dstips[1] + dstips[2] + dstips[3]);
		
		//alt2
		long srcipAdded2 = (Long.parseLong(srcips[0]) << 24) + (Long.parseLong(srcips[1]) << 16) +
				(Long.parseLong(srcips[2]) << 8) + Long.parseLong(srcips[3]);
		long dstipAdded2 = (Long.parseLong(dstips[0]) << 24) + (Long.parseLong(dstips[1]) << 16) +
				(Long.parseLong(dstips[2]) << 8) + Long.parseLong(dstips[3]);
		
		//Anonymize the raw IP
		//anonymized_srcip = my_anonymizer.anonymize(srcipAdded);
		//anonymized_dstip = my_anonymizer.anonymize(dstipAdded);
		
//		int octet1 = anonymized_srcip >> 24;
//		int octet2 = (anonymized_srcip << 8) >> 24;
//		int octet3 = (anonymized_srcip << 16) >> 24;
//		int octet4 = (anonymized_srcip << 24) >> 24;
		
		int octet1 = 10;
		int octet2 = 192;
		int octet3 = 32;
		int octet4 = 129;
		
		columns[13] = octet1 + "." + octet2 + "." + octet3 + "." + octet4;
		
		System.out.println(columns[13]);

		//System.out.println(srcipAdded + " " + dstipAdded);
		//System.out.println(srcipAdded2 + " " + dstipAdded2);

	}
	
	}
}
