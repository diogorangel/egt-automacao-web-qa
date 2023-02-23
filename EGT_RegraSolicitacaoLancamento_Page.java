package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import paginas.EGT_GerenciamentoAnexos_Page;
import paginas.EGT_Login_Page;
import paginas.EGT_RegraSolicitacaoLancamento_Page;
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


	public class EGT_RegraSolicitacaoLancamento_Page extends Pagina {
		@SuppressWarnings({ "unused" })
		
		private WebDriver driverWeb;
		WebDriver driver=(WebDriver) 
		FTABBContext.getContext().getContextBrowserDriver().getDriver();
		
		public EGT_RegraSolicitacaoLancamento_Page(WebDriver driverWeb) {
			this.driverWeb = driverWeb;
			PageFactory.initElements(driverWeb, this);
		}
	//Funcionalidade Solicitação de Lançamento Contábil
	@MapearElementoWeb(xPath = "//h1[contains(text(),'Solicitação de Lançamento Contábil')")
	public Elemento tituloTelaRegraSolicitacaoContabil;
	
	//Subtitulo Solicitação de Lançamento Contábil
	@MapearElementoWeb(id = "titulo")
	public Elemento subtituloTelaRegraSolicitacaoContabil;
	
	//Campo Nome Regra de Solicitacao
	@MapearElementoWeb (xPath = "//div[contains(text(),'Nome')]")
	public ElementoTexto paginaPlataformaNome;
	
	//Campo Grupo Regra de Solicitacao
	@MapearElementoWeb (xPath = "//div[contains(text(),'Grupo')]")
	public ElementoTexto paginaPlataformaGrupo;
	
	//Subtitulo Vinculações de Informações Contábeis 
	@MapearElementoWeb (xPath = "//egt-lista-vinculacao-contabil[1]/nb-card[1]/nb-card-header[1]")
	public Elemento tituloVinculacoesContabeis;
	
	//Subtitulo Vinculações de Informações Contábeis 
	@MapearElementoWeb (xPath = "//table[1]")
	public ElementoTabela tabelaVinculacoesContabeis;
	
	//Subtitulo Vinculações de Informações Contábeis 
	@MapearElementoWeb (xPath = "//nb-card-body[1]")
	public ElementoTabela corpoTabelaVinculacoesContabeis;
	
	//Botao Selecionar Regra
	@MapearElementoWeb (xPath = "//button[contains(@class, 'mr-0 appearance-filled size-medium status-primary shape-rectangle icon-start nb-transition')]")
	public ElementoBotao botaoSelecionarRegra;
	
	//Botao Selecionar Regra
	@MapearElementoWeb (xPath = "//button[contains(text(),'Selecione o grupo da regra')]")
	public ElementoBotao campoSelecionarGrupo ;
	
	//Pop up regra solicitacao
	@MapearElementoWeb (xPath = "//nb-card-body[1]")
	public Elemento popupRegraSolicitacao;
	
	//Pop up regra solicitacao
	@MapearElementoWeb (xPath = "//nb-option[contains(text(),' BB E BV Financeira ')]")
	public Elemento selecionarGrupo;
	
	@MapearElementoWeb(xPath = "//td[contains(text(),'CONTABILIZAÇÃO CONTRATO BB E BV FINANCEIRA')]")
	public Elemento selecionarTextoGrupo;
	
	//Campo Nome Regra de Solicitacao
	@MapearElementoWeb (xPath = "//div[contains(text(),' BB E BV Financeira ')]")
	public ElementoTexto paginaPlataformaNomeFinanceira;
		
	//Campo Grupo Regra de Solicitacao
	@MapearElementoWeb (xPath = "//div[contains(text(),' CONTABILIZAÇÃO CONTRATO BB E BV FINANCEIRA ')]")
	public ElementoTexto paginaPlataformaGrupoFinanceira;
	
	//Botaõ Fechar do popup Selecionar Grupo
	@MapearElementoWeb(xPath = "//button[contains(text(),' Fechar ')]")
	public ElementoBotao botaoFecharPopupSelecionarGrupo ;
	
	//Botao Limpar Selecao de Grupo Habilitado
	@MapearElementoWeb (xPath ="//button[contains(text(),' Limpar Seleção de Grupo ') and contains (@aria-disabled,'false')]")
	public ElementoBotao botaoLimparSelecaoDeGrupoAtivo;
	
	//Botao Limpar Selecao de Grupo Habilitado
	@MapearElementoWeb (xPath ="//button[contains(text(),' Limpar Seleção de Grupo ') and contains (@aria-disabled,'true')]")
	public ElementoBotao botaoLimparSelecaoDeGrupoDesativado;
	
	//Coluna TIPO OBJETO da Tabela
	@MapearElementoWeb (xPath = "//th[contains(text(),'Tipo Objeto')]")
	public ElementoTexto colunaTabelaTipoObjeto;
	
	//Coluna OBJETO da Tabela
	@MapearElementoWeb (xPath = "//th[normalize-space()='Objeto']")
	public ElementoTexto colunaTabelaObjeto;
	
	//Coluna Subobjeto da Tabela
	@MapearElementoWeb (xPath = "//th[normalize-space()='Subobjeto']")
	public ElementoTexto colunaTabelaSubobjeto;
	
	//Coluna TN da Tabela
	@MapearElementoWeb (xPath = "//th[normalize-space()='TN']")
	public ElementoTexto colunaTabelaTN;
	
	//Coluna Evento da Tabela
	@MapearElementoWeb (xPath = "//th[normalize-space()='Evento']")
	public ElementoTexto colunaTabelaEvento;
	
	//Coluna Seq Evento da Tabela
	@MapearElementoWeb (xPath = "//th[normalize-space()='Seq Evento']")
	public ElementoTexto colunaTabelaSeqEvento;
	
	//Coluna Dependência Origem da Tabela
	@MapearElementoWeb (xPath = "//th[normalize-space()='Dependência Origem']")
	public ElementoTexto colunaTabelaDependenciaOrigem;
	
	//Coluna Titular Origem da Tabela
	@MapearElementoWeb (xPath = "//th[normalize-space()='Titular Origem']")
	public ElementoTexto colunaTitularOrigem;
	
	//Coluna Dependência Destino da Tabela
	@MapearElementoWeb (xPath = "//th[normalize-space()='Dependência Destino']")
	public ElementoTexto colunaDependenciaDestino;
	
	//Coluna Titular Destino da Tabela
	@MapearElementoWeb (xPath = "//th[normalize-space()='Titular Destino']")
	public ElementoTexto colunaTitularDestino;
	
	//Coluna Titular Destino da Tabela
	@MapearElementoWeb (xPath = "//th[normalize-space()='Serviço']")
	public ElementoTexto colunaServico;
	
	//////////////////////////////////////
	//Campo TIPO OBJETO da Tabela
	@MapearElementoWeb (xPath = "//td[text()='0005']")
	public ElementoTexto campoTabelaTipoObjeto;
		
	//Campo OBJETO da Tabela
	@MapearElementoWeb (xPath = "//td[text()='0598']")
	public ElementoTexto campoTabelaObjeto;
		
	//Campo Subobjeto da Tabela
	@MapearElementoWeb (xPath = "//td[text()=' 0004 ']")
	public ElementoTexto campoTabelaSubobjeto;
		
	//Campo TN da Tabela
	@MapearElementoWeb (xPath = "//td[text()='4283']")
	public ElementoTexto campoTabelaTN;
		
	//Campo Evento da Tabela
	@MapearElementoWeb (xPath = "//td[text()='846702']")
	public ElementoTexto campoTabelaEvento;
		
	//Campo Seq Evento da Tabela
	@MapearElementoWeb (xPath = "//th[normalize-space()='Seq Evento']")
	public ElementoTexto campoTabelaSeqEvento;
		
	//Campo Dependência Origem da Tabela
	@MapearElementoWeb (xPath = "//td[text()='0001 ']")
	public ElementoTexto campoTabelaDependenciaOrigem;
		
	//Campo Titular Origem da Tabela
	@MapearElementoWeb (xPath = "//td[text()=' 3400 ']")
	public ElementoTexto campoTitularOrigem;
		
	//Campo Dependência Destino da Tabela
	@MapearElementoWeb (xPath = "//td[text()='6492']")
	public ElementoTexto campoDependenciaDestino;
		
	//Campo Titular Destino da Tabela
	@MapearElementoWeb (xPath = "//td[text()=' 8624']")
	public ElementoTexto campoTitularDestino;
		
	//Campo Titular Destino da Tabela
	@MapearElementoWeb (xPath = "//td[text()='DICRE']")
	public ElementoTexto campoServico;
	
	//Marcar Botaõ Lista Informacoes Contabeis
	//@MapearElementoWeb (xPath = "//td[contains(@class, 'cdk-cell cdk-column-selecionar bb-column-selecionar bb-cell ng-star-inserted')]")
	@MapearElementoWeb (xPath = "//label[contains(@class, 'label')]")
	//@MapearElementoWeb (xPath = "//span[contains(@class, 'custom-checkbox')]")
	//(xPath = "//input[contains(@class, 'native-input visually-hidden')]")
	public ElementoTabela botaoVinculacoesContabeis;
	
	//Botao Selecionar Todos
	@MapearElementoWeb(xPath = "//button[contains(text(),'Selecionar Todos')]")
	public ElementoBotao botaoSelecionarTodos;
	
	//Botao Solicitar Lançamento Contábil 
	@MapearElementoWeb(xPath = "//button[contains(@class, 'mr-0 appearance-filled btn-disabled size-medium status-primary shape-rectangle nb-transition') or contains (., ' Solicitar Lançamento Contábil ')]")
	public ElementoBotao botaoSolicitarLancamentoContabil;
	
	//UOR Mensagem
	@MapearElementoWeb(xPath = "//p[contains(text(),'Erro ao recuperar UOR do usuário')]")
	public Elemento mensagemUsuarioUOR;
	
	//Titulo Tela 2º Solicitação de Lançamento Contábil 
	@MapearElementoWeb(xPath = "//nb-accordion[1]/nb-accordion-item[1]/nb-accordion-item-header[1]")
	public Elemento tituloTelaSolicitacaoLancamentoContabil;
	
	//Campo Grupo Regra de Solicitacao
	@MapearElementoWeb (xPath = "//div[contains(text(),'IOR')]")
	public ElementoTexto paginaPlataformaIOR;
	
	//Titulo Preenchimento massificado  
	@MapearElementoWeb(xPath = "//nb-accordion[2]/nb-accordion-item[1]/nb-accordion-item-header[1]")
	public Elemento tituloPreenchimentoMassificado;
	
	//Texto Excel no campo Valor 
	@MapearElementoWeb(xPath = "//div[contains(text(),'É possível colar valores de coluna do Excel no campo Valor')]")
	public ElementoTexto textoColarValoresColuna;
	
	//Campo Texto Data
	@MapearElementoWeb(xPath = "//div[contains(text(),'Data')]")
	public ElementoTexto paginaPlataformaData;
	
	//Campo Data
	@MapearElementoWeb(xPath = "//div[1]/input[1]")
	public Elemento campoPlataformaData;
	
	//Tabela 1
	@MapearElementoWeb(xPath = "//div[1]/input[1]")
	public Elemento tabelaPreenchimentoMassificado;
	
	//Campo Data
	@MapearElementoWeb(xPath = "//input[contains(@class, 'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-invalid nb-transition')]")
	public ElementoInput campoData;
	
	//Solicitar Lançamento Contábil
	@MapearElementoWeb(xPath = "//button[contains(text(),'Solicitar Lançamento Contábil')]")
	public ElementoBotao BotaoSolicitacaoContabil;
	
	//Botao Preencher
	@MapearElementoWeb(xPath = "//button[contains(text(),'Preencher')]")
	public ElementoBotao BotaoPreencher;
	
	//Botao Preencher
	@MapearElementoWeb(xPath = "//button[contains(text(),' Voltar ')]")
	public ElementoBotao BotaoVoltar;
	
	//Validar Regra
	//ICC 804  FUNCAFÉ Lista de regra- @MapearElementoWeb(xPath="//td[contains(.,'ICC 804  FUNCAFÉ')]")
	@MapearElementoWeb (xPath = "//td[contains(text(),'ICC 804  FUNCAFÉ')]")
	public Elemento validarRegra;
	
	//Preencher Data na tela Solicitação de Lançamento Contábil //table[1]|
	//ElementoInput@MapearElementoWeb(xPath = "//table[1]|//input[contains(@class, 'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-invalid nb-transition') or contains (.,'size-medium shape-rectangle ng-pristine ng-invalid nb-transition status-danger ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-invalid nb-transition') or contains (., 'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-invalid nb-transition') or contains (.,'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-invalid nb-transition')]")
	//@MapearElementoWeb(xPath = "//input[contains(@class, 'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-invalid nb-transition') or contains (.,'size-medium shape-rectangle ng-pristine ng-invalid nb-transition status-danger ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-invalid nb-transition') or contains (., 'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-invalid nb-transition') or contains (.,'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-invalid nb-transition')]")
	//@MapearElementoWeb(xPath = "//input[contains(@id, 'dataLancamento')]")
	//@MapearElementoWeb(xPath = "//input[contains(@id, 'dataLancamento') and contains (@class, 'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-invalid nb-transition') or contains (.,'size-medium shape-rectangle ng-pristine ng-invalid nb-transition status-danger ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-invalid nb-transition') or contains (., 'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-invalid nb-transition') or contains (.,'size-medium status-basic shape-rectangle ng-untouched ng-pristine ng-invalid nb-transition')]")
	@MapearElementoWeb(id = "dataLancamento")
	public ElementoInput campoDataSolicitarLancamento;
	
	//Campo Valor na tela Solicitação de Lançamento Contábil //table[1]|
	//@MapearElementoWeb(xPath = "//input[contains(@class, 'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched')or contains(.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (., 'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched')]")
	//ElementoInput@MapearElementoWeb(xPath = "//table[1]|//input[contains(@class, 'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched')or contains(.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (., 'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched')]")
	//@MapearElementoWeb(xPath = "//input[contains(@id, 'valorLancamento')]")
	@MapearElementoWeb(id = "valorLancamento")
	//@MapearElementoWeb(xPath = "//input[contains(@id, 'valorLancamento') and contains(@class, 'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched')or contains(.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (.,'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (., 'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched') or contains (., 'size-medium status-basic shape-rectangle ng-pristine ng-valid nb-transition ng-touched')]")
	public ElementoInput campoValorSolicitarLancamento;
	
	//Preencher Data no campo Data da tela Solicitação de Lançamento Contábil
	@MapearElementoWeb(xPath = "//div[contains(@class,'cell-content') and contains(.,' 27 ')]")
	public ElementoTexto valorDataSolicitacao;
	
	//Layout Confirma Solicitação de lancamento Contabil
	@MapearElementoWeb(xPath = "//div[contains(text(),'Confirma solicitação de lançamento contábil?')]")
	public ElementoTexto tituloConfirmacaoLancamentoContabil;
	
	//Layout Confirma Solicitação de lancamento Contabil
	@MapearElementoWeb(xPath = "//div[contains(text(),'A solicitação possui 1 lançamento.')]")
	public ElementoTexto perguntaConfirmacaoLancamentoContabil;
	
	//Layout Confirma Solicitação de lancamento Contabil
	@MapearElementoWeb(xPath = "//egt-dialog-confirmacao[1]/nb-card[1]/nb-card-footer[1]")
	public Elemento layoutConfirmacaoLancamentoContabil;
	
	//Botao Sim popup Confirmacao
	@MapearElementoWeb(xPath = "//button[contains(., 'Sim')]")
	public ElementoBotao botaoSimAnexo;
		
	//Botao Nao Popup Confirmacao
	@MapearElementoWeb(xPath = "//button[contains(., 'Não')]")
	public ElementoBotao botaoNaoAnexo;
	
	//Mensagem Confirma Solicitação de lancamento Contabil
	@MapearElementoWeb(xPath ="//p[contains(text(),'Solicitação número 173 gravada com sucesso.')]")
	public Elemento mensagemConfirmacaoLancamentoContabil;
	
	//Mensagem da confirmação da exclusao de anexo e assinatura
	@MapearElementoWeb(xPath = "//p[contains(text(),'Verifique o preenchimento do formulário.')]")
	public ElementoTexto mensagemVerificarFormulario;
			
	// construtor
	public EGT_RegraSolicitacaoLancamento_Page() {
		super();
	}
	
	public void informarValor(String tipoValor) throws ElementoNaoLocalizadoException {		
		campoValorSolicitarLancamento.escrever(tipoValor);

	}
	
	
	//public void informarExtensao(String tipoExtensao) throws ElementoNaoLocalizadoException {		
		//extensaoArquivo.escrever(tipoExtensao);

	
	
	
	// métodos da página
		}
	
