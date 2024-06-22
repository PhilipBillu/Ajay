import java.security.*;
import java.security.spec.ECGenParameterSpec;
public class CryptoWallet {
    private PrivateKey privatekey;
    private PublicKey publickey;
    public CryptoWallet(){
        generateKeyPair();
    }
    public void generateKeyPair(){
        try{
            KeyPairGenerator keygen=KeyPairGenerator.getInstance("EC");
            SecureRandom random=SecureRandom.getInstanceStrong();
            ECGenParameterSpec ecspec=new ECGenParameterSpec("secp256k1");
            keygen.initialize(ecspec,random);
            KeyPair keypair=keygen.generateKeyPair();
            privatekey=keypair.getPrivate();
            publickey=keypair.getPublic();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CryptoWallet wallet =new CryptoWallet();
        System.out.println("Private Key : "+wallet.privatekey);
        System.out.println("Public Key : "+wallet.publickey);
    }
}
