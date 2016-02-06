package Model;

/**
 * Created by Sarago on 03/02/16.
 */
public class reqConsultasCompletaCPF {
    private String CPF;
    private Boolean adicAnalise;
    private Boolean adicDetAnot;
    private Boolean adicRendPres;
    private Boolean adicAlertIdent;
    private Boolean adicAlertObit;
    private String adicEndTelDDD;
    private String adicAgendPeriodo;

    public reqConsultasCompletaCPF(String cpf, Boolean adicAnalise, Boolean adicDetAnot, Boolean adicRendPres, Boolean adicAlertIdent, Boolean adicAlertObit, String adicEndTelDDD, String adicAgendPeriodo) {
        CPF = cpf;
        this.adicAnalise = adicAnalise;
        this.adicDetAnot = adicDetAnot;
        this.adicRendPres = adicRendPres;
        this.adicAlertIdent = adicAlertIdent;
        this.adicAlertObit = adicAlertObit;
        this.adicEndTelDDD = adicEndTelDDD;
        this.adicAgendPeriodo = adicAgendPeriodo;
    }
}
