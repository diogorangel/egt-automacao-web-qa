package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import paginas.EGT_GerenciamentoAnexos_Page;
import paginas.EGT_Login_Page;
import paginas.EGT_RegraSolicitacaoLancamento_Page;
import utilitarios.*;
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

	public class EGT_GerenciamentoAnexos_Page extends Pagina {
		@SuppressWarnings({ "unused" })
		
		private WebDriver driverWeb;
		WebDriver driver=(WebDriver) 
		FTABBContext.getContext().getContextBrowserDriver().getDriver();
		
		public EGT_GerenciamentoAnexos_Page(WebDriver driverWeb) {
			this.driverWeb = driverWeb;
			PageFactory.initElements(driverWeb, this);
		}
	//Funcionalidade Documento de solicitacao de lancamento
	@MapearElementoWeb(xPath = "//span[contains(text(),'Documentos de solicitação de lançamento')]")
	//(xPath  = "//span[contains(., 'Documentos de solicitação de lançamento')]")
	public ElementoTexto escriSolicitacaoContabil;
	
	//Funcionalidade Documento de lancamento contabil
	@MapearElementoWeb(xPath = "//span[contains(text(),'Documentos de lançamento contábil')]") 
			//span[contains(., 'Documentos de lançamento contábil')]")
	public ElementoTexto escriLancamentoContabil;
	
	//Lista de Regras de Solicitacao de Lancamento
	@MapearElementoWeb(xPath = "//h1[contains(.,'Lista de Regras de Solicitação de Lançamento')]")
	public ElementoTexto tituloListadeRegrasdeSolicitaçãodeLançamento;
	
	//Funcionalidade Solicitacao de Lancamento Contabil
	@MapearElementoWeb(xPath = "//h1[contains(.,'Solicitação de Lançamento Contábil')]")
	public ElementoTexto tituloSolicitaçãodeLançamentoContábil;
	
	//Funcionalidade Conducao de Lancamento Contabil
	@MapearElementoWeb(xPath = "//h1[contains(.,'Condução de Lançamento Contábil')]")
	public ElementoTexto tituloConduçãodeLançamentoContábil;

	//Campo Unidade MB Conducao
	@MapearElementoWeb(id = "tamanho")
	public ElementoInput escreverUnidade;
	
	//Campo Unidade em MB
	//@MapearElementoWeb(xPath = "//input[@id='tamanho' and @maxlength='3' and @type='text' and @formcontrolname='tamanhoMaximo']")
	////input[@id='tamanho' and @maxlength='2' and @type='number' and @formcontrolname='tamanhoMaximo']")
	@MapearElementoWeb(xPath = "//input[@id='tamanho' and @maxlength='2' and @type='text' and @formcontrolname='tamanhoMaximo']")
	public ElementoInput campoTamanhoUnidadeMB;
	
	//Texto Unidade em MB
	@MapearElementoWeb(xPath = "//label[contains(text(),'Unidade em MB')]")
	public ElementoTexto tituloUnidadeMB;
	
	//3 Caracteres Campo Unidade em MB
	@MapearElementoWeb(xPath = "//input[contains(@class, 'size-medium shape-rectangle nb-transition ng-touched ng-dirty ng-invalid status-danger')]")
	public Elemento botaoCampoUnidadeMB;
	
	//Gerenciador de anexos Titulo
	@MapearElementoWeb(xPath= "//h1[contains(text(),'Gerenciamento de Anexos')]")
	public ElementoTexto tituloGerenciamentodeAnexos;
	
	//Botao Incluir Funcional
	//@MapearElementoWeb(xPath = "//div[2]/div[1]/input[@id='incluir']")
	@MapearElementoWeb(xPath = "//div[2]/div[1]/input[@id='alterar']")
	public ElementoBotao botaoAlterar;
	
	//Botao Alterar Funcional
	@MapearElementoWeb(xPath = "//div[3]/div[1]/input[@id='incluir']")
	public ElementoBotao botaoIncluir;
	
	//Escrita Botao Alterar
	@MapearElementoWeb(xPath = "//input[contains(@value, 'ALTERAR')]")
	public ElementoBotao botaoEscritaAlterar;
	
	//Escrita Botao Incluir
	@MapearElementoWeb(xPath = "//input[contains(@value, 'INCLUIR')]")
	public ElementoBotao botaoEscritaIncluir;
	
	@MapearElementoWeb(xPath = "//button[contains(@aria-label, 'Fechar aplicativo')]")
	public ElementoBotao botaoFechar;
	
	//Botao Sim popup Confirmacao
	@MapearElementoWeb(xPath = "//button[contains(., 'Sim')]")
	public ElementoBotao botaoSimAnexo;
	
	//Botao Nao Popup Confirmacao
	@MapearElementoWeb(xPath = "//button[contains(., 'Não')]")
	public ElementoBotao botaoNaoAnexo;
	
	//5 Caracteres Campo Arquivo
	@MapearElementoWeb(id = "extensao")
	public ElementoInput extensaoArquivo;
	
	//5 Caracteres Campo Arquivo
	@MapearElementoWeb(xPath = "//input[@id='extensao' and @maxlength='5' and @type='text' and @formcontrolname='extensao']")
	public ElementoInput campoExtensaoArquivo;
	
	//8 Caracteres Assinatura
	@MapearElementoWeb(id = "assinatura")
	public ElementoInput escreverAssinatura;
	
	//8 Caracteres Assinatura
	@MapearElementoWeb(xPath = "//input[@id='assinatura' and @maxlength='8' and @type='text' and @formcontrolname='assinatura']")
	public ElementoInput campoEscreverAssinatura;
	
	//Mensagem de Validacao de Inclusão do Parametro
	@MapearElementoWeb(xPath = "//p[contains(text(),'Parâmetro incluído com sucesso.')]")
	public ElementoTexto mensagemIncluir;
	
	//Mensagem de Validacao de Inclusão do Parametro Repetido
	@MapearElementoWeb(xPath = "//p[contains(text(),'Este parâmetro já está cadastrado. - BBMsgException')]")
	public ElementoTexto mensagemParametroRepetido;
	
	//Pop up de confirmação da inclusão
	@MapearElementoWeb(xPath = "//nb-card-body[1]")
	public Elemento popConfirmacao;
	
	//Pop up tipo de documento, Extensao, Assinatura
	@MapearElementoWeb(xPath = "//div[2]/div[1]/table[1]")
	public Elemento popupTipoDocumento;
	
	//Pop up de confirmação Texto
	@MapearElementoWeb(xPath = "//div[contains(text(),'Confirma a autorização da extensão?')]")
	public ElementoTexto popupTipoDocumentoTitulo;
	
	//Pop up de confirmação Texto
	@MapearElementoWeb(xPath = "//div[contains(text(),'A inclusão da assinatura confere mais segurança na checagem do arquivo. Deseja continuar sem informá-la?')]")
	public ElementoTexto mensagemInclusaoAssinatura;
	
	//Primeira Tabela
	@MapearElementoWeb(xPath = "//table[1]")
	public ElementoTabela tabelaAnexo1;
	
	//Icone Lixeira
	@MapearElementoWeb(xPath = "//nb-icon[contains(@icon, 'trash-2-outline')]")
	public ElementoTabela iconeLixo;
	
	//Popup de exclusão do anexo
	@MapearElementoWeb(xPath = "//div[2]/div[1]/table[1]")
	public ElementoTabela popupExclusao;
	
	//Mensagem de exclusão do anexo Extensao
	@MapearElementoWeb(xPath = "//nb-card-body[1]/div[3]/div[contains(text(),'')]")
	public ElementoTexto mensagemExtensao;
	
	//Mensagem de exclusão do anexo
	@MapearElementoWeb(xPath = "//div[contains(text(),'Confirma a exclusão da extensão?')]")
	public ElementoTexto mensagemPerguntaExclusao;
	
	//Mensagem da confirmação da exclusao de anexo e assinatura
	@MapearElementoWeb(xPath = "//p[contains(text(),'Parâmetro excluído com sucesso.')]")
	public ElementoTexto mensagemConfirmacaoExclusao;
	
	//Mensagem da confirmação da exclusao de anexo e assinatura
	@MapearElementoWeb(xPath = "//p[contains(text(),'Verifique o preenchimento do formulário.')]")
	public ElementoTexto mensagemVerificarFormulario;
	
	//Mensagem da Confirma a alteração do tamanho máximo? 
	@MapearElementoWeb(xPath = "//div[contains(text(),'Confirma a alteração do tamanho máximo?')]")
	public ElementoTexto mensagemConfirmacaoTamanhoMaximo;
	
	//Popup da alteração do tamanho máximo? 
	@MapearElementoWeb(xPath = "//table[1]")
	public ElementoTabela popupTamanhoMaximo;
	
	//Mensagem de erro Tamanha Maximo
	@MapearElementoWeb(xPath = "//p[contains(text(),'Verifique o preenchimento do formulário.')]")
	public ElementoTexto mensagemPreenchimentoFormulario;
	
	//Mensagem de erro Tamanha Maximo 25 MG
	@MapearElementoWeb(xPath = "//p[contains(text(),'Tamanho máximo limitado a 25 MB.')]")
	public ElementoTexto mensagemPreenchimentoMais25MG;
	
	//Mensagem da confirmação de Alteracao da Unidade MB
	@MapearElementoWeb(xPath = "//p[contains(text(),'Tamanho alterado com sucesso.')]")
	public ElementoTexto mensagemAlteracaoUnidadeMB;
	
	//Mensagem de nao alteracao
	@MapearElementoWeb(xPath = "//p[contains(text(),'Não houve alteração no tamanho máximo.')]")
	public ElementoTexto mensagemNaoAlteracaoUnidadeMB;
	
	//Botao Fechar Pop-Up
	@MapearElementoWeb(xPath = "//button[contains(@class, 'close' ) or contains (@class, 'btn-close') and contains (@aria-label, 'Close')]")
	public ElementoBotao fecharPopup;
	
	// construtor
	public EGT_GerenciamentoAnexos_Page() {
		super();
	}
	
	public void informarExtensao(String tipoExtensao) throws ElementoNaoLocalizadoException {		
		extensaoArquivo.escrever(tipoExtensao);

	}
	
	public void informarCampoExtensao(String tipoExtensao) throws ElementoNaoLocalizadoException {		
		campoExtensaoArquivo.escrever(tipoExtensao);

	}
	
	public void informarAssinatura(String tipoAssinatura) throws ElementoNaoLocalizadoException {		
		escreverAssinatura.escrever(tipoAssinatura);

	}
	
	public void informarCampoAssinatura(String tipoAssinatura) throws ElementoNaoLocalizadoException {		
		campoEscreverAssinatura.escrever(tipoAssinatura);

	}
	
	public void informarUnidade(String tipoUnidade) throws ElementoNaoLocalizadoException {		
		campoTamanhoUnidadeMB.escrever(tipoUnidade);

	}
	
	public void informarCampoUnidadeMB(String tipoUnidadeMB) throws ElementoNaoLocalizadoException {		
		escreverUnidade.escrever(tipoUnidadeMB);

	}
	
	
	
	
	// métodos da página
}
