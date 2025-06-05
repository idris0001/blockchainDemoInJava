# Java Blockchain Demo

## Project Description
This project demonstrates the basic structure and behavior of blockchain blocks in Java. It includes chaining blocks using previous hashes, Proof-of-Work (PoW) mining with SHA-256, and nonce adjustment to meet a given hash difficulty level. The demo constructs each block by including the previous block’s hash, data payload, and a nonce adjusted through mining. It computes the current block’s hash using SHA-256, then links blocks immutably by using each block’s hash as the previous hash for the next block, illustrating blockchain immutability and linkage.

## Features
- Basic block structure with data, timestamp, previous hash, and current hash
- Proof-of-work mining simulation
- Chain integrity verification
- Simple command-line interface

## Requirements
- Java JDK 8 or higher
- Maven (optional, if using a build tool)
- Any Java IDE or command line

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/java-blockchain-demo.git

2.  Compile the Java file(s):

    javac Block.java

3. Run the main class:
 java Block

*Sample output*
Block t hash: 0000ac5100c4b3e2d3d895cd7b457ba7f336fa9bdae68b2e9f8bb14673f4e3bb
Block t+1 hash: 0000f19dd5d0b77a2f7b6caa766bf553404b7eef5913d525bf883e01408377ad
