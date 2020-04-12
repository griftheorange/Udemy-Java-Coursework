package com.griffin;

public class Password {
    private static final int key = 75488404;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    public int encryptDecrypt(int password){
        System.out.println(password + " encrypted is " + (password ^ key));
        System.out.println((password ^ key) + " decrypted is " + (password ^ key ^ key));
        return password ^ key;
    }

    public final void storePassword(){
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    public boolean letMeIn(int password){
        if(encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope you cannot come in");
            return false;
        }
    }
}
