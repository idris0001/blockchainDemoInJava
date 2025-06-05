This project demonstrates the basic structure and behavior of blockchain blocks in Java, including:

Chaining blocks using previous hashes, Proof-of-Work (PoW) mining using SHA-256, Nonce adjustment to meet a given hash difficulty level

What does it do?
1. Constructs Block t by including:
a. previousHash (hash of block t−1)
b. data (payload)
c. nonce (adjusted for mining)
2. Computes hash(Block t) using SHA-256
3. Builds Block t+1 using the hash of Block t as its previousHash
4. Demonstrates immutability and block linkage
