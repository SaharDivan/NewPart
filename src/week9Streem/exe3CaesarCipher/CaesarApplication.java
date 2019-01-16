package week9Streem.exe3CaesarCipher;

public class CaesarApplication {

    public static void main(String[] args) {

        Caesar caesar = new Caesar();
        String cipherText=caesar.cipher("Hello! World",6);
        System.out.println(cipherText);

    }
}
