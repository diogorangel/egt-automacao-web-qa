package steps;

import static org.junit.Assert.assertTrue;
import javax.print.attribute.standard.PagesPerMinute;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import utilitarios.UtilitariosWeb;
import paginas.EGT_ConducaoLancamentoContabil_Page;
import paginas.EGT_Login_Page;
import utilitarios.*;
import br.com.bb.ath.ftabb.FTABBContext;
import br.com.bb.ath.ftabb.browser.BrowserDriverFactory;
import br.com.bb.ath.ftabb.elementos.ElementActions;
import br.com.bb.ath.ftabb.elementos.Elemento;
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
public class EGT_ConducaoLancamentoContabil_Steps extends FTABBUtils {
	
	private WebDriver driverWeb;

	private EGT_ConducaoLancamentoContabil_Page pgEGTPage;
	/**
	 * Construtor da Classe
	 */
	public EGT_ConducaoLancamentoContabil_Steps() {
		super();
	}
	
	@Given("Valido a tela de Conducao de Lancamento Contabil")
	public void validoTelaConducaoLancamentoContabil() throws Throwable {
		capturarTela();
		pgEGTPage = new EGT_ConducaoLancamentoContabil_Page();
		pgEGTPage.aguardarElemento(pgEGTPage.tituloConducaoLancamentoContabil);
		assertTrue(pgEGTPage.textoUor.elementoExiste());
		assertTrue(pgEGTPage.iconeEdicaoUor.elementoExiste());
		assertTrue(pgEGTPage.textoDependencia.elementoExiste());
		assertTrue(pgEGTPage.quantiaDependencia.elementoExiste());
		assertTrue(pgEGTPage.campoNumeroSolicitacao.elementoExiste());
		assertTrue(pgEGTPage.campoSituacaoSolicitacao.elementoExiste());
		assertTrue(pgEGTPage.campoDataInicio.elementoExiste());
		assertTrue(pgEGTPage.campoDataFim.elementoExiste());
		assertTrue(pgEGTPage.botaoPesquisar.elementoExiste());
		assertTrue(pgEGTPage.tabelaResultados.elementoExiste());
		capturarTela();
	}
	
	@Given("Pesquiso as solicitacoes realizadas \"([^\"]*)\"$")
	public void solicitacoesRealiadas(String arg1) throws Throwable {
	capturarTela();
	pgEGTPage = new EGT_ConducaoLancamentoContabil_Page();
	pgEGTPage.aguardarElemento(pgEGTPage.tituloConducaoLancamentoContabil);
	pgEGTPage.aguardarElemento(pgEGTPage.botaoPesquisar);
	assertTrue(pgEGTPage.botaoPesquisar.elementoExiste());
	pgEGTPage.escreverNumeroSolicitacao(arg1);
	capturarTela();
	System.out.println("-"+arg1+"-");
	capturarTela();
	pgEGTPage.botaoPesquisar.posicionarMouseEClicar();
	pgEGTPage.aguardarElemento(pgEGTPage.resultadoBuscaSolicitacao);
	pgEGTPage.resultadoBuscaSolicitacao.rolarTela();
	assertTrue(pgEGTPage.resultadoBuscaSolicitacao.elementoExiste());
	capturarTela();
	}
}
	
