@Library(['aic-jenkins-sharedlib']) _

mavenBuildPipeline {
    canaisNotificacao = 'egt'
    nomePod                         = 'jdk8' // OPCIONAL identifica qual jdk o projeto utiliza, há opção de execução com o valor 'jdk11'
    habilitarValidacaoEstatica      = true // habilita a validação estática do código fonte
    habilitarValidacaoSeguranca     = false // habilita a validação de segurança do código fonte
    habilitarConstrucao             = true // habilita a construção da aplicação
    habilitarTestesUnidade          = false // habilita a execução dos testes de unidade
    habilitarTestesIntegracao       = false // habilita a execução dos testes de integração
    habilitarTestesFumaca           = false // habilita a execução dos testes de fumaça
    habilitarSonar                  = true // habilita a execução do SonarQube Scanner
    habilitarEmpacotamento          = true // habilita o empacotamento da aplicação
    habilitarEmpacotamentoDocker    = false // habilita o empacotamento da imagem docker e posterior publicação no repositório corporativo
    habilitarPublicacao             = true // habilita a publicação do pacote no repositório corporativo
    habilitarDebug                  = false // habilita debug
}