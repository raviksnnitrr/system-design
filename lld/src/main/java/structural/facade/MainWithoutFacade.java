package structural.facade;

import structural.facade.library.*;

public class MainWithoutFacade {

    public static void main(String[] args){
        DatabaseService databaseService = new DatabaseService();
        User user = databaseService.getUser(UIService.getLoggedInUserId());
        CryptoFactory.getCryptoService("BTC").buyCurrency(user, 1000);
        MailService mailService = new MailService();
        mailService.sendConfirmationMail(user);
    }
}
