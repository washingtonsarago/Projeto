package Model;

/**
 * Created by Sarago on 03/02/16.
 */
public class reqConsultasPendencias {
    private String CNPJ_CPF;
    private Boolean adicCheque;
    private String adicProtUF;
    private String adicEndTelDDD;
    private String adicEndTelTelefone;
    private String adicAgendPeriodo;

    public reqConsultasPendencias(String cnpj_cpf, Boolean adicCheque, String adicProtUF, String adicEndTelDDD, String adicEndTelTelefone, String adicAgendPeriodo) {
        CNPJ_CPF = cnpj_cpf;
        this.adicCheque = adicCheque;
        this.adicProtUF = adicProtUF;
        this.adicEndTelDDD = adicEndTelDDD;
        this.adicEndTelTelefone = adicEndTelTelefone;
        this.adicAgendPeriodo = adicAgendPeriodo;
    }
}
