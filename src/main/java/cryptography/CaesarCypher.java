package cryptography;

public class CaesarCypher {
    protected char[] encoder = new char[26];
    protected char[] decoder = new char[26];


    public CaesarCypher(int rotation){
        for(int k =0; k < 26; k++) {
            encoder[k] = (char)('A' + (k + rotation) % 26);
            decoder[k] = (char)('A' + (k - rotation) % 26);



        }
    }

    public String transform(String original, char[] code){
        char[] msg = original.toCharArray();
        for (int k = 0; k < msg.length; k++){
            if(Character.isUpperCase(msg[k])){
                int j  = msg[k] - 'A';

            }
        }
        return new String(msg);
    }



}



