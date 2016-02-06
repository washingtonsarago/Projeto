package Model;

/**
 * Created by Sarago on 03/02/16.
 */
public class Consultas {
    public  class  retConsulta{
        private int consultaid;
        private String descricao;
        private String html_DescricaoCurta;
        private String txt_DescricaoCurta;
        private String html_DescricaoDetalhada;
        private String txt_DescricaoDetalhada;
        private  Disponibilidade disponibilidade;
        private  Double valor;
        private String aviso;
        private Boolean assinante;
        private  Boolean jaFoiAssinante;

        private retConsultaAdicional Adicionais;
            public retConsulta(int consultaid, String descricao, String html_descricaoCurta, String txt_descricaoCurta, String html_descricaoDetalhada, String txt_descricaoDetalhada, Disponibilidade disponibilidade, Double valor, String aviso, Boolean assinante, Boolean jaFoiAssinante, retConsultaAdicional adicionais) {
                this.consultaid = consultaid;
                this.descricao = descricao;
                html_DescricaoCurta = html_descricaoCurta;
                txt_DescricaoCurta = txt_descricaoCurta;
                html_DescricaoDetalhada = html_descricaoDetalhada;
                txt_DescricaoDetalhada = txt_descricaoDetalhada;
                this.disponibilidade = disponibilidade;
                this.valor = valor;
                this.aviso = aviso;
                this.assinante = assinante;
                this.jaFoiAssinante = jaFoiAssinante;
                Adicionais = adicionais;
            }
        }
    public class retConsultaAdicional{
        private String adicionalconsultaid;
        private String descricao;
        private String html_DescricaoDetalhada;
        private String txt_DescricaoDetalhada;
        private double valor;
        private boolean somenteAssinantes;


        public retConsultaAdicional(String adicionalconsultaid, String descricao, String html_descricaoDetalhada, String txt_descricaoDetalhada, double valor, boolean somenteAssinantes) {
            this.adicionalconsultaid = adicionalconsultaid;
            this.descricao = descricao;
            html_DescricaoDetalhada = html_descricaoDetalhada;
            txt_DescricaoDetalhada = txt_descricaoDetalhada;
            this.valor = valor;
            this.somenteAssinantes = somenteAssinantes;
        }
    }

    /*
    Disponibilidade
        0:Indisponível
        1:PF
        2:PJ
        3:PF e PJ
        4:PJ e Própria PF
        5:Própria PF
        6:Própria PJ
     */
    public  enum Disponibilidade{
        Indisponivel (0),
        PF (1),
        PJ (2),
        PJPF (3),
        PJPropriaPF (4),
        PropriaPF (5),
        PropriaPJ (6);

        public  int valor;
        Disponibilidade(int i) {
            valor = i;
        }
    }
}
