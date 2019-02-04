package heroQuestBoard.reailFenceCipher;

public class cipherApplication {
    public static void main(String[] args) {
        encryptor encryptor = new encryptor();
        String encrypt = encryptor.encrypt("sahar sahebdivan", 3);
        System.out.println(encrypt);
    }
}
