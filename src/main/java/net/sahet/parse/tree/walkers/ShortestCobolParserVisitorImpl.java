package net.sahet.parse.tree.walkers;

import net.sahet.parsers.ShortestCobolParser;
import net.sahet.parsers.ShortestCobolParserBaseVisitor;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class ShortestCobolParserVisitorImpl extends ShortestCobolParserBaseVisitor<String> {


    @Override
    public String visitDisplayStatement(ShortestCobolParser.DisplayStatementContext ctx) {
        String originalTxt = ctx.message().getText();
        String sha3Hex = "";
        try {
            System.out.println("Original text: " + originalTxt);
            final MessageDigest digest = MessageDigest.getInstance("SHA3-256");
            final byte[] hashbytes = digest.digest(
                    originalTxt.getBytes(StandardCharsets.UTF_8));
            sha3Hex = bytesToHex(hashbytes);
            System.out.println("Hash: " + sha3Hex);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return sha3Hex;
    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }


}
