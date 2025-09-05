package br.com.mariojp.solid.dip;

public class NoopMailSender implements MailSender {
    @Override
    public void send(String to, String message) {
        // OBS:: Não faz nada (usado quando DRY_RUN=true)
        System.out.println("[NOOP] Email não enviado (modo teste): " + message);
    }
}
