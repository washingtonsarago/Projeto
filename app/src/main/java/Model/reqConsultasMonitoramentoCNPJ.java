package Model;

/**
 * Created by Sarago on 03/02/16.
 */
public class reqConsultasMonitoramentoCNPJ {
    private String CNPJ;
    private boolean AtualizaPJ;
    private boolean adicTrim;
    private boolean adicSem;
    private boolean adicAnual;
    private boolean EmailAtivacao;

    public reqConsultasMonitoramentoCNPJ(String cnpj, boolean atualizaPJ, boolean adicTrim, boolean adicSem, boolean adicAnual, boolean emailAtivacao) {
        CNPJ = cnpj;
        AtualizaPJ = atualizaPJ;
        this.adicTrim = adicTrim;
        this.adicSem = adicSem;
        this.adicAnual = adicAnual;
        EmailAtivacao = emailAtivacao;
    }
}
