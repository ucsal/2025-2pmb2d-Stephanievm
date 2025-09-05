package br.com.mariojp.solid.dip;

public class EmailNotifier {

    private final MailSender mailSender;

    public EmailNotifier(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void notify(String to, String message) {
        mailSender.send(to, message);
    }
}

// OBS:: Esse passo aqui é a refatoração ("EmailNotifier") para depender de ("MailSender")
