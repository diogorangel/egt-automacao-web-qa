package steps;
import static org.junit.Assert.assertTrue;
import javax.print.attribute.standard.PagesPerMinute;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.*;
import utilitarios.*;
import paginas.EGT_GerenciamentoAnexos_Page;
import paginas.EGT_ListaRegraSolicitacaoLancamento_Page;
import paginas.EGT_Login_Page;
import paginas.EGT_RegraSolicitacaoLancamento_Page;
import utilitarios.*;
import br.com.bb.ath.ftabb.FTABBContext;
import br.com.bb.ath.ftabb.browser.BrowserDriverFactory;
import br.com.bb.ath.ftabb.elementos.ElementActions;
import br.com.bb.ath.ftabb.elementos.Elemento;
import br.com.bb.ath.ftabb.elementos.ElementoTabela;
import br.com.bb.ath.ftabb.elementos.ElementoTexto;
import br.com.bb.ath.ftabb.exceptions.ElementoNaoLocalizadoException;
import br.com.bb.ath.ftabb.exceptions.FTABBException;
import br.com.bb.ath.ftabb.gaw.PaginaPlataformaMensagensErro;
import br.com.bb.ath.ftabb.gaw.Plataforma;
import br.com.bb.ath.ftabb.utilitarios.FTABBUtils;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


@SuppressWarnings({ "unused" })
public class EGT_RegraSolicitacaoLancamento_Steps extends FTABBUtils {
	
	private WebDriver driverWeb;
	
	private EGT_RegraSolicitacaoLancamento_Page pgEGTPage;
	private EGT_ListaRegraSolicitacaoLancamento_Page pgEGT;
	private UtilitariosWeb UtilsPage;
	/**
	 * Construtor da Classe
	 */
	public EGT_RegraSolicitacaoLancamento_Steps() {
		super();
	}

	@Before
	public static void inicio(){
		Plataforma.abrirPlataforma();
	}
		
	@Given("Valido a tela de Regras de Solicitacao de Lancamento")
	public void validoTelaRegrasSolicitcaoLancamento() throws Throwable {
		capturarTela();
		pgEGTPage = new EGT_RegraSolicitacaoLancamento_Page();
		assertTrue(pgEGTPage.subtituloTelaRegraSolicitacaoContabil.elementoExiste());
		assertTrue(pgEGTPage.paginaPlataformaNome.elementoExiste());
		assertTrue(pgEGTPage.paginaPlataformaGrupo.elementoExiste());
		assertTrue(pgEGTPage.tituloVinculacoesContabeis.elementoExiste());
		assertTrue(pgEGTPage.tabelaVinculacoesContabeis.elementoExiste());
		assertTrue(pgEGTPage.corpoTabelaVinculacoesContabeis.elementoExiste());
		assertTrue(pgEGTPage.botaoSelecionarRegra.elementoExiste());
		capturarTela();
	}
	
	@When("Clicar no botao Selecionar Regra")
	public void clicarBotaoSelecionarRegra() throws Throwable {
		capturarTela();
		pgEGTPage = new EGT_RegraSolicitacaoLancamento_Page();
		pgEGTPage.aguardarElemento(pgEGTPage.subtituloTelaRegraSolicitacaoContabil);
		pgEGTPage.aguardarElemento(pgEGTPage.paginaPlataformaNome);
		pgEGTPage.aguardarElemento(pgEGTPage.paginaPlataformaGrupo);
		pgEGTPage.aguardarElemento(pgEGTPage.tituloVinculacoesContabeis);
		assertTrue(pgEGTPage.botaoSelecionarRegra.elementoExiste());
		pgEGTPage.botaoSelecionarRegra.posicionarMouseEClicar();
		capturarTela();
	}
	
