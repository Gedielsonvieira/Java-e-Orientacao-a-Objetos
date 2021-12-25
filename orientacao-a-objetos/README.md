
> Orientação a objetos é uma maneira de programar que resolve muitos problemas enfrentados pela programação procedural

## Motivação: problemas do paradigma procedural
<span style="color: #cc2829;">O problema central do paradigma procedural é que não existe uma forma simples de criar conexão forte entre dados e funcionalidades, ocasionando "subproblemas" mencionados abaixo:</span>

- `Aumenta a probabilidade do erro acontecer` : Ex: Na validação de um CPF, temos um formulário no qual recebemos essa informação e depois temos de enviar esse dado a uma função que vai validá-lo, mas o que força o desenvolvedor a validar esse CPF? O que pode ocasionar, inúmeras vezes o esquecimento de chamar esse validador e agora considere que você tem 50 formulários e precise validar em todos o CPF.

- `Guias de programação`: Todo desenvolvedor precisa saber de uma quantidade enorme de informações, mesmo que, na maioria das vezes, não está realmente relacionada à sua parte no sistema, mas ele precisa ler tudo isso, resultando em um entrave muito grande!<br> 
Imagine comigo, na entrada de um novo Dev, precisaríamos avisá-lo de que sempre devemos validar o CPF de um formulário e é nesse momento que nascem aqueles guias de programação para o desenvolvedor que for entrar no projeto.
- `Responsabilidade espalhada` : Cai na questão do guia de programação, pois mesmo não sendo relacionada a sua parte do sistema, você tem que estar ciente, ou seja, todo mundo e ninguem ao mesmo tempo é responsável. 
- `Necessidade de ler o código que foi escrito por outro desenvolvedor e descobrir como ele funciona internamente` : Um sistema bem encapsulado não deveria gerar essa necessidade. Em um sistema grande, simplesmente não temos tempo de ler todo o código existente.
- `Retrabalho` : Ao inserir uma outra validação que irá validar a idade do cliente teríamos de colocar uma condicional, espalhado por todo o código e, mesmo que se crie outra função para validar, precisaríamos incluir isso nos nossos 50 formulários já existentes. Qual é a chance de esquecermos um deles? É muito grande.
    <p style="color: #cc2829;">A responsabilidade de verificar se o cliente tem ou não 18 anos ficou espalhada por todo o seu código. <span style="color: #0af53f;">Seria interessante poder concentrar essa responsabilidade em um lugar só para não ter chances de se esquecer disso.</span></p>

    Melhor ainda seria se conseguíssemos mudar essa validação e os outros programadores nem precisassem ficar sabendo disso. Ou seja, eles criariam formulários, e um único programador seria responsável pela validação: os outros nem saberiam da existência desse trecho de código. Impossível? Não, o paradigma da orientação a objetos facilita tudo isso.

 <span style="color: #0af53f;">No paradigma orientado a objetos, é muito fácil ter essa conexão por meio dos recursos da própria linguagem.</span>