package Model;

/**
 * Created by Sarago on 03/02/16.
 */
public class reqConsultasChequesPendenciasProtestosUF {
    private String CNPJ_CPF;
    private String UF;
    private String adicEndTelDDD;
    private String adicEndTelTelefone;
    private String adicAgendPeriodo;

    public reqConsultasChequesPendenciasProtestosUF(String cnpj_cpf, String uf, String adicEndTelDDD, String adicEndTelTelefone, String adicAgendPeriodo) {
        CNPJ_CPF = cnpj_cpf;
        UF = uf;
        this.adicEndTelDDD = adicEndTelDDD;
        this.adicEndTelTelefone = adicEndTelTelefone;
        this.adicAgendPeriodo = adicAgendPeriodo;
    }
}
