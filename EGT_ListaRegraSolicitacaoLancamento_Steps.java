package steps;
import static org.junit.Assert.assertTrue;
import javax.print.attribute.standard.PagesPerMinute;
import org.openqa.selenium.interactions.Actions;
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
public class EGT_ListaRegraSolicitacaoLancamento_Steps extends FTABBUtils {
	
	private WebDriver driverWeb;

	private EGT_ListaRegraSolicitacaoLancamento_Page pgEGTPage;
	/**
	 * Construtor da Classe
	 */
	public EGT_ListaRegraSolicitacaoLancamento_Steps() {
		super();
	}

	@Before
	public static void inicio(){
		Plataforma.abrirPlataforma();
	}
		
	@Given("Valido a tela de Lista de Regras de Solicitacao de Lancamento")
	public void validoListaRegrasSolicitcaoLancamento() throws Throwable {
		capturarTela();
		pgEGTPage = new EGT_ListaRegraSolicitacaoLancamento_Page();
		pgEGTPage.aguardarElemento(pgEGTPage.UorTodas);
		assertTrue(pgEGTPage.UorTodas.elementoExiste());
		assertTrue(pgEGTPage.vigenciaTodas.elementoExiste());
		assertTrue(pgEGTPage.tituloFiltrosPesquisa.elementoExiste());
		assertTrue(pgEGTPage.botaoPesquisar.elementoExiste());
		assertTrue(pgEGTPage.botaoIncluiRegra.elementoExiste());
		assertTrue(pgEGTPage.tituloRegraSolicitacaoLancamentoContabil.elementoExiste());
		assertTrue(pgEGTPage.textoCampoNome.elementoExiste());
		capturarTela();
	}
	
	@Then("Valido a regra da tela Lista e Regra de Solicitacao")
	public void validoregraTelaListaRegraSolicitacao() throws Throwable {
		capturarTela();
		pgEGTPage = new EGT_ListaRegraSolicitacaoLancamento_Page();
		pgEGTPage.aguardarElemento(pgEGTPage.UorTodas);
		pgEGTPage.UorTodas.posicionarMouseEClicar();
		pgEGTPage.vigenciaTodas.posicionarMouseEClicar();
		pgEGTPage.botaoPesquisar.posicionarMouseEClicar();
		pgEGTPage.aguardarElemento(pgEGTPage.regraNome);
		assertTrue(pgEGTPage.regraNome.elementoExiste());
		capturarTela();
	}
	
}