# CursoemVideoJava

Este repositório reúne todos os exercícios desenvolvidos durante o [Curso de Java POO do site Curso em Vídeo](https://www.cursoemvideo.com/curso/java-poo/), ministrado por Gustavo Guanabara. O objetivo é praticar os principais conceitos de Programação Orientada a Objetos (POO) utilizando Java, acompanhando a sequência completa das 30 aulas gratuitas do curso.

## Sobre o curso

- Curso completo e gratuito, referência nacional para iniciantes e estudantes de Java.
- Ministrado por Gustavo Guanabara, professor destaque na área.
- Aborda teoria, exemplos práticos, explicações em vídeo e projetos de fixação.
- Plataforma utilizada: NetBeans e VS Code (com extensão Java).

## Estrutura do Repositório

Os arquivos .java estão divididos em pastas conforme as aulas, seguindo a lógica do curso. Cada pasta contém a implementação dos exercícios e atividades propostas, além dos códigos de exemplos explorados nos vídeos.

## Progresso das Aulas ✔️

![Progresso do Curso](https://img.shields.io/badge/Progresso-60%25-brightgreen)

- [x] Aula Teórica 1 – O que é Programação Orientada a Objetos?
- [x] Aula Prática 1 – Instalando o JDK e NetBeans
- [x] Aula Teórica 2 – O que é um Objeto?
- [x] Aula Prática 2 – Criando Classes e Objetos em Java
- [x] Aula Teórica 3 – O que é Visibilidade em um Objeto?
- [x] Aula Prática 3 – Configurando Visibilidade de Atributos e Métodos
- [x] Aula Teórica 4 – Métodos Especiais
- [x] Aula Prática 4 – Métodos Getter, Setter e Construtor
- [x] Aula Teórica 5 – Exemplo Prático com Objetos
- [x] Aula Prática 5 – Exemplo Prático em Java
- [x] Aula Teórica 6 – Pilares da POO: Encapsulamento
- [x] Aula Prática 6 – Encapsulamento
- [x] Aula Teórica 7 – Relacionamento entre Classes
- [x] Aula Prática 7 – Objetos Compostos em Java
- [x] Aula Teórica 8 – Relacionamento de Agregação
- [x] Aula Prática 8 – Agregação entre Objetos com Java
- [x] Aula Teórica 9 – Exercícios de POO
- [x] Aula Prática 9 – Exercício prático POO em Java
- [ ] Aula Teórica 10 – Herança (Parte 1)
- [ ] Aula Prática 10 – Herança (Parte 1)
- [ ] Aula Teórica 11 – Herança (Parte 2)
- [ ] Aula Prática 11 – Herança (Parte 2)
- [ ] Aula Teórica 12 – Conceito Polimorfismo (Parte 1)
- [ ] Aula Prática 12 – Polimorfismo em Java (Parte 1)
- [ ] Aula Teórica 13 – Conceito Polimorfismo (Parte 2)
- [ ] Aula Prática 13 – Polimorfismo Sobrecarga (Parte 2)
- [ ] Aula Teórica 14 – Exercícios de POO (Parte 2)
- [ ] Aula Prática 14 – Projeto Final em Java (Parte 1)
- [ ] Aula Teórica 15 – Exercícios de POO (Parte 3)
- [ ] Aula Prática 15 – Projeto Final em Java (Parte 2)

## Exercícios já implementados

- **Aulas Iniciais:** Classes de exemplo como `Caneta`, `Celular`, `Teclado`, focando em visibilidade (`public`, `private`, `protected`) e métodos especiais (Getters, Setters, Construtores).
  
- **Projeto ContaBanco (Aula 5):** Simulação completa de um sistema bancário.
  - Implementação de métodos para `abrirConta`, `fecharConta`, `depositar`, `sacar` e `pagarMensal`.
  - Validações de segurança e regras de negócio para Conta Corrente e Poupança.

- **Controle Remoto (Aula 6):** Exemplo profundo de **Encapsulamento**.
  - Utilização de **Interface** (`Controlador`) para definir métodos abstratos.
  - O usuário interage apenas com a "capa" do controle, sem acesso direto aos atributos internos.

- **Ultra Emoji Combat (Aulas 7 e 8):** Relacionamento entre classes e **Agregação**.
  - Classes `Lutador` e `Luta` interagindo entre si.
  - **Diferencial:** Implementação de um algoritmo de **probabilidade ponderada** para o resultado da luta. A vitória não é totalmente aleatória; ela considera atributos como peso, altura, vitórias e uma chance dinâmica de empate, somados a um fator sorte (`Random`).

- **Projeto Livro (Aula 9):** Exercício prático de fixação.
  - Classes `Pessoa` e `Livro` ligadas por agregação (um Livro tem um Leitor).
  - Implementação da interface `Publicacao`.
  - Lógica detalhada para `folhear` (ir para página específica), `avancarPag` e validações (não ler com livro fechado).

## Como usar

1. Clone o repositório:
git clone https://github.com/Isacmsm/CursoemVideoJava
2. Abra no VS Code, NetBeans ou IDE de sua preferência.
3. Explore cada pasta conforme o progresso das aulas.
4. Experimente modificar e executar os códigos para testar os conceitos explicados.

## Objetivo

Este repositório serve como diário de aprendizado, repositório pessoal de prática e fonte de consulta futura. Será constantemente atualizado até o término de todas as aulas e exercícios do curso.