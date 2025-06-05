/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.block;

import java.security.MessageDigest;

public class Block {
    public String previousHash;
    public String data;
    public int nonce;
    public String hash;

    public Block(String previousHash, String data) {
        this.previousHash = previousHash;
        this.data = data;
        this.nonce = 0;
        this.hash = "";
    }

    public String computeHash() {
        try {
            String input = previousHash + data + nonce;
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes("UTF-8"));

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch(Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0');
        while (true) {
            hash = computeHash();
            if (hash.substring(0, difficulty).equals(target)) {
                break;
            }
            nonce++;
        }
    }

    public static void main(String[] args) {
        String genesisHash = new String(new char[64]).replace('\0', '0');

        Block blockT = new Block(genesisHash, "Data for Block t");
        blockT.mineBlock(4);
        System.out.println("Block t hash: " + blockT.hash);

        Block blockTPlus1 = new Block(blockT.hash, "Data for Block t+1");
        blockTPlus1.mineBlock(4);
        System.out.println("Block t+1 hash: " + blockTPlus1.hash);
    }
}
