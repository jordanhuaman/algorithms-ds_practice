package datatypes.java.src;


/**
 * TODO: what is byte
 * TODO: what is Byte 
 * TODO: convert chart to byte
 */
public class Bytetype {
  public static void main(String[] args) {
    //1. The valus of byte is between -127 - 128. So, when we try to assing 128 it throws an error
    byte example = 127;
    
    //2. Wrapps the 'byte' type in the Byte class to get more utilities
    Byte sample = 12;
    
    //3. When we try to convert byte to chart -> It makes use of Unicode/ASCII 
    byte conver = '2';
    System.out.println(example + " " + sample + " " + conver);

  }
}
