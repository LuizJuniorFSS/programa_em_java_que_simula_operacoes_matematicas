# 📊 Programa Java - Simulação de Operações Matemáticas

Este projeto implementa um sistema de operações matemáticas em Java utilizando conceitos de **programação orientada a objetos**, **classes abstratas**, **herança**, **polimorfismo** e **tratamento de exceções**.

## 🎯 Objetivo

Criar um programa que simula operações matemáticas básicas (soma e divisão) com tratamento adequado de exceções, especialmente para casos de divisão por zero.

## 📁 Estrutura do Projeto

```
programa_em_java_que_simula_operacoes_matematicas/
├── OperacaoMatematica.java     # Classe abstrata base
├── Soma.java                   # Implementação da operação de soma
├── Divisao.java               # Implementação da operação de divisão
├── DivisaoPorZeroException.java # Exceção personalizada
├── Principal.java             # Classe principal com método main
└── README.md                  # Este arquivo
```

## 🏗️ Arquitetura do Sistema

### 1. Classe Abstrata `OperacaoMatematica`
- **Propósito**: Define a estrutura base para todas as operações matemáticas
- **Método abstrato**: `calcular(double a, double b) throws Exception`
- **Características**:
  - Não pode ser instanciada diretamente
  - Força as subclasses a implementarem o método `calcular()`

### 2. Subclasse `Soma`
- **Herda de**: `OperacaoMatematica`
- **Funcionalidade**: Implementa a operação de adição
- **Método**: `calcular()` retorna `a + b`
- **Exceções**: Não lança exceções específicas

### 3. Subclasse `Divisao`
- **Herda de**: `OperacaoMatematica`
- **Funcionalidade**: Implementa a operação de divisão com validação
- **Método**: `calcular()` retorna `a / b`
- **Validação**: Verifica se o divisor é zero antes da operação
- **Exceção**: Lança `DivisaoPorZeroException` quando `b == 0`

### 4. Exceção Personalizada `DivisaoPorZeroException`
- **Herda de**: `Exception`
- **Propósito**: Tratamento específico para divisão por zero
- **Mensagem**: "Não é possível dividir por zero."
- **Construtores**:
  - Padrão com mensagem fixa
  - Personalizado com mensagem customizada

### 5. Classe Principal `Principal`
- **Contém**: Método `main()` para execução do programa
- **Funcionalidades**:
  - Criação de objetos das operações
  - Execução de testes com diferentes valores
  - Tratamento de exceções com blocos `try-catch`
  - Demonstração do funcionamento do sistema

## ✅ Checklist de Implementação

### ✓ Requisitos Atendidos:

- [x] **Classe abstrata OperacaoMatematica** com método abstrato `calcular()`
- [x] **Subclasse Soma** implementando o método `calcular()` para adição
- [x] **Subclasse Divisao** implementando o método `calcular()` para divisão
- [x] **Exceção personalizada DivisaoPorZeroException** estendendo `Exception`
- [x] **Validação de divisão por zero** na classe `Divisao`
- [x] **Lançamento da exceção** em caso de tentativa de divisão por zero
- [x] **Tratamento try-catch** para capturar exceções na classe `Principal`
- [x] **Programa executável** com demonstração completa das funcionalidades

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior instalado
- Terminal/Prompt de comando

### Passos para Execução

1. **Compilar os arquivos Java**:
   ```bash
   javac *.java
   ```

2. **Executar o programa**:
   ```bash
   java Principal
   ```

## 📊 Exemplo de Saída

```
=== PROGRAMA DE OPERAÇÕES MATEMÁTICAS ===

Soma: 10 + 5 = 15.0
Divisão: 10 / 2 = 5.0
Erro capturado: Não é possível dividir por zero.

=== MAIS TESTES ===
Soma: 7.5 + 2.3 = 9.8
Divisão: 15 / 3 = 5.0
Divisão: 20 / 4 = 5.0
Tentando dividir 5 por 0...
Exceção capturada: Não é possível dividir por zero.

=== FIM DO PROGRAMA ===
```

### 🖥️ Execução no Terminal

![Execução do Programa](https://raw.githubusercontent.com/LuizJuniorFSS/programa_em_java_que_simula_operacoes_matematicas/master/screenshot.png)

## 🔧 Conceitos Aplicados

### 1. **Programação Orientada a Objetos**
- Encapsulamento de funcionalidades em classes
- Abstração através de classe abstrata
- Herança com subclasses especializadas

### 2. **Polimorfismo**
- Implementação diferente do método `calcular()` em cada subclasse
- Uso da mesma interface para operações distintas

### 3. **Tratamento de Exceções**
- Criação de exceção personalizada
- Uso de `throws` na declaração de métodos
- Blocos `try-catch` para captura e tratamento

### 4. **Boas Práticas**
- Documentação com JavaDoc
- Validação de entrada de dados
- Mensagens de erro informativas
- Código limpo e bem estruturado

## 🎓 Aprendizados

Este projeto demonstra:
- Como criar e usar classes abstratas em Java
- Implementação de herança e polimorfismo
- Criação e uso de exceções personalizadas
- Tratamento adequado de erros em tempo de execução
- Estruturação de código orientado a objetos

## 📝 Observações Técnicas

- **Método abstrato**: Força implementação nas subclasses
- **Exceção checked**: `DivisaoPorZeroException` deve ser tratada ou declarada
- **Validação rigorosa**: Verificação de divisão por zero antes da operação
- **Flexibilidade**: Fácil extensão para novas operações matemáticas

---

**Desenvolvido como exercício prático de Programação Orientada a Objetos em Java** 🎯