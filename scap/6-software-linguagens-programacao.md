# Software

O que faz um computador ser um computador é a interação entre hardware e software. É o software que transmite as instruções para que o computador funcione. E cada parte do hardware é controlada por um software específico.

Um software é um conjunto de instruções/comandos que dá ordem ao hardware para executar uma determinada tarefa. O software é a parte intagível da máquina, desenvolvida por meio de códigos e linguagem de programação.

## Tipos de Software

**1. Softwares de Sistema**

- operam o hardware do computador de forma direta.
- exemplo: o sistema operacional, que é responsável por executar o gerenciador de tarefas, de memória, de arquivos, entre outros.

**2. Drivers de dispositivos**

- controlam e monitoram o funcionamento de dispositivos específicos (também são softwares de sistema).

**3. Softwares de Aplicativo**

- softwares para usuários.
- exemplos: editores de imagem, processadores de texto, etc.

## Linguagens de Programação

As linguagens de programação são geralmente classificadas em compiladas e interpretadas.

**1. Linguagem de Programação Compilada**

O código fonte é executado diretamente pelo sistema operacional ou pelo processador, após ser traduzido por meio de um processo chamada compilação usando o um programa de computador chamado compilador.

- código fonte (independente do sistema operacional) -> compilador (atua cada vez que se modifica o programa)
  -> código objeto (depende do sistema operacional - código assembly) -> executador (atua cada vez que se executa o programa)

Assembly: linguagem para escrever instruções para o processador.
Assembler: um programa que lê o arquivo contendo os comandos simples da linguagem Assembly e transforma em linguagem de máquina.
Linguagem de máquina: são os códigos que o processador entende.

_Java é uma linguagem de alto nível?_
_-> sim._

**2. Linguagem de Programação Interpretada**

O código fonte é executado por um programa de computador chamado interpretador.

- código fonte (independente do sistema operacional) -> interpretador (atua cada vez que se executa o programa)

Ou seja, um outro software (interpretador) executa o programa.

**_Quais as diferenças em termos de performance entre a linguagem interpretada e linguagem compilada?_**

-> Uma linguagem compilada fornece uma aplicação com maior performance pois o código será compilado por inteiro em uma unica vez.

-> Uma linguagem interpretada vai exigir um interpretador para a executar o código escrito. Este processo ocorrerá linha por linha, logo isso afetará a performance do software.

- Porém, uma vantagem da linguagem interpretada sobre a linguagem compilada é que um código em linguagem é mais fácil para debugar pois a interpretação ocorre aos poucos, enquanto que em uma linguagem compilada é mais difícil encontrar os erros pois no processo de compilação o código é executado todo de uma vez.

_Quando uma linguagem como o Java apresenta os erros como IndexOutOfBound significa que ele já tem nativamente um mecanismo que encontra o problema para apresentar ao usuário?_
