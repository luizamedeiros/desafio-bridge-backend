## Resumo do Projeto

O projeto foi proposto como um desafio do processo seletivo para bolsista de Desenvolvimento Web Full Stack do <a href='https://portal.bridge.ufsc.br/'> Laboratório Bridge</a>, buscando construir uma aplicação web que "permita que o usuário insira um número
inteiro k e calcule o número de inteiros positivos n menores que k, para os quais
n e n + 1 têm o mesmo número de divisores positivos." Por exemplo, caso o usuário inserisse o número 5, receberia como retorno o número 2 sendo o único que atende a esse requisito, logo, existe 1 número que satisfaz essa condição para o número 5.
<br/><br/>
As restrições técnicas foram: 
<ul>
<li> Os cálculos devem ser executados somente pelo backend; </li>
<li> Estilize a página utilizando a ferramenta/biblioteca CSS de sua preferência; </li>
</ul>
<br/>
Alguns bônus sugeridos e incorporados, foram:
<li> Armazenamento e apresentação do histórico dos números informados pelo usuário junto com
seus respectivos resultados, e tempo de resposta de cada requisição; </li>
<li> Definição de limites e validações para que a aplicação não apresente erros - ou seja, o campo de input da calculador não pode ser vazio, e precisa ser um número inteiro e maior que 1; </li>
<li> A solução foi publicada em um cloud provider. </li>

## Tecnologias e abordagens

<ul>
<li> Para a implementação do frontend do projeto, foi utilizado o <a href="https://reactjs.org/"> ReactJS</a>, conforme sugerido pelo Laboratório; </li>
<li> Para a visualização dos resultados do cálculo, foi utilizado o <a href="https://sweetalert2.github.io/">Sweetalert2</a>, por apresentar modais versáteis e customizáveis; </li>
<li> Para o registro do histórico dos resultados obtidos, bem como os números inseridos pelo usuário, foi utilizado o armazenamento no <strong>local storage</strong> do navegador; </li>
<li> A estilização da página foi feita com <strong>CSS</strong>, sendo pensada para se alinhar à identidade visual do Laboratório, levando em consideração suas cores principais, fontes, imagens, e recursos estilísticos; </li>
<li> O roteamento foi feito através do <a href="https://www.npmjs.com/package/react-router-dom">React Router Dom</a>, tornando a experiência do usuário mais fluida ao construir um aplicativo de página única (SPA);</li>
<li> Para a implementação do backend do projeto, foi utilizado o <a href="https://www.java.com/pt-BR/">Java</a>, juntamente ao <strong>Spring Boot</strong>. </li>
<li> Para a hospedagem do backend da aplicação, foi utilizado o <a href="https://www.heroku.com/">heroku</a>, e o backend pode ser acessado através <a href="https://dbb-22.herokuapp.com/calculate">deste link</a>. Para fazer um cálculo diretamente do navegador, é necessário apenas concatenar ao final do link '?input=5', ou qualquer valor desejado, para visualizar o retorno no navegador.</li>
<li> Para a hospedagem do frontend da aplicação, foi utilizado o <a href="https://vercel.com/">Vercel</a>. A aplicação pode ser acessada online através <a href='https://desafio-bridge-frontend-luizamedeiros.vercel.app/'>deste link</a>. O motivo de utilizar-se dois provedores distintos foi apenas para experimentar a facilidade/usabilidade de cada um.</li>
</ul>

## Como executar?
<ol>
<li> Baixe e descompacte o projeto, ou faça um <b> git clone </b> no repositório. </li>
<li> No repositório do projeto, execute ./mvnw spring-boot:run </li>
<li> O servidor estará ativo na porta 8090 da sua máquina </li>
</ol>

## Possíveis melhorias
Algumns aspectos da aplicação poderiam ser repensados para oferecer uma experiência ainda melhor ao usuário. Entre eles, pode-se citar:
<ul>
<li> Inclusão de responsividade; </li>
<li> Melhora no algoritmo que processa o cálculo, no backend </li>
<li> Implementação de testes unitários, no backend; </li>
<li> Descarte dos modais em telas menores, para facilitar a visualização do resultado, e ser uma experiência mais confortável e adaptada à realidade de telas pequenas. </li>
</ul>

## Rotas
<ul>
<li> A rota 'calculate' recebe como parâmetro um 'input' numérico, e retorna um JSON, contendo a quantidade de números que satisfazem a condição do cálculo, bem como quais números satisfazem. </li>
