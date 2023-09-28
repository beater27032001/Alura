package br.com.alura.screenmatch.excecao;

public class ErroDecConversaoDeAnoException extends RuntimeException {
    public String msg;

    public ErroDecConversaoDeAnoException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }
}
