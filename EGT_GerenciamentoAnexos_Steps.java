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
public class EGT_GerenciamentoAnexos_Steps extends FTABBUtils {
	
	private WebDriver driverWeb;

	private EGT_GerenciamentoAnexos_Page pgEGTPage;
	/**
	 * Construtor da Classe
	 */
	public EGT_GerenciamentoAnexos_Steps() {
		super();
	}
	
	@And("Validar a tela da opcao documentos de solicitacao de lancamento")
	public void selecionardocumentoSolicitacao() throws Throwable  {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		pgEGTPage.aguardarElemento(pgEGTPage.escriLancamentoContabil);
		pgEGTPage.aguardarElemento(pgEGTPage.escriSolicitacaoContabil);
		capturarTela();
		pgEGTPage.escriLancamentoContabil.posicionarMouseEClicar();
		assertTrue(pgEGTPage.escriLancamentoContabil.elementoExiste());
		assertTrue(pgEGTPage.escriSolicitacaoContabil.elementoExiste());
		assertTrue(pgEGTPage.escreverUnidade.elementoExiste());
		assertTrue(pgEGTPage.botaoEscritaIncluir.elementoExiste());
		assertTrue(pgEGTPage.botaoIncluir.elementoExiste());
		assertTrue(pgEGTPage.botaoAlterar.elementoExiste());
		assertTrue(pgEGTPage.botaoEscritaAlterar.elementoExiste());
		assertTrue(pgEGTPage.tituloUnidadeMB.elementoExiste());
		//assertTrue(pgEGTPage.numeroUnidadeMBConduçãodeLançamentoContábil.elementoExiste());
		capturarTela();
	}
	
	@And("Validar a tela da opcao documentos de lancamento contabil")
	public void selecionardocumentoLancamento() throws Throwable  {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		pgEGTPage.aguardarElemento(pgEGTPage.escriLancamentoContabil);
		pgEGTPage.aguardarElemento(pgEGTPage.escriSolicitacaoContabil);
		capturarTela();
		pgEGTPage.escriSolicitacaoContabil.posicionarMouseEClicar();
		assertTrue(pgEGTPage.escriLancamentoContabil.elementoExiste());
		assertTrue(pgEGTPage.escriSolicitacaoContabil.elementoExiste());
		assertTrue(pgEGTPage.escreverUnidade.elementoExiste());
		assertTrue(pgEGTPage.botaoEscritaIncluir.elementoExiste());
		assertTrue(pgEGTPage.botaoIncluir.elementoExiste());
		assertTrue(pgEGTPage.botaoAlterar.elementoExiste());
		assertTrue(pgEGTPage.botaoEscritaAlterar.elementoExiste());
		assertTrue(pgEGTPage.tituloUnidadeMB.elementoExiste());
		//assertTrue(pgEGTPage.numeroUnidadeMBConduçãodeLançamentoContábil.elementoExiste());
		capturarTela();
	}
	
