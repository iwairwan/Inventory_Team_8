/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UH
 */
public class Encrypt {
    public static String getmd5Java(String message)
    {
        String digest = null;
        try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] hash = md.digest(message.getBytes("UTF-8"));
                //merubah byte array ke dalam String Hexadecimal
                StringBuilder sb = new StringBuilder(2*hash.length);
                for(byte b : hash)
                {
                        sb.append(String.format("%02x", b&0xff));
                }
                digest = sb.toString();
            } catch (UnsupportedEncodingException ex)
                {
                        Logger.getLogger(Encrypt.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchAlgorithmException ex)
                        {
                                Logger.getLogger(Encrypt.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        return digest;
    }
}