	@Then("Selecionar um Grupo de Regra")
	public void selecionarRegraSolicitacaoLancamento() throws Throwable {
		capturarTela();
		pgEGTPage = new EGT_RegraSolicitacaoLancamento_Page();
		assertTrue(pgEGTPage.botaoSelecionarRegra.elementoExiste());
		pgEGTPage.botaoSelecionarRegra.posicionarMouseEClicar();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.campoSelecionarGrupo);
		pgEGTPage.aguardarElemento(pgEGTPage.popupRegraSolicitacao);
		assertTrue(pgEGTPage.campoSelecionarGrupo.elementoExiste());
		assertTrue(pgEGTPage.popupRegraSolicitacao.elementoExiste());
		assertTrue(pgEGTPage.botaoSelecionarRegra.elementoExiste());
		assertTrue(pgEGTPage.botaoLimparSelecaoDeGrupoDesativado.elementoExiste());
		capturarTela();
		pgEGTPage.campoSelecionarGrupo.posicionarMouseEClicar();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.selecionarGrupo);
		pgEGTPage.selecionarGrupo.posicionarMouseEClicar();
		capturarTela();
		assertTrue(pgEGTPage.botaoLimparSelecaoDeGrupoAtivo.elementoExiste());
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.selecionarTextoGrupo);
		pgEGTPage.selecionarTextoGrupo.posicionarMouseEClicar();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.paginaPlataformaNomeFinanceira);
		pgEGTPage.aguardarElemento(pgEGTPage.paginaPlataformaGrupoFinanceira);
		assertTrue(pgEGTPage.paginaPlataformaNomeFinanceira.elementoExiste());
		assertTrue(pgEGTPage.paginaPlataformaGrupoFinanceira.elementoExiste());
		assertTrue(pgEGTPage.tabelaVinculacoesContabeis.elementoExiste());
		assertTrue(pgEGTPage.tituloVinculacoesContabeis.elementoExiste());
		capturarTela();
	}
	
	@Then("Nao Seleciono um Grupo de Regra")
	public void naoSelecionoRegraSolicitacaoLancamento() throws Throwable {
		capturarTela();
		pgEGTPage = new EGT_RegraSolicitacaoLancamento_Page();
		assertTrue(pgEGTPage.botaoSelecionarRegra.elementoExiste());
		pgEGTPage.botaoSelecionarRegra.posicionarMouseEClicar();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.campoSelecionarGrupo);
		pgEGTPage.aguardarElemento(pgEGTPage.popupRegraSolicitacao);
		assertTrue(pgEGTPage.campoSelecionarGrupo.elementoExiste());
		assertTrue(pgEGTPage.popupRegraSolicitacao.elementoExiste());
		assertTrue(pgEGTPage.botaoSelecionarRegra.elementoExiste());
		assertTrue(pgEGTPage.botaoLimparSelecaoDeGrupoDesativado.elementoExiste());
		capturarTela();
		pgEGTPage.campoSelecionarGrupo.posicionarMouseEClicar();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.selecionarGrupo);
		pgEGTPage.selecionarGrupo.posicionarMouseEClicar();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.selecionarTextoGrupo);
		pgEGTPage.aguardarElemento(pgEGTPage.botaoFecharPopupSelecionarGrupo);
		capturarTela();
		assertTrue(pgEGTPage.botaoFecharPopupSelecionarGrupo.elementoExiste());
		assertTrue(pgEGTPage.botaoLimparSelecaoDeGrupoAtivo.elementoExiste());
		pgEGTPage.botaoFecharPopupSelecionarGrupo.posicionarMouseEClicar();
		capturarTela();
		assertTrue(pgEGTPage.paginaPlataformaNome.elementoExiste());
		assertTrue(pgEGTPage.paginaPlataformaGrupo.elementoExiste());
		capturarTela();
	}
	
	@Then("Clico no Botao Limpar Selecao do Grupo")
	public void clicoBotaoLimparSelecaoGrupo() throws Throwable {
		capturarTela();
		pgEGTPage = new EGT_RegraSolicitacaoLancamento_Page();
		assertTrue(pgEGTPage.botaoSelecionarRegra.elementoExiste());
		capturarTela();
		pgEGTPage.botaoSelecionarRegra.posicionarMouseEClicar();
		assertTrue(pgEGTPage.botaoSelecionarTodos.elementoExiste());
		pgEGTPage.botaoSelecionarTodos.posicionarMouseEClicar();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.campoSelecionarGrupo);
		pgEGTPage.aguardarElemento(pgEGTPage.popupRegraSolicitacao);
		assertTrue(pgEGTPage.campoSelecionarGrupo.elementoExiste());
		assertTrue(pgEGTPage.popupRegraSolicitacao.elementoExiste());
		assertTrue(pgEGTPage.botaoSelecionarRegra.elementoExiste());
		assertTrue(pgEGTPage.botaoLimparSelecaoDeGrupoDesativado.elementoExiste());
		capturarTela();
		pgEGTPage.botaoLimparSelecaoDeGrupoDesativado.posicionarMouseEClicar();
		capturarTela();
		pgEGTPage.campoSelecionarGrupo.posicionarMouseEClicar();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.selecionarGrupo);
		pgEGTPage.selecionarGrupo.posicionarMouseEClicar();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.selecionarTextoGrupo);
		pgEGTPage.aguardarElemento(pgEGTPage.botaoFecharPopupSelecionarGrupo);
		capturarTela();
		assertTrue(pgEGTPage.botaoFecharPopupSelecionarGrupo.elementoExiste());
		assertTrue(pgEGTPage.botaoLimparSelecaoDeGrupoAtivo.elementoExiste());
		pgEGTPage.botaoLimparSelecaoDeGrupoAtivo.posicionarMouseEClicar();
		capturarTela();
		assertTrue(pgEGTPage.paginaPlataformaNome.elementoExiste());
		assertTrue(pgEGTPage.paginaPlataformaGrupo.elementoExiste());
		capturarTela();
	}
	
	@Then("Valido as Colunas da Tabela Informacoes Contabeis")
	public void tabelaInformacoesContabeis() throws Throwable {
		pgEGTPage.aguardarElemento(pgEGTPage.colunaTabelaTipoObjeto);
		pgEGTPage.aguardarElemento(pgEGTPage.colunaTabelaObjeto);
		pgEGTPage.aguardarElemento(pgEGTPage.colunaTabelaSubobjeto);
		pgEGTPage.aguardarElemento(pgEGTPage.colunaTabelaTN);
		pgEGTPage.aguardarElemento(pgEGTPage.colunaTabelaEvento);
		pgEGTPage.aguardarElemento(pgEGTPage.colunaTabelaSeqEvento);
		pgEGTPage.aguardarElemento(pgEGTPage.colunaTabelaDependenciaOrigem);
		pgEGTPage.aguardarElemento(pgEGTPage.colunaTitularOrigem);
		pgEGTPage.aguardarElemento(pgEGTPage.colunaDependenciaDestino);
		pgEGTPage.aguardarElemento(pgEGTPage.colunaTitularDestino);
		pgEGTPage.aguardarElemento(pgEGTPage.colunaServico);
		assertTrue(pgEGTPage.colunaTabelaTipoObjeto.elementoExiste());
		assertTrue(pgEGTPage.colunaTabelaObjeto.elementoExiste());
		assertTrue(pgEGTPage.colunaTabelaSubobjeto.elementoExiste());
		assertTrue(pgEGTPage.colunaTabelaTN.elementoExiste());
		assertTrue(pgEGTPage.colunaTabelaEvento.elementoExiste());
		assertTrue(pgEGTPage.colunaTabelaSeqEvento.elementoExiste());
		assertTrue(pgEGTPage.colunaTabelaDependenciaOrigem.elementoExiste());
		assertTrue(pgEGTPage.colunaTitularOrigem.elementoExiste());
		assertTrue(pgEGTPage.colunaDependenciaDestino.elementoExiste());
		assertTrue(pgEGTPage.colunaTitularDestino.elementoExiste());
		assertTrue(pgEGTPage.colunaServico.elementoExiste());
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.colunaTabelaTipoObjeto);
		pgEGTPage.aguardarElemento(pgEGTPage.botaoVinculacoesContabeis);
		assertTrue(pgEGTPage.campoTabelaTipoObjeto.elementoExiste());
		assertTrue(pgEGTPage.campoTabelaObjeto.elementoExiste());
		assertTrue(pgEGTPage.campoTabelaSubobjeto.elementoExiste());
		assertTrue(pgEGTPage.campoTabelaTN.elementoExiste());
		assertTrue(pgEGTPage.campoTabelaEvento.elementoExiste());
		assertTrue(pgEGTPage.campoTabelaSeqEvento.elementoExiste());
		assertTrue(pgEGTPage.campoTabelaDependenciaOrigem.elementoExiste());
		assertTrue(pgEGTPage.campoTitularOrigem.elementoExiste());
		assertTrue(pgEGTPage.campoDependenciaDestino.elementoExiste());
		assertTrue(pgEGTPage.campoTitularDestino.elementoExiste());
		assertTrue(pgEGTPage.campoServico.elementoExiste());
		assertTrue(pgEGTPage.botaoVinculacoesContabeis.elementoExiste());
		capturarTela();
	}
	
	@Then("Validar os botoes de Informacoes Contabeis")
	public void botoesInformacoesContabeis() throws Throwable {
		pgEGTPage = new EGT_RegraSolicitacaoLancamento_Page();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.campoTitularDestino);
		pgEGTPage.aguardarElemento(pgEGTPage.botaoSolicitarLancamentoContabil);
		pgEGTPage.botaoSolicitarLancamentoContabil.posicionarMouseEClicar();
		pgEGTPage.aguardarElemento(pgEGTPage.botaoVinculacoesContabeis);
		assertTrue(pgEGTPage.botaoVinculacoesContabeis.elementoExiste());
		assertTrue(pgEGTPage.campoTitularDestino.elementoExiste());
		pgEGTPage.botaoVinculacoesContabeis.select();
		pgEGTPage.tabelaVinculacoesContabeis.posicionarMouseEClicar();
		capturarTela();
	}
	
	@Then ("Selecionar uma linha Informacao Contabil")
	public void selecionarUmaLinha() throws Throwable {
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.campoTitularDestino);
		assertTrue(pgEGTPage.campoTitularDestino.elementoExiste());
		pgEGTPage.campoTitularDestino.posicionarMouseEClicar();
		capturarTela();
		sleep(2);
	}
	
	@Then("Clicar no Botao Selecionar Todos")
	public void clicarBotaoSelecionarTodos() throws Throwable {
		pgEGTPage = new EGT_RegraSolicitacaoLancamento_Page();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.botaoSolicitarLancamentoContabil);
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.botaoSelecionarTodos);
		assertTrue(pgEGTPage.botaoSelecionarTodos.elementoExiste());
		pgEGTPage.botaoSelecionarTodos.posicionarMouseEClicar();
		capturarTela();
	}
	
	@Then("Clicar no Botao Solicitar Lancamento Contabil")
	public void clicarbotaoSolicitarContabil() throws Throwable {
		pgEGTPage = new EGT_RegraSolicitacaoLancamento_Page();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.botaoSolicitarLancamentoContabil);
		assertTrue(pgEGTPage.botaoSolicitarLancamentoContabil.elementoExiste());
		pgEGTPage.botaoSolicitarLancamentoContabil.posicionarMouseEClicar();
		capturarTela();
		sleep(2);
		capturarTela();
	}
	
	@Then("Valido a de Tela Solicitacao Lancamento Contabil")
	public void telaLancamentoContabil() throws Throwable {
		capturarTela();
		//pgEGTPage.aguardarElemento(pgEGTPage.mensagemUsuarioUOR);
		pgEGTPage.aguardarElemento(pgEGTPage.tituloTelaSolicitacaoLancamentoContabil);
		//pgEGTPage.aguardarElemento(pgEGTPage.paginaPlataformaNome);
		//pgEGTPage.aguardarElemento(pgEGTPage.paginaPlataformaGrupo);
		//pgEGTPage.aguardarElemento(pgEGTPage.paginaPlataformaIOR);
		//pgEGTPage.aguardarElemento(pgEGTPage.tituloPreenchimentoMassificado);
		//pgEGTPage.aguardarElemento(pgEGTPage.textoColarValoresColuna);
		//pgEGTPage.aguardarElemento(pgEGTPage.paginaPlataformaData);
		//pgEGTPage.aguardarElemento(pgEGTPage.campoPlataformaData);
		//pgEGTPage.aguardarElemento(pgEGTPage.tabelaPreenchimentoMassificado);
		//pgEGTPage.aguardarElemento(pgEGTPage.campoData);
		//pgEGTPage.aguardarElemento(pgEGTPage.BotaoSolicitacaoContabil);
		//assertTrue(pgEGTPage.mensagemUsuarioUOR.elementoExiste());
		assertTrue(pgEGTPage.tituloTelaSolicitacaoLancamentoContabil.elementoExiste());
		assertTrue(pgEGTPage.paginaPlataformaNome.elementoExiste());
		assertTrue(pgEGTPage.paginaPlataformaGrupo.elementoExiste());
		assertTrue(pgEGTPage.paginaPlataformaIOR.elementoExiste());
		assertTrue(pgEGTPage.tituloPreenchimentoMassificado.elementoExiste());
		assertTrue(pgEGTPage.textoColarValoresColuna.elementoExiste());
		assertTrue(pgEGTPage.paginaPlataformaData.elementoExiste());
		assertTrue(pgEGTPage.campoPlataformaData.elementoExiste());
		assertTrue(pgEGTPage.tabelaPreenchimentoMassificado.elementoExiste());
		assertTrue(pgEGTPage.campoData.elementoExiste());
		assertTrue(pgEGTPage.BotaoSolicitacaoContabil.elementoExiste());
		capturarTela();
		pgEGTPage.BotaoSolicitacaoContabil.posicionarMouseEClicar();
		sleep(2);
		capturarTela();
	}
	
	@Then("Clicar no botao Voltar")
	public void botaoVoltar() throws Throwable {
		capturarTela();
		assertTrue(pgEGTPage.BotaoVoltar.elementoExiste());
		pgEGTPage.BotaoVoltar.posicionarMouseEClicar();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.subtituloTelaRegraSolicitacaoContabil);
		pgEGTPage.aguardarElemento(pgEGTPage.paginaPlataformaNome);
		pgEGTPage.aguardarElemento(pgEGTPage.paginaPlataformaGrupo);
		pgEGTPage.aguardarElemento(pgEGTPage.tituloVinculacoesContabeis);
		assertTrue(pgEGTPage.botaoSelecionarRegra.elementoExiste());
		capturarTela();
	}
	
	@Then("Clicar no botao Preencher")
	public void botaoPreencher() throws Throwable {
		capturarTela();
		assertTrue(pgEGTPage.BotaoPreencher.elementoExiste());
		pgEGTPage.BotaoPreencher.posicionarMouseEClicar();
		capturarTela();
		//pgEGTPage.aguardarElemento(pgEGTPage.mensagemUsuarioUOR);
		pgEGTPage.aguardarElemento(pgEGTPage.tituloTelaSolicitacaoLancamentoContabil);
		//pgEGTPage.aguardarElemento(pgEGTPage.paginaPlataformaNome);
		//pgEGTPage.aguardarElemento(pgEGTPage.paginaPlataformaGrupo);
		//pgEGTPage.aguardarElemento(pgEGTPage.paginaPlataformaIOR);
		//pgEGTPage.aguardarElemento(pgEGTPage.tituloPreenchimentoMassificado);
		//pgEGTPage.aguardarElemento(pgEGTPage.textoColarValoresColuna);
		//pgEGTPage.aguardarElemento(pgEGTPage.paginaPlataformaData);
		//pgEGTPage.aguardarElemento(pgEGTPage.campoPlataformaData);
		//pgEGTPage.aguardarElemento(pgEGTPage.tabelaPreenchimentoMassificado);
		//pgEGTPage.aguardarElemento(pgEGTPage.campoData);
		//pgEGTPage.aguardarElemento(pgEGTPage.BotaoSolicitacaoContabil);
		capturarTela();
	}
	
	@Then("Validar nome da Regra")
	public void validarNomeRegra() throws Throwable {
		capturarTela();
		pgEGT = new EGT_ListaRegraSolicitacaoLancamento_Page();
		pgEGTPage = new EGT_RegraSolicitacaoLancamento_Page();
		assertTrue(pgEGTPage.botaoSelecionarRegra.elementoExiste());
		pgEGTPage.botaoSelecionarRegra.posicionarMouseEClicar();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.campoSelecionarGrupo);
		pgEGTPage.aguardarElemento(pgEGTPage.popupRegraSolicitacao);
		assertTrue(pgEGTPage.campoSelecionarGrupo.elementoExiste());
		assertTrue(pgEGTPage.popupRegraSolicitacao.elementoExiste());
		assertTrue(pgEGTPage.botaoSelecionarRegra.elementoExiste());
		assertTrue(pgEGTPage.botaoLimparSelecaoDeGrupoDesativado.elementoExiste());
		capturarTela();
		pgEGTPage.campoSelecionarGrupo.posicionarMouseEClicar();
		capturarTela();
		pgEGT.aguardarElemento(pgEGT.regraNome);
		pgEGT.regraNome.posicionarMouseEClicar();
		capturarTela();
		sleep(2);
	}
	
	@Then("Validar o campo Data e o campo Valor")
	public void validarCampoDataValor() throws Throwable {
		capturarTela();
		pgEGTPage = new EGT_RegraSolicitacaoLancamento_Page();
		pgEGTPage.aguardarElemento(pgEGTPage.campoDataSolicitarLancamento);
		pgEGTPage.aguardarElemento(pgEGTPage.campoValorSolicitarLancamento);
		assertTrue(pgEGTPage.campoDataSolicitarLancamento.elementoExiste());
		assertTrue(pgEGTPage.campoValorSolicitarLancamento.elementoExiste());
		pgEGTPage.campoDataSolicitarLancamento.rolarTela();
		pgEGTPage.campoValorSolicitarLancamento.rolarTela();
		capturarTela();
	}
	
	@Then("Preencher o campo Data e o campo Valor \"([^\"]*)\"$")
	public void PreecherCampoDataValor(String arg1) throws Throwable {
		capturarTela();
		pgEGTPage = new EGT_RegraSolicitacaoLancamento_Page();
		pgEGTPage.aguardarElemento(pgEGTPage.campoDataSolicitarLancamento);
		pgEGTPage.aguardarElemento(pgEGTPage.campoValorSolicitarLancamento);
		pgEGTPage.campoDataSolicitarLancamento.rolarTela();
		pgEGTPage.campoValorSolicitarLancamento.rolarTela();
		assertTrue(pgEGTPage.campoDataSolicitarLancamento.elementoExiste());
		assertTrue(pgEGTPage.campoValorSolicitarLancamento.elementoExiste());
		pgEGTPage.campoDataSolicitarLancamento.posicionarMouseEClicar();
		pgEGTPage.aguardarElemento(pgEGTPage.valorDataSolicitacao);
		assertTrue(pgEGTPage.valorDataSolicitacao.elementoExiste());
		capturarTela();
		pgEGTPage.valorDataSolicitacao.posicionarMouseEClicar();
		capturarTela();
		pgEGTPage.informarValor(arg1);
		capturarTela();
		System.out.println("-"+arg1+"-");
		capturarTela();
	}
	@Then("Confirmacao Lancamento Contabil")
	public void confirmacaoLancamentoContabil() throws Throwable {
		pgEGTPage = new EGT_RegraSolicitacaoLancamento_Page();
		if (pgEGTPage.mensagemVerificarFormulario.elementoExiste() == true){
			assertTrue(pgEGTPage.mensagemVerificarFormulario.elementoExiste());
			System.out.println("Erro cenario");
			capturarTela(); 
		}
		else{
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.layoutConfirmacaoLancamentoContabil);
		assertTrue(pgEGTPage.tituloConfirmacaoLancamentoContabil.elementoExiste());
		assertTrue(pgEGTPage.perguntaConfirmacaoLancamentoContabil.elementoExiste());
		assertTrue(pgEGTPage.layoutConfirmacaoLancamentoContabil.elementoExiste());
		capturarTela();
		assertTrue(pgEGTPage.botaoSimAnexo.elementoExiste());
		assertTrue(pgEGTPage.botaoNaoAnexo.elementoExiste());
		pgEGTPage.botaoSimAnexo.posicionarMouseEClicar();
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.mensagemConfirmacaoLancamentoContabil);
		assertTrue(pgEGTPage.mensagemConfirmacaoLancamentoContabil.elementoExiste());
		capturarTela();
		System.out.println("Acerto cenario");
		}
	}
	
	@Then("Nao Confirmacao Lancamento Contabil")
	public void naoConfirmacaoLancamentoContabil() throws Throwable {
		if (pgEGTPage.mensagemVerificarFormulario.elementoExiste() == true){
			assertTrue(pgEGTPage.mensagemVerificarFormulario.elementoExiste());
			capturarTela();
			System.out.println("Erro cenario");
		}
		
		else {
		capturarTela();
		pgEGTPage = new EGT_RegraSolicitacaoLancamento_Page();
		pgEGTPage.aguardarElemento(pgEGTPage.layoutConfirmacaoLancamentoContabil);
		assertTrue(pgEGTPage.tituloConfirmacaoLancamentoContabil.elementoExiste());
		assertTrue(pgEGTPage.perguntaConfirmacaoLancamentoContabil.elementoExiste());
		assertTrue(pgEGTPage.layoutConfirmacaoLancamentoContabil.elementoExiste());
		capturarTela();
		assertTrue(pgEGTPage.botaoSimAnexo.elementoExiste());
		assertTrue(pgEGTPage.botaoNaoAnexo.elementoExiste());
		capturarTela();
		pgEGTPage.botaoNaoAnexo.posicionarMouseEClicar();
		capturarTela();
		System.out.println("Correto cenario");
		}
		
	}
}