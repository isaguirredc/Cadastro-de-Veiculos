# Sistema de Cadastro de Veículos

Projeto desenvolvido no 4º semestre do curso de **Ciência da Computação** na **ATITUS Educação**.

---

## Descrição

Sistema de cadastro de veículos desenvolvido em **Java** que aplica os conceitos de **Abstração** e **Encapsulamento** do paradigma de Orientação a Objetos. O programa permite gerenciar um cadastro completo de veículos com operações de CRUD (Create, Read, Update, Delete) e funcionalidades avançadas de pesquisa.

---

## Funcionalidades

*  **Cadastrar veículos** com marca, modelo, ano e placa
*  **Listar todos os veículos** cadastrados no sistema
*  **Excluir veículos** por número de placa
*  **Pesquisar veículos** por placa exata ou por parte do modelo
*  **Validação de dados** para evitar placas duplicadas
*  **Interface intuitiva** com menu interativo

---

## Estrutura do Projeto

### Classe Veiculo
- **Atributos privados**: marca (String), modelo (String), ano (int), placa (String)
- **Construtores**: default e parametrizado
- **Métodos de acesso**: getters e setters para todos os atributos
- **Método toString()**: retorna representação formatada dos dados do veículo

### Classe CadastroVeiculos
- **Lista de veículos**: `List<Veiculo>` utilizando ArrayList
- **Menu interativo**: interface de usuário com opções numeradas
- **Validações**: impede cadastro de placas duplicadas
- **Sistema de pesquisa**: busca por placa exata ou por parte do modelo

---

## Responsável

**Isadora Aguirre Dal Conte** — RA: **1136123**
