//Scrivere un programma in java che utilizzi le classe astratta Messaggio in classi piu specifiche quali: Whatsapp,Telegram,SMS.Arrichire l'esempio con override di metodi

package exercizio_17;

public class Main {
    public static void main(String[] args) {
        Whatsapp whatsapp = new Whatsapp();
        whatsapp.messaggio();

        SMS sms = new SMS();
        sms.messaggio();

        Telegram telegram = new Telegram();
        telegram.messaggio();
    }

}
