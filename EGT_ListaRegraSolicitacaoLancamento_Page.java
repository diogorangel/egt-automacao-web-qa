package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import paginas.EGT_GerenciamentoAnexos_Page;
import paginas.EGT_ListaRegraSolicitacaoLancamento_Page;
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


	public class EGT_ListaRegraSolicitacaoLancamento_Page extends Pagina {
		@SuppressWarnings({ "unused" })
		
		private WebDriver driverWeb;
		WebDriver driver=(WebDriver) 
		FTABBContext.getContext().getContextBrowserDriver().getDriver();
		
		public EGT_ListaRegraSolicitacaoLancamento_Page(WebDriver driverWeb) {
			this.driverWeb = driverWeb;
			PageFactory.initElements(driverWeb, this);
		}
	//Funcionalidade Solicitação de Lançamento Contábil
	@MapearElementoWeb(xPath = "//nb-radio[2]//span[contains(text(),'Todas')]")
	public ElementoTexto UorTodas;
	
	//Subtitulo Solicitação de Lançamento Contábil
	@MapearElementoWeb(xPath = "//nb-radio[3]//span[contains(text(),'Todas')]")
	public ElementoTexto vigenciaTodas;
	
	//titulo Filtros de Pesquisa
	@MapearElementoWeb(id = "titulo")
	public Elemento tituloFiltrosPesquisa;
	
	//Botao Pesquisar
	@MapearElementoWeb(xPath = "//button[contains(text(),'Pesquisar')]")
	public ElementoBotao botaoPesquisar;
	
	//Botao Incluir Regra
	@MapearElementoWeb(xPath = "//button[contains(text(),'Incluir Regra')]")
	public ElementoBotao botaoIncluiRegra;
	
	//Titulo Regras de Solicitação de Lançamento Contábil
	@MapearElementoWeb(xPath = "//nb-card[2]/nb-card-header[1]")
	public Elemento tituloRegraSolicitacaoLancamentoContabil;
	
	//Campo Inserir Nome
	@MapearElementoWeb(xPath = "//input[contains(@class,'ng-pristine ng-valid ng-touched')]")
	public ElementoInput campoNome;
	
	//Campo Inserir Nome
	@MapearElementoWeb(xPath="//th[contains(@class,'cdk-header-cell cdk-column-nomeRegraSolicitacao bb-column-nomeRegraSolicitacao bb-header-cell') and contains (.,' Nome ')]")
	public ElementoTexto textoCampoNome;
	
	//ICC 804  FUNCAFÉ
	@MapearElementoWeb(xPath="//td[contains(.,'ICC 804  FUNCAFÉ')]")
	public ElementoTexto regraNome;
	
	// construtor
	public EGT_ListaRegraSolicitacaoLancamento_Page() {
		super();
	}
	
	//public void informarExtensao(String tipoExtensao) throws ElementoNaoLocalizadoException {		
		//extensaoArquivo.escrever(tipoExtensao);

	
	
	
	// métodos da página
		}
	
