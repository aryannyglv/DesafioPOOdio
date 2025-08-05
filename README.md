# 🚀 Projeto: Sistema de Gerenciamento de Bootcamp em Java  
📘 **Aprendendo Programação Orientada a Objetos na Prática**

Seja bem-vindo(a) ao projeto **"BOOTCAMP - Abstraindo o Domínio com POO"**, um desafio prático para colocar em uso os principais pilares da **Programação Orientada a Objetos** usando **Java**.

Neste projeto, o objetivo é representar de forma orientada a objetos o funcionamento de um **Bootcamp**, seus conteúdos e participantes.

---

## 🎯 Objetivo

Modelar um sistema que simula a participação de desenvolvedores em um Bootcamp, com foco nos pilares da POO:

✅ Abstração  
✅ Encapsulamento  
✅ Herança  
✅ Polimorfismo  

---

## 🧱 Entidades Abstraídas do Domínio Bootcamp

### 🏁 Bootcamp
- nome
- descrição
- data de início e fim
- lista de conteúdos (cursos e mentorias)
- lista de desenvolvedores inscritos

> O Bootcamp funciona como um programa de formação, reunindo conteúdos diversos para desenvolvedores.

---

### 📚 Curso
- título
- descrição
- carga horária

> Representa um conteúdo técnico com duração definida.

---

### 💬 Mentoria
- título
- descrição
- data

> Representa um encontro ao vivo com especialistas.

---

### 👩‍💻 Desenvolvedor (Dev)
- nome
- conteúdos inscritos
- conteúdos concluídos
- XP total acumulado

> O dev participa de bootcamps, consome os conteúdos e acumula experiência (XP).

---

## 🔗 Relacionamentos

- Um Bootcamp contém vários **Cursos** e **Mentorias**.  
- Um Dev pode se inscrever em vários Bootcamps.  
- Um Dev pode concluir conteúdos e acumular XP.

---

## 🧠 Pilares da POO utilizados

### 🔸 Abstração
Foco nos elementos essenciais do domínio, escondendo detalhes irrelevantes da implementação.

### 🔸 Encapsulamento
Protegemos atributos com modificadores de acesso (`private`) e fornecemos métodos (`getters/setters`) para acesso seguro.

### 🔸 Herança
Criamos uma superclasse `Conteudo` que é estendida por `Curso` e `Mentoria`, que compartilham atributos e comportamentos.

### 🔸 Polimorfismo
Através do método `calcularXP()`, aplicamos comportamentos diferentes dependendo do tipo de conteúdo (`Curso` ou `Mentoria`).

---

## 🛠 Tecnologias

- Java 11+
- Paradigma de Programação Orientado a Objetos
- IDE: IntelliJ
- Git & GitHub
---

## ✨ Minha experiência com esse projeto

Desenvolver esse projeto foi um verdadeiro desafio e, ao mesmo tempo, uma experiência extremamente valiosa.
Durante o processo, enfrentei dificuldades na organização das classes, na escolha de bons nomes, e principalmente na aplicação correta dos conceitos de herança e polimorfismo.

Com o tempo, fui compreendendo melhor como abstrair um domínio real (no caso, um bootcamp) em entidades Java, e como deixar o código limpo, coeso e reutilizável. Ver o sistema funcionando e os desenvolvedores simulando o progresso nos cursos foi muito gratificante!

Esse projeto não só fortaleceu meus conhecimentos em POO com Java, como também me mostrou na prática a importância da modelagem e do pensamento orientado a objetos.

Se você está começando, saiba que errar faz parte do processo. Continue tentando, praticando, e a evolução virá! 🚀
---
## 📚 Créditos

-  _Este projeto é um dos desafios oficiais da plataforma Digital Innovation One (DIO), voltado à prática dos fundamentos da Programação Orientada a Objetos em Java, com foco em abstração de domínio, herança, polimorfismo e encapsulamento._
---
