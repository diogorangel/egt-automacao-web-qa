package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import paginas.EGT_ConducaoLancamentoContabil_Page;
import paginas.EGT_GerenciamentoAnexos_Page;
import paginas.EGT_Login_Page;
import utilitarios.*;
import groovyjarjarantlr4.v4.runtime.tree.xpath.XPath;
import br.com.bb.ath.ftabb.FTABB;
import br.com.bb.ath.ftabb.FTABBContext;
import br.com.bb.ath.ftabb.Pagina;
import br.com.bb.ath.ftabb.anotacoes.MapearElementoWeb;
import br.com.bb.ath.ftabb.elementos.Elemento;
import br.com.bb.ath.ftabb.elementos.ElementoBotao;
import br.com.bb.ath.ftabb.elementos.ElementoFrame;
import br.com.bb.ath.ftabb.elementos.ElementoInput;
import br.com.bb.ath.ftabb.elementos.ElementoLista;
import br.com.bb.ath.ftabb.elementos.ElementoTabela;
import br.com.bb.ath.ftabb.elementos.ElementoTexto;
import br.com.bb.ath.ftabb.exceptions.ElementoNaoLocalizadoException;
import br.com.bb.ath.ftabb.utilitarios.Utils;


	public class EGT_ConducaoLancamentoContabil_Page extends Pagina {
		@SuppressWarnings({ "unused" })
		
		private WebDriver driverWeb;
		WebDriver driver=(WebDriver) 
		FTABBContext.getContext().getContextBrowserDriver().getDriver();
		
		public EGT_ConducaoLancamentoContabil_Page(WebDriver driverWeb) {
			this.driverWeb = driverWeb;
			PageFactory.initElements(driverWeb, this);
		}
		
	//Lista de Regras de Solicitacao de Lancamento
	@MapearElementoWeb(xPath = "//h1[contains(.,'Lista de Regras de Solicitação de Lançamento')]")
	public ElementoTexto tituloConducaoLancamentoContabil;
	
	//Lista de Regras de Solicitacao de Lancamento
	@MapearElementoWeb(xPath = "//div[contains(text(),'UOR')]")
	public ElementoTexto textoUor;
	
	//Lista de Regras de Solicitacao de Lancamento
	@MapearElementoWeb(xPath = "//nb-card-body[1]/div[1]/div[contains(text(),'345534')]")
	public ElementoTexto iconeEdicaoUor;
	
	//Lista de Regras de Solicitacao de Lancamento
	@MapearElementoWeb(xPath = "//div[contains(text(),'Dependência')]")
	public ElementoTexto textoDependencia;
		
	//Lista de Regras de Solicitacao de Lancamento
	@MapearElementoWeb(xPath = "//div[contains(text(),'9568')]")
	public ElementoTexto quantiaDependencia;
	
	//ID - Número da solicitação
	@MapearElementoWeb(id = "formNumeroSolicitacao")
	public ElementoInput campoNumeroSolicitacao;
	
	//Campo - Situação da solicitação
	@MapearElementoWeb(xPath = "//button[contains(.,' Todas ') and contains(@class,'select-button')]")
	public ElementoBotao campoSituacaoSolicitacao;
	
	//Campo - Situação da solicitação
	@MapearElementoWeb(xPath = "//input[contains(@name, 'dataInicio') and contains (@class,'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-valid nb-transition')]")
	public ElementoInput campoDataInicio;
	
	//Campo - Situação da solicitação
	@MapearElementoWeb(xPath = "//input[contains(@name, 'dataFim') and contains (@class,'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-valid nb-transition')]")
	public ElementoInput campoDataFim;
	
	//Campo - Situação da solicitação
	@MapearElementoWeb(xPath = "//button[contains(.,'Pesquisar') and contains(@type,'submit')]")
	public ElementoBotao botaoPesquisar;
	
	//Tabela Resultados
	@MapearElementoWeb(xPath = "//egt-conduz-solicitacao[1]")
	public Elemento tabelaResultados;
	
	//Resultado Solicitacao de Lancamento 167
	@MapearElementoWeb(xPath = "//div[contains(text(),'Solicitação de Lançamento 167')]")
	public ElementoTexto resultadoBuscaSolicitacao;
	
	// construtor
	public EGT_ConducaoLancamentoContabil_Page() {
		super();
	}
	
	public void escreverNumeroSolicitacao(String NumeroSolicitacao) throws ElementoNaoLocalizadoException {		
		campoNumeroSolicitacao.escrever(NumeroSolicitacao);

	}

	
	
	
	// métodos da página
		}
	
