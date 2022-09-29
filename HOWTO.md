Esse sistema foi desenvolvido especificamente para o processo seletivo de desenvolvedor Java Jr. da Hepta tecnologia. Utilizei a linguagem Java no back-end e VUE.js no front-end, o intuito é executar as funções básicas de manipulação de dados (create, read, update e delete) com uma visualização dinâmica.

Siga o passo a passo para a execução do programa:

- Banco de dados - 

1 - Primeiro veja se o serviço do MySQL está inicializado pelo gerenciador de tarefas (é necessário que seu servidor esteja em execução), com ele funcionando, inicialize seu banco de dados (pelo MySQL Workbench ou similar) e lembre-se de colocar a senha no arquivo do back-end chamado application.properties em processo-seletivo-hepta-crud\javaCrud\src\main\resources\application.properties, após isso é necessário criar um esquema com o nome springboot (as tabelas serão criadas automaticamente).

O back-end e o front-end estão divididos, é necessário inicializá-los manualmente, vamos começar pelo back-end:

- Back-end - JavaSE-1.8

1- Você pode utilizar o Run ou executar sem depuração (Ctrl + F5 no Visual Studio Code) para inicializar o server SpringBoot, ele geralmente inicializa na porta 8080 do navegador, o caminho para o beck-end do projeto foi definido sendo http://localhost:8080/api/funcionarios/, por aqui é possivel acompanhar em forma de .json tudo que se encontra no banco de dados.

- Front-end -

2 - o front-end se encontra na pasta app, para iniciá-lo, basta instalar as dependências digitando npm ou yarn no terminal na pasta app, para inicializar o servidor basta digitar npm start ou yarn start, geralmente o servidor do front-end se inicializa na porta 3000 (http://localhost:3000/).

3 - Agora é só aproveitar as funcionalidades do sistema, é possivel fazer testes inserindo dados, editá-los e excluí-los do banco, o front foi desenvolvido utilizando a biblioteca Vuetify buscando mais dinamismo na mostragem de dados, além da elegância na visualização dos dados na tabela.