package Model;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Sarago on 02/02/16.
 */
class Sessoes {

    public class  Sessao{

        private UUID ChaveAPI;
        private  String IP;
        private  String IDM;
        private  int parceiroid;
        private  String CodigoSessaoAdm;
        public class Out{

            public UUID SessaoOut;}

        public Sessao(UUID chaveAPI, String ip, String idm, int parceiroid, String codigoSessaoAdm) {
            ChaveAPI = chaveAPI;
            IP = ip;
            IDM = idm;
            this.parceiroid = parceiroid;
            CodigoSessaoAdm = codigoSessaoAdm;
        }
        public Sessao(){}
    }
    public  class  DadosDaSessao{
        private  UUID Sessao;

        public DadosDaSessao(UUID sessao) {
            Sessao = sessao;
        }

        public  class Out
        {
            private Sessao sessao;

            public Out(Sessoes.Sessao sessao) {
                this.sessao = sessao;
            }
        }

    }
    public  class  LoginSessao{
        private UUID Sessao;
        private  int CodigoAcesso;
        private  int Senha;


    }
    public  class  ConfigSessao{
        private  UUID Sessao;

        public class Out{
            private  String ccfacil_Empresa;
            private  String ccfacil_Endereco;
            private String ccfacil_Fax;
            private String ccfacil_Telefone;
            private String ccfacil_Site;
            private String ccfacil_EmailContato;
            private String ccfacil_EmailFinanceiro;
            private Date ccfacil_ValidadeTabelaPrecos;
            private  boolean pag_Amex;
            private  boolean pag_Boleto;
            private  boolean pag_Diners;
            private  boolean pag_Elo;
            private  boolean pag_Hipercard;
            private  boolean pag_Mastercard;
            private  boolean pag_Visa;
            private  boolean consultas_Indisponivel;
            private String textos_html_Aviso;
            private  String textos_txt_Aviso;
            private  String textos_html_Contrato;
            private  String textos_txt_Contrato;
            private  String textos_html_Contrato_Mensagem;
            private  String textos_txt_Contrato_Mensagem;
            private  String textos_Contrato_UltAlteracao;
            private  String textos_html_Home1;
            private  String textos_txt_Home1;
            private  String textos_html_Home2;
            private  String textos_txt_Home2;
            private  String textos_html_Home3;
            private  String textos_txt_Home3;
            private  String textos_html_InstrucoesComprarCredito;
            private  String textos_txt_InstrucoesComprarCredito;
            private  String textos_html_NovoCadastro;
            private  String textos_txt_NovoCadastro;
            private  String textos_html_PoliticaPrivacidade;
            private  String textos_txt_PoliticaPrivacidade;
            private  String textos_html_Rodape;
            private  String textos_txt_Rodape;


            public Out(String ccfacil_empresa, String ccfacil_endereco, String ccfacil_fax, String ccfacil_telefone, String ccfacil_site, String ccfacil_emailContato, String ccfacil_emailFinanceiro, Date ccfacil_validadeTabelaPrecos, boolean pag_amex, boolean pag_boleto, boolean pag_diners, boolean pag_elo, boolean pag_hipercard, boolean pag_mastercard, boolean pag_visa, boolean consultas_indisponivel, String textos_html_aviso, String textos_txt_aviso, String textos_html_contrato, String textos_txt_contrato, String textos_html_contrato_mensagem, String textos_txt_contrato_mensagem, String textos_contrato_ultAlteracao, String textos_html_home1, String textos_txt_home1, String textos_html_home2, String textos_txt_home2, String textos_html_home3, String textos_txt_home3, String textos_html_instrucoesComprarCredito, String textos_txt_instrucoesComprarCredito, String textos_html_novoCadastro, String textos_txt_novoCadastro, String textos_html_politicaPrivacidade, String textos_txt_politicaPrivacidade, String textos_html_rodape, String textos_txt_rodape) {
                ccfacil_Empresa = ccfacil_empresa;
                ccfacil_Endereco = ccfacil_endereco;
                ccfacil_Fax = ccfacil_fax;
                ccfacil_Telefone = ccfacil_telefone;
                ccfacil_Site = ccfacil_site;
                ccfacil_EmailContato = ccfacil_emailContato;
                ccfacil_EmailFinanceiro = ccfacil_emailFinanceiro;
                ccfacil_ValidadeTabelaPrecos = ccfacil_validadeTabelaPrecos;
                pag_Amex = pag_amex;
                pag_Boleto = pag_boleto;
                pag_Diners = pag_diners;
                pag_Elo = pag_elo;
                pag_Hipercard = pag_hipercard;
                pag_Mastercard = pag_mastercard;
                pag_Visa = pag_visa;
                consultas_Indisponivel = consultas_indisponivel;
                textos_html_Aviso = textos_html_aviso;
                textos_txt_Aviso = textos_txt_aviso;
                textos_html_Contrato = textos_html_contrato;
                textos_txt_Contrato = textos_txt_contrato;
                textos_html_Contrato_Mensagem = textos_html_contrato_mensagem;
                textos_txt_Contrato_Mensagem = textos_txt_contrato_mensagem;
                textos_Contrato_UltAlteracao = textos_contrato_ultAlteracao;
                textos_html_Home1 = textos_html_home1;
                textos_txt_Home1 = textos_txt_home1;
                textos_html_Home2 = textos_html_home2;
                textos_txt_Home2 = textos_txt_home2;
                textos_html_Home3 = textos_html_home3;
                textos_txt_Home3 = textos_txt_home3;
                textos_html_InstrucoesComprarCredito = textos_html_instrucoesComprarCredito;
                textos_txt_InstrucoesComprarCredito = textos_txt_instrucoesComprarCredito;
                textos_html_NovoCadastro = textos_html_novoCadastro;
                textos_txt_NovoCadastro = textos_txt_novoCadastro;
                textos_html_PoliticaPrivacidade = textos_html_politicaPrivacidade;
                textos_txt_PoliticaPrivacidade = textos_txt_politicaPrivacidade;
                textos_html_Rodape = textos_html_rodape;
                textos_txt_Rodape = textos_txt_rodape;
            }
        }
    }

}
