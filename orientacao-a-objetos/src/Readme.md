# Encapsulamento e visibilidade

> A partir do momento em que um atributo se torna privado, isso quer dizer que ele não pode ser lido ou modificado, a não ser na própria classe. Esse é o conceito principal de encapsulamento, ou seja, esconder como as coisas funcionam.

## Vantagem de utilizar atributos privados

> A implementação interna pode ser modificada sem afetar nenhum código fora da própria classe.

## Get e Set || Getters e Setters
- `Get:` Os métodos de leitura apenas retornam o valor, mas para isso temos que dizer ao método qual o tipo de retorno do método. Em Java os métodos de leitura são representados pelo get.

- `Set:` Já os métodos de modificação não retornam nenhum valor, porém eles modificam o valor internamente de acordo com a regra de negócio. Em Java os métodos de modificação (atribuição) são representados pelo set.

> Todo Get significa que quero pegar uma informação, trazer essa informação, e todo Set diz que eu quero inserir um dado (ou "setar" um dado)
No set não há return, por que todo set é um void e todo voidnão há retorno.

## Construtores
- Quando pensamos em objetos consistentes, queremos dizer que seus atributos funcionam de acordo com as regras de negócios estipuladas por uma empresa, chefe ou algo do gênero

- <p style="color: green;">Construtores não são um método pois não tem nenhum retorno (void, int, double...), mas sim uma rotina de inicialização e também porque só é executado uma vez para aquele mesmo objeto</p>

- A inicialização de atributos é a principal responsabilidade do construtor

- Quando o construtor não está declarado na classe usa-se o padrão do Java, que não recebe parâmetro algum e para evitar estados inconsistentes no nosso objeto criamos construtores com o que precisamos que seje passado para aquele objeto

<h2 style="color: #cc2829;"> Observações: </h2>

Não é porque temos um getSaldo que precisamos ter um setSaldo 
- `A regra deve ser:` precisa ter um método getSalto para pegar o saldo?, precisa ter um setSaldo para modificar o saldo?</br></br>
- São raros os casos em que os atributos não seram privados
- Sempre encapsular tudo mesmo que não achamos um motivo forte para colocar o atributo como privado no começo porque pode ser que venhamos a ter