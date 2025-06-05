This project demonstrates the basic structure and behavior of blockchain blocks in Java, including:

Chaining blocks using previous hashes

Proof-of-Work (PoW) mining using SHA-256

Nonce adjustment to meet a given hash difficulty level

What It Does
Constructs Block t by including:

previousHash (hash of block t−1)

data (payload)

nonce (adjusted for mining)

Computes hash(Block t) using SHA-256

Builds Block t+1 using the hash of Block t as its previousHash

Demonstrates immutability and block linkage
