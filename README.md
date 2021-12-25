## História
> A Plataforma Java é mais importante e não especificamente a linguagem Java.

> A principal vantagem da plataforma Java é não depender de apenas um único software ou hardware, podendo ser emulada por uma maquina virtual.

- `Problema avistado:`
        <p>Na Década de 90 muitas aparelhos eletrônicos e cada aparelho tinha seu código fonte e tinha que ter uma linguagem própria para trabalhar com eles. </p> 

- `Solução:`
        <p>Criar um código que gera-se um executável e depois de compilado pelo hardware que a  ideia era ser um processador saberia entender o executável e saberia para qual formato deveria  traduzir cada comando para rodar nos aparelhos (geladeira, liquidificado, VHS...) -> Ideia fracassou porque custava caro colocar em todos os aparelhos uma placa(hardware)</p>

    Em 95 o Java saiu com a característica de rodar em vários dispositivos (Linux, Mac, Windows) e tbm para rodar dentro dos navegadores e dominou no server side porque nos dá liberdade.
___

## Compilação    
   - [x] .java quando compilado se torna -> Executável -> que é bytecode Java ( .class) e é a jvm (maquina virtual java) que entende o bytecode .class

   - [x] bytecode é o formato que a jvm entende e é de difícil compreensão do ser humano

   - [x] Várias linguagens rodam em cima da plataforma do Java como Python, Ruby... e depois de gerado o bytecode é só ter a JVM e ela vai saber qual SO você utiliza e irá rodar em qualquer dispositivo,

***

## Versões
   - [x] A linguagem teve mudanças consideráveis na versão 5 e 8 aparecendo muitos recursos, como novos comandos, conceitos...


## JRE vs JDK
- JRE - Java Runtime Enviroment é o ambiente de execução Java que é necessário para executar uma aplicação Java.
	
- JDK - Java Development Kits é o kit para desenvolver aplicações Java


## Anotações Gerais:
   - [x] A entrada de uma aplicação Java é sempre uma função/método public static void main(String[] args)

   - [x] O compilador gera o Bytecode caso não tenha nenhum erro sintático no código fonte. 
    Caso tenhamos escrito o código de forma correta, ou seja, seguindo as normas sintáticas da linguagem, o compilador então pode gerar o código equivalente na linguagem que a JVM de fato compreende, que é o Bytecode. Caso algum erro seja verificado por ele, ele notifica sobre o problema e não gera o Bytecode.

   - [x] O compilador de Java da Oracle chamado de javac utilizado no cmd é que nos dará p bytecode = executável =  .class

   - [x] Ver versão instalada através do cmd: 
        > java -version
        > javac --version

   - [x] IDE - Ambiente integrado de desenvolvimento
            Um IDE é um ambiente integrado de desenvolvimento que centraliza em um único lugar o compilador da linguagem utilizada, editor de texto, documentação e tudo que gira em torno da criação de aplicações.

   > Praticamente todos os IDEs são vinculados especificamente a uma linguagem ou estrutura ou conjunto de linguagens ou estruturas fortemente coletados. Alguns exemplos: Visual Studio para .NET e outras linguagens Microsoft, RubyMine para Ruby, IntelliJ para Java, XCode para tecnologias Apple.
    
   - [x] Workspace
        Cada projeto do Eclipse fica dentro de um workspace.
        Um workspace é a pasta padrão que será utilizado para armazenar todos os projetos criados com a IDE Eclipse.


## Java é estaticamente e fortemente tipado
   - [x] Tipagem estática significa que os tipos das variáveis de um programa são explicitamente definidos no código e, portanto, conhecidos/checados em tempo de compilação, e Uma vez definido o tipo, estas variáveis estão restritas ao tipo declarado
   - [x] Linguagem fortemente tipada seria aquela em que os objetos/variáveis tem um tipo bem definido e que precisa ser informado no momento de sua declaração.

   - [x] "Que necessita da declaração de todas as variáveis e tipos a serem utilizados"

   - [x] Java tem precedencia aritimética, ou seja, multiplicação e divisão ocorre primeiro do que uma soma...
        " Operações matemáticas seguem uma determinada ordem de prioridade "

## java é CamelCase - 
   - [x] Que é a prática de escrever as palavras compostas ou frases, onde cada palavra é iniciada com maiúsculas e unidas sem espaços
