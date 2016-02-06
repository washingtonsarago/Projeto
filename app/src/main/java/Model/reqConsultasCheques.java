package Model;

/**
 * Created by Sarago on 03/02/16.
 */
public class reqConsultasCheques {
    private String CNPJ_CPF;
    private String Banco;
    private String Agencia;
    private String ContaCorrente;
    private String Cheque;
    private String DigitoCheque;
    private Boolean adicPend;
    private String adicProtUF;
    private String adicEndTelDDD;
    private String adicEndTelTelefone;

    public reqConsultasCheques(String cnpj_cpf, String banco, String agencia, String contaCorrente, String cheque, String digitoCheque, Boolean adicPend, String adicProtUF, String adicEndTelDDD, String adicEndTelTelefone) {
        CNPJ_CPF = cnpj_cpf;
        Banco = banco;
        Agencia = agencia;
        ContaCorrente = contaCorrente;
        Cheque = cheque;
        DigitoCheque = digitoCheque;
        this.adicPend = adicPend;
        this.adicProtUF = adicProtUF;
        this.adicEndTelDDD = adicEndTelDDD;
        this.adicEndTelTelefone = adicEndTelTelefone;
    }
}
