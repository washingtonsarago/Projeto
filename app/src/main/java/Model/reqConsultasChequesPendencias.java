package Model;

/**
 * Created by Sarago on 03/02/16.
 */
public class reqConsultasChequesPendencias {
    private String CNPJ_CPF;
    private String adicProtUF;
    private String adicEndTelDDD;
    private String adicEndTelTelefone;
    private String adicAgendPeriodo;

    public reqConsultasChequesPendencias(String cnpj_cpf, String adicProtUF, String adicEndTelDDD, String adicEndTelTelefone, String adicAgendPeriodo) {
        CNPJ_CPF = cnpj_cpf;
        this.adicProtUF = adicProtUF;
        this.adicEndTelDDD = adicEndTelDDD;
        this.adicEndTelTelefone = adicEndTelTelefone;
        this.adicAgendPeriodo = adicAgendPeriodo;
    }
}
