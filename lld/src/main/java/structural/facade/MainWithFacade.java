package structural.facade;

public class MainWithFacade {

    public static void main(String[] args) {

        BuyCryptoFacade buyCrypto = new BuyCryptoFacade();
        buyCrypto.buyCryptocurrency(1000, "BTC");

    }

}
