## Desafio de código "Simulando Uma Conta Bancária Através do Terminal/Console"

Desafio de código do bootcamp "Claro - Java com Spring Boot", módulo de "Sintaxe Básica com Java".

## ContaTerminal - Visão Geral

`ContaTerminal` é um aplicativo simples em Java que interage com os usuários para gerenciar detalhes de contas bancárias. O programa solicita ao usuário o número da conta, o número da agência, o nome do cliente e o saldo da conta. Em seguida, exibe uma mensagem de confirmação com os detalhes fornecidos.

## Recursos

- Solicita ao usuário:
  - Número da conta (inteiro)
  - Número da agência (string)
  - Nome do cliente (string)
  - Saldo da conta (double)
- Exibe um resumo das informações inseridas.

## Começando

Para executar este projeto localmente, você precisará ter o Java Development Kit (JDK) instalado em sua máquina.

### Pré-requisitos

- JDK 8 ou superior
- Um IDE ou editor de texto adequado (por exemplo, IntelliJ IDEA, Eclipse, VSCode)

### Instalação

1. **Clone o Repositório**

   ```bash
   git clone https://github.com/KelvinAlvesCode/desafio-projeto-conta-banco.git

2.  **Navegue até o Diretório do Projeto**
    
    ```bash
    `cd ContaTerminal` 
    
3.  **Compile o Código Java**
    
    ```bash
    `javac ContaTerminal.java` 
    
4.  **Execute o Programa**
    
    ```bash
    `java ContaTerminal`
    
### Uso

1.  Quando solicitado, insira o número da conta como um número inteiro.
2.  Insira o número da agência como uma string.
3.  Insira o nome do cliente como uma string.
4.  Insira o saldo da conta como um número decimal (por exemplo, `1234.56`).

O programa exibirá um resumo das informações fornecidas.

## Exemplo
```
`Digite o número da conta:
12345
Por favor, digite o número da agência:
001
Por favor, digite o nome do cliente:
João Silva
Por favor, digite o saldo da conta:
1500.75
Olá João Silva, obrigado por criar uma conta em nosso banco!
Sua agência é 001.
Sua conta é 12345.
E seu saldo de 1500.75 já está disponível para saque.` 
```

## Solução de Problemas

Se você encontrar uma `InputMismatchException`, certifique-se de fornecer o tipo de dado correto para cada entrada. Por exemplo:

-   Use números inteiros para o número da conta.
-   Use strings para o número da agência e o nome do cliente.
-   Use números decimais para os saldos separando por ponto e não vírgula.


#### <div align="center">Made by <a href="https://github.com/KelvinAlvesCode">Kelvin Alves</a>.</div>
