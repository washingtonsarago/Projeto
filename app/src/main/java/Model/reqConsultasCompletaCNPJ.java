package Model;

import java.util.BitSet;

/**
 * Created by Sarago on 03/02/16.
 */
public class reqConsultasCompletaCNPJ {
    private String CNPJ;
    private Boolean adicAnalise;
    private Boolean adicRiskscor;
    private Boolean adicPartic;
    private Boolean adicFatPres;
    private Boolean adicDetAnot;
    private String adicAgendPeriodo;

    public reqConsultasCompletaCNPJ(String cnpj, Boolean adicAnalise, Boolean adicRiskscor, Boolean adicPartic, Boolean adicFatPres, Boolean adicDetAnot, String adicAgendPeriodo) {
        CNPJ = cnpj;
        this.adicAnalise = adicAnalise;
        this.adicRiskscor = adicRiskscor;
        this.adicPartic = adicPartic;
        this.adicFatPres = adicFatPres;
        this.adicDetAnot = adicDetAnot;
        this.adicAgendPeriodo = adicAgendPeriodo;
    }
}
