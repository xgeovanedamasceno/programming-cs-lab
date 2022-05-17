# Libs e Frameworks

**1. React**

- Biblioteca para a criação de interfaces funcionais.

**2. Nextjs**

- Framework que adiciona mais funcionalidade para React, entre elas:
  - Renderização estática (programada) e também pelo lado servidor (Server Side Rendering)
  - tratamento de rotas por diretórios
  - Maior performance para a aplicação
  - indexação de conteúdo e SEO

**3. Redux**

- Biblioteca Javascript para o gerenciamento e compartilhamneto de estado entre vários componentes diferentes.
- Os estados ficam armazenados em uma árvore de objetos através da **store** através de 3 recursos:
  - Store: container que armazena de forma centralizada todos os estados da aplicação
  - Actions: são ações disparadas da aplicação para a store.
  - Reducers: encarregados de lidar com todas as ações e especificam como o estado da aplicação irá mudar de acordo com a action que foi enviada para a store.
- Princípios do Store:
  - Todos os estados estarão disponíveis exclusivamente através da store.
  - Os estados são somente leitura.
  - As alterações são feitas através de funções puras.
