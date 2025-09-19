🐾 Animal Virtual em Java

Este projeto é uma simulação de Animal Virtual desenvolvida em Java, com foco na aplicação de conceitos de Programação Orientada a Objetos (POO), como classes, objetos, atributos, métodos e encapsulamento.

🚀 Funcionalidades

Cadastrar animal (nome, tipo e idade).

Alimentar (aumenta energia).

Brincar (aumenta felicidade e gasta energia).

Dormir (restaura energia para 100).

Mostrar status completo do animal.

🛠️ Tecnologias

Java 17+

Scanner para entrada de dados no console

📂 Estrutura do Projeto
📦 AnimalVirtual
 ┣ 📜 Animal.java        # Classe com atributos e métodos do animal
 ┣ 📜 MainMenu.java      # Classe principal com menu interativo
 ┗ 📜 README.md          # Documentação do projeto

📌 Classe Animal

Atributos: nome, tipo, idade, energia (100), felicidade (100)

Métodos:

alimentar(): +10 energia (máx. 100)

brincar(): +10 felicidade e -5 energia

dormir(): energia volta a 100

mostrarStatus(): exibe dados organizados do animal
