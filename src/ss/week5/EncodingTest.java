package ss.week5;

import java.util.Arrays;

import org.apache.commons.codec.*;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.binary.StringUtils;

/**
 * A simple class that experiments with the Hex encoding
 * of the Apache Commons Codec library.
 *
 */
public class EncodingTest {
    public static void main(String[] args) throws DecoderException {
    	System.out.println("### P-5.11 ###");
        String input = "Hello World";

        System.out.println(Hex.encodeHexString(input.getBytes()));
        
        System.out.println("### P-5.12 ###");
        String inputHex = "4d6f64756c652032";
        byte[] inputByte = Hex.decodeHex(inputHex.toCharArray());
        String outputString = StringUtils.newStringUtf8(inputByte);
        
        System.out.println(outputString);
        
        System.out.println("### P-5.13 ###");
        
        String input2 = input;
        
        String input2Hex = Hex.encodeHexString(input2.getBytes());
        String input2Hex2 = "010203040506";
        byte[] output2Byte = Base64.decodeBase64(input2Hex2.getBytes());
        System.out.println("output: " + Arrays.toString(output2Byte));
        System.out.println("length: " + output2Byte.length);
        // Advantage: it is shorter?
        
        String string = "U29mdHdhcmUgU31zdGVtcw==";
        byte[] byteArray = Base64.decodeBase64(string.getBytes());
        System.out.println(Arrays.toString(byteArray));
        
        String a = "";
        for (int i = 0; i<10;i++){
        	a = a+"a";
        	byte[] aByteArray = Base64.decodeBase64(a.getBytes());
            System.out.println(Arrays.toString(aByteArray));
        }
        
        
        
    }
}
