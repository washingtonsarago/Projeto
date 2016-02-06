package Model;

import java.util.Date;

/**
 * Created by Sarago on 03/02/16.
 */
public class reqConsultasMonitoramentoCPF {
    private String CPF;
    private String Nome;
    private Date Nascimento;
    private boolean adicTrim;
    private boolean adicSem;
    private boolean adicAnual;
    private String adicAvisoSMSDDD;
    private String adicAvisoSMSCelular;
    private boolean adicSPCBrasil;
    private String EmailAtivacao;

    public reqConsultasMonitoramentoCPF(String cpf, String nome, Date nascimento, boolean adicTrim, boolean adicSem, boolean adicAnual, String adicAvisoSMSDDD, String adicAvisoSMSCelular, boolean adicSPCBrasil, String emailAtivacao) {
        CPF = cpf;
        Nome = nome;
        Nascimento = nascimento;
        this.adicTrim = adicTrim;
        this.adicSem = adicSem;
        this.adicAnual = adicAnual;
        this.adicAvisoSMSDDD = adicAvisoSMSDDD;
        this.adicAvisoSMSCelular = adicAvisoSMSCelular;
        this.adicSPCBrasil = adicSPCBrasil;
        EmailAtivacao = emailAtivacao;
    }
}
