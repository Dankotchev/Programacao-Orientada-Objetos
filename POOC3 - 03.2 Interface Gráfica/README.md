# Exercícios

## Exercício 01

Desenvolver uma aplicação java utilizando interface gráfica Swing para implementar uma manutenção de produtos com compra e venda, considerando os seguintes itens:

a) Sobre os produtos devemos ter:

1. codigo - inteiro
2. descricao - string
3. marca - string
4. quantidade em estoque - int
5. valor - double

Permitir que se faça venda e compra de um produto, ou seja, deve ter dois métodos que devem ser capaz de receber uma quantidade vendida ou comprada e realizar a atualização do estoque.

b) Na tela contendo a relação de produtos (Controle de Produtos), deve ter uma tabela apresentando o código, descrição e valor do produto, e os seguintes botões: Novo, Alterar, Excluir, Visualizar, Comprar, Vender e Sair.

![Manutenção de Produtos](https://github.com/Dankotchev/Programacao-Orientada-Objetos/blob/main/POOC3%20-%2003.2%20Interface%20Gr%C3%A1fica/ProdInterGraf%20-%20ManutencaoProdutos.png?raw=true)

Nessa tela quando o usuário clicar nos botões Novo, Alterar e Visualizar deve ser apresentada uma nova janela (JDialog) com todos os dados do produto para o usuário incluir, alterar ou visualizar. 

Quando o usuário clicar em vender e comprar, deve-se apresentar uma outra tela com o código, descrição e quantidade em estoque do produto e um campo de texto onde o usuário definirá a quantidade comprada ou vendida.

c) A tela para manutenção dos dados do produto, deve ter campos para todos os dados do produto permitindo ao usuário digitar valores para esses dados. Lembrar que na alteração a quantidade de produto não pode ser alterada (não deixar o campo editável). Atentar para a conversão do conteúdo dos campos quantidade e valor.

![Dados do Produto](https://github.com/Dankotchev/Programacao-Orientada-Objetos/blob/main/POOC3%20-%2003.2%20Interface%20Gr%C3%A1fica/ProdInterGraf%20-%20DadosProdutos.png?raw=true)

d) A tela para compra e venda de produtos, deve apresentar o código, descrição e quantidade em estoque, que não deve ser editável para o usuário, além de um campo de quantidade vendida ou comprada. Quando for uma venda, a quantidade vendida não deve ser superior a quantidade em estoque, isso deve ser verificado no botão de confirmar. Caso isso ocorra apresente uma mensagem ao usuário.

![Compra de Produtos](https://raw.githubusercontent.com/Dankotchev/Programacao-Orientada-Objetos/main/POOC3%20-%2003.2%20Interface%20Gr%C3%A1fica/ProdInterGraf%20-%20CompraProdutos.png)

ou 

![Venda de Produtos](https://github.com/Dankotchev/Programacao-Orientada-Objetos/blob/main/POOC3%20-%2003.2%20Interface%20Gr%C3%A1fica/ProdInterGraf%20-%20VendaProdutos.png?raw=true)

Essa tela deve ter um método setProduto para preencher os dados do produto na tela e um método getQuantidade, que será o conteúdo do campo quantidade comprada ou vendida validada.

Criar um ou dois métodos para que os textos dentro da janela sejam trocados e se possa saber se é uma compra ou uma venda.
