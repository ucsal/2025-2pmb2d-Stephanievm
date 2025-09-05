package br.com.mariojp.solid.dip;

public class SmtpClient implements MailSender {

    @Override
    public void send(String to, String message) {
        String smtpAvailable = System.getenv("SMTP_AVAILABLE");
        if (!"true".equalsIgnoreCase(smtpAvailable)) {
            throw new IllegalStateException("SMTP not available");
        }
        System.out.println("Enviando email para " + to + ": " + message);
    }
}