	@And("Validar o preenchimento do campo extensao \"([^\"]*)\"$")
	public void inclusaoExtensao(String arg1) throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		sleep(5);
		pgEGTPage.informarExtensao(arg1);
		capturarTela();
	}	
	
	@And("Validar o preenchimento do campo assinatura \"([^\"]*)\"$")
	public void inclusaoAssinatura(String arg2) throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		sleep(2);
		pgEGTPage.informarAssinatura(arg2);
		capturarTela();
	}	
	
	@And("Clico no Botao Incluir")
	public void clicoBotaoIncluir() throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		pgEGTPage.botaoIncluir.posicionarMouseEClicar();
		capturarTela();
	}	
	
	@And("Validar o popup e mensagens de Inclusao")
	public void validarpopupInclusao() throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		if (pgEGTPage.popConfirmacao.elementoExiste() == true) {
			assertTrue(pgEGTPage.popConfirmacao.elementoExiste());
			assertTrue(pgEGTPage.popupTipoDocumento.elementoExiste());
			assertTrue(pgEGTPage.popupTipoDocumentoTitulo.elementoExiste());
			assertTrue(pgEGTPage.popConfirmacao.elementoExiste());
			//assertTrue(pgEGTPage.mensagemInclusaoAssinatura.elementoExiste());
			capturarTela();
		}
		
		else if (pgEGTPage.mensagemVerificarFormulario.elementoExiste() == true) {
			pgEGTPage.aguardarElemento(pgEGTPage.mensagemVerificarFormulario);
			assertTrue(pgEGTPage.mensagemVerificarFormulario.elementoExiste());
			capturarTela();
		}

		else if (pgEGTPage.mensagemVerificarFormulario.elementoExiste() == true) {
			assertTrue(pgEGTPage.popConfirmacao.elementoExiste());
			assertTrue(pgEGTPage.popupTipoDocumento.elementoExiste());
			assertTrue(pgEGTPage.popupTipoDocumentoTitulo.elementoExiste());
			capturarTela();
			}
		else {
			capturarTela();
			}
		}
	
	@And("Validar a inclusao da assinatura e anexo")
	public void validarInclusao() throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		sleep(1);
		pgEGTPage.botaoSimAnexo.posicionarMouseEClicar();
		capturarTela();
	}	
	
	@And("Validar a nao inclusao da assinatura e anexo")
	public void validaraNaoInclusao() throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		sleep(1);
		pgEGTPage.botaoNaoAnexo.posicionarMouseEClicar();
		capturarTela();
	}
	
	@And("Validar a exclusao da assinatura e anexo")
	public void validarExclusao() throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		sleep(1);
		if (pgEGTPage.botaoSimAnexo.elementoExiste() == true) {
			sleep(1);
			pgEGTPage.aguardarElemento(pgEGTPage.botaoSimAnexo);
			assertTrue(pgEGTPage.botaoSimAnexo.elementoExiste());
			capturarTela();
			pgEGTPage.botaoSimAnexo.posicionarMouseEClicar();
			capturarTela();
		}

		else {
			sleep(1);
			capturarTela();
		}
	}
	
	@And("Validar a nao exclusao da assinatura e anexo")
	public void validaraNaoExclusao() throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		if (pgEGTPage.botaoNaoAnexo.elementoExiste() == true) {
			sleep(1);
			pgEGTPage.aguardarElemento(pgEGTPage.botaoNaoAnexo);
			assertTrue(pgEGTPage.botaoNaoAnexo.elementoExiste());
			capturarTela();
			pgEGTPage.botaoNaoAnexo.posicionarMouseEClicar();
			capturarTela();
		}

		else {
			sleep(1);
			capturarTela();
		}
	}
	
	@And("Validar a mensagem de Inclusao do Paramentro")
	public void validarInclusaoParamentro() throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		if (pgEGTPage.mensagemIncluir.elementoExiste() == true) {
			sleep(1);
			pgEGTPage.aguardarElemento(pgEGTPage.mensagemIncluir);
			assertTrue(pgEGTPage.mensagemIncluir.elementoExiste());
			capturarTela();
		}

		else {
			sleep(1);
			pgEGTPage.aguardarElemento(pgEGTPage.mensagemParametroRepetido);
			assertTrue(pgEGTPage.mensagemParametroRepetido.elementoExiste());
			capturarTela();
		}
	}
	
	@And("Validar a mensagem de Exclusao do Paramentro")
	public void validarExclusaoParamentro() throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		if (pgEGTPage.mensagemConfirmacaoExclusao.elementoExiste() == true) {
			sleep(1);
			pgEGTPage.aguardarElemento(pgEGTPage.mensagemConfirmacaoExclusao);
			assertTrue(pgEGTPage.mensagemConfirmacaoExclusao.elementoExiste());
			capturarTela();
		}

		else {
			capturarTela();
		}
	}
	
	@And("Validar a exibicao da tabela de anexos")
	public void exibicaoTabelaAnexos() throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		if (pgEGTPage.tabelaAnexo1.elementoExiste() == true) {
			sleep(1);
			pgEGTPage.aguardarElemento(pgEGTPage.tabelaAnexo1);
			assertTrue(pgEGTPage.tabelaAnexo1.elementoExiste());
			capturarTela();
		}

		else {
			sleep(1);
			capturarTela();
		}
	}
	
	@And("Excluo um anexo e assinatura")
	public void exclusaoAnexoTabela1() throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		if (pgEGTPage.iconeLixo.elementoExiste() == true) {
			sleep(1);
			pgEGTPage.aguardarElemento(pgEGTPage.iconeLixo);
			capturarTela();
			pgEGTPage.iconeLixo.posicionarMouseEClicar();
			capturarTela();
			assertTrue(pgEGTPage.iconeLixo.elementoExiste());
			assertTrue(pgEGTPage.popupExclusao.elementoExiste());
			assertTrue(pgEGTPage.mensagemExtensao.elementoExiste());
			assertTrue(pgEGTPage.mensagemPerguntaExclusao.elementoExiste());
			sleep(1);
		}

		else {
			sleep(1);
			capturarTela();
		}
	}
	
	@And("Valido o tamanho do campo Unidade MB \"([^\"]*)\"$")
	public void tamanhoCampoUnidade(String arg1) throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		if (pgEGTPage.campoTamanhoUnidadeMB.elementoExiste() == true) {
			sleep(1);
			pgEGTPage.aguardarElemento(pgEGTPage.campoTamanhoUnidadeMB);
			assertTrue(pgEGTPage.campoTamanhoUnidadeMB.elementoExiste());
			capturarTela();
			pgEGTPage.informarUnidade(arg1);
			System.out.println("-"+arg1+"-");
			capturarTela();
		}

		else {
			sleep(1);
			System.out.println("O Campo Unidade MB foi corrompido");
			capturarTela();
		}
	}
	
	@And("Valido o tamanho do campo Extensao \"([^\"]*)\"$")
	public void tamanhoCampoExtensao(String arg1) throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		if (pgEGTPage.campoExtensaoArquivo.elementoExiste() == true) {
			sleep(1);
			pgEGTPage.aguardarElemento(pgEGTPage.campoExtensaoArquivo);
			assertTrue(pgEGTPage.campoExtensaoArquivo.elementoExiste());
			capturarTela();
			pgEGTPage.informarCampoExtensao(arg1);
			System.out.println("-"+arg1+"-");
			capturarTela();
		}

		else {
			sleep(1);
			System.out.println("O Campo Extensao foi corrompido");
			capturarTela();
		}
	}
	
	@And("Valido o tamanho do campo Assinatura \"([^\"]*)\"$")
	public void tamanhoCampoAssinatura(String arg1) throws Throwable {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		if (pgEGTPage.campoEscreverAssinatura.elementoExiste() == true) {
			sleep(1);
			pgEGTPage.aguardarElemento(pgEGTPage.campoEscreverAssinatura);
			assertTrue(pgEGTPage.campoEscreverAssinatura.elementoExiste());
			capturarTela();
			System.out.println("-"+arg1+"-");
			pgEGTPage.informarCampoAssinatura(arg1);
			capturarTela();
		}

		else {
			sleep(1);
			System.out.println("O Campo Assinatura foi corrompido");
			capturarTela();
		}
	}
	
	@And("Validar Campo Unidade em MB \"([^\"]*)\"$")
	public void validarCampoUnidadeMB(String arg1) throws Throwable  {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		pgEGTPage.aguardarElemento(pgEGTPage.campoTamanhoUnidadeMB);
		pgEGTPage.aguardarElemento(pgEGTPage.tituloUnidadeMB);
		assertTrue(pgEGTPage.campoTamanhoUnidadeMB.elementoExiste());
		assertTrue(pgEGTPage.tituloUnidadeMB.elementoExiste());
		pgEGTPage.informarCampoUnidadeMB(arg1);
		System.out.println("-"+arg1+"-");
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.botaoAlterar);
		assertTrue(pgEGTPage.botaoAlterar.elementoExiste());
		pgEGTPage.botaoAlterar.posicionarMouseEClicar();
		sleep(2);
		capturarTela();
		if (pgEGTPage.mensagemPreenchimentoFormulario.elementoExiste() == true){
			sleep(1);
			assertTrue(pgEGTPage.mensagemPreenchimentoFormulario.elementoExiste());
			capturarTela(); 
		}
		
		else if (pgEGTPage.mensagemPreenchimentoMais25MG.elementoExiste() == true){
			sleep(1);
			assertTrue(pgEGTPage.mensagemPreenchimentoMais25MG.elementoExiste());
			capturarTela();
		}
		
		else if (pgEGTPage.mensagemNaoAlteracaoUnidadeMB.elementoExiste() == true) {
			pgEGTPage.aguardarElemento(pgEGTPage.mensagemNaoAlteracaoUnidadeMB);
			assertTrue(pgEGTPage.mensagemNaoAlteracaoUnidadeMB.elementoExiste());
			capturarTela(); 
			pgEGTPage.fecharPopup.posicionarMouseEClicar();
			capturarTela(); 
		}
		
		else {
			sleep(1);
			assertTrue(pgEGTPage.mensagemConfirmacaoTamanhoMaximo.elementoExiste());
			assertTrue(pgEGTPage.popupTamanhoMaximo.elementoExiste());
			capturarTela();
			pgEGTPage.botaoSimAnexo.posicionarMouseEClicar();
			pgEGTPage.aguardarElemento(pgEGTPage.mensagemAlteracaoUnidadeMB);
			assertTrue(pgEGTPage.mensagemAlteracaoUnidadeMB.elementoExiste());
			capturarTela();
		}	
	}
	
	@And("Validar a nao alteracao da Unidade MB \"([^\"]*)\"$")
	public void validarNaoAlteracaoUnidadeMB(String arg1) throws Throwable  {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		pgEGTPage.aguardarElemento(pgEGTPage.campoTamanhoUnidadeMB);
		pgEGTPage.aguardarElemento(pgEGTPage.tituloUnidadeMB);
		assertTrue(pgEGTPage.campoTamanhoUnidadeMB.elementoExiste());
		assertTrue(pgEGTPage.tituloUnidadeMB.elementoExiste());
		pgEGTPage.informarCampoUnidadeMB(arg1);
		System.out.println("-"+arg1+"-");
		capturarTela();
		pgEGTPage.aguardarElemento(pgEGTPage.botaoAlterar);
		assertTrue(pgEGTPage.botaoAlterar.elementoExiste());
		pgEGTPage.botaoAlterar.posicionarMouseEClicar();
		sleep(2);
		capturarTela();
		if (pgEGTPage.mensagemConfirmacaoTamanhoMaximo.elementoExiste() == true){
			sleep(1);
			assertTrue(pgEGTPage.popupTamanhoMaximo.elementoExiste());
			assertTrue(pgEGTPage.mensagemConfirmacaoTamanhoMaximo.elementoExiste());
			capturarTela(); 
			pgEGTPage.botaoNaoAnexo.posicionarMouseEClicar();
			capturarTela(); 
		}
		else if (pgEGTPage.mensagemPreenchimentoMais25MG.elementoExiste() == true){
			assertTrue(pgEGTPage.mensagemPreenchimentoMais25MG.elementoExiste());
			capturarTela(); 
		}
		else {
			assertTrue(pgEGTPage.mensagemNaoAlteracaoUnidadeMB.elementoExiste());
			capturarTela(); 
		}
		
	}
	
	@And("Alterar Unidade MB")
	public void alterarUnidadeMB() throws Throwable  {
		pgEGTPage.aguardarElemento(pgEGTPage.botaoAlterar);
		pgEGTPage.botaoAlterar.posicionarMouseEClicar();
		capturarTela();
	}
	
	@And("Mensagem Verifique o preenchimento do formulario Unidade MB")
	public void mensagemVerificarUnidade() throws Throwable  {
		pgEGTPage.aguardarElemento(pgEGTPage.mensagemVerificarFormulario);
		assertTrue(pgEGTPage.mensagemVerificarFormulario.elementoExiste());
		capturarTela();	
	}
	
	@And("Validar fechar popups de mensagens")
	public void validarFecharMensagens() throws Throwable  {
		pgEGTPage = new EGT_GerenciamentoAnexos_Page();
		capturarTela();
		if (pgEGTPage.mensagemConfirmacaoExclusao.elementoExiste() == true){
			assertTrue(pgEGTPage.mensagemConfirmacaoExclusao.elementoExiste());
			capturarTela(); 
			pgEGTPage.fecharPopup.posicionarMouseEClicar();
			capturarTela(); 
		}
		
		else if (pgEGTPage.mensagemVerificarFormulario.elementoExiste() == true){
			assertTrue(pgEGTPage.mensagemVerificarFormulario.elementoExiste());
			capturarTela();
			pgEGTPage.fecharPopup.posicionarMouseEClicar();
			capturarTela(); 
		}
		else if (pgEGTPage.mensagemPreenchimentoMais25MG.elementoExiste() == true){
			assertTrue(pgEGTPage.mensagemPreenchimentoMais25MG.elementoExiste());
			capturarTela();
			pgEGTPage.fecharPopup.posicionarMouseEClicar();
			capturarTela(); 
		}
		
		else if (pgEGTPage.mensagemIncluir.elementoExiste() == true){
			assertTrue(pgEGTPage.mensagemIncluir.elementoExiste());
			capturarTela();
			pgEGTPage.fecharPopup.posicionarMouseEClicar();
			capturarTela(); 
		}
		else if (pgEGTPage.mensagemAlteracaoUnidadeMB.elementoExiste() == true){
			assertTrue(pgEGTPage.mensagemAlteracaoUnidadeMB.elementoExiste());
			capturarTela();
			pgEGTPage.fecharPopup.posicionarMouseEClicar();
			capturarTela(); 
		}
		
		else if (pgEGTPage.mensagemAlteracaoUnidadeMB.elementoExiste() == true){
			assertTrue(pgEGTPage.mensagemAlteracaoUnidadeMB.elementoExiste());
			capturarTela();
			pgEGTPage.fecharPopup.posicionarMouseEClicar();
			capturarTela(); 
		}
		
		else if (pgEGTPage.mensagemVerificarFormulario.elementoExiste() == true){
			assertTrue(pgEGTPage.mensagemVerificarFormulario.elementoExiste());
			capturarTela();
			pgEGTPage.fecharPopup.posicionarMouseEClicar();
			capturarTela(); 
		}
		else {
			capturarTela();
			pgEGTPage.fecharPopup.posicionarMouseEClicar();
			capturarTela(); 
			
		}	
	}

}
	
