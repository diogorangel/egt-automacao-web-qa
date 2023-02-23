package paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import paginas.EGT_GerenciamentoAnexos_Page;
import paginas.EGT_Login_Page;
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


	public class EGT_Login_Page extends Pagina {
		@SuppressWarnings({ "unused" })
		
		private WebDriver driverWeb;
		WebDriver driver=(WebDriver) 
		FTABBContext.getContext().getContextBrowserDriver().getDriver();

		public EGT_Login_Page(WebDriver driverWeb) {
			this.driverWeb = driverWeb;
			PageFactory.initElements(driverWeb, this);
		}
		
	//Codigo Usuario
	@MapearElementoWeb(id = "idToken1")
	public ElementoInput CodigoUsuario;
	
	//Codigo Usuario
	@MapearElementoWeb(id = "idToken3")
	public ElementoInput senhaUsuario;
	
	//Botao Login
	@MapearElementoWeb(xPath = "loginButton_0")
	public ElementoBotao BotaoLogin;
	
	//Botao Fechar
	@MapearElementoWeb(xPath = "//button[contains(@aria-label, 'Fechar aplicativo')]")
	public ElementoBotao botaoFechar;
	
	// construtor
	public EGT_Login_Page() {
		super();
	}
	

	
	
	
	// métodos da página
		}
	
