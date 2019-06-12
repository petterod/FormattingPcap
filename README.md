# FormattingPcap
Formatting PCAP files to text files

This repository allows for formatting of PCAP files to text files. FormattingIP formats the PCAP file into one IPv4 text file
and one IPv6 text file, from the format defined in PktIPv4 and PktIPv6, respectively.

FormattingIP requires an input PCAP file and two output files, one for the IPv4 text file, and the other for the IPv6 text file.

When exported as a runnable JAR file, it can be run as such:

java -jar FormattingIP.jar <input-PCAP-file> <output-IPv4-text-file> <output-IPv6-text-file>

