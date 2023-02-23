package steps;

import static org.junit.Assert.assertTrue;
import javax.print.attribute.standard.PagesPerMinute;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import utilitarios.*;
import paginas.EGT_GerenciamentoAnexos_Page;
import paginas.EGT_Login_Page;
import paginas.EGT_RegraSolicitacaoLancamento_Page;
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
public class EGT_Login_Steps extends FTABBUtils {
	
	private WebDriver driverWeb; 

	
	private EGT_Login_Page pgEGTPage;
	/**
	 * Construtor da Classe
	 */
	public EGT_Login_Steps() {
		super();
	}

	@Before
	public static void inicio(){
		Plataforma.abrirPlataforma();
	}
	
	@Given("Realizo o Login na Plataforma e acesso o Coger")
	public void queestounapaginadelogin() throws Throwable {
		String chave = $("login_plataforma.chaveF.chave");
		String senha = $("login_plataforma.chaveF.senha");
		System.out.println("-"+chave+"-");
		System.out.println("-"+senha+"-");
		//Plataforma.fazerLogin();
		Plataforma.fazerLogin(chave, senha);
		Plataforma.selecionarAreaDeTrabalho("Coger");
		capturarTela();
	}
	
	@When("Entro em Regras de Solicitacao de Lancamento")
	public void regrasolicitacaolancamento() throws Throwable {
		Plataforma.abrirMenu("Escrituração Contábil","Regras de Solicitação de Lançamento");
		capturarTela();
	}
	
	@And("Entro em Conducao de Lancamento Contabil")
	public void conducaolancamento() throws Throwable {
		Plataforma.abrirMenu("Escrituração Contábil","Condução de Lançamento");
		capturarTela();
		
	}
	@And("Entro na tela Gerenciamento de Anexos")
	public void gerenciamentoanexos() throws Throwable {
		Plataforma.abrirMenu("Escrituração Contábil","Gerenciamento de Anexos");
		capturarTela();
		
	}
	@Then("Entro em Solicitacao de Lancamento")
	public void solicitacaolancamento() throws Throwable {
		Plataforma.abrirMenu("Escrituração Contábil","Solicitação de Lançamento");
		capturarTela();
		
	}
	@And("Encerro a navegacao pela plataforma")
	public void encerrarnavegacaoPlataforma() throws Throwable {
		Plataforma.fecharPlataforma();
	}
	
	
	@And("Encerro a navegacao pelo botao fechar plataforma")
	public void encerrarbotaoPlataforma() throws Throwable {
		pgEGTPage.botaoFechar.posicionarMouseEClicar();
	}


}
