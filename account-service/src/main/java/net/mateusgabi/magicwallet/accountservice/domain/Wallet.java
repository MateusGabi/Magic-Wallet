package net.mateusgabi.magicwallet.accountservice.domain;

public class Wallet {
    private String id;
    private String mame;

    public Wallet(String id, String mame) {
        this.id = id;
        this.mame = mame;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }
}
